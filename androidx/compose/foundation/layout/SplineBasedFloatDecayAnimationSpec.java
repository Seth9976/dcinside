package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import y4.l;

final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float a;

    public SplineBasedFloatDecayAnimationSpec(@l Density density0) {
        L.p(density0, "density");
        super();
        this.a = density0.getDensity() * 51890.199219f;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float a() {
        return 0.0f;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float b(long v, float f, float f1) {
        long v1 = this.c(0.0f, f1);
        float f2 = this.f(f1);
        return FlingResult.f(AndroidFlingSpline.a.b((v1 <= 0L ? 1.0f : ((float)v) / ((float)v1)))) * f2 / ((float)v1) * 1000000000.0f;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long c(float f, float f1) {
        return (long)(Math.exp(this.g(f1) / 1.358202) * 1000000000.0);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float d(float f, float f1) {
        return f + this.f(f1);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float e(long v, float f, float f1) {
        long v1 = this.c(0.0f, f1);
        return v1 <= 0L ? f + this.f(f1) * 1.0f : f + this.f(f1) * FlingResult.e(AndroidFlingSpline.a.b(((float)v) / ((float)v1)));
    }

    // 去混淆评级： 低(30)
    public final float f(float f) {
        double f1 = Math.exp(1.736268 * this.g(f));
        return ((float)(((double)(0.015f * this.a)) * f1)) * Math.signum(f);
    }

    // 去混淆评级： 低(20)
    private final double g(float f) {
        return AndroidFlingSpline.a.a(f, 0.015f * this.a);
    }
}

