package kotlin.random;

import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.o;
import y4.l;

@s0({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public final class g {
    @h0(version = "1.3")
    @l
    public static final f a(int v) {
        return new i(v, v >> 0x1F);
    }

    @h0(version = "1.3")
    @l
    public static final f b(long v) {
        return new i(((int)v), ((int)(v >> 0x20)));
    }

    @l
    public static final String c(@l Object object0, @l Object object1) {
        L.p(object0, "from");
        L.p(object1, "until");
        return "Random range is empty: [" + object0 + ", " + object1 + ").";
    }

    public static final void d(double f, double f1) {
        if(f1 <= f) {
            throw new IllegalArgumentException(g.c(f, f1).toString());
        }
    }

    public static final void e(int v, int v1) {
        if(v1 <= v) {
            throw new IllegalArgumentException(g.c(v, v1).toString());
        }
    }

    public static final void f(long v, long v1) {
        if(v1 <= v) {
            throw new IllegalArgumentException(g.c(v, v1).toString());
        }
    }

    public static final int g(int v) {
        return 0x1F - Integer.numberOfLeadingZeros(v);
    }

    @h0(version = "1.3")
    public static final int h(@l f f0, @l kotlin.ranges.l l0) {
        L.p(f0, "<this>");
        L.p(l0, "range");
        if(l0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + l0);
        }
        if(l0.h() < 0x7FFFFFFF) {
            return f0.n(l0.g(), l0.h() + 1);
        }
        return l0.g() <= 0x80000000 ? f0.l() : f0.n(l0.g() - 1, l0.h()) + 1;
    }

    @h0(version = "1.3")
    public static final long i(@l f f0, @l o o0) {
        L.p(f0, "<this>");
        L.p(o0, "range");
        if(o0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + o0);
        }
        if(o0.h() < 0x7FFFFFFFFFFFFFFFL) {
            return f0.q(o0.g(), o0.h() + 1L);
        }
        return o0.g() <= 0x8000000000000000L ? f0.o() : f0.q(o0.g() - 1L, o0.h()) + 1L;
    }

    public static final int j(int v, int v1) {
        return v >>> 0x20 - v1 & -v1 >> 0x1F;
    }
}

