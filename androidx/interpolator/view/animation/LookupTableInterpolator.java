package androidx.interpolator.view.animation;

import android.view.animation.Interpolator;

abstract class LookupTableInterpolator implements Interpolator {
    private final float[] a;
    private final float b;

    protected LookupTableInterpolator(float[] arr_f) {
        this.a = arr_f;
        this.b = 1.0f / ((float)(arr_f.length - 1));
    }

    @Override  // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if(f >= 1.0f) {
            return 1.0f;
        }
        if(f <= 0.0f) {
            return 0.0f;
        }
        int v = Math.min(((int)(((float)(this.a.length - 1)) * f)), this.a.length - 2);
        float f1 = this.a[v];
        return f1 + (f - ((float)v) * this.b) / this.b * (this.a[v + 1] - f1);
    }
}

