package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil.GlException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    private final AtomicBoolean a;
    private final AtomicBoolean b;
    private final ProjectionRenderer c;
    private final FrameRotationQueue d;
    private final TimedValueQueue e;
    private final TimedValueQueue f;
    private final float[] g;
    private final float[] h;
    private int i;
    private SurfaceTexture j;
    private volatile int k;
    private int l;
    @Nullable
    private byte[] m;
    private static final String n = "SceneRenderer";

    public SceneRenderer() {
        this.a = new AtomicBoolean();
        this.b = new AtomicBoolean(true);
        this.c = new ProjectionRenderer();
        this.d = new FrameRotationQueue();
        this.e = new TimedValueQueue();
        this.f = new TimedValueQueue();
        this.g = new float[16];
        this.h = new float[16];
        this.k = 0;
        this.l = -1;
    }

    @Override  // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void a(long v, float[] arr_f) {
        this.d.e(v, arr_f);
    }

    public void c(float[] arr_f, boolean z) {
        GLES20.glClear(0x4000);
        try {
            GlUtil.e();
        }
        catch(GlException glUtil$GlException0) {
            Log.e("SceneRenderer", "Failed to draw a frame", glUtil$GlException0);
        }
        if(this.a.compareAndSet(true, false)) {
            ((SurfaceTexture)Assertions.g(this.j)).updateTexImage();
            try {
                GlUtil.e();
            }
            catch(GlException glUtil$GlException1) {
                Log.e("SceneRenderer", "Failed to draw a frame", glUtil$GlException1);
            }
            if(this.b.compareAndSet(true, false)) {
                GlUtil.V(this.g);
            }
            long v = this.j.getTimestamp();
            Long long0 = (Long)this.e.g(v);
            if(long0 != null) {
                this.d.c(this.g, ((long)long0));
            }
            Projection projection0 = (Projection)this.f.j(v);
            if(projection0 != null) {
                this.c.d(projection0);
            }
        }
        Matrix.multiplyMM(this.h, 0, arr_f, 0, this.g, 0);
        this.c.a(this.i, this.h, z);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.e();
            this.c.b();
            GlUtil.e();
            this.i = GlUtil.n();
        }
        catch(GlException glUtil$GlException0) {
            Log.e("SceneRenderer", "Failed to initialize the renderer", glUtil$GlException0);
        }
        SurfaceTexture surfaceTexture0 = new SurfaceTexture(this.i);
        this.j = surfaceTexture0;
        surfaceTexture0.setOnFrameAvailableListener((SurfaceTexture surfaceTexture0) -> this.a.set(true));
        return this.j;
    }

    // 检测为 Lambda 实现
    private void e(SurfaceTexture surfaceTexture0) [...]

    public void f(int v) {
        this.k = v;
    }

    private void g(@Nullable byte[] arr_b, int v, long v1) {
        byte[] arr_b1 = this.m;
        int v2 = this.l;
        this.m = arr_b;
        if(v == -1) {
            v = this.k;
        }
        this.l = v;
        if(v2 == v && Arrays.equals(arr_b1, this.m)) {
            return;
        }
        Projection projection0 = this.m == null ? null : ProjectionDecoder.a(this.m, this.l);
        if(projection0 == null || !ProjectionRenderer.c(projection0)) {
            projection0 = Projection.b(this.l);
        }
        this.f.a(v1, projection0);
    }

    public void h() {
        this.c.e();
    }

    @Override  // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void j() {
        this.e.c();
        this.d.d();
        this.b.set(true);
    }

    @Override  // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void l(long v, long v1, Format format0, @Nullable MediaFormat mediaFormat0) {
        this.e.a(v1, v);
        this.g(format0.y, format0.z, v1);
    }
}

