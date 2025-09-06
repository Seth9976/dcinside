package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import y4.l;

@StabilityInferred(parameters = 0)
public final class VectorizedRepeatableSpec implements VectorizedFiniteAnimationSpec {
    private final int a;
    @l
    private final VectorizedDurationBasedAnimationSpec b;
    @l
    private final RepeatMode c;
    private final long d;
    private final long e;
    public static final int f = 8;

    static {
    }

    @k(level = m.c, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0) {
        L.p(vectorizedDurationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        this(v, vectorizedDurationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, int v1, w w0) {
        if((v1 & 4) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        this(v, vectorizedDurationBasedAnimationSpec0, repeatMode0);
    }

    private VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v1) {
        this.a = v;
        this.b = vectorizedDurationBasedAnimationSpec0;
        this.c = repeatMode0;
        if(v < 1) {
            throw new IllegalArgumentException("Iterations count can\'t be less than 1");
        }
        this.d = ((long)(vectorizedDurationBasedAnimationSpec0.g() + vectorizedDurationBasedAnimationSpec0.c())) * 1000000L;
        this.e = v1 * 1000000L;
    }

    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, int v2, w w0) {
        if((v2 & 4) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        if((v2 & 8) != 0) {
            v1 = 0L;
        }
        this(v, vectorizedDurationBasedAnimationSpec0, repeatMode0, v1, null);
    }

    public VectorizedRepeatableSpec(int v, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, w w0) {
        this(v, vectorizedDurationBasedAnimationSpec0, repeatMode0, v1);
    }

    @Override  // androidx.compose.animation.core.VectorizedFiniteAnimationSpec
    public boolean a() {
        return false;
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    public long b(@l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        return ((long)this.a) * this.d - this.e;
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
        return this.b.e(v1, animationVector0, animationVector1, animationVector3);
    }

    @Override  // androidx.compose.animation.core.VectorizedAnimationSpec
    @l
    public AnimationVector f(long v, @l AnimationVector animationVector0, @l AnimationVector animationVector1, @l AnimationVector animationVector2) {
        L.p(animationVector0, "initialValue");
        L.p(animationVector1, "targetValue");
        L.p(animationVector2, "initialVelocity");
        long v1 = this.i(v);
        AnimationVector animationVector3 = this.j(v, animationVector0, animationVector2, animationVector1);
        return this.b.f(v1, animationVector0, animationVector1, animationVector3);
    }

    public final long h() {
        return this.d;
    }

    private final long i(long v) {
        long v1 = this.e;
        if(v + v1 <= 0L) {
            return 0L;
        }
        long v2 = v + v1;
        long v3 = Math.min(v2 / this.d, ((long)this.a) - 1L);
        return this.c == RepeatMode.a || v3 % 2L == 0L ? v2 - v3 * this.d : (v3 + 1L) * this.d - v2;
    }

    private final AnimationVector j(long v, AnimationVector animationVector0, AnimationVector animationVector1, AnimationVector animationVector2) {
        return v + this.e <= this.d ? animationVector1 : this.e(this.d - this.e, animationVector0, animationVector1, animationVector2);
    }
}

