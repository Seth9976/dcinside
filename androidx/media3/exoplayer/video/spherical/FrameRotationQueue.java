package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.TimedValueQueue;

final class FrameRotationQueue {
    private final float[] a;
    private final float[] b;
    private final TimedValueQueue c;
    private boolean d;

    public FrameRotationQueue() {
        this.a = new float[16];
        this.b = new float[16];
        this.c = new TimedValueQueue();
    }

    public static void a(float[] arr_f, float[] arr_f1) {
        GlUtil.V(arr_f);
        float f = arr_f1[10];
        float f1 = arr_f1[8];
        float f2 = (float)Math.sqrt(f * f + f1 * f1);
        float f3 = arr_f1[10];
        arr_f[0] = f3 / f2;
        float f4 = arr_f1[8];
        arr_f[2] = f4 / f2;
        arr_f[8] = -f4 / f2;
        arr_f[10] = f3 / f2;
    }

    private static void b(float[] arr_f, float[] arr_f1) {
        float f = arr_f1[0];
        float f1 = -arr_f1[1];
        float f2 = -arr_f1[2];
        float f3 = Matrix.length(f, f1, f2);
        if(f3 != 0.0f) {
            Matrix.setRotateM(arr_f, 0, ((float)Math.toDegrees(f3)), f / f3, f1 / f3, f2 / f3);
            return;
        }
        GlUtil.V(arr_f);
    }

    public boolean c(float[] arr_f, long v) {
        float[] arr_f1 = (float[])this.c.j(v);
        if(arr_f1 == null) {
            return false;
        }
        FrameRotationQueue.b(this.b, arr_f1);
        if(!this.d) {
            FrameRotationQueue.a(this.a, this.b);
            this.d = true;
        }
        Matrix.multiplyMM(arr_f, 0, this.a, 0, this.b, 0);
        return true;
    }

    public void d() {
        this.c.c();
        this.d = false;
    }

    public void e(long v, float[] arr_f) {
        this.c.a(v, arr_f);
    }
}

