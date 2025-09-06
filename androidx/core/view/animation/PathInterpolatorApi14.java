package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

class PathInterpolatorApi14 implements Interpolator {
    private final float[] a;
    private final float[] b;
    private static final float c = 0.002f;

    PathInterpolatorApi14(float f, float f1) {
        this(PathInterpolatorApi14.b(f, f1));
    }

    PathInterpolatorApi14(float f, float f1, float f2, float f3) {
        this(PathInterpolatorApi14.a(f, f1, f2, f3));
    }

    PathInterpolatorApi14(Path path0) {
        PathMeasure pathMeasure0 = new PathMeasure(path0, false);
        float f = pathMeasure0.getLength();
        int v = ((int)(f / 0.002f)) + 1;
        this.a = new float[v];
        this.b = new float[v];
        float[] arr_f = new float[2];
        for(int v1 = 0; v1 < v; ++v1) {
            pathMeasure0.getPosTan(((float)v1) * f / ((float)(((int)(f / 0.002f)))), arr_f, null);
            this.a[v1] = arr_f[0];
            this.b[v1] = arr_f[1];
        }
    }

    private static Path a(float f, float f1, float f2, float f3) {
        Path path0 = new Path();
        path0.moveTo(0.0f, 0.0f);
        path0.cubicTo(f, f1, f2, f3, 1.0f, 1.0f);
        return path0;
    }

    private static Path b(float f, float f1) {
        Path path0 = new Path();
        path0.moveTo(0.0f, 0.0f);
        path0.quadTo(f, f1, 1.0f, 1.0f);
        return path0;
    }

    @Override  // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if(f <= 0.0f) {
            return 0.0f;
        }
        if(f >= 1.0f) {
            return 1.0f;
        }
        int v = this.a.length - 1;
        int v1 = 0;
        while(v - v1 > 1) {
            int v2 = (v1 + v) / 2;
            if(f < this.a[v2]) {
                v = v2;
            }
            else {
                v1 = v2;
            }
        }
        float f1 = this.a[v];
        float f2 = this.a[v1];
        float f3 = f1 - f2;
        if(f3 == 0.0f) {
            return this.b[v1];
        }
        float f4 = this.b[v1];
        return f4 + (f - f2) / f3 * (this.b[v] - f4);
    }
}

