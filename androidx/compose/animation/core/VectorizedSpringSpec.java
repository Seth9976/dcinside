package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class VectorizedSpringSpec implements VectorizedFiniteAnimationSpec {
    private final float a;
    private final float b;
    private final VectorizedFloatAnimationSpec c;
    public static final int d = 8;

    static {
    }

    public VectorizedSpringSpec(float f, float f1, @m AnimationVector animationVector0) {
        this(f, f1, VectorizedAnimationSpecKt.d(animationVector0, f, f1));
    }

    public VectorizedSpringSpec(float f, float f1, AnimationVector animationVector0, int v, w w0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            animationVector0 = null;
        }
        this(f, f1, animationVector0);
    }

    private VectorizedSpringSpec(float f, float f1, Animations animations0) {
        this.a = f;
        this.b = f1;
        this.c = new VectorizedFloatAnimationSpec(animations0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.animation.core.VectorizedFiniteAnimationSpec
    public boolean a() {
        return false;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long b(@l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return this.c.b(animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector d(@l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return this.c.d(animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector e(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return this.c.e(v, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector f(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return this.c.f(v, animationVector0, animationVector1, animationVector2);
    }

    public final float h() {
        return this.a;
    }

    public final float i() {
        return this.b;
    }
}

