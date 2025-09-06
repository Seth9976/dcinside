package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import y4.l;

@Immutable
public final class RepeatableSpec implements FiniteAnimationSpec {
    private final int a;
    @l
    private final DurationBasedAnimationSpec b;
    @l
    private final RepeatMode c;
    private final long d;
    public static final int e;

    static {
    }

    @k(level = m.c, message = "This constructor has been deprecated")
    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        L.p(durationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        this(v, durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v1, w w0) {
        if((v1 & 4) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        this(v, durationBasedAnimationSpec0, repeatMode0);
    }

    private RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v1) {
        this.a = v;
        this.b = durationBasedAnimationSpec0;
        this.c = repeatMode0;
        this.d = v1;
    }

    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, int v2, w w0) {
        if((v2 & 4) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        if((v2 & 8) != 0) {
            v1 = 0L;
        }
        this(v, durationBasedAnimationSpec0, repeatMode0, v1, null);
    }

    public RepeatableSpec(int v, DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v1, w w0) {
        this(v, durationBasedAnimationSpec0, repeatMode0, v1);
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.a(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    @l
    public VectorizedFiniteAnimationSpec a(@l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "converter");
        VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec0 = this.b.a(twoWayConverter0);
        return new VectorizedRepeatableSpec(this.a, vectorizedDurationBasedAnimationSpec0, this.c, this.d, null);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof RepeatableSpec && ((RepeatableSpec)object0).a == this.a && L.g(((RepeatableSpec)object0).b, this.b) && ((RepeatableSpec)object0).c == this.c && StartOffset.f(((RepeatableSpec)object0).d, this.d);
    }

    @l
    public final DurationBasedAnimationSpec f() {
        return this.b;
    }

    public final long g() {
        return this.d;
    }

    public final int h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ((this.a * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + StartOffset.i(this.d);
    }

    @l
    public final RepeatMode i() {
        return this.c;
    }
}

