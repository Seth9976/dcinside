package kotlin.random;

import androidx.collection.b;
import kotlin.A0;
import kotlin.D0;
import kotlin.H0;
import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.A;
import kotlin.ranges.x;
import kotlin.t;
import kotlin.y0;
import y4.l;

@s0({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class h {
    public static final void a(int v, int v1) {
        if(y0.a(v1, v) <= 0) {
            throw new IllegalArgumentException(g.c(D0.b(v), D0.b(v1)).toString());
        }
    }

    public static final void b(long v, long v1) {
        if(b.a(v1, v) <= 0) {
            throw new IllegalArgumentException(g.c(H0.b(v), H0.b(v1)).toString());
        }
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] c(@l f f0, int v) {
        L.p(f0, "<this>");
        return A0.d(f0.d(v));
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] d(@l f f0, @l byte[] arr_b) {
        L.p(f0, "$this$nextUBytes");
        L.p(arr_b, "array");
        f0.e(arr_b);
        return arr_b;
    }

    @h0(version = "1.3")
    @t
    @l
    public static final byte[] e(@l f f0, @l byte[] arr_b, int v, int v1) {
        L.p(f0, "$this$nextUBytes");
        L.p(arr_b, "array");
        f0.f(arr_b, v, v1);
        return arr_b;
    }

    public static byte[] f(f f0, byte[] arr_b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = A0.o(arr_b);
        }
        return h.e(f0, arr_b, v, v1);
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final int g(@l f f0) {
        L.p(f0, "<this>");
        return D0.h(f0.l());
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final int h(@l f f0, @l x x0) {
        L.p(f0, "<this>");
        L.p(x0, "range");
        if(x0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + x0);
        }
        if(y0.a(x0.h(), -1) < 0) {
            return h.i(f0, x0.g(), x0.h() + 1);
        }
        return y0.a(x0.g(), 0) <= 0 ? h.g(f0) : D0.h(h.i(f0, x0.g() - 1, x0.h()) + 1);
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final int i(@l f f0, int v, int v1) {
        L.p(f0, "$this$nextUInt");
        h.a(v, v1);
        return D0.h(f0.n(v ^ 0x80000000, v1 ^ 0x80000000) ^ 0x80000000);
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final int j(@l f f0, int v) {
        L.p(f0, "$this$nextUInt");
        return h.i(f0, 0, v);
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final long k(@l f f0) {
        L.p(f0, "<this>");
        return H0.h(f0.o());
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final long l(@l f f0, @l A a0) {
        L.p(f0, "<this>");
        L.p(a0, "range");
        if(a0.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + a0);
        }
        if(b.a(a0.h(), -1L) < 0) {
            return h.n(f0, a0.g(), a0.h() + 1L);
        }
        return b.a(a0.g(), 0L) <= 0 ? h.k(f0) : H0.h(h.n(f0, a0.g() - 1L, a0.h()) + 1L);
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final long m(@l f f0, long v) {
        L.p(f0, "$this$nextULong");
        return h.n(f0, 0L, v);
    }

    @W0(markerClass = {t.class})
    @h0(version = "1.5")
    public static final long n(@l f f0, long v, long v1) {
        L.p(f0, "$this$nextULong");
        h.b(v, v1);
        return H0.h(f0.q(v ^ 0x8000000000000000L, v1 ^ 0x8000000000000000L) ^ 0x8000000000000000L);
    }
}

