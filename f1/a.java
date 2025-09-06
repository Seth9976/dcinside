package F1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R.attr;
import com.google.android.material.color.v;
import com.google.android.material.internal.M;
import com.google.android.material.resources.b;

public class a {
    private final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final float e;
    private static final float f = 4.5f;
    private static final float g = 2.0f;
    private static final int h;

    static {
        a.h = 5;
    }

    public a(@NonNull Context context0) {
        this(b.b(context0, attr.elevationOverlayEnabled, false), v.b(context0, attr.elevationOverlayColor, 0), v.b(context0, attr.elevationOverlayAccentColor, 0), v.b(context0, attr.colorSurface, 0), context0.getResources().getDisplayMetrics().density);
    }

    public a(boolean z, @ColorInt int v, @ColorInt int v1, @ColorInt int v2, float f) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = f;
    }

    public int a(float f) {
        return Math.round(this.b(f) * 255.0f);
    }

    public float b(float f) {
        return this.e <= 0.0f || f <= 0.0f ? 0.0f : Math.min((((float)Math.log1p(f / this.e)) * 4.5f + 2.0f) / 100.0f, 1.0f);
    }

    @ColorInt
    public int c(@ColorInt int v, float f) {
        float f1 = this.b(f);
        int v1 = Color.alpha(v);
        int v2 = v.t(ColorUtils.D(v, 0xFF), this.b, f1);
        if(f1 > 0.0f) {
            int v3 = this.c;
            if(v3 != 0) {
                v2 = v.s(v2, ColorUtils.D(v3, a.h));
            }
        }
        return ColorUtils.D(v2, v1);
    }

    @ColorInt
    public int d(@ColorInt int v, float f, @NonNull View view0) {
        return this.c(v, f + this.i(view0));
    }

    // 去混淆评级： 低(20)
    @ColorInt
    public int e(@ColorInt int v, float f) {
        return !this.a || !this.m(v) ? v : this.c(v, f);
    }

    @ColorInt
    public int f(@ColorInt int v, float f, @NonNull View view0) {
        return this.e(v, f + this.i(view0));
    }

    @ColorInt
    public int g(float f) {
        return this.e(this.d, f);
    }

    @ColorInt
    public int h(float f, @NonNull View view0) {
        return this.g(f + this.i(view0));
    }

    public float i(@NonNull View view0) {
        return M.p(view0);
    }

    @ColorInt
    public int j() {
        return this.b;
    }

    @ColorInt
    public int k() {
        return this.d;
    }

    public boolean l() {
        return this.a;
    }

    private boolean m(@ColorInt int v) {
        return ColorUtils.D(v, 0xFF) == this.d;
    }
}

