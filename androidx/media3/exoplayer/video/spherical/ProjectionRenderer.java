package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil.GlException;
import androidx.media3.common.util.GlUtil;
import java.nio.FloatBuffer;

final class ProjectionRenderer {
    static class MeshData {
        private final int a;
        private final FloatBuffer b;
        private final FloatBuffer c;
        private final int d;

        public MeshData(SubMesh projection$SubMesh0) {
            this.a = projection$SubMesh0.a();
            this.b = GlUtil.j(projection$SubMesh0.c);
            this.c = GlUtil.j(projection$SubMesh0.d);
            switch(projection$SubMesh0.b) {
                case 1: {
                    this.d = 5;
                    return;
                }
                case 2: {
                    this.d = 6;
                    return;
                }
                default: {
                    this.d = 4;
                }
            }
        }
    }

    private int a;
    @Nullable
    private MeshData b;
    @Nullable
    private MeshData c;
    private GlProgram d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private static final String j = "ProjectionRenderer";
    private static final String k = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";
    private static final String l = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";
    private static final float[] m;
    private static final float[] n;
    private static final float[] o;
    private static final float[] p;
    private static final float[] q;

    static {
        ProjectionRenderer.m = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
        ProjectionRenderer.n = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
        ProjectionRenderer.o = new float[]{1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
        ProjectionRenderer.p = new float[]{0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
        ProjectionRenderer.q = new float[]{0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    }

    public void a(int v, float[] arr_f, boolean z) {
        float[] arr_f1;
        MeshData projectionRenderer$MeshData0 = z ? this.c : this.b;
        if(projectionRenderer$MeshData0 == null) {
            return;
        }
        int v1 = this.a;
        if(v1 != 1) {
            if(v1 != 2) {
                arr_f1 = ProjectionRenderer.m;
            }
            else if(z) {
                arr_f1 = ProjectionRenderer.q;
            }
            else {
                arr_f1 = ProjectionRenderer.p;
            }
        }
        else if(z) {
            arr_f1 = ProjectionRenderer.o;
        }
        else {
            arr_f1 = ProjectionRenderer.n;
        }
        GLES20.glUniformMatrix3fv(this.f, 1, false, arr_f1, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, arr_f, 0);
        GLES20.glActiveTexture(0x84C0);
        GLES20.glBindTexture(0x8D65, v);
        GLES20.glUniform1i(this.i, 0);
        try {
            GlUtil.e();
        }
        catch(GlException glUtil$GlException0) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", glUtil$GlException0);
        }
        GLES20.glVertexAttribPointer(this.g, 3, 0x1406, false, 12, projectionRenderer$MeshData0.b);
        try {
            GlUtil.e();
        }
        catch(GlException glUtil$GlException1) {
            Log.e("ProjectionRenderer", "Failed to load position data", glUtil$GlException1);
        }
        GLES20.glVertexAttribPointer(this.h, 2, 0x1406, false, 8, projectionRenderer$MeshData0.c);
        try {
            GlUtil.e();
        }
        catch(GlException glUtil$GlException2) {
            Log.e("ProjectionRenderer", "Failed to load texture data", glUtil$GlException2);
        }
        GLES20.glDrawArrays(projectionRenderer$MeshData0.d, 0, projectionRenderer$MeshData0.a);
        try {
            GlUtil.e();
        }
        catch(GlException glUtil$GlException3) {
            Log.e("ProjectionRenderer", "Failed to render", glUtil$GlException3);
        }
    }

    public void b() {
        try {
            GlProgram glProgram0 = new GlProgram("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.d = glProgram0;
            this.e = glProgram0.l("uMvpMatrix");
            this.f = this.d.l("uTexMatrix");
            this.g = this.d.g("aPosition");
            this.h = this.d.g("aTexCoords");
            this.i = this.d.l("uTexture");
        }
        catch(GlException glUtil$GlException0) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", glUtil$GlException0);
        }
    }

    public static boolean c(Projection projection0) {
        return projection0.a.b() == 1 && projection0.a.a(0).a == 0 && projection0.b.b() == 1 && projection0.b.a(0).a == 0;
    }

    public void d(Projection projection0) {
        if(!ProjectionRenderer.c(projection0)) {
            return;
        }
        this.a = projection0.c;
        MeshData projectionRenderer$MeshData0 = new MeshData(projection0.a.a(0));
        this.b = projectionRenderer$MeshData0;
        if(!projection0.d) {
            projectionRenderer$MeshData0 = new MeshData(projection0.b.a(0));
        }
        this.c = projectionRenderer$MeshData0;
    }

    public void e() {
        GlProgram glProgram0 = this.d;
        if(glProgram0 != null) {
            try {
                glProgram0.f();
            }
            catch(GlException glUtil$GlException0) {
                Log.e("ProjectionRenderer", "Failed to delete the shader program", glUtil$GlException0);
            }
        }
    }
}

