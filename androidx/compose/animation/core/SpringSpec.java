package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class SpringSpec implements FiniteAnimationSpec {
    private final float a;
    private final float b;
    @m
    private final Object c;
    public static final int d;

    static {
    }

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public SpringSpec(float f, float f1, @m Object object0) {
        this.a = f;
        this.b = f1;
        this.c = object0;
    }

    public SpringSpec(float f, float f1, Object object0, int v, w w0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1500.0f;
        }
        if((v & 4) != 0) {
            object0 = null;
        }
        this(f, f1, object0);
    }

    @Override  // androidx.compose.animation.core.AnimationSpec
    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.i(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FiniteAnimationSpec
    public VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.i(twoWayConverter0);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof SpringSpec && ((SpringSpec)object0).a == this.a && ((SpringSpec)object0).b == this.b && L.g(((SpringSpec)object0).c, this.c);
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    @m
    public final Object h() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return this.c == null ? Float.floatToIntBits(this.a) * 0x1F + Float.floatToIntBits(this.b) : (this.c.hashCode() * 0x1F + Float.floatToIntBits(this.a)) * 0x1F + Float.floatToIntBits(this.b);
    }

    @l
    public VectorizedSpringSpec i(@l TwoWayConverter twoWayConverter0) {
        L.p(twoWayConverter0, "converter");
        AnimationVector animationVector0 = AnimationSpecKt.b(twoWayConverter0, this.c);
        return new VectorizedSpringSpec(this.a, this.b, animationVector0);
    }
}

