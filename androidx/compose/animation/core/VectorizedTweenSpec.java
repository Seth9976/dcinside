package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@StabilityInferred(parameters = 0)
public final class VectorizedTweenSpec implements VectorizedDurationBasedAnimationSpec {
    private final int a;
    private final int b;
    @l
    private final Easing c;
    @l
    private final VectorizedFloatAnimationSpec d;
    public static final int e = 8;

    static {
    }

    public VectorizedTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public VectorizedTweenSpec(int v, int v1, @l Easing easing0) {
        L.p(easing0, "easing");
        super();
        this.a = v;
        this.b = v1;
        this.c = easing0;
        this.d = new VectorizedFloatAnimationSpec(new FloatTweenSpec(this.c(), this.g(), easing0));
    }

    public VectorizedTweenSpec(int v, int v1, Easing easing0, int v2, w w0) {
        if((v2 & 1) != 0) {
            v = 300;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if((v2 & 4) != 0) {
            easing0 = EasingKt.b();
        }
        this(v, v1, easing0);
    }

    @Override  // androidx.compose.animation.core.VectorizedFiniteAnimationSpec
    public boolean a() {
        return false;
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public long b(AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return g.a(this, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int c() {
        return this.a;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public AnimationVector d(AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return f.a(this, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector e(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return this.d.e(v, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector f(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return this.d.f(v, animationVector0, animationVector1, animationVector2);
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int g() {
        return this.b;
    }

    @l
    public final Easing h() {
        return this.c;
    }
}

