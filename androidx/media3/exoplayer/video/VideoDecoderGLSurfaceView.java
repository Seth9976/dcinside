package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil.GlException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import h4.m;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@UnstableApi
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {
    static final class Renderer implements GLSurfaceView.Renderer {
        private final GLSurfaceView a;
        private final int[] b;
        private final int[] c;
        private final int[] d;
        private final int[] e;
        private final AtomicReference f;
        private final FloatBuffer[] g;
        private GlProgram h;
        private int i;
        private VideoDecoderOutputBuffer j;
        private static final float[] k = null;
        private static final float[] l = null;
        private static final float[] m = null;
        private static final String n = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";
        private static final String[] o = null;
        private static final String p = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";
        private static final FloatBuffer q;

        static {
            Renderer.k = new float[]{1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
            Renderer.l = new float[]{1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
            Renderer.m = new float[]{1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
            Renderer.o = new String[]{"y_tex", "u_tex", "v_tex"};
            Renderer.q = GlUtil.j(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        }

        public Renderer(GLSurfaceView gLSurfaceView0) {
            this.a = gLSurfaceView0;
            this.b = new int[3];
            this.c = new int[3];
            this.d = new int[3];
            this.e = new int[3];
            this.f = new AtomicReference();
            this.g = new FloatBuffer[3];
            for(int v = 0; v < 3; ++v) {
                this.e[v] = -1;
                this.d[v] = -1;
            }
        }

        public void a(VideoDecoderOutputBuffer videoDecoderOutputBuffer0) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer1 = (VideoDecoderOutputBuffer)this.f.getAndSet(videoDecoderOutputBuffer0);
            if(videoDecoderOutputBuffer1 != null) {
                videoDecoderOutputBuffer1.p();
            }
            this.a.requestRender();
        }

        @m({"program"})
        private void b() {
            try {
                GLES20.glGenTextures(3, this.b, 0);
                for(int v = 0; v < 3; ++v) {
                    GLES20.glUniform1i(this.h.l(Renderer.o[v]), v);
                    GLES20.glActiveTexture(v + 0x84C0);
                    GlUtil.c(0xDE1, this.b[v], 0x2601);
                }
                GlUtil.e();
                return;
            }
            catch(GlException glUtil$GlException0) {
            }
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", glUtil$GlException0);
        }

        @Override  // android.opengl.GLSurfaceView$Renderer
        public void onDrawFrame(GL10 gL100) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer0 = (VideoDecoderOutputBuffer)this.f.getAndSet(null);
            if(videoDecoderOutputBuffer0 == null && this.j == null) {
                return;
            }
            if(videoDecoderOutputBuffer0 != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer1 = this.j;
                if(videoDecoderOutputBuffer1 != null) {
                    videoDecoderOutputBuffer1.p();
                }
                this.j = videoDecoderOutputBuffer0;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer)Assertions.g(this.j);
            float[] arr_f = Renderer.l;
            switch(videoDecoderOutputBuffer2.m) {
                case 1: {
                    arr_f = Renderer.k;
                    break;
                }
                case 3: {
                    arr_f = Renderer.m;
                }
            }
            GLES20.glUniformMatrix3fv(this.i, 1, false, arr_f, 0);
            int[] arr_v = (int[])Assertions.g(videoDecoderOutputBuffer2.l);
            ByteBuffer[] arr_byteBuffer = (ByteBuffer[])Assertions.g(videoDecoderOutputBuffer2.k);
            for(int v = 0; v < 3; ++v) {
                int v1 = v == 0 ? videoDecoderOutputBuffer2.i : (videoDecoderOutputBuffer2.i + 1) / 2;
                GLES20.glActiveTexture(v + 0x84C0);
                GLES20.glBindTexture(0xDE1, this.b[v]);
                GLES20.glPixelStorei(0xCF5, 1);
                GLES20.glTexImage2D(0xDE1, 0, 6409, arr_v[v], v1, 0, 6409, 0x1401, arr_byteBuffer[v]);
            }
            int[] arr_v1 = new int[3];
            arr_v1[0] = videoDecoderOutputBuffer2.h;
            int v2 = (videoDecoderOutputBuffer2.h + 1) / 2;
            arr_v1[2] = v2;
            arr_v1[1] = v2;
            for(int v3 = 0; v3 < 3; ++v3) {
                if(this.d[v3] != arr_v1[v3] || this.e[v3] != arr_v[v3]) {
                    Assertions.i(arr_v[v3] != 0);
                    float f = ((float)arr_v1[v3]) / ((float)arr_v[v3]);
                    this.g[v3] = GlUtil.j(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f, 0.0f, f, 1.0f});
                    GLES20.glVertexAttribPointer(this.c[v3], 2, 0x1406, false, 0, this.g[v3]);
                    this.d[v3] = arr_v1[v3];
                    this.e[v3] = arr_v[v3];
                }
            }
            GLES20.glClear(0x4000);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.e();
            }
            catch(GlException glUtil$GlException0) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", glUtil$GlException0);
            }
        }

        @Override  // android.opengl.GLSurfaceView$Renderer
        public void onSurfaceChanged(GL10 gL100, int v, int v1) {
            GLES20.glViewport(0, 0, v, v1);
        }

        @Override  // android.opengl.GLSurfaceView$Renderer
        public void onSurfaceCreated(GL10 gL100, EGLConfig eGLConfig0) {
            try {
                GlProgram glProgram0 = new GlProgram("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.h = glProgram0;
                GLES20.glVertexAttribPointer(glProgram0.g("in_pos"), 2, 0x1406, false, 0, Renderer.q);
                this.c[0] = this.h.g("in_tc_y");
                this.c[1] = this.h.g("in_tc_u");
                this.c[2] = this.h.g("in_tc_v");
                this.i = this.h.l("mColorConversion");
                GlUtil.e();
                this.b();
                GlUtil.e();
            }
            catch(GlException glUtil$GlException0) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", glUtil$GlException0);
            }
        }
    }

    private final Renderer a;
    private static final String b = "VideoDecoderGLSV";

    public VideoDecoderGLSurfaceView(Context context0) {
        this(context0, null);
    }

    public VideoDecoderGLSurfaceView(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        Renderer videoDecoderGLSurfaceView$Renderer0 = new Renderer(this);
        this.a = videoDecoderGLSurfaceView$Renderer0;
        this.setPreserveEGLContextOnPause(true);
        this.setEGLContextClientVersion(2);
        this.setRenderer(videoDecoderGLSurfaceView$Renderer0);
        this.setRenderMode(0);
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override  // androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer
    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer0) {
        this.a.a(videoDecoderOutputBuffer0);
    }
}

