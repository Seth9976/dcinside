package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import y4.l;

@StabilityInferred(parameters = 0)
public final class InfiniteRepeatableSpec implements AnimationSpec {
    @l
    private final DurationBasedAnimationSpec a;
    @l
    private final RepeatMode b;
    private final long c;
    public static final int d = 8;

    static {
    }

    @k(level = m.c, message = "This constructor has been deprecated")
    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0) {
        L.p(durationBasedAnimationSpec0, "animation");
        L.p(repeatMode0, "repeatMode");
        this(durationBasedAnimationSpec0, repeatMode0, 0L, null);
    }

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, int v, w w0) {
        if((v & 2) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        this(durationBasedAnimationSpec0, repeatMode0);
    }

    private InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v) {
        this.a = durationBasedAnimationSpec0;
        this.b = repeatMode0;
        this.c = v;
    }

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v, int v1, w w0) {
        if((v1 & 2) != 0) {
            repeatMode0 = RepeatMode.a;
        }
        if((v1 & 4) != 0) {
            v = 0L;
        }
        this(durationBasedAnimationSpec0, repeatMode0, v, null);
    }

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec0, RepeatMode repeatMode0, long v, w w0) {
        this(durationBasedAnimationSpec0, repeatMode0, v);
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    @l
    public VectorizedAnimationSpec a(@l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "converter");
        return new VectorizedInfiniteRepeatableSpec(this.a.a(twoWayConverter0), this.b, this.c, null);
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@y4.m Object object0) {
        return object0 instanceof InfiniteRepeatableSpec && L.g(((InfiniteRepeatableSpec)object0).a, this.a) && ((InfiniteRepeatableSpec)object0).b == this.b && StartOffset.f(((InfiniteRepeatableSpec)object0).c, this.c);
    }

    @l
    public final DurationBasedAnimationSpec f() {
        return this.a;
    }

    public final long g() {
        return this.c;
    }

    @l
    public final RepeatMode h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + StartOffset.i(this.c);
    }
}

