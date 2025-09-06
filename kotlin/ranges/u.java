package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.r;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1538:1\n1#2:1539\n*E\n"})
class u extends t {
    public static float A(float f, float f1) {
        return f > f1 ? f1 : f;
    }

    @h0(version = "1.7")
    @m
    public static final Integer A0(@l j j0) {
        L.p(j0, "<this>");
        return j0.isEmpty() ? null : j0.g();
    }

    @l
    public static final a A1(@l a a0, int v) {
        L.p(a0, "<this>");
        t.a(v > 0, v);
        kotlin.ranges.a.a a$a0 = a.d;
        int v1 = a0.g();
        int v2 = a0.h();
        if(a0.i() <= 0) {
            v = -v;
        }
        return a$a0.a(((char)v1), ((char)v2), v);
    }

    public static int B(int v, int v1) {
        return v <= v1 ? v : v1;
    }

    @h0(version = "1.7")
    @m
    public static final Long B0(@l kotlin.ranges.m m0) {
        L.p(m0, "<this>");
        return m0.isEmpty() ? null : m0.g();
    }

    @l
    public static j B1(@l j j0, int v) {
        L.p(j0, "<this>");
        t.a(v > 0, v);
        kotlin.ranges.j.a j$a0 = j.d;
        int v1 = j0.g();
        int v2 = j0.h();
        if(j0.i() <= 0) {
            v = -v;
        }
        return j$a0.a(v1, v2, v);
    }

    public static long C(long v, long v1) {
        return v <= v1 ? v : v1;
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "floatRangeContains")
    public static final boolean C0(g g0, byte b) {
        L.p(g0, "<this>");
        return g0.a(((float)b));
    }

    @l
    public static final kotlin.ranges.m C1(@l kotlin.ranges.m m0, long v) {
        L.p(m0, "<this>");
        t.a(v > 0L, v);
        long v1 = m0.g();
        long v2 = m0.h();
        return m0.i() <= 0L ? kotlin.ranges.m.d.a(v1, v2, -v) : kotlin.ranges.m.d.a(v1, v2, v);
    }

