package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import y4.l;

@StabilityInferred(parameters = 0)
public final class VectorizedInfiniteRepeatableSpec implements VectorizedAnimationSpec {
    @l
    private final VectorizedDurationBasedAnimationSpec a;
    @l
    private final RepeatMode b;
    private final long c;
    private final long d;
    public static final int e = 8;

    static {
    }

    @k(level = m.c, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0) {
        L.p(vectorizedDurationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        this(vectorizedDurationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, int v, w w0) {
        if((v & 2) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        this(vectorizedDurationBasedAnimationSpec0, repeatMode0);
    }

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v) {
        this.a = vectorizedDurationBasedAnimationSpec0;
        this.b = repeatMode0;
        this.c = ((long)(vectorizedDurationBasedAnimationSpec0.g() + vectorizedDurationBasedAnimationSpec0.c())) * 1000000L;
        this.d = v * 1000000L;
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v, int v1, w w0) {
        if((v1 & 2) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        if((v1 & 4) != 0) {
            v = 0L;
        }
        this(vectorizedDurationBasedAnimationSpec0, repeatMode0, v, null);
    }

    public VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v, w w0) {
        this(vectorizedDurationBasedAnimationSpec0, repeatMode0, v);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean a() {
        return true;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long b(@l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return 0x7FFFFFFFFFFFFFFFL;
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
        long v1 = this.i(v);
        AnimationVector animationVector3 = this.j(v, animationVector0, animationVector2, animationVector1);
        return this.a.e(v1, animationVector0, animationVector1, animationVector3);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector f(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        long v1 = this.i(v);
        AnimationVector animationVector3 = this.j(v, animationVector0, animationVector2, animationVector1);
        return this.a.f(v1, animationVector0, animationVector1, animationVector3);
    }

    public final long h() {
        return this.c;
    }

    private final long i(long v) {
        long v1 = this.d;
        if(v + v1 <= 0L) {
            return 0L;
        }
        long v2 = v + v1;
        long v3 = v2 / this.c;
        return this.b == RepeatMode.a || v3 % 2L == 0L ? v2 - v3 * this.c : (v3 + 1L) * this.c - v2;
    }

    private final AnimationVector j(long v, AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return v + this.d <= this.c ? animationVector1 : this.e(this.c - this.d, animationVector0, animationVector1, animationVector2);
    }
}

