package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class SnapSpec implements DurationBasedAnimationSpec {
    private final int a;
    public static final int b;

    static {
    }

    public SnapSpec() {
        this(0, 1, null);
    }

    public SnapSpec(int v) {
        this.a = v;
    }

    public SnapSpec(int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        this(v);
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.a(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.DurationBasedAnimationSpec
    @l
    public VectorizedDurationBasedAnimationSpec a(@l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "converter");
        return new VectorizedSnapSpec(this.a);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.a(twoWayConverter0);
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof SnapSpec && ((SnapSpec)object0).a == this.a;
    }

    public final int f() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }
}

