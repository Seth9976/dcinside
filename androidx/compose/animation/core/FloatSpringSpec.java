package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;
import y4.l;

@StabilityInferred(parameters = 0)
public final class FloatSpringSpec implements FloatAnimationSpec {
    private final float a;
    private final float b;
    private final float c;
    @l
    private final SpringSimulation d;
    public static final int e = 8;

    static {
    }

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public FloatSpringSpec(float f, float f1, float f2) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        SpringSimulation springSimulation0 = new SpringSimulation(1.0f);
        springSimulation0.f(f);
        springSimulation0.h(f1);
        this.d = springSimulation0;
    }

    public FloatSpringSpec(float f, float f1, float f2, int v, w w0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.01f;
        }
        this(f, f1, f2);
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.a(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public VectorizedFloatAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return c.c(this, twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float b(long v, float f, float f1, float f2) {
        this.d.g(f1);
        return Motion.i(this.d.i(f, f2, v / 1000000L));
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public long c(float f, float f1, float f2) {
        return SpringEstimationKt.c(this.d.d(), this.d.b(), f2 / this.c, (f - f1) / this.c, 1.0f) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float d(float f, float f1, float f2) {
        return 0.0f;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float e(long v, float f, float f1, float f2) {
        this.d.g(f1);
        return Motion.h(this.d.i(f, f2, v / 1000000L));
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }
}

