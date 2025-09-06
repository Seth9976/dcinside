package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class TweenSpec implements DurationBasedAnimationSpec {
    private final int a;
    private final int b;
    @l
    private final Easing c;
    public static final int d;

    static {
    }

    public TweenSpec() {
        this(0, 0, null, 7, null);
    }

    public TweenSpec(int v, int v1, @l Easing easing0) {
        L.p(easing0, "easing");
        super();
        this.a = v;
        this.b = v1;
        this.c = easing0;
    }

    public TweenSpec(int v, int v1, Easing easing0, int v2, w w0) {
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

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.i(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.DurationBasedAnimationSpec
    public VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.i(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.i(twoWayConverter0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof TweenSpec && ((TweenSpec)object0).a == this.a && ((TweenSpec)object0).b == this.b && L.g(((TweenSpec)object0).c, this.c);
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.a;
    }

    @l
    public final Easing h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return (this.a * 0x1F + this.c.hashCode()) * 0x1F + this.b;
    }

    @l
    public VectorizedTweenSpec i(@l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "converter");
        return new VectorizedTweenSpec(this.a, this.b, this.c);
    }
}

