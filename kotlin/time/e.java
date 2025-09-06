package kotlin.time;

import A3.p;
import A3.q;
import A3.r;
import kotlin.W0;
import kotlin.b0;
import kotlin.c0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.math.b;
import kotlin.ranges.o;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.m;
import z3.g;

@W0(markerClass = {l.class})
@h0(version = "1.6")
@s0({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1494:1\n38#1:1495\n38#1:1496\n38#1:1497\n38#1:1498\n38#1:1499\n683#1,2:1500\n700#1,2:1509\n170#2,6:1502\n1#3:1508\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1495\n40#1:1496\n458#1:1497\n478#1:1498\n662#1:1499\n979#1:1500,2\n1070#1:1509,2\n1021#1:1502,6\n*E\n"})
@g
public final class e implements Comparable {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        @f
        public static void A(double f) {
        }

        @f
        public static void B(int v) {
        }

        @f
        public static void C(long v) {
        }

        private final long D(double f) {
            return kotlin.time.g.l0(f, h.f);
        }

        private final long E(int v) {
            return kotlin.time.g.m0(v, h.f);
        }

        private final long F(long v) {
            return kotlin.time.g.n0(v, h.f);
        }

        @f
        public static void G(double f) {
        }

        @f
        public static void H(int v) {
        }

        @f
        public static void I(long v) {
        }

        // 去混淆评级： 低(20)
        public final long J() [...] // 潜在的解密器

        private final long K(double f) {
            return kotlin.time.g.l0(f, h.b);
        }

        private final long L(int v) {
            return kotlin.time.g.m0(v, h.b);
        }

        private final long M(long v) {
            return kotlin.time.g.n0(v, h.b);
        }

        @f
        public static void N(double f) {
        }

        @f
        public static void O(int v) {
        }

        @f
        public static void P(long v) {
        }

        private final long Q(double f) {
            return kotlin.time.g.l0(f, h.e);
        }

        private final long R(int v) {
            return kotlin.time.g.m0(v, h.e);
        }

        private final long S(long v) {
            return kotlin.time.g.n0(v, h.e);
        }

        @f
        public static void T(double f) {
        }

        @f
        public static void U(int v) {
        }

        @f
        public static void V(long v) {
        }

        // 去混淆评级： 低(20)
        public final long W() [...] // 潜在的解密器

        @h0(version = "1.5")
        @k(message = "Use \'Double.hours\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long X(double f) {
            return kotlin.time.g.l0(f, h.g);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Int.hours\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long Y(int v) {
            return kotlin.time.g.m0(v, h.g);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Long.hours\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long Z(long v) {
            return kotlin.time.g.n0(v, h.g);
        }

        @l
        public final double a(double f, @y4.l h h0, @y4.l h h1) {
            L.p(h0, "sourceUnit");
            L.p(h1, "targetUnit");
            return j.a(f, h0, h1);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Double.microseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long a0(double f) {
            return kotlin.time.g.l0(f, h.c);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Double.days\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long b(double f) {
            return kotlin.time.g.l0(f, h.h);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Int.microseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long b0(int v) {
            return kotlin.time.g.m0(v, h.c);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Int.days\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long c(int v) {
            return kotlin.time.g.m0(v, h.h);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Long.microseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long c0(long v) {
            return kotlin.time.g.n0(v, h.c);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Long.days\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long d(long v) {
            return kotlin.time.g.n0(v, h.h);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Double.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long d0(double f) {
            return kotlin.time.g.l0(f, h.d);
        }

        private final long e(double f) {
            return kotlin.time.g.l0(f, h.h);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Int.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long e0(int v) {
            return kotlin.time.g.m0(v, h.d);
        }

        private final long f(int v) {
            return kotlin.time.g.m0(v, h.h);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Long.milliseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long f0(long v) {
            return kotlin.time.g.n0(v, h.d);
        }

        private final long g(long v) {
            return kotlin.time.g.n0(v, h.h);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Double.minutes\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long g0(double f) {
            return kotlin.time.g.l0(f, h.f);
        }

        @f
        public static void h(double f) {
        }

        @h0(version = "1.5")
        @k(message = "Use \'Int.minutes\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long h0(int v) {
            return kotlin.time.g.m0(v, h.f);
        }

        @f
        public static void i(int v) {
        }

        @h0(version = "1.5")
        @k(message = "Use \'Long.minutes\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long i0(long v) {
            return kotlin.time.g.n0(v, h.f);
        }

        @f
        public static void j(long v) {
        }

        @h0(version = "1.5")
        @k(message = "Use \'Double.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long j0(double f) {
            return kotlin.time.g.l0(f, h.b);
        }

        private final long k(double f) {
            return kotlin.time.g.l0(f, h.g);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Int.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long k0(int v) {
            return kotlin.time.g.m0(v, h.b);
        }

        private final long l(int v) {
            return kotlin.time.g.m0(v, h.g);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Long.nanoseconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long l0(long v) {
            return kotlin.time.g.n0(v, h.b);
        }

        private final long m(long v) {
            return kotlin.time.g.n0(v, h.g);
        }

        public final long m0(@y4.l String s) {
            L.p(s, "value");
            try {
                return kotlin.time.g.f0(s, false);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new IllegalArgumentException("Invalid duration string format: \'" + s + "\'.", illegalArgumentException0);
            }
        }

        @f
        public static void n(double f) {
        }

        public final long n0(@y4.l String s) {
            L.p(s, "value");
            try {
                return kotlin.time.g.f0(s, true);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                throw new IllegalArgumentException("Invalid ISO duration string format: \'" + s + "\'.", illegalArgumentException0);
            }
        }

        @f
        public static void o(int v) {
        }

        @m
        public final e o0(@y4.l String s) {
            L.p(s, "value");
            try {
                return e.f(kotlin.time.g.f0(s, true));
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }

        @f
        public static void p(long v) {
        }

        @m
        public final e p0(@y4.l String s) {
            L.p(s, "value");
            try {
                return e.f(kotlin.time.g.f0(s, false));
            }
            catch(IllegalArgumentException unused_ex) {
                return null;
            }
        }

        // 去混淆评级： 低(20)
        public final long q() [...] // 潜在的解密器

        @h0(version = "1.5")
        @k(message = "Use \'Double.seconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long q0(double f) {
            return kotlin.time.g.l0(f, h.e);
        }

        private final long r(double f) {
            return kotlin.time.g.l0(f, h.c);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Int.seconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long r0(int v) {
            return kotlin.time.g.m0(v, h.e);
        }

        private final long s(int v) {
            return kotlin.time.g.m0(v, h.c);
        }

        @h0(version = "1.5")
        @k(message = "Use \'Long.seconds\' extension property from Duration.Companion instead.", replaceWith = @c0(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        @l
        public final long s0(long v) {
            return kotlin.time.g.n0(v, h.e);
        }

        private final long t(long v) {
            return kotlin.time.g.n0(v, h.c);
        }

        @f
        public static void u(double f) {
        }

        @f
        public static void v(int v) {
        }

        @f
        public static void w(long v) {
        }

        private final long x(double f) {
            return kotlin.time.g.l0(f, h.d);
        }

        private final long y(int v) {
            return kotlin.time.g.m0(v, h.d);
        }

        private final long z(long v) {
            return kotlin.time.g.n0(v, h.d);
        }
    }

    private final long a;
    @y4.l
    public static final a b;
    private static final long c;
    private static final long d;
    private static final long e;

    static {
        e.b = new a(null);
        e.c = e.i(0L);
        e.d = kotlin.time.g.j(0x3FFFFFFFFFFFFFFFL);
        e.e = kotlin.time.g.j(0xC000000000000001L);
    }

    private e(long v) {
        this.a = v;
    }

    @k(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @c0(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static void A() {
    }

    public final long A0() {
        return this.a;
    }

    public static final double B(long v) {
        return e.o0(v, h.d);
    }

    @k(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @c0(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static void C() {
    }

    public static final double D(long v) {
        return e.o0(v, h.f);
    }

    @k(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @c0(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static void E() {
    }

    public static final double F(long v) {
        return e.o0(v, h.b);
    }

    @k(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @c0(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static void G() {
    }

    public static final double H(long v) {
        return e.o0(v, h.e);
    }

    public static final long I(long v) {
        return e.r0(v, h.h);
    }

    public static final long J(long v) {
        return e.r0(v, h.g);
    }

    public static final long K(long v) {
        return e.r0(v, h.c);
    }

    // 去混淆评级： 低(20)
    public static final long L(long v) {
        return !e.b0(v) || !e.a0(v) ? e.r0(v, h.d) : v >> 1;
    }

    public static final long M(long v) {
        return e.r0(v, h.f);
    }

    public static final long N(long v) {
        if(!e.c0(v)) {
            if(v >> 1 > 0x8637BD05AF6L) {
                return 0x7FFFFFFFFFFFFFFFL;
            }
            return v >> 1 >= 0xFFFFF79C842FA50AL ? kotlin.time.g.f(v >> 1) : 0x8000000000000000L;
        }
        return v >> 1;
    }

    public static final long O(long v) {
        return e.r0(v, h.e);
    }

    @b0
    public static void P() {
    }

    // 去混淆评级： 低(20)
    public static final int Q(long v) {
        return e.d0(v) ? 0 : ((int)(e.M(v) % 60L));
    }

    @b0
    public static void R() {
    }

    public static final int S(long v) {
        if(e.d0(v)) {
            return 0;
        }
        return e.b0(v) ? ((int)kotlin.time.g.f((v >> 1) % 1000L)) : ((int)((v >> 1) % 1000000000L));
    }

    @b0
    public static void T() {
    }

    // 去混淆评级： 低(20)
    public static final int U(long v) {
        return e.d0(v) ? 0 : ((int)(e.O(v) % 60L));
    }

    // 去混淆评级： 低(20)
    private static final h V(long v) {
        return e.c0(v) ? h.b : h.d;
    }

    private static final int W(long v) {
        return ((int)v) & 1;
    }

    private static final long X(long v) [...] // Inlined contents

    public static int Z(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final long a() [...] // 潜在的解密器

    public static final boolean a0(long v) {
        return !e.d0(v);
    }

    public static final long b() [...] // 潜在的解密器

    private static final boolean b0(long v) {
        return (((int)v) & 1) == 1;
    }

    public static final long c() [...] // 潜在的解密器

    private static final boolean c0(long v) {
        return (((int)v) & 1) == 0;
    }

    @Override
    public int compareTo(Object object0) {
        return this.g(((e)object0).A0());
    }

    private static final long d(long v, long v1, long v2) {
        long v3 = kotlin.time.g.g(v2);
        long v4 = v1 + v3;
        return -4611686018426L > v4 || v4 >= 4611686018427L ? kotlin.time.g.j(s.K(v4, 0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)) : kotlin.time.g.l(kotlin.time.g.f(v4) + (v2 - kotlin.time.g.f(v3)));
    }

    public static final boolean d0(long v) {
        return v == e.d || v == e.e;
    }

    private static final void e(long v, StringBuilder stringBuilder0, int v1, int v2, int v3, String s, boolean z) {
        stringBuilder0.append(v1);
        if(v2 != 0) {
            stringBuilder0.append('.');
            String s1 = v.V3(String.valueOf(v2), v3, '0');
            int v4 = -1;
            int v5 = s1.length() - 1;
            if(v5 >= 0) {
                while(true) {
                    if(s1.charAt(v5) != 0x30) {
                        v4 = v5;
                        break;
                    }
                    if(v5 - 1 < 0) {
                        break;
                    }
                    --v5;
                }
            }
            if(z || v4 + 1 >= 3) {
                stringBuilder0.append(s1, 0, (v4 + 3) / 3 * 3);
            }
            else {
                stringBuilder0.append(s1, 0, v4 + 1);
            }
            L.o(stringBuilder0, "append(...)");
        }
        stringBuilder0.append(s);
    }

    public static final boolean e0(long v) {
        return v < 0L;
    }

    @Override
    public boolean equals(Object object0) {
        return e.m(this.a, object0);
    }

    public static final e f(long v) {
        return new e(v);
    }

    public static final boolean f0(long v) {
        return v > 0L;
    }

    public int g(long v) {
        return e.h(this.a, v);
    }

    public static final long g0(long v, long v1) {
        return e.h0(v, e.z0(v1));
    }

    public static int h(long v, long v1) {
        if((v ^ v1) >= 0L && (((int)(v ^ v1)) & 1) != 0) {
            int v2 = (((int)v) & 1) - (((int)v1) & 1);
            return e.e0(v) ? -v2 : v2;
        }
        return L.u(v, v1);
    }

    public static final long h0(long v, long v1) {
        if(e.d0(v)) {
            if(!e.a0(v1) && (v1 ^ v) < 0L) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return v;
        }
        if(e.d0(v1)) {
            return v1;
        }
        if((((int)v) & 1) == (((int)v1) & 1)) {
            long v2 = (v >> 1) + (v1 >> 1);
            return e.c0(v) ? kotlin.time.g.m(v2) : kotlin.time.g.k(v2);
        }
        return e.b0(v) ? e.d(v, v >> 1, v1 >> 1) : e.d(v, v1 >> 1, v >> 1);
    }

    @Override
    public int hashCode() {
        return e.Z(this.a);
    }

    // 去混淆评级： 中等(50)
    public static long i(long v) {
        return v;
    }

    public static final long i0(long v, double f) {
        int v1 = b.K0(f);
        if(((double)v1) == f) {
            return e.j0(v, v1);
        }
        h h0 = e.V(v);
        return kotlin.time.g.l0(e.o0(v, h0) * f, h0);
    }

    public static final double j(long v, long v1) {
        h h0 = (h)kotlin.comparisons.a.X(e.V(v), e.V(v1));
        return e.o0(v, h0) / e.o0(v1, h0);
    }

    public static final long j0(long v, int v1) {
        if(e.d0(v)) {
            if(v1 == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            }
            return v1 > 0 ? v : e.z0(v);
        }
        if(v1 == 0) {
            return 0L;
        }
        long v2 = (v >> 1) * ((long)v1);
        if(e.c0(v)) {
            if(0xFFFFFFFF80000001L <= v >> 1 && v >> 1 < 0x80000000L) {
                return kotlin.time.g.l(v2);
            }
            if(v2 / ((long)v1) == v >> 1) {
                return kotlin.time.g.m(v2);
            }
            long v3 = kotlin.time.g.g(v >> 1);
            long v4 = v3 * ((long)v1);
            long v5 = kotlin.time.g.g(((v >> 1) - kotlin.time.g.f(v3)) * ((long)v1)) + v4;
            if(v4 / ((long)v1) == v3 && (v5 ^ v4) >= 0L) {
                return kotlin.time.g.j(s.L(v5, new o(0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)));
            }
            return b.V(v >> 1) * b.U(v1) <= 0 ? e.e : e.d;
        }
        if(v2 / ((long)v1) == v >> 1) {
            return kotlin.time.g.j(s.L(v2, new o(0xC000000000000001L, 0x3FFFFFFFFFFFFFFFL)));
        }
        return b.V(v >> 1) * b.U(v1) <= 0 ? e.e : e.d;
    }

    public static final long k(long v, double f) {
        int v1 = b.K0(f);
        if(((double)v1) == f && v1 != 0) {
            return e.l(v, v1);
        }
        h h0 = e.V(v);
        return kotlin.time.g.l0(e.o0(v, h0) / f, h0);
    }

    public static final Object k0(long v, @y4.l A3.o o0) {
        L.p(o0, "action");
        return o0.invoke(e.O(v), e.S(v));
    }

    public static final long l(long v, int v1) {
        if(v1 == 0) {
            if(e.f0(v)) {
                return e.d;
            }
            if(!e.e0(v)) {
                throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
            }
            return e.e;
        }
        if(e.c0(v)) {
            return kotlin.time.g.l((v >> 1) / ((long)v1));
        }
        if(e.d0(v)) {
            return e.j0(v, b.U(v1));
        }
        long v2 = (v >> 1) / ((long)v1);
        return -4611686018426L > v2 || v2 >= 4611686018427L ? kotlin.time.g.j(v2) : kotlin.time.g.l(kotlin.time.g.f(v2) + kotlin.time.g.f((v >> 1) - v2 * ((long)v1)) / ((long)v1));
    }

    public static final Object l0(long v, @y4.l p p0) {
        L.p(p0, "action");
        return p0.invoke(e.M(v), e.U(v), e.S(v));
    }

    public static boolean m(long v, Object object0) {
        return object0 instanceof e ? v == ((e)object0).A0() : false;
    }

    public static final Object m0(long v, @y4.l q q0) {
        L.p(q0, "action");
        return q0.T0(e.J(v), e.Q(v), e.U(v), e.S(v));
    }

    public static final boolean n(long v, long v1) {
        return v == v1;
    }

    public static final Object n0(long v, @y4.l r r0) {
        L.p(r0, "action");
        return r0.K0(e.I(v), e.s(v), e.Q(v), e.U(v), e.S(v));
    }

    public static final double o0(long v, @y4.l h h0) {
        L.p(h0, "unit");
        if(v == e.d) {
            return Infinity;
        }
        return v == e.e ? -Infinity : j.a(v >> 1, e.V(v), h0);
    }

    // 去混淆评级： 低(20)
    public static final long p(long v) {
        return e.e0(v) ? e.z0(v) : v;
    }

    public static final int p0(long v, @y4.l h h0) {
        L.p(h0, "unit");
        return (int)s.K(e.r0(v, h0), 0xFFFFFFFF80000000L, 0x7FFFFFFFL);
    }

    @y4.l
    public static final String q0(long v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if(e.e0(v)) {
            stringBuilder0.append('-');
        }
        stringBuilder0.append("PT");
        long v1 = e.p(v);
        long v2 = e.J(v1);
        int v3 = e.Q(v1);
        int v4 = e.U(v1);
        int v5 = e.S(v1);
        if(e.d0(v)) {
            v2 = 0x9184E729FFFL;
        }
        boolean z = false;
        boolean z1 = v4 != 0 || v5 != 0;
        if(v3 != 0 || z1 && v2 != 0L) {
            z = true;
        }
        if(v2 != 0L) {
            stringBuilder0.append(v2);
            stringBuilder0.append('H');
        }
        if(z) {
            stringBuilder0.append(v3);
            stringBuilder0.append('M');
        }
        if(z1 || v2 == 0L && !z) {
            e.e(v, stringBuilder0, v4, v5, 9, "S", true);
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    @b0
    public static void r() {
    }

    public static final long r0(long v, @y4.l h h0) {
        L.p(h0, "unit");
        if(v == e.d) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return v == e.e ? 0x8000000000000000L : j.b(v >> 1, e.V(v), h0);
    }

    // 去混淆评级： 低(20)
    public static final int s(long v) {
        return e.d0(v) ? 0 : ((int)(e.J(v) % 24L));
    }

    @k(message = "Use inWholeMilliseconds property instead.", replaceWith = @c0(expression = "this.inWholeMilliseconds", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static final long s0(long v) {
        return e.L(v);
    }

    @k(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @c0(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static void t() {
    }

    @k(message = "Use inWholeNanoseconds property instead.", replaceWith = @c0(expression = "this.inWholeNanoseconds", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static final long t0(long v) {
        return e.N(v);
    }

    @Override
    @y4.l
    public String toString() {
        return e.v0(this.a);
    }

    public static final double u(long v) {
        return e.o0(v, h.h);
    }

    @k(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @c0(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static void v() {
    }

    @y4.l
    public static String v0(long v) {
        if(v == 0L) {
            return "0s";
        }
        if(v == e.d) {
            return "Infinity";
        }
        if(v == e.e) {
            return "-Infinity";
        }
        boolean z = e.e0(v);
        StringBuilder stringBuilder0 = new StringBuilder();
        if(z) {
            stringBuilder0.append('-');
        }
        long v1 = e.p(v);
        long v2 = e.I(v1);
        int v3 = e.s(v1);
        int v4 = e.Q(v1);
        int v5 = e.U(v1);
        int v6 = e.S(v1);
        int v7 = 0;
        boolean z1 = v5 != 0 || v6 != 0;
        if(v2 != 0L) {
            stringBuilder0.append(v2);
            stringBuilder0.append('d');
            v7 = 1;
        }
        if(v3 != 0 || v2 != 0L && (v4 != 0 || z1)) {
            if(v7 > 0) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(v3);
            stringBuilder0.append('h');
            ++v7;
        }
        if(v4 != 0 || z1 && (v3 != 0 || v2 != 0L)) {
            if(v7 > 0) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(v4);
            stringBuilder0.append('m');
            ++v7;
        }
        if(z1) {
            if(v7 > 0) {
                stringBuilder0.append(' ');
            }
            if(v5 != 0 || v2 != 0L || v3 != 0 || v4 != 0) {
                e.e(v, stringBuilder0, v5, v6, 9, "s", false);
            }
            else if(v6 >= 1000000) {
                e.e(v, stringBuilder0, v6 / 1000000, v6 % 1000000, 6, "ms", false);
            }
            else if(v6 >= 1000) {
                e.e(v, stringBuilder0, v6 / 1000, v6 % 1000, 3, "us", false);
            }
            else {
                stringBuilder0.append(v6);
                stringBuilder0.append("ns");
            }
            ++v7;
        }
        if(z && v7 > 1) {
            stringBuilder0.insert(1, '(').append(')');
        }
        String s = stringBuilder0.toString();
        L.o(s, "toString(...)");
        return s;
    }

    public static final double w(long v) {
        return e.o0(v, h.g);
    }

    @y4.l
    public static final String w0(long v, @y4.l h h0, int v1) {
        L.p(h0, "unit");
        if(v1 < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + v1).toString());
        }
        double f = e.o0(v, h0);
        return Double.isInfinite(f) ? String.valueOf(f) : kotlin.time.f.b(f, s.B(v1, 12)) + kotlin.time.k.h(h0);
    }

    public static String x0(long v, h h0, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return e.w0(v, h0, v1);
    }

    @k(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @c0(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.l(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    @l
    public static void y() {
    }

    public static final long y0(long v, @y4.l h h0) {
        L.p(h0, "unit");
        h h1 = e.V(v);
        return h0.compareTo(h1) <= 0 || e.d0(v) ? v : kotlin.time.g.n0((v >> 1) - (v >> 1) % j.b(1L, h0, h1), h1);
    }

    public static final double z(long v) {
        return e.o0(v, h.c);
    }

    public static final long z0(long v) {
        return kotlin.time.g.i(-(v >> 1), ((int)v) & 1);
    }
}

