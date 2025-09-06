package androidx.core.view.insets;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;
import androidx.annotation.ColorInt;

public class GradientProtection extends Protection {
    private final GradientDrawable r;
    private final int[] s;
    private boolean t;
    @ColorInt
    private int u;
    private float v;
    private static final float[] w;

    static {
        GradientProtection.w = new float[100];
        PathInterpolator pathInterpolator0 = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        for(int v = 99; v >= 0; --v) {
            GradientProtection.w[v] = pathInterpolator0.getInterpolation(((float)(99 - v)) / 99.0f);
        }
    }

    public GradientProtection(int v) {
        super(v);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        this.r = gradientDrawable0;
        this.s = new int[GradientProtection.w.length];
        this.u = 0;
        this.v = 1.2f;
        switch(v) {
            case 1: {
                gradientDrawable0.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                return;
            }
            case 2: {
                gradientDrawable0.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                return;
            }
            case 4: {
                gradientDrawable0.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
                return;
            }
            case 8: {
                gradientDrawable0.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
            }
        }
    }

    public GradientProtection(int v, @ColorInt int v1) {
        this(v);
        this.F(v1);
    }

    @ColorInt
    public int D() {
        return this.u;
    }

    public float E() {
        return this.v;
    }

    public void F(@ColorInt int v) {
        this.t = true;
        this.G(v);
    }

    private void G(@ColorInt int v) {
        if(this.u != v) {
            this.u = v;
            GradientProtection.I(v, this.s);
            this.r.setColors(this.s);
            this.u(this.r);
        }
    }

    public void H(float f) {
        if(f < 0.0f) {
            throw new IllegalArgumentException("Scale must not be negative.");
        }
        this.v = f;
        this.C();
    }

    private static void I(int v, int[] arr_v) {
        for(int v1 = arr_v.length - 1; v1 >= 0; --v1) {
            arr_v[v1] = Color.argb(((int)(GradientProtection.w[v1] * ((float)Color.alpha(v)))), Color.red(v), Color.green(v), Color.blue(v));
        }
    }

    @Override  // androidx.core.view.insets.Protection
    void g(@ColorInt int v) {
        if(!this.t) {
            this.G(v);
        }
    }

    @Override  // androidx.core.view.insets.Protection
    int n(int v) {
        return (int)(this.v * ((float)v));
    }
}

