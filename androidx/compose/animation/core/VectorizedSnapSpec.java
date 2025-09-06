package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@StabilityInferred(parameters = 0)
public final class VectorizedSnapSpec implements VectorizedDurationBasedAnimationSpec {
    private final int a;
    public static final int b;

    static {
    }

    public VectorizedSnapSpec() {
        this(0, 1, null);
    }

    public VectorizedSnapSpec(int v) {
        this.a = v;
    }

    public VectorizedSnapSpec(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
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
        return 0;
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
        return animationVector2;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector f(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return v >= ((long)this.g()) * 1000000L ? animationVector1 : animationVector0;
    }

    @Override  // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int g() {
        return this.a;
    }
}

