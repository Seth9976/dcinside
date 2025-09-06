package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@StabilityInferred(parameters = 0)
public final class FloatTweenSpec implements FloatAnimationSpec {
    private final int a;
    private final int b;
    @l
    private final Easing c;
    public static final int d;

    static {
    }

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public FloatTweenSpec(int v, int v1, @l Easing easing0) {
        L.p(easing0, "easing");
        super();
        this.a = v;
        this.b = v1;
        this.c = easing0;
    }

    public FloatTweenSpec(int v, int v1, Easing easing0, int v2, w w0) {
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

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return this.a(twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public VectorizedFloatAnimationSpec a(TwoWayConverter twoWayConverter0) {
        return c.c(this, twoWayConverter0);
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float b(long v, float f, float f1, float f2) {
        long v1 = this.f(v / 1000000L);
        int v2 = Long.compare(v1, 0L);
        if(v2 < 0) {
            return 0.0f;
        }
        if(v2 == 0) {
            return f2;
        }
        float f3 = this.e((v1 - 1L) * 1000000L, f, f1, f2);
        return (this.e(v1 * 1000000L, f, f1, f2) - f3) * 1000.0f;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public long c(float f, float f1, float f2) {
        return ((long)(this.b + this.a)) * 1000000L;
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float d(float f, float f1, float f2) {
        return c.a(this, f, f1, f2);
    }

    @Override  // androidx.compose.animation.core.FloatAnimationSpec
    public float e(long v, float f, float f1, float f2) {
        long v1 = this.f(v / 1000000L);
        float f3 = s.H((this.a == 0 ? 1.0f : ((float)v1) / ((float)this.a)), 0.0f, 1.0f);
        return VectorConvertersKt.k(f, f1, this.c.a(f3));
    }

    private final long f(long v) {
        return s.K(v - ((long)this.b), 0L, this.a);
    }

    public final int g() {
        return this.b;
    }

    public final int h() {
        return this.a;
    }
}