    @l
    public static final Comparable D(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "<this>");
        L.p(comparable1, "maximumValue");
        return comparable0.compareTo(comparable1) <= 0 ? comparable0 : comparable1;
    }

    @i(name = "floatRangeContains")
    public static final boolean D0(@l g g0, double f) {
        L.p(g0, "<this>");
        return g0.a(((float)f));
    }

    @m
    public static final Byte D1(double f) {
        return -128.0 > f || f > 127.0 ? null : ((byte)(((int)f)));
    }

    public static final short E(short v, short v1) {
        return v <= v1 ? v : v1;
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "floatRangeContains")
    public static final boolean E0(g g0, int v) {
        L.p(g0, "<this>");
        return g0.a(((float)v));
    }

    @m
    public static final Byte E1(float f) {
        return -128.0f > f || f > 127.0f ? null : ((byte)(((int)f)));
    }

    public static final byte F(byte b, byte b1, byte b2) {
        if(b1 > b2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int)b2) + " is less than minimum " + ((int)b1) + '.');
        }
        if(b < b1) {
            return b1;
        }
        return b <= b2 ? b : b2;
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "floatRangeContains")
    public static final boolean F0(g g0, long v) {
        L.p(g0, "<this>");
        return g0.a(((float)v));
    }

    @m
    public static final Byte F1(int v) {
        return 0xFFFFFF80 > v || v >= 0x80 ? null : ((byte)v);
    }

    public static double G(double f, double f1, double f2) {
        if(f1 > f2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f2 + " is less than minimum " + f1 + '.');
        }
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "floatRangeContains")
    public static final boolean G0(g g0, short v) {
        L.p(g0, "<this>");
        return g0.a(((float)v));
    }

    @m
    public static final Byte G1(long v) {
        return 0xFFFFFFFFFFFFFF80L > v || v >= 0x80L ? null : ((byte)(((int)v)));
    }

    public static float H(float f, float f1, float f2) {
        if(f1 > f2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f2 + " is less than minimum " + f1 + '.');
        }
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    @i(name = "intRangeContains")
    public static final boolean H0(@l g g0, byte b) {
        L.p(g0, "<this>");
        return g0.a(((int)b));
    }

    @m
    public static final Byte H1(short v) {
        return 0xFFFFFF80 > v || v >= 0x80 ? null : ((byte)v);
    }

    public static int I(int v, int v1, int v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + v2 + " is less than minimum " + v1 + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "intRangeContains")
    public static final boolean I0(g g0, double f) {
        L.p(g0, "<this>");
        Integer integer0 = u.I1(f);
        return integer0 == null ? false : g0.a(integer0);
    }

    @m
    public static final Integer I1(double f) {
        return -2147483648.0 > f || f > 2147483647.0 ? null : ((int)f);
    }

    public static int J(int v, @l g g0) {
        L.p(g0, "range");
        if(g0 instanceof f) {
            return ((Number)s.N(v, ((f)g0))).intValue();
        }
        if(g0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g0 + '.');
        }
        if(v < ((Number)g0.getStart()).intValue()) {
            return ((Number)g0.getStart()).intValue();
        }
        return v <= ((Number)g0.d()).intValue() ? v : ((Number)g0.d()).intValue();
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "intRangeContains")
    public static final boolean J0(g g0, float f) {
        L.p(g0, "<this>");
        Integer integer0 = u.J1(f);
        return integer0 == null ? false : g0.a(integer0);
    }

    @m
    public static final Integer J1(float f) {
        return -2147483648.0f > f || f > 2147483648.0f ? null : ((int)f);
    }

    public static long K(long v, long v1, long v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + v2 + " is less than minimum " + v1 + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    @i(name = "intRangeContains")
    public static boolean K0(@l g g0, long v) {
        L.p(g0, "<this>");
        Integer integer0 = u.K1(v);
        return integer0 == null ? false : g0.a(integer0);
    }

    @m
    public static final Integer K1(long v) {
        return 0xFFFFFFFF80000000L > v || v >= 0x80000000L ? null : ((int)v);
    }

    public static long L(long v, @l g g0) {
        L.p(g0, "range");
        if(g0 instanceof f) {
            return ((Number)s.N(v, ((f)g0))).longValue();
        }
        if(g0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g0 + '.');
        }
        if(v < ((Number)g0.getStart()).longValue()) {
            return ((Number)g0.getStart()).longValue();
        }
        return v <= ((Number)g0.d()).longValue() ? v : ((Number)g0.d()).longValue();
    }

    @i(name = "intRangeContains")
    public static final boolean L0(@l g g0, short v) {
        L.p(g0, "<this>");
        return g0.a(((int)v));
    }

    @m
    public static final Long L1(double f) {
        return -9223372036854776000.0 > f || f > 9223372036854776000.0 ? null : ((long)f);
    }

    @l
    public static final Comparable M(@l Comparable comparable0, @m Comparable comparable1, @m Comparable comparable2) {
        L.p(comparable0, "<this>");
        if(comparable1 != null && comparable2 != null) {
            if(comparable1.compareTo(comparable2) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable2 + " is less than minimum " + comparable1 + '.');
            }
            if(comparable0.compareTo(comparable1) < 0) {
                return comparable1;
            }
            return comparable0.compareTo(comparable2) <= 0 ? comparable0 : comparable2;
        }
        if(comparable1 != null && comparable0.compareTo(comparable1) < 0) {
            return comparable1;
        }
        return comparable2 == null || comparable0.compareTo(comparable2) <= 0 ? comparable0 : comparable2;
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "intRangeContains")
    public static final boolean M0(@l kotlin.ranges.r r0, byte b) {
        L.p(r0, "<this>");
        return r0.a(((int)b));
    }

    @m
    public static final Long M1(float f) {
        return -9223372036854776000.0f > f || f > 9223372036854776000.0f ? null : ((long)f);
    }

    @h0(version = "1.1")
    @l
    public static Comparable N(@l Comparable comparable0, @l f f0) {
        L.p(comparable0, "<this>");
        L.p(f0, "range");
        if(f0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + f0 + '.');
        }
        if(f0.c(comparable0, f0.getStart()) && !f0.c(f0.getStart(), comparable0)) {
            return f0.getStart();
        }
        return !f0.c(f0.d(), comparable0) || f0.c(comparable0, f0.d()) ? comparable0 : f0.d();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "intRangeContains")
    public static final boolean N0(@l kotlin.ranges.r r0, long v) {
        L.p(r0, "<this>");
        Integer integer0 = u.K1(v);
        return integer0 == null ? false : r0.a(integer0);
    }

    @m
    public static final Short N1(double f) {
        return -32768.0 > f || f > 32767.0 ? null : ((short)(((int)f)));
    }

    @l
    public static final Comparable O(@l Comparable comparable0, @l g g0) {
        L.p(comparable0, "<this>");
        L.p(g0, "range");
        if(g0 instanceof f) {
            return s.N(comparable0, ((f)g0));
        }
        if(g0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g0 + '.');
        }
        if(comparable0.compareTo(g0.getStart()) < 0) {
            return g0.getStart();
        }
        return comparable0.compareTo(g0.d()) <= 0 ? comparable0 : g0.d();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "intRangeContains")
    public static final boolean O0(@l kotlin.ranges.r r0, short v) {
        L.p(r0, "<this>");
        return r0.a(((int)v));
    }

    @m
    public static final Short O1(float f) {
        return -32768.0f > f || f > 32767.0f ? null : ((short)(((int)f)));
    }

    public static final short P(short v, short v1, short v2) {
        if(v1 > v2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int)v2) + " is less than minimum " + ((int)v1) + '.');
        }
        if(v < v1) {
            return v1;
        }
        return v <= v2 ? v : v2;
    }

    @h0(version = "1.7")
    public static final char P0(@l a a0) {
        L.p(a0, "<this>");
        if(a0.isEmpty()) {
            throw new NoSuchElementException("Progression " + a0 + " is empty.");
        }
        return a0.h();
    }

    @m
    public static final Short P1(int v) {
        return 0xFFFF8000 > v || v >= 0x8000 ? null : ((short)v);
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final boolean Q(c c0, Character character0) {
        L.p(c0, "<this>");
        return character0 != null && c0.l(character0.charValue());
    }

    @h0(version = "1.7")
    public static final int Q0(@l j j0) {
        L.p(j0, "<this>");
        if(j0.isEmpty()) {
            throw new NoSuchElementException("Progression " + j0 + " is empty.");
        }
        return j0.h();
    }

    @m
    public static final Short Q1(long v) {
        return 0xFFFFFFFFFFFF8000L > v || v >= 0x8000L ? null : ((short)(((int)v)));
    }

    @kotlin.internal.f
    private static final boolean R(kotlin.ranges.l l0, byte b) {
        L.p(l0, "<this>");
        return u.H0(l0, b);
    }

    @h0(version = "1.7")
    public static final long R0(@l kotlin.ranges.m m0) {
        L.p(m0, "<this>");
        if(m0.isEmpty()) {
            throw new NoSuchElementException("Progression " + m0 + " is empty.");
        }
        return m0.h();
    }

    @l
    public static final c R1(char c, char c1) {
        return L.t(c1, 0) > 0 ? new c(c, ((char)(c1 - 1))) : c.e.a();
    }

    @kotlin.internal.f
    private static final boolean S(kotlin.ranges.l l0, long v) {
        L.p(l0, "<this>");
        return s.K0(l0, v);
    }

    @h0(version = "1.7")
    @m
    public static final Character S0(@l a a0) {
        L.p(a0, "<this>");
        return a0.isEmpty() ? null : Character.valueOf(a0.h());
    }

    @l
    public static final kotlin.ranges.l S1(byte b, byte b1) {
        return new kotlin.ranges.l(((int)b), b1 - 1);
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final boolean T(kotlin.ranges.l l0, Integer integer0) {
        L.p(l0, "<this>");
        return integer0 != null && l0.l(((int)integer0));
    }

    @h0(version = "1.7")
    @m
    public static final Integer T0(@l j j0) {
        L.p(j0, "<this>");
        return j0.isEmpty() ? null : j0.h();
    }

    @l
    public static final kotlin.ranges.l T1(byte b, int v) {
        return v > 0x80000000 ? new kotlin.ranges.l(((int)b), v - 1) : kotlin.ranges.l.e.a();
    }

    @kotlin.internal.f
    private static final boolean U(kotlin.ranges.l l0, short v) {
        L.p(l0, "<this>");
        return u.L0(l0, v);
    }

    @h0(version = "1.7")
    @m
    public static final Long U0(@l kotlin.ranges.m m0) {
        L.p(m0, "<this>");
        return m0.isEmpty() ? null : m0.h();
    }

    @l
    public static final kotlin.ranges.l U1(byte b, short v) {
        return new kotlin.ranges.l(((int)b), v - 1);
    }

    @kotlin.internal.f
    private static final boolean V(o o0, byte b) {
        L.p(o0, "<this>");
        return u.V0(o0, b);
    }

    @i(name = "longRangeContains")
    public static final boolean V0(@l g g0, byte b) {
        L.p(g0, "<this>");
        return g0.a(((long)b));
    }

    @l
    public static final kotlin.ranges.l V1(int v, byte b) {
        return new kotlin.ranges.l(v, b - 1);
    }

    @kotlin.internal.f
    private static final boolean W(o o0, int v) {
        L.p(o0, "<this>");
        return u.Y0(o0, v);
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "longRangeContains")
    public static final boolean W0(g g0, double f) {
        L.p(g0, "<this>");
        Long long0 = u.L1(f);
        return long0 == null ? false : g0.a(long0);
    }

    @l
    public static kotlin.ranges.l W1(int v, int v1) {
        return v1 > 0x80000000 ? new kotlin.ranges.l(v, v1 - 1) : kotlin.ranges.l.e.a();
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final boolean X(o o0, Long long0) {
        L.p(o0, "<this>");
        return long0 != null && o0.l(((long)long0));
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "longRangeContains")
    public static final boolean X0(g g0, float f) {
        L.p(g0, "<this>");
        Long long0 = u.M1(f);
        return long0 == null ? false : g0.a(long0);
    }

    @l
    public static final kotlin.ranges.l X1(int v, short v1) {
        return new kotlin.ranges.l(v, v1 - 1);
    }

    @kotlin.internal.f
    private static final boolean Y(o o0, short v) {
        L.p(o0, "<this>");
        return u.Z0(o0, v);
    }

    @i(name = "longRangeContains")
    public static final boolean Y0(@l g g0, int v) {
        L.p(g0, "<this>");
        return g0.a(((long)v));
    }

    @l
    public static final kotlin.ranges.l Y1(short v, byte b) {
        return new kotlin.ranges.l(((int)v), b - 1);
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "doubleRangeContains")
    public static final boolean Z(g g0, byte b) {
        L.p(g0, "<this>");
        return g0.a(((double)b));
    }

    @i(name = "longRangeContains")
    public static final boolean Z0(@l g g0, short v) {
        L.p(g0, "<this>");
        return g0.a(((long)v));
    }

    @l
    public static final kotlin.ranges.l Z1(short v, int v1) {
        return v1 > 0x80000000 ? new kotlin.ranges.l(((int)v), v1 - 1) : kotlin.ranges.l.e.a();
    }

    @i(name = "doubleRangeContains")
    public static final boolean a0(@l g g0, float f) {
        L.p(g0, "<this>");
        return g0.a(((double)f));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "longRangeContains")
    public static final boolean a1(@l kotlin.ranges.r r0, byte b) {
        L.p(r0, "<this>");
        return r0.a(((long)b));
    }

    @l
    public static final kotlin.ranges.l a2(short v, short v1) {
        return new kotlin.ranges.l(((int)v), v1 - 1);
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "doubleRangeContains")
    public static final boolean b0(g g0, int v) {
        L.p(g0, "<this>");
        return g0.a(((double)v));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "longRangeContains")
    public static final boolean b1(@l kotlin.ranges.r r0, int v) {
        L.p(r0, "<this>");
        return r0.a(((long)v));
    }

    @l
    public static final o b2(byte b, long v) {
        return v > 0x8000000000000000L ? new o(((long)b), v - 1L) : o.e.a();
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "doubleRangeContains")
    public static final boolean c0(g g0, long v) {
        L.p(g0, "<this>");
        return g0.a(((double)v));
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "longRangeContains")
    public static final boolean c1(@l kotlin.ranges.r r0, short v) {
        L.p(r0, "<this>");
        return r0.a(((long)v));
    }

    @l
    public static final o c2(int v, long v1) {
        return v1 > 0x8000000000000000L ? new o(((long)v), v1 - 1L) : o.e.a();
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "doubleRangeContains")
    public static final boolean d0(g g0, short v) {
        L.p(g0, "<this>");
        return g0.a(((double)v));
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final char d1(c c0) {
        L.p(c0, "<this>");
        return u.e1(c0, kotlin.random.f.a);
    }

    @l
    public static final o d2(long v, byte b) {
        return new o(v, ((long)b) - 1L);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "doubleRangeContains")
    public static final boolean e0(@l kotlin.ranges.r r0, float f) {
        L.p(r0, "<this>");
        return r0.a(((double)f));
    }

    @h0(version = "1.3")
    public static final char e1(@l c c0, @l kotlin.random.f f0) {
        L.p(c0, "<this>");
        L.p(f0, "random");
        try {
            return (char)f0.n(c0.g(), c0.h() + 1);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @l
    public static o e2(long v, int v1) {
        return new o(v, ((long)v1) - 1L);
    }

    @l
    public static final a f0(char c, char c1) {
        return a.d.a(c, c1, -1);
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final int f1(kotlin.ranges.l l0) {
        L.p(l0, "<this>");
        return s.g1(l0, kotlin.random.f.a);
    }

    @l
    public static final o f2(long v, long v1) {
        return v1 > 0x8000000000000000L ? new o(v, v1 - 1L) : o.e.a();
    }

    @l
    public static final j g0(byte b, byte b1) {
        return j.d.a(((int)b), ((int)b1), -1);
    }

    @h0(version = "1.3")
    public static int g1(@l kotlin.ranges.l l0, @l kotlin.random.f f0) {
        L.p(l0, "<this>");
        L.p(f0, "random");
        try {
            return kotlin.random.g.h(f0, l0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @l
    public static final o g2(long v, short v1) {
        return new o(v, ((long)v1) - 1L);
    }

    @l
    public static final j h0(byte b, int v) {
        return j.d.a(((int)b), v, -1);
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final long h1(o o0) {
        L.p(o0, "<this>");
        return u.i1(o0, kotlin.random.f.a);
    }

    @l
    public static final o h2(short v, long v1) {
        return v1 > 0x8000000000000000L ? new o(((long)v), v1 - 1L) : o.e.a();
    }

    @l
    public static final j i0(byte b, short v) {
        return j.d.a(((int)b), ((int)v), -1);
    }

    @h0(version = "1.3")
    public static final long i1(@l o o0, @l kotlin.random.f f0) {
        L.p(o0, "<this>");
        L.p(f0, "random");
        try {
            return kotlin.random.g.i(f0, o0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new NoSuchElementException(illegalArgumentException0.getMessage());
        }
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "byteRangeContains")
    public static final boolean j(g g0, double f) {
        L.p(g0, "<this>");
        Byte byte0 = u.D1(f);
        return byte0 == null ? false : g0.a(byte0);
    }

    @l
    public static final j j0(int v, byte b) {
        return j.d.a(v, ((int)b), -1);
    }

    @h0(version = "1.4")
    @kotlin.internal.f
    private static final Character j1(c c0) {
        L.p(c0, "<this>");
        return u.k1(c0, kotlin.random.f.a);
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "byteRangeContains")
    public static final boolean k(g g0, float f) {
        L.p(g0, "<this>");
        Byte byte0 = u.E1(f);
        return byte0 == null ? false : g0.a(byte0);
    }

    @l
    public static j k0(int v, int v1) {
        return j.d.a(v, v1, -1);
    }

    @h0(version = "1.4")
    @m
    public static final Character k1(@l c c0, @l kotlin.random.f f0) {
        L.p(c0, "<this>");
        L.p(f0, "random");
        return c0.isEmpty() ? null : Character.valueOf(((char)f0.n(c0.g(), c0.h() + 1)));
    }

    @i(name = "byteRangeContains")
    public static final boolean l(@l g g0, int v) {
        L.p(g0, "<this>");
        Byte byte0 = u.F1(v);
        return byte0 == null ? false : g0.a(byte0);
    }

    @l
    public static final j l0(int v, short v1) {
        return j.d.a(v, ((int)v1), -1);
    }

    @h0(version = "1.4")
    @kotlin.internal.f
    private static final Integer l1(kotlin.ranges.l l0) {
        L.p(l0, "<this>");
        return u.m1(l0, kotlin.random.f.a);
    }

    @i(name = "byteRangeContains")
    public static final boolean m(@l g g0, long v) {
        L.p(g0, "<this>");
        Byte byte0 = u.G1(v);
        return byte0 == null ? false : g0.a(byte0);
    }

    @l
    public static final j m0(short v, byte b) {
        return j.d.a(((int)v), ((int)b), -1);
    }

    @h0(version = "1.4")
    @m
    public static final Integer m1(@l kotlin.ranges.l l0, @l kotlin.random.f f0) {
        L.p(l0, "<this>");
        L.p(f0, "random");
        return l0.isEmpty() ? null : kotlin.random.g.h(f0, l0);
    }

    @i(name = "byteRangeContains")
    public static final boolean n(@l g g0, short v) {
        L.p(g0, "<this>");
        Byte byte0 = u.H1(v);
        return byte0 == null ? false : g0.a(byte0);
    }

    @l
    public static final j n0(short v, int v1) {
        return j.d.a(((int)v), v1, -1);
    }

    @h0(version = "1.4")
    @kotlin.internal.f
    private static final Long n1(o o0) {
        L.p(o0, "<this>");
        return u.o1(o0, kotlin.random.f.a);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "byteRangeContains")
    public static final boolean o(@l kotlin.ranges.r r0, int v) {
        L.p(r0, "<this>");
        Byte byte0 = u.F1(v);
        return byte0 == null ? false : r0.a(byte0);
    }

    @l
    public static final j o0(short v, short v1) {
        return j.d.a(((int)v), ((int)v1), -1);
    }

    @h0(version = "1.4")
    @m
    public static final Long o1(@l o o0, @l kotlin.random.f f0) {
        L.p(o0, "<this>");
        L.p(f0, "random");
        return o0.isEmpty() ? null : kotlin.random.g.i(f0, o0);
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "byteRangeContains")
    public static final boolean p(@l kotlin.ranges.r r0, long v) {
        L.p(r0, "<this>");
        Byte byte0 = u.G1(v);
        return byte0 == null ? false : r0.a(byte0);
    }

    @l
    public static final kotlin.ranges.m p0(byte b, long v) {
        return kotlin.ranges.m.d.a(((long)b), v, -1L);
    }

    @l
    public static final a p1(@l a a0) {
        L.p(a0, "<this>");
        return a.d.a(a0.h(), a0.g(), -a0.i());
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "byteRangeContains")
    public static final boolean q(@l kotlin.ranges.r r0, short v) {
        L.p(r0, "<this>");
        Byte byte0 = u.H1(v);
        return byte0 == null ? false : r0.a(byte0);
    }

    @l
    public static final kotlin.ranges.m q0(int v, long v1) {
        return kotlin.ranges.m.d.a(((long)v), v1, -1L);
    }

    @l
    public static j q1(@l j j0) {
        L.p(j0, "<this>");
        return j.d.a(j0.h(), j0.g(), -j0.i());
    }

    public static final byte r(byte b, byte b1) {
        return b >= b1 ? b : b1;
    }

    @l
    public static final kotlin.ranges.m r0(long v, byte b) {
        return kotlin.ranges.m.d.a(v, ((long)b), -1L);
    }

    @l
    public static final kotlin.ranges.m r1(@l kotlin.ranges.m m0) {
        L.p(m0, "<this>");
        return kotlin.ranges.m.d.a(m0.h(), m0.g(), -m0.i());
    }

    public static final double s(double f, double f1) {
        return f < f1 ? f1 : f;
    }

    @l
    public static final kotlin.ranges.m s0(long v, int v1) {
        return kotlin.ranges.m.d.a(v, ((long)v1), -1L);
    }

    @i(name = "shortRangeContains")
    public static final boolean s1(@l g g0, byte b) {
        L.p(g0, "<this>");
        return g0.a(((short)b));
    }

    public static float t(float f, float f1) {
        return f < f1 ? f1 : f;
    }

    @l
    public static final kotlin.ranges.m t0(long v, long v1) {
        return kotlin.ranges.m.d.a(v, v1, -1L);
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "shortRangeContains")
    public static final boolean t1(g g0, double f) {
        L.p(g0, "<this>");
        Short short0 = u.N1(f);
        return short0 == null ? false : g0.a(short0);
    }

    public static int u(int v, int v1) {
        return v >= v1 ? v : v1;
    }

    @l
    public static final kotlin.ranges.m u0(long v, short v1) {
        return kotlin.ranges.m.d.a(v, ((long)v1), -1L);
    }

    @k(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    @kotlin.l(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @i(name = "shortRangeContains")
    public static final boolean u1(g g0, float f) {
        L.p(g0, "<this>");
        Short short0 = u.O1(f);
        return short0 == null ? false : g0.a(short0);
    }

    public static long v(long v, long v1) {
        return v >= v1 ? v : v1;
    }

    @l
    public static final kotlin.ranges.m v0(short v, long v1) {
        return kotlin.ranges.m.d.a(((long)v), v1, -1L);
    }

    @i(name = "shortRangeContains")
    public static final boolean v1(@l g g0, int v) {
        L.p(g0, "<this>");
        Short short0 = u.P1(v);
        return short0 == null ? false : g0.a(short0);
    }

    @l
    public static Comparable w(@l Comparable comparable0, @l Comparable comparable1) {
        L.p(comparable0, "<this>");
        L.p(comparable1, "minimumValue");
        return comparable0.compareTo(comparable1) >= 0 ? comparable0 : comparable1;
    }

    @h0(version = "1.7")
    public static final char w0(@l a a0) {
        L.p(a0, "<this>");
        if(a0.isEmpty()) {
            throw new NoSuchElementException("Progression " + a0 + " is empty.");
        }
        return a0.g();
    }

    @i(name = "shortRangeContains")
    public static final boolean w1(@l g g0, long v) {
        L.p(g0, "<this>");
        Short short0 = u.Q1(v);
        return short0 == null ? false : g0.a(short0);
    }

    public static final short x(short v, short v1) {
        return v >= v1 ? v : v1;
    }

    @h0(version = "1.7")
    public static final int x0(@l j j0) {
        L.p(j0, "<this>");
        if(j0.isEmpty()) {
            throw new NoSuchElementException("Progression " + j0 + " is empty.");
        }
        return j0.g();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "shortRangeContains")
    public static final boolean x1(@l kotlin.ranges.r r0, byte b) {
        L.p(r0, "<this>");
        return r0.a(((short)b));
    }

    public static final byte y(byte b, byte b1) {
        return b <= b1 ? b : b1;
    }

    @h0(version = "1.7")
    public static final long y0(@l kotlin.ranges.m m0) {
        L.p(m0, "<this>");
        if(m0.isEmpty()) {
            throw new NoSuchElementException("Progression " + m0 + " is empty.");
        }
        return m0.g();
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "shortRangeContains")
    public static final boolean y1(@l kotlin.ranges.r r0, int v) {
        L.p(r0, "<this>");
        Short short0 = u.P1(v);
        return short0 == null ? false : r0.a(short0);
    }

    public static final double z(double f, double f1) {
        return f > f1 ? f1 : f;
    }

    @h0(version = "1.7")
    @m
    public static final Character z0(@l a a0) {
        L.p(a0, "<this>");
        return a0.isEmpty() ? null : Character.valueOf(a0.g());
    }

    @W0(markerClass = {r.class})
    @h0(version = "1.9")
    @i(name = "shortRangeContains")
    public static final boolean z1(@l kotlin.ranges.r r0, long v) {
        L.p(r0, "<this>");
        Short short0 = u.Q1(v);
        return short0 == null ? false : r0.a(short0);
    }
}

