package kotlin.time;

import java.util.Collection;
import java.util.Iterator;
import kotlin.W0;
import kotlin.c0;
import kotlin.collections.T;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.l;
import kotlin.math.b;
import kotlin.ranges.s;
import kotlin.text.v;

@s0({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1494:1\n1447#1,6:1496\n1450#1,3:1502\n1447#1,6:1505\n1447#1,6:1511\n1450#1,3:1520\n1#2:1495\n1734#3,3:1517\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/DurationKt\n*L\n1371#1:1496,6\n1405#1:1502,3\n1408#1:1505,6\n1411#1:1511,6\n1447#1:1520,3\n1436#1:1517,3\n*E\n"})
public final class g {
    public static final int a = 1000000;
    public static final long b = 0x3FFFFFFFFFFA14BFL;
    public static final long c = 0x3FFFFFFFFFFFFFFFL;
    private static final long d = 4611686018426L;

    public static final long A(int v) {
        return g.m0(v, h.c);
    }

    public static final long B(long v) {
        return g.n0(v, h.c);
    }

    @h0(version = "1.3")
    @k(message = "Use \'Double.microseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void C(double f) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Int.microseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void D(int v) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Long.microseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void E(long v) {
    }

    public static final long F(double f) {
        return g.l0(f, h.d);
    }

    public static final long G(int v) {
        return g.m0(v, h.d);
    }

    public static final long H(long v) {
        return g.n0(v, h.d);
    }

    @h0(version = "1.3")
    @k(message = "Use \'Double.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void I(double f) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Int.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void J(int v) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Long.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void K(long v) {
    }

    public static final long L(double f) {
        return g.l0(f, h.f);
    }

    public static final long M(int v) {
        return g.m0(v, h.f);
    }

    public static final long N(long v) {
        return g.n0(v, h.f);
    }

    @h0(version = "1.3")
    @k(message = "Use \'Double.minutes\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void O(double f) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Int.minutes\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void P(int v) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Long.minutes\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void Q(long v) {
    }

    public static final long R(double f) {
        return g.l0(f, h.b);
    }

    public static final long S(int v) {
        return g.m0(v, h.b);
    }

    public static final long T(long v) {
        return g.n0(v, h.b);
    }

    @h0(version = "1.3")
    @k(message = "Use \'Double.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void U(double f) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Int.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void V(int v) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Long.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void W(long v) {
    }

    public static final long X(double f) {
        return g.l0(f, h.e);
    }

    public static final long Y(int v) {
        return g.m0(v, h.e);
    }

    public static final long Z(long v) {
        return g.n0(v, h.e);
    }

    @h0(version = "1.3")
    @k(message = "Use \'Double.seconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void a0(double f) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Int.seconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void b0(int v) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Long.seconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void c0(long v) {
    }

    private static final long d0(long v) [...] // Inlined contents

    private static final long e0(long v) [...] // Inlined contents

    public static final long f(long v) {
        return v * 1000000L;
    }

    private static final long f0(String s, boolean z) {
        long v12;
        int v9;
        long v = 0L;
        int v1 = s.length();
        if(v1 == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int v2 = s.charAt(0) != 43 && s.charAt(0) != 45 ? 0 : 1;
        int v3 = v2 <= 0 ? 0 : 1;
        boolean z1 = v3 != 0 && v.f5(s, '-', false, 2, null);
        if(v1 <= v2) {
            throw new IllegalArgumentException("No components");
        }
        if(s.charAt(v2) == 80) {
            int v4 = v2 + 1;
            if(v4 != v1) {
                Enum enum0 = null;
                boolean z2 = false;
                while(true) {
                    if(v4 >= v1) {
                        return z1 ? e.z0(v) : v;
                    }
                    if(s.charAt(v4) == 84) {
                        if(!z2) {
                            ++v4;
                            if(v4 != v1) {
                                z2 = true;
                                continue;
                            }
                        }
                        throw new IllegalArgumentException();
                    }
                    int v5;
                    for(v5 = v4; v5 < s.length(); ++v5) {
                        int v6 = s.charAt(v5);
                        if((0x30 > v6 || v6 >= 58) && !v.V2("+-.", ((char)v6), false, 2, null)) {
                            break;
                        }
                    }
                    L.n(s, "null cannot be cast to non-null type java.lang.String");
                    String s1 = s.substring(v4, v5);
                    L.o(s1, "substring(...)");
                    if(s1.length() == 0) {
                        throw new IllegalArgumentException();
                    }
                    int v7 = v4 + s1.length();
                    if(v7 < 0 || v7 >= s.length()) {
                        throw new IllegalArgumentException("Missing unit for value " + s1);
                    }
                    h h0 = kotlin.time.k.f(s.charAt(v7), z2);
                    if(enum0 != null && enum0.compareTo(h0) <= 0) {
                        throw new IllegalArgumentException("Unexpected order of duration components");
                    }
                    int v8 = v.r3(s1, '.', 0, false, 6, null);
                    if(h0 != h.e || v8 <= 0) {
                        v9 = v7 + 1;
                        v = e.h0(v, g.n0(g.g0(s1), h0));
                    }
                    else {
                        L.n(s1, "null cannot be cast to non-null type java.lang.String");
                        String s2 = s1.substring(0, v8);
                        L.o(s2, "substring(...)");
                        v9 = v7 + 1;
                        long v10 = e.h0(v, g.n0(g.g0(s2), h0));
                        L.n(s1, "null cannot be cast to non-null type java.lang.String");
                        String s3 = s1.substring(v8);
                        L.o(s3, "substring(...)");
                        v = e.h0(v10, g.l0(Double.parseDouble(s3), h0));
                    }
                    v4 = v9;
                    enum0 = h0;
                }
            }
            throw new IllegalArgumentException();
        }
        if(z) {
            throw new IllegalArgumentException();
        }
        if(v.e2(s, v2, "Infinity", 0, Math.max(v1 - v2, 8), true)) {
            return z1 ? e.z0(0x7FFFFFFFFFFFFFFFL) : 0x7FFFFFFFFFFFFFFFL;
        }
        int v11 = v3 ^ 1;
        if(v3 == 0 || s.charAt(v2) != 40 || v.v7(s) != 41) {
            v12 = 0L;
        }
        else {
            ++v2;
            --v1;
            if(v2 == v1) {
                throw new IllegalArgumentException("No components");
            }
            v12 = 0L;
            v11 = 1;
        }
        Enum enum1 = null;
        for(boolean z3 = false; v2 < v1; z3 = true) {
            if(z3 && v11 != 0) {
                while(v2 < s.length() && s.charAt(v2) == 0x20) {
                    ++v2;
                }
            }
            int v13;
            for(v13 = v2; v13 < s.length(); ++v13) {
                int v14 = s.charAt(v13);
                if((0x30 > v14 || v14 >= 58) && v14 != 46) {
                    break;
                }
            }
            L.n(s, "null cannot be cast to non-null type java.lang.String");
            String s4 = s.substring(v2, v13);
            L.o(s4, "substring(...)");
            if(s4.length() == 0) {
                throw new IllegalArgumentException();
            }
            int v15 = v2 + s4.length();
            int v16;
            for(v16 = v15; v16 < s.length(); ++v16) {
                int v17 = s.charAt(v16);
                if(97 > v17 || v17 >= 0x7B) {
                    break;
                }
            }
            L.n(s, "null cannot be cast to non-null type java.lang.String");
            String s5 = s.substring(v15, v16);
            L.o(s5, "substring(...)");
            v2 = v15 + s5.length();
            h h1 = kotlin.time.k.g(s5);
            if(enum1 != null && enum1.compareTo(h1) <= 0) {
                throw new IllegalArgumentException("Unexpected order of duration components");
            }
            int v18 = v.r3(s4, '.', 0, false, 6, null);
            if(v18 > 0) {
                L.n(s4, "null cannot be cast to non-null type java.lang.String");
                String s6 = s4.substring(0, v18);
                L.o(s6, "substring(...)");
                long v19 = e.h0(v12, g.n0(Long.parseLong(s6), h1));
                L.n(s4, "null cannot be cast to non-null type java.lang.String");
                String s7 = s4.substring(v18);
                L.o(s7, "substring(...)");
                v12 = e.h0(v19, g.l0(Double.parseDouble(s7), h1));
                if(v2 < v1) {
                    throw new IllegalArgumentException("Fractional component must be last");
                }
            }
            else {
                v12 = e.h0(v12, g.n0(Long.parseLong(s4), h1));
            }
            enum1 = h1;
        }
        v = v12;
        return z1 ? e.z0(v) : v;
    }

    public static final long g(long v) {
        return v / 1000000L;
    }

    private static final long g0(String s) {
        int v = s.length();
        int v1 = v <= 0 || !v.V2("+-", s.charAt(0), false, 2, null) ? 0 : 1;
        if(v - v1 > 16) {
            kotlin.ranges.l l0 = new kotlin.ranges.l(v1, v.j3(s));
            if(!(l0 instanceof Collection) || !((Collection)l0).isEmpty()) {
                Iterator iterator0 = l0.iterator();
                while(iterator0.hasNext()) {
                    int v2 = s.charAt(((T)iterator0).b());
                    if(0x30 > v2 || v2 >= 58) {
                        goto label_11;
                    }
                }
            }
            return s.charAt(0) == 45 ? 0x8000000000000000L : 0x7FFFFFFFFFFFFFFFL;
        }
    label_11:
        if(v.v2(s, "+", false, 2, null)) {
            s = v.C6(s, 1);
        }
        return Long.parseLong(s);
    }

    private static final int h0(String s, int v, Function1 function10) {
        while(v < s.length() && ((Boolean)function10.invoke(Character.valueOf(s.charAt(v)))).booleanValue()) {
            ++v;
        }
        return v;
    }

    private static final long i(long v, int v1) {
        return e.i((v << 1) + ((long)v1));
    }

    private static final String i0(String s, int v, Function1 function10) {
        int v1;
        for(v1 = v; v1 < s.length() && ((Boolean)function10.invoke(Character.valueOf(s.charAt(v1)))).booleanValue(); ++v1) {
        }
        L.n(s, "null cannot be cast to non-null type java.lang.String");
        String s1 = s.substring(v, v1);
        L.o(s1, "substring(...)");
        return s1;
    }

    private static final long j(long v) {
        return e.i((v << 1) + 1L);
    }

    @W0(markerClass = {kotlin.time.l.class})
    @h0(version = "1.6")
    @f
    private static final long j0(double f, long v) {
        return e.i0(v, f);
    }

    private static final long k(long v) {
        return -4611686018426L > v || v >= 4611686018427L ? g.j(s.K(v, 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)) : g.l(v * 1000000L);
    }

    @W0(markerClass = {kotlin.time.l.class})
    @h0(version = "1.6")
    @f
    private static final long k0(int v, long v1) {
        return e.j0(v1, v);
    }

    private static final long l(long v) {
        return e.i(v << 1);
    }

    @W0(markerClass = {kotlin.time.l.class})
    @h0(version = "1.6")
    public static final long l0(double f, @y4.l h h0) {
        L.p(h0, "unit");
        double f1 = j.a(f, h0, h.b);
        if(Double.isNaN(f1)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long v = b.M0(f1);
        return 0xC00000000005EB41L > v || v >= 0x3FFFFFFFFFFA14C0L ? g.k(b.M0(j.a(f, h0, h.d))) : g.l(v);
    }

    private static final long m(long v) {
        return 0xC00000000005EB41L > v || v >= 0x3FFFFFFFFFFA14C0L ? g.j(v / 1000000L) : g.l(v);
    }

    @W0(markerClass = {kotlin.time.l.class})
    @h0(version = "1.6")
    public static final long m0(int v, @y4.l h h0) {
        L.p(h0, "unit");
        return h0.compareTo(h.e) > 0 ? g.n0(v, h0) : g.l(j.c(v, h0, h.b));
    }

    public static final long n(double f) {
        return g.l0(f, h.h);
    }

    @W0(markerClass = {kotlin.time.l.class})
    @h0(version = "1.6")
    public static final long n0(long v, @y4.l h h0) {
        L.p(h0, "unit");
        long v1 = j.c(0x3FFFFFFFFFFA14BFL, h.b, h0);
        return -v1 > v || v > v1 ? g.j(s.K(j.b(v, h0, h.d), 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)) : g.l(j.c(v, h0, h.b));
    }

    public static final long o(int v) {
        return g.m0(v, h.h);
    }

    public static final long p(long v) {
        return g.n0(v, h.h);
    }

    @h0(version = "1.3")
    @k(message = "Use \'Double.days\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void q(double f) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Int.days\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void r(int v) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Long.days\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void s(long v) {
    }

    public static final long t(double f) {
        return g.l0(f, h.g);
    }

    public static final long u(int v) {
        return g.m0(v, h.g);
    }

    public static final long v(long v) {
        return g.n0(v, h.g);
    }

    @h0(version = "1.3")
    @k(message = "Use \'Double.hours\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void w(double f) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Int.hours\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void x(int v) {
    }

    @h0(version = "1.3")
    @k(message = "Use \'Long.hours\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @kotlin.time.l
    public static void y(long v) {
    }

    public static final long z(double f) {
        return g.l0(f, h.c);
    }
}

