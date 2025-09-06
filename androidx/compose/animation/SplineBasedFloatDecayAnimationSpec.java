package androidx.compose.animation;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    @l
    private final FlingCalculator a;
    public static final int b;

    static {
    }

    public SplineBasedFloatDecayAnimationSpec(@l Density density0) {
        L.p(density0, "density");
        super();
        this.a = new FlingCalculator(0.015f, density0);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float a() {
        return 0.0f;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float b(long v, float f, float f1) {
        return this.a.d(f1).j(v / 1000000L);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long c(float f, float f1) {
        return this.a.c(f1) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float d(float f, float f1) {
        return f + this.f(f1);
    }

    @Override  // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float e(long v, float f, float f1) {
        return f + this.a.d(f1).i(v / 1000000L);
    }

    private final float f(float f) {
        return this.a.b(f) * Math.signum(f);
    }
}

