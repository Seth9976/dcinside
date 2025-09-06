package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.U;
import kotlin.b0;
import kotlin.c0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import y4.l;
import z3.i;

@s0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n13933#2,14:3043\n13956#2,14:3057\n13979#2,14:3071\n14002#2,14:3085\n14025#2,14:3099\n14048#2,14:3113\n14071#2,14:3127\n14094#2,14:3141\n14117#2,14:3155\n16519#2,14:3169\n16542#2,14:3183\n16565#2,14:3197\n16588#2,14:3211\n16611#2,14:3225\n16634#2,14:3239\n16657#2,14:3253\n16680#2,14:3267\n16703#2,14:3281\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt\n*L\n2434#1:3043,14\n2441#1:3057,14\n2448#1:3071,14\n2455#1:3085,14\n2462#1:3099,14\n2469#1:3113,14\n2476#1:3127,14\n2483#1:3141,14\n2490#1:3155,14\n2632#1:3169,14\n2639#1:3183,14\n2646#1:3197,14\n2653#1:3211,14\n2660#1:3225,14\n2667#1:3239,14\n2674#1:3253,14\n2681#1:3267,14\n2688#1:3281,14\n*E\n"})
class o extends n {
    public static final int A(@l int[] arr_v, int v, int v1, int v2) {
        L.p(arr_v, "<this>");
        return Arrays.binarySearch(arr_v, v1, v2, v);
    }

    @h0(version = "1.3")
    @l
    public static long[] A0(@l long[] arr_v, @l long[] arr_v1, int v, int v1, int v2) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "destination");
        System.arraycopy(arr_v, v1, arr_v1, v, v2 - v1);
        return arr_v1;
    }

    @f
    private static final float A1(float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        return arr_f[v];
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object A2(Object[] arr_object, Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        return p.il(arr_object, comparator0);
    }

    @l
    public static short[] A3(@l short[] arr_v, short v) {
        L.p(arr_v, "<this>");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v1[arr_v.length] = v;
        L.m(arr_v1);
        return arr_v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger A4(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_v.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(((short)arr_v[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    public static final int B(@l long[] arr_v, long v, int v1, int v2) {
        L.p(arr_v, "<this>");
        return Arrays.binarySearch(arr_v, v1, v2, v);
    }

    @h0(version = "1.3")
    @l
    public static Object[] B0(@l Object[] arr_object, @l Object[] arr_object1, int v, int v1, int v2) {
        L.p(arr_object, "<this>");
        L.p(arr_object1, "destination");
        System.arraycopy(arr_object, v1, arr_object1, v, v2 - v1);
        return arr_object1;
    }

    @f
    private static final int B1(int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return arr_v[v];
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short B2(short[] arr_v, Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        return p.jl(arr_v, comparator0);
    }

    @l
    public static short[] B3(@l short[] arr_v, @l short[] arr_v1) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "elements");
        short[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        L.m(arr_v2);
        return arr_v2;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger B4(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_z.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(Boolean.valueOf(arr_z[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    public static final int C(@l Object[] arr_object, Object object0, int v, int v1) {
        L.p(arr_object, "<this>");
        return Arrays.binarySearch(arr_object, v, v1, object0);
    }

    @h0(version = "1.3")
    @l
    public static short[] C0(@l short[] arr_v, @l short[] arr_v1, int v, int v1, int v2) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "destination");
        System.arraycopy(arr_v, v1, arr_v1, v, v2 - v1);
        return arr_v1;
    }

    @f
    private static final long C1(long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return arr_v[v];
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte C2(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return p.fn(arr_b);
    }

    @l
    public static final boolean[] C3(@l boolean[] arr_z, @l Collection collection0) {
        L.p(arr_z, "<this>");
        L.p(collection0, "elements");
        int v = arr_z.length;
        boolean[] arr_z1 = Arrays.copyOf(arr_z, collection0.size() + v);
        for(Object object0: collection0) {
            arr_z1[v] = ((Boolean)object0).booleanValue();
            ++v;
        }
        L.m(arr_z1);
        return arr_z1;
    }

    @l
    public static final SortedSet C4(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return (SortedSet)p.jy(arr_b, new TreeSet());
    }

    public static final int D(@l Object[] arr_object, Object object0, @l Comparator comparator0, int v, int v1) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        return Arrays.binarySearch(arr_object, v, v1, object0, comparator0);
    }

    @h0(version = "1.3")
    @l
    public static final boolean[] D0(@l boolean[] arr_z, @l boolean[] arr_z1, int v, int v1, int v2) {
        L.p(arr_z, "<this>");
        L.p(arr_z1, "destination");
        System.arraycopy(arr_z, v1, arr_z1, v, v2 - v1);
        return arr_z1;
    }

    @f
    private static final Object D1(Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        return arr_object[v];
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character D2(char[] arr_c) {
        L.p(arr_c, "<this>");
        return p.gn(arr_c);
    }

    @l
    public static final boolean[] D3(@l boolean[] arr_z, boolean z) {
        L.p(arr_z, "<this>");
        boolean[] arr_z1 = Arrays.copyOf(arr_z, arr_z.length + 1);
        arr_z1[arr_z.length] = z;
        L.m(arr_z1);
        return arr_z1;
    }

    @l
    public static final SortedSet D4(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return (SortedSet)p.ky(arr_c, new TreeSet());
    }

    public static final int E(@l short[] arr_v, short v, int v1, int v2) {
        L.p(arr_v, "<this>");
        return Arrays.binarySearch(arr_v, v1, v2, v);
    }

    public static byte[] E0(byte[] arr_b, byte[] arr_b1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_b.length;
        }
        return kotlin.collections.l.v0(arr_b, arr_b1, v, v1, v2);
    }

    @f
    private static final short E1(short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        return arr_v[v];
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable E2(Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        return p.hn(arr_comparable);
    }

    @l
    public static final boolean[] E3(@l boolean[] arr_z, @l boolean[] arr_z1) {
        L.p(arr_z, "<this>");
        L.p(arr_z1, "elements");
        boolean[] arr_z2 = Arrays.copyOf(arr_z, arr_z.length + arr_z1.length);
        System.arraycopy(arr_z1, 0, arr_z2, arr_z.length, arr_z1.length);
        L.m(arr_z2);
        return arr_z2;
    }

    @l
    public static final SortedSet E4(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        return (SortedSet)p.ly(arr_f, new TreeSet());
    }

    public static int F(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        return o.w(arr_b, b, v, v1);
    }

    public static char[] F0(char[] arr_c, char[] arr_c1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_c.length;
        }
        return kotlin.collections.l.w0(arr_c, arr_c1, v, v1, v2);
    }

    @f
    private static final boolean F1(boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        return arr_z[v];
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double F2(double[] arr_f) {
        L.p(arr_f, "<this>");
        return p.in(arr_f);
    }

    @f
    private static final Object[] F3(Object[] arr_object, Object object0) {
        L.p(arr_object, "<this>");
        return kotlin.collections.l.w3(arr_object, object0);
    }

    @l
    public static final SortedSet F4(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        return (SortedSet)p.my(arr_f, new TreeSet());
    }

    public static int G(char[] arr_c, char c, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_c.length;
        }
        return o.x(arr_c, c, v, v1);
    }

    public static double[] G0(double[] arr_f, double[] arr_f1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_f.length;
        }
        return o.x0(arr_f, arr_f1, v, v1, v2);
    }

    public static void G1(@l byte[] arr_b, byte b, int v, int v1) {
        L.p(arr_b, "<this>");
        Arrays.fill(arr_b, v, v1, b);
    }

    @h0(version = "1.1")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double G2(Double[] arr_double) {
        L.p(arr_double, "<this>");
        return p.jn(arr_double);
    }

    public static final void G3(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        if(arr_b.length > 1) {
            Arrays.sort(arr_b);
        }
    }

    @l
    public static final SortedSet G4(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        return (SortedSet)p.ny(arr_v, new TreeSet());
    }

    public static int H(double[] arr_f, double f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        return o.y(arr_f, f, v, v1);
    }

    public static float[] H0(float[] arr_f, float[] arr_f1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_f.length;
        }
        return kotlin.collections.l.y0(arr_f, arr_f1, v, v1, v2);
    }

    public static final void H1(@l char[] arr_c, char c, int v, int v1) {
        L.p(arr_c, "<this>");
        Arrays.fill(arr_c, v, v1, c);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float H2(float[] arr_f) {
        L.p(arr_f, "<this>");
        return p.kn(arr_f);
    }

    public static final void H3(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "<this>");
        Arrays.sort(arr_b, v, v1);
    }

    @l
    public static final SortedSet H4(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return (SortedSet)p.oy(arr_v, new TreeSet());
    }

    public static int I(float[] arr_f, float f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        return o.z(arr_f, f, v, v1);
    }

    public static int[] I0(int[] arr_v, int[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_v.length;
        }
        return kotlin.collections.l.z0(arr_v, arr_v1, v, v1, v2);
    }

    public static final void I1(@l double[] arr_f, double f, int v, int v1) {
        L.p(arr_f, "<this>");
        Arrays.fill(arr_f, v, v1, f);
    }

    @h0(version = "1.1")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float I2(Float[] arr_float) {
        L.p(arr_float, "<this>");
        return p.ln(arr_float);
    }

    public static final void I3(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        if(arr_c.length > 1) {
            Arrays.sort(arr_c);
        }
    }

    @l
    public static final SortedSet I4(@l Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        return (SortedSet)p.py(arr_comparable, new TreeSet());
    }

    public static int J(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        return o.A(arr_v, v, v1, v2);
    }

    public static long[] J0(long[] arr_v, long[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_v.length;
        }
        return kotlin.collections.l.A0(arr_v, arr_v1, v, v1, v2);
    }

    public static final void J1(@l float[] arr_f, float f, int v, int v1) {
        L.p(arr_f, "<this>");
        Arrays.fill(arr_f, v, v1, f);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer J2(int[] arr_v) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.mn(arr_v);
    }

    public static final void J3(@l char[] arr_c, int v, int v1) {
        L.p(arr_c, "<this>");
        Arrays.sort(arr_c, v, v1);
    }

    @l
    public static final SortedSet J4(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        return (SortedSet)p.py(arr_object, new TreeSet(comparator0));
    }

    public static int K(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        return o.B(arr_v, v, v1, v2);
    }

    public static Object[] K0(Object[] arr_object, Object[] arr_object1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_object.length;
        }
        return kotlin.collections.l.B0(arr_object, arr_object1, v, v1, v2);
    }

    public static void K1(@l int[] arr_v, int v, int v1, int v2) {
        L.p(arr_v, "<this>");
        Arrays.fill(arr_v, v1, v2, v);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long K2(long[] arr_v) {
        L.p(arr_v, "<this>");
        return p.nn(arr_v);
    }

    public static final void K3(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length > 1) {
            Arrays.sort(arr_f);
        }
    }

    @l
    public static final SortedSet K4(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        return (SortedSet)p.qy(arr_v, new TreeSet());
    }

    public static int L(Object[] arr_object, Object object0, int v, int v1, int v2, Object object1) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_object.length;
        }
        return o.C(arr_object, object0, v, v1);
    }

    public static short[] L0(short[] arr_v, short[] arr_v1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_v.length;
        }
        return kotlin.collections.l.C0(arr_v, arr_v1, v, v1, v2);
    }

    public static void L1(@l long[] arr_v, long v, int v1, int v2) {
        L.p(arr_v, "<this>");
        Arrays.fill(arr_v, v1, v2, v);
    }

    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short L2(short[] arr_v) {
        L.p(arr_v, "<this>");
        return p.on(arr_v);
    }

    public static final void L3(@l double[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        Arrays.sort(arr_f, v, v1);
    }

    @l
    public static final SortedSet L4(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return (SortedSet)p.ry(arr_z, new TreeSet());
    }

    public static int M(Object[] arr_object, Object object0, Comparator comparator0, int v, int v1, int v2, Object object1) {
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = arr_object.length;
        }
        return o.D(arr_object, object0, comparator0, v, v1);
    }

    public static boolean[] M0(boolean[] arr_z, boolean[] arr_z1, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v = 0;
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = arr_z.length;
        }
        return o.D0(arr_z, arr_z1, v, v1, v2);
    }

    public static void M1(@l Object[] arr_object, Object object0, int v, int v1) {
        L.p(arr_object, "<this>");
        Arrays.fill(arr_object, v, v1, object0);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean M2(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
                if(comparable0.compareTo(comparable1) > 0) {
                    z = z1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final void M3(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        if(arr_f.length > 1) {
            Arrays.sort(arr_f);
        }
    }

    @l
    public static final Boolean[] M4(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        Boolean[] arr_boolean = new Boolean[arr_z.length];
        for(int v = 0; v < arr_z.length; ++v) {
            arr_boolean[v] = Boolean.valueOf(arr_z[v]);
        }
        return arr_boolean;
    }

    public static int N(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        return o.E(arr_v, v, v1, v2);
    }

    @f
    private static final byte[] N0(byte[] arr_b) {
        L.p(arr_b, "<this>");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        L.o(arr_b1, "copyOf(...)");
        return arr_b1;
    }

    public static void N1(@l short[] arr_v, short v, int v1, int v2) {
        L.p(arr_v, "<this>");
        Arrays.fill(arr_v, v1, v2, v);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte N2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((byte)v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    public static void N3(@l float[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        Arrays.sort(arr_f, v, v1);
    }

    @l
    public static final Byte[] N4(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        Byte[] arr_byte = new Byte[arr_b.length];
        for(int v = 0; v < arr_b.length; ++v) {
            arr_byte[v] = (byte)arr_b[v];
        }
        return arr_byte;
    }

    @h0(version = "1.1")
    @f
    @h
    @i(name = "contentDeepEqualsInline")
    private static final boolean O(Object[] arr_object, Object[] arr_object1) {
        L.p(arr_object, "<this>");
        L.p(arr_object1, "other");
        return kotlin.collections.l.g(arr_object, arr_object1);
    }

    @f
    private static final byte[] O0(byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        byte[] arr_b1 = Arrays.copyOf(arr_b, v);
        L.o(arr_b1, "copyOf(...)");
        return arr_b1;
    }

    public static final void O1(@l boolean[] arr_z, boolean z, int v, int v1) {
        L.p(arr_z, "<this>");
        Arrays.fill(arr_z, v, v1, z);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character O2(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v3)));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    public static final void O3(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length > 1) {
            Arrays.sort(arr_v);
        }
    }

    @l
    public static final Character[] O4(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        Character[] arr_character = new Character[arr_c.length];
        for(int v = 0; v < arr_c.length; ++v) {
            arr_character[v] = Character.valueOf(arr_c[v]);
        }
        return arr_character;
    }

    // 去混淆评级： 低(30)
    @h0(version = "1.4")
    @f
    @i(name = "contentDeepEqualsNullable")
    private static final boolean P(Object[] arr_object, Object[] arr_object1) {
        return kotlin.collections.l.g(arr_object, arr_object1);
    }

    @f
    private static final char[] P0(char[] arr_c) {
        L.p(arr_c, "<this>");
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length);
        L.o(arr_c1, "copyOf(...)");
        return arr_c1;
    }

    public static void P1(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_b.length;
        }
        kotlin.collections.l.G1(arr_b, b, v, v1);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double P2(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) > 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    public static void P3(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        Arrays.sort(arr_v, v, v1);
    }

    @l
    public static final Double[] P4(@l double[] arr_f) {
        L.p(arr_f, "<this>");
        Double[] arr_double = new Double[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_double[v] = (double)arr_f[v];
        }
        return arr_double;
    }

    @h0(version = "1.1")
    @f
    @h
    @i(name = "contentDeepHashCodeInline")
    private static final int Q(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return kotlin.collections.l.b(arr_object);
    }

    @f
    private static final char[] Q0(char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        char[] arr_c1 = Arrays.copyOf(arr_c, v);
        L.o(arr_c1, "copyOf(...)");
        return arr_c1;
    }

    public static void Q1(char[] arr_c, char c, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_c.length;
        }
        o.H1(arr_c, c, v, v1);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float Q2(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) > 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    public static final void Q3(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length > 1) {
            Arrays.sort(arr_v);
        }
    }

    @l
    public static final Float[] Q4(@l float[] arr_f) {
        L.p(arr_f, "<this>");
        Float[] arr_float = new Float[arr_f.length];
        for(int v = 0; v < arr_f.length; ++v) {
            arr_float[v] = (float)arr_f[v];
        }
        return arr_float;
    }

    // 去混淆评级： 低(30)
    @h0(version = "1.4")
    @f
    @i(name = "contentDeepHashCodeNullable")
    private static final int R(Object[] arr_object) {
        return kotlin.collections.l.b(arr_object);
    }

    @f
    private static final double[] R0(double[] arr_f) {
        L.p(arr_f, "<this>");
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        return arr_f1;
    }

    public static void R1(double[] arr_f, double f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        o.I1(arr_f, f, v, v1);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer R2(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    public static void R3(@l long[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        Arrays.sort(arr_v, v, v1);
    }

    @l
    public static final Integer[] R4(@l int[] arr_v) {
        L.p(arr_v, "<this>");
        Integer[] arr_integer = new Integer[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_integer[v] = (int)arr_v[v];
        }
        return arr_integer;
    }

    @h0(version = "1.1")
    @f
    @h
    @i(name = "contentDeepToStringInline")
    private static final String S(Object[] arr_object) {
        L.p(arr_object, "<this>");
        return n.h(arr_object);
    }

    @f
    private static final double[] S0(double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        double[] arr_f1 = Arrays.copyOf(arr_f, v);
        L.o(arr_f1, "copyOf(...)");
        return arr_f1;
    }

    public static void S1(float[] arr_f, float f, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_f.length;
        }
        o.J1(arr_f, f, v, v1);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long S2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @f
    private static final void S3(Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        kotlin.collections.l.U3(arr_comparable);
    }

    @l
    public static final Long[] S4(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        Long[] arr_long = new Long[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_long[v] = (long)arr_v[v];
        }
        return arr_long;
    }

    // 去混淆评级： 低(30)
    @h0(version = "1.4")
    @f
    @i(name = "contentDeepToStringNullable")
    private static final String T(Object[] arr_object) {
        return n.h(arr_object);
    }

    @f
    private static final float[] T0(float[] arr_f) {
        L.p(arr_f, "<this>");
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length);
        L.o(arr_f1, "copyOf(...)");
        return arr_f1;
    }

    public static void T1(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        kotlin.collections.l.K1(arr_v, v, v1, v2);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object T2(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(v != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(object0);
            if(1 <= v) {
                for(int v1 = 1; true; ++v1) {
                    Object object1 = arr_object[v1];
                    Comparable comparable1 = (Comparable)function10.invoke(object1);
                    if(comparable0.compareTo(comparable1) > 0) {
                        object0 = object1;
                        comparable0 = comparable1;
                    }
                    if(v1 == v) {
                        break;
                    }
                }
            }
        }
        return object0;
    }

    @h0(version = "1.4")
    public static final void T3(@l Comparable[] arr_comparable, int v, int v1) {
        L.p(arr_comparable, "<this>");
        Arrays.sort(arr_comparable, v, v1);
    }

    @l
    public static final Short[] T4(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        Short[] arr_short = new Short[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_short[v] = (short)arr_v[v];
        }
        return arr_short;
    }

    @h0(version = "1.4")
    @f
    private static final boolean U(byte[] arr_b, byte[] arr_b1) {
        return Arrays.equals(arr_b, arr_b1);
    }

    @f
    private static final float[] U0(float[] arr_f, int v) {
        L.p(arr_f, "<this>");
        float[] arr_f1 = Arrays.copyOf(arr_f, v);
        L.o(arr_f1, "copyOf(...)");
        return arr_f1;
    }

    public static void U1(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        kotlin.collections.l.L1(arr_v, v, v1, v2);
    }

    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short U2(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((short)v3));
                if(comparable0.compareTo(comparable1) > 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    public static void U3(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        if(arr_object.length > 1) {
            Arrays.sort(arr_object);
        }
    }

    @h0(version = "1.4")
    @f
    private static final boolean V(char[] arr_c, char[] arr_c1) {
        return Arrays.equals(arr_c, arr_c1);
    }

    @f
    private static final int[] V0(int[] arr_v) {
        L.p(arr_v, "<this>");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    public static void V1(Object[] arr_object, Object object0, int v, int v1, int v2, Object object1) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_object.length;
        }
        kotlin.collections.l.M1(arr_object, object0, v, v1);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean V2(boolean[] arr_z, Comparator comparator0) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        return p.zn(arr_z, comparator0);
    }

    public static final void V3(@l Object[] arr_object, int v, int v1) {
        L.p(arr_object, "<this>");
        Arrays.sort(arr_object, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final boolean W(double[] arr_f, double[] arr_f1) {
        return Arrays.equals(arr_f, arr_f1);
    }

    @f
    private static final int[] W0(int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        int[] arr_v1 = Arrays.copyOf(arr_v, v);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    public static void W1(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = arr_v.length;
        }
        kotlin.collections.l.N1(arr_v, v, v1, v2);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte W2(byte[] arr_b, Comparator comparator0) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        return p.An(arr_b, comparator0);
    }

    public static final void W3(@l short[] arr_v) {
        L.p(arr_v, "<this>");
        if(arr_v.length > 1) {
            Arrays.sort(arr_v);
        }
    }

    @h0(version = "1.4")
    @f
    private static final boolean X(float[] arr_f, float[] arr_f1) {
        return Arrays.equals(arr_f, arr_f1);
    }

    @f
    private static final long[] X0(long[] arr_v) {
        L.p(arr_v, "<this>");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    public static void X1(boolean[] arr_z, boolean z, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_z.length;
        }
        o.O1(arr_z, z, v, v1);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character X2(char[] arr_c, Comparator comparator0) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        return p.Bn(arr_c, comparator0);
    }

    public static final void X3(@l short[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        Arrays.sort(arr_v, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final boolean Y(int[] arr_v, int[] arr_v1) {
        return Arrays.equals(arr_v, arr_v1);
    }

    @f
    private static final long[] Y0(long[] arr_v, int v) {
        L.p(arr_v, "<this>");
        long[] arr_v1 = Arrays.copyOf(arr_v, v);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    @l
    public static final List Y1(@l Object[] arr_object, @l Class class0) {
        L.p(arr_object, "<this>");
        L.p(class0, "klass");
        return (List)o.Z1(arr_object, new ArrayList(), class0);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double Y2(double[] arr_f, Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        return p.Cn(arr_f, comparator0);
    }

    public static void Y3(byte[] arr_b, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_b.length;
        }
        o.H3(arr_b, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final boolean Z(long[] arr_v, long[] arr_v1) {
        return Arrays.equals(arr_v, arr_v1);
    }

    @f
    private static final Object[] Z0(Object[] arr_object) {
        L.p(arr_object, "<this>");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        L.o(arr_object1, "copyOf(...)");
        return arr_object1;
    }

    @l
    public static final Collection Z1(@l Object[] arr_object, @l Collection collection0, @l Class class0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "destination");
        L.p(class0, "klass");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(class0.isInstance(object0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float Z2(float[] arr_f, Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        return p.Dn(arr_f, comparator0);
    }

    public static void Z3(char[] arr_c, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_c.length;
        }
        o.J3(arr_c, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final boolean a0(Object[] arr_object, Object[] arr_object1) {
        return Arrays.equals(arr_object, arr_object1);
    }

    @f
    private static final Object[] a1(Object[] arr_object, int v) {
        L.p(arr_object, "<this>");
        Object[] arr_object1 = Arrays.copyOf(arr_object, v);
        L.o(arr_object1, "copyOf(...)");
        return arr_object1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte a2(byte[] arr_b) {
        L.p(arr_b, "<this>");
        return p.Hk(arr_b);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer a3(int[] arr_v, Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        return p.En(arr_v, comparator0);
    }

    public static void a4(double[] arr_f, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_f.length;
        }
        o.L3(arr_f, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final boolean b0(short[] arr_v, short[] arr_v1) {
        return Arrays.equals(arr_v, arr_v1);
    }

    @f
    private static final short[] b1(short[] arr_v) {
        L.p(arr_v, "<this>");
        short[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character b2(char[] arr_c) {
        L.p(arr_c, "<this>");
        return p.Ik(arr_c);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long b3(long[] arr_v, Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        return p.Fn(arr_v, comparator0);
    }

    public static void b4(float[] arr_f, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_f.length;
        }
        kotlin.collections.l.N3(arr_f, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final boolean c0(boolean[] arr_z, boolean[] arr_z1) {
        return Arrays.equals(arr_z, arr_z1);
    }

    @f
    private static final short[] c1(short[] arr_v, int v) {
        L.p(arr_v, "<this>");
        short[] arr_v1 = Arrays.copyOf(arr_v, v);
        L.o(arr_v1, "copyOf(...)");
        return arr_v1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Comparable c2(Comparable[] arr_comparable) {
        L.p(arr_comparable, "<this>");
        return kotlin.collections.l.Jk(arr_comparable);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object c3(Object[] arr_object, Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        return p.Gn(arr_object, comparator0);
    }

    public static void c4(int[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_v.length;
        }
        kotlin.collections.l.P3(arr_v, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final int d0(byte[] arr_b) {
        return Arrays.hashCode(arr_b);
    }

    @f
    private static final boolean[] d1(boolean[] arr_z) {
        L.p(arr_z, "<this>");
        boolean[] arr_z1 = Arrays.copyOf(arr_z, arr_z.length);
        L.o(arr_z1, "copyOf(...)");
        return arr_z1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double d2(double[] arr_f) {
        L.p(arr_f, "<this>");
        return p.Kk(arr_f);
    }

    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short d3(short[] arr_v, Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        return p.Hn(arr_v, comparator0);
    }

    public static void d4(long[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_v.length;
        }
        kotlin.collections.l.R3(arr_v, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final int e0(char[] arr_c) {
        return Arrays.hashCode(arr_c);
    }

    @f
    private static final boolean[] e1(boolean[] arr_z, int v) {
        L.p(arr_z, "<this>");
        boolean[] arr_z1 = Arrays.copyOf(arr_z, v);
        L.o(arr_z1, "copyOf(...)");
        return arr_z1;
    }

    @h0(version = "1.1")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double e2(Double[] arr_double) {
        L.p(arr_double, "<this>");
        return p.Lk(arr_double);
    }

    @l
    public static byte[] e3(@l byte[] arr_b, byte b) {
        L.p(arr_b, "<this>");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length + 1);
        arr_b1[arr_b.length] = b;
        L.m(arr_b1);
        return arr_b1;
    }

    public static void e4(Comparable[] arr_comparable, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_comparable.length;
        }
        o.T3(arr_comparable, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final int f0(double[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static byte[] f1(@l byte[] arr_b, int v, int v1) {
        L.p(arr_b, "<this>");
        m.c(v1, arr_b.length);
        byte[] arr_b1 = Arrays.copyOfRange(arr_b, v, v1);
        L.o(arr_b1, "copyOfRange(...)");
        return arr_b1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float f2(float[] arr_f) {
        L.p(arr_f, "<this>");
        return p.Mk(arr_f);
    }

    @l
    public static final byte[] f3(@l byte[] arr_b, @l Collection collection0) {
        L.p(arr_b, "<this>");
        L.p(collection0, "elements");
        int v = arr_b.length;
        byte[] arr_b1 = Arrays.copyOf(arr_b, collection0.size() + v);
        for(Object object0: collection0) {
            arr_b1[v] = ((Number)object0).byteValue();
            ++v;
        }
        L.m(arr_b1);
        return arr_b1;
    }

    public static void f4(Object[] arr_object, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_object.length;
        }
        o.V3(arr_object, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final int g0(float[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static final char[] g1(@l char[] arr_c, int v, int v1) {
        L.p(arr_c, "<this>");
        m.c(v1, arr_c.length);
        char[] arr_c1 = Arrays.copyOfRange(arr_c, v, v1);
        L.o(arr_c1, "copyOfRange(...)");
        return arr_c1;
    }

    @h0(version = "1.1")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float g2(Float[] arr_float) {
        L.p(arr_float, "<this>");
        return kotlin.collections.l.Nk(arr_float);
    }

    @l
    public static byte[] g3(@l byte[] arr_b, @l byte[] arr_b1) {
        L.p(arr_b, "<this>");
        L.p(arr_b1, "elements");
        byte[] arr_b2 = Arrays.copyOf(arr_b, arr_b.length + arr_b1.length);
        System.arraycopy(arr_b1, 0, arr_b2, arr_b.length, arr_b1.length);
        L.m(arr_b2);
        return arr_b2;
    }

    public static void g4(short[] arr_v, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = arr_v.length;
        }
        o.X3(arr_v, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final int h0(int[] arr_v) {
        return Arrays.hashCode(arr_v);
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static final double[] h1(@l double[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        m.c(v1, arr_f.length);
        double[] arr_f1 = Arrays.copyOfRange(arr_f, v, v1);
        L.o(arr_f1, "copyOfRange(...)");
        return arr_f1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer h2(int[] arr_v) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.Ok(arr_v);
    }

    @l
    public static final char[] h3(@l char[] arr_c, char c) {
        L.p(arr_c, "<this>");
        char[] arr_c1 = Arrays.copyOf(arr_c, arr_c.length + 1);
        arr_c1[arr_c.length] = c;
        L.m(arr_c1);
        return arr_c1;
    }

    public static void h4(@l Object[] arr_object, @l Comparator comparator0) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        if(arr_object.length > 1) {
            Arrays.sort(arr_object, comparator0);
        }
    }

    @h0(version = "1.4")
    @f
    private static final int i0(long[] arr_v) {
        return Arrays.hashCode(arr_v);
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static float[] i1(@l float[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        m.c(v1, arr_f.length);
        float[] arr_f1 = Arrays.copyOfRange(arr_f, v, v1);
        L.o(arr_f1, "copyOfRange(...)");
        return arr_f1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long i2(long[] arr_v) {
        L.p(arr_v, "<this>");
        return p.Pk(arr_v);
    }

    @l
    public static final char[] i3(@l char[] arr_c, @l Collection collection0) {
        L.p(arr_c, "<this>");
        L.p(collection0, "elements");
        int v = arr_c.length;
        char[] arr_c1 = Arrays.copyOf(arr_c, collection0.size() + v);
        for(Object object0: collection0) {
            arr_c1[v] = ((Character)object0).charValue();
            ++v;
        }
        L.m(arr_c1);
        return arr_c1;
    }

    public static void i4(@l Object[] arr_object, @l Comparator comparator0, int v, int v1) {
        L.p(arr_object, "<this>");
        L.p(comparator0, "comparator");
        Arrays.sort(arr_object, v, v1, comparator0);
    }

    @h0(version = "1.4")
    @f
    private static final int j0(Object[] arr_object) {
        return Arrays.hashCode(arr_object);
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static int[] j1(@l int[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        m.c(v1, arr_v.length);
        int[] arr_v1 = Arrays.copyOfRange(arr_v, v, v1);
        L.o(arr_v1, "copyOfRange(...)");
        return arr_v1;
    }

    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short j2(short[] arr_v) {
        L.p(arr_v, "<this>");
        return p.Qk(arr_v);
    }

    @l
    public static final char[] j3(@l char[] arr_c, @l char[] arr_c1) {
        L.p(arr_c, "<this>");
        L.p(arr_c1, "elements");
        char[] arr_c2 = Arrays.copyOf(arr_c, arr_c.length + arr_c1.length);
        System.arraycopy(arr_c1, 0, arr_c2, arr_c.length, arr_c1.length);
        L.m(arr_c2);
        return arr_c2;
    }

    public static void j4(Object[] arr_object, Comparator comparator0, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = arr_object.length;
        }
        kotlin.collections.l.i4(arr_object, comparator0, v, v1);
    }

    @h0(version = "1.4")
    @f
    private static final int k0(short[] arr_v) {
        return Arrays.hashCode(arr_v);
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static long[] k1(@l long[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        m.c(v1, arr_v.length);
        long[] arr_v1 = Arrays.copyOfRange(arr_v, v, v1);
        L.o(arr_v1, "copyOfRange(...)");
        return arr_v1;
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean k2(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        if(arr_z.length == 0) {
            return null;
        }
        boolean z = arr_z[0];
        int v = p.ye(arr_z);
        if(v == 0) {
            return Boolean.valueOf(z);
        }
        Comparable comparable0 = (Comparable)function10.invoke(Boolean.valueOf(z));
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                boolean z1 = arr_z[v1];
                Comparable comparable1 = (Comparable)function10.invoke(Boolean.valueOf(z1));
                if(comparable0.compareTo(comparable1) < 0) {
                    z = z1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @l
    public static final double[] k3(@l double[] arr_f, double f) {
        L.p(arr_f, "<this>");
        double[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length + 1);
        arr_f1[arr_f.length] = f;
        L.m(arr_f1);
        return arr_f1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal k4(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_b.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(((byte)arr_b[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @h0(version = "1.4")
    @f
    private static final int l0(boolean[] arr_z) {
        return Arrays.hashCode(arr_z);
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static Object[] l1(@l Object[] arr_object, int v, int v1) {
        L.p(arr_object, "<this>");
        m.c(v1, arr_object.length);
        Object[] arr_object1 = Arrays.copyOfRange(arr_object, v, v1);
        L.o(arr_object1, "copyOfRange(...)");
        return arr_object1;
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte l2(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        if(arr_b.length == 0) {
            return null;
        }
        int v = arr_b[0];
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 == 0) {
            return (byte)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((byte)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_b[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((byte)v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (byte)v;
    }

    @l
    public static final double[] l3(@l double[] arr_f, @l Collection collection0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "elements");
        int v = arr_f.length;
        double[] arr_f1 = Arrays.copyOf(arr_f, collection0.size() + v);
        for(Object object0: collection0) {
            arr_f1[v] = ((Number)object0).doubleValue();
            ++v;
        }
        L.m(arr_f1);
        return arr_f1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal l4(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_c.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(Character.valueOf(arr_c[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @h0(version = "1.4")
    @f
    private static final String m0(byte[] arr_b) {
        String s = Arrays.toString(arr_b);
        L.o(s, "toString(...)");
        return s;
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static short[] m1(@l short[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        m.c(v1, arr_v.length);
        short[] arr_v1 = Arrays.copyOfRange(arr_v, v, v1);
        L.o(arr_v1, "copyOfRange(...)");
        return arr_v1;
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character m2(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        if(arr_c.length == 0) {
            return null;
        }
        int v = arr_c[0];
        int v1 = p.re(arr_c);
        if(v1 == 0) {
            return Character.valueOf(((char)v));
        }
        Comparable comparable0 = (Comparable)function10.invoke(Character.valueOf(((char)v)));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_c[v2];
                Comparable comparable1 = (Comparable)function10.invoke(Character.valueOf(((char)v3)));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return Character.valueOf(((char)v));
    }

    @l
    public static final double[] m3(@l double[] arr_f, @l double[] arr_f1) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "elements");
        double[] arr_f2 = Arrays.copyOf(arr_f, arr_f.length + arr_f1.length);
        System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
        L.m(arr_f2);
        return arr_f2;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal m4(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_f.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(((double)arr_f[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @l
    public static final List n(@l byte[] arr_b) {
        public static final class a extends c implements RandomAccess {
            final byte[] c;

            a(byte[] arr_b) {
                this.c = arr_b;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(byte b) {
                return kotlin.collections.l.m8(this.c, b);
            }

            public Byte c(int v) {
                return (byte)this.c[v];
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Byte ? this.b(((Number)object0).byteValue()) : false;
            }

            public int d(byte b) {
                return kotlin.collections.l.Cf(this.c, b);
            }

            public int g(byte b) {
                return kotlin.collections.l.Gh(this.c, b);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Byte ? this.d(((Number)object0).byteValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Byte ? this.g(((Number)object0).byteValue()) : -1;
            }
        }

        L.p(arr_b, "<this>");
        return new a(arr_b);
    }

    @h0(version = "1.4")
    @f
    private static final String n0(char[] arr_c) {
        String s = Arrays.toString(arr_c);
        L.o(s, "toString(...)");
        return s;
    }

    @b0
    @h0(version = "1.3")
    @l
    @i(name = "copyOfRange")
    public static final boolean[] n1(@l boolean[] arr_z, int v, int v1) {
        L.p(arr_z, "<this>");
        m.c(v1, arr_z.length);
        boolean[] arr_z1 = Arrays.copyOfRange(arr_z, v, v1);
        L.o(arr_z1, "copyOfRange(...)");
        return arr_z1;
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double n2(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        double f = arr_f[0];
        int v = p.se(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                double f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) < 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @l
    public static final float[] n3(@l float[] arr_f, float f) {
        L.p(arr_f, "<this>");
        float[] arr_f1 = Arrays.copyOf(arr_f, arr_f.length + 1);
        arr_f1[arr_f.length] = f;
        L.m(arr_f1);
        return arr_f1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal n4(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_f.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(((float)arr_f[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @l
    public static final List o(@l char[] arr_c) {
        public static final class kotlin.collections.o.h extends c implements RandomAccess {
            final char[] c;

            kotlin.collections.o.h(char[] arr_c) {
                this.c = arr_c;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(char c) {
                return kotlin.collections.l.n8(this.c, c);
            }

            public Character c(int v) {
                return Character.valueOf(this.c[v]);
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Character ? this.b(((Character)object0).charValue()) : false;
            }

            public int d(char c) {
                return p.Df(this.c, c);
            }

            public int g(char c) {
                return p.Hh(this.c, c);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Character ? this.d(((Character)object0).charValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Character ? this.g(((Character)object0).charValue()) : -1;
            }
        }

        L.p(arr_c, "<this>");
        return new kotlin.collections.o.h(arr_c);
    }

    @h0(version = "1.4")
    @f
    private static final String o0(double[] arr_f) {
        String s = Arrays.toString(arr_f);
        L.o(s, "toString(...)");
        return s;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final byte[] o1(byte[] arr_b, int v, int v1) {
        L.p(arr_b, "<this>");
        return kotlin.collections.l.f1(arr_b, v, v1);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float o2(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        if(arr_f.length == 0) {
            return null;
        }
        float f = arr_f[0];
        int v = p.te(arr_f);
        if(v == 0) {
            return f;
        }
        Comparable comparable0 = (Comparable)function10.invoke(f);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                float f1 = arr_f[v1];
                Comparable comparable1 = (Comparable)function10.invoke(f1);
                if(comparable0.compareTo(comparable1) < 0) {
                    f = f1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return f;
    }

    @l
    public static final float[] o3(@l float[] arr_f, @l Collection collection0) {
        L.p(arr_f, "<this>");
        L.p(collection0, "elements");
        int v = arr_f.length;
        float[] arr_f1 = Arrays.copyOf(arr_f, collection0.size() + v);
        for(Object object0: collection0) {
            arr_f1[v] = ((Number)object0).floatValue();
            ++v;
        }
        L.m(arr_f1);
        return arr_f1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal o4(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_v.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(((int)arr_v[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @l
    public static List p(@l double[] arr_f) {
        @s0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12571#2,2:3043\n1754#2,6:3045\n1862#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$6\n*L\n213#1:3043,2\n215#1:3045,6\n216#1:3051,6\n*E\n"})
        public static final class kotlin.collections.o.f extends c implements RandomAccess {
            final double[] c;

            kotlin.collections.o.f(double[] arr_f) {
                this.c = arr_f;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(double f) {
                double[] arr_f = this.c;
                for(int v = 0; v < arr_f.length; ++v) {
                    if(Double.doubleToLongBits(arr_f[v]) == Double.doubleToLongBits(f)) {
                        return true;
                    }
                }
                return false;
            }

            public Double c(int v) {
                return (double)this.c[v];
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Double ? this.b(((Number)object0).doubleValue()) : false;
            }

            public int d(double f) {
                double[] arr_f = this.c;
                int v = 0;
                while(v < arr_f.length) {
                    if(Double.doubleToLongBits(arr_f[v]) != Double.doubleToLongBits(f)) {
                        ++v;
                        continue;
                    }
                    return v;
                }
                return -1;
            }

            public int g(double f) {
                double[] arr_f = this.c;
                int v = arr_f.length - 1;
                if(v >= 0) {
                    while(true) {
                        if(Double.doubleToLongBits(arr_f[v]) == Double.doubleToLongBits(f)) {
                            return v;
                        }
                        if(v - 1 < 0) {
                            break;
                        }
                        --v;
                    }
                }
                return -1;
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Double ? this.d(((Number)object0).doubleValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Double ? this.g(((Number)object0).doubleValue()) : -1;
            }
        }

        L.p(arr_f, "<this>");
        return new kotlin.collections.o.f(arr_f);
    }

    @h0(version = "1.4")
    @f
    private static final String p0(float[] arr_f) {
        String s = Arrays.toString(arr_f);
        L.o(s, "toString(...)");
        return s;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final char[] p1(char[] arr_c, int v, int v1) {
        L.p(arr_c, "<this>");
        return o.g1(arr_c, v, v1);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer p2(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @l
    public static final float[] p3(@l float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "elements");
        float[] arr_f2 = Arrays.copyOf(arr_f, arr_f.length + arr_f1.length);
        System.arraycopy(arr_f1, 0, arr_f2, arr_f.length, arr_f1.length);
        L.m(arr_f2);
        return arr_f2;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal p4(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_v.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(((long)arr_v[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @l
    public static final List q(@l float[] arr_f) {
        @s0({"SMAP\n_ArraysJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,3042:1\n12561#2,2:3043\n1742#2,6:3045\n1850#2,6:3051\n*S KotlinDebug\n*F\n+ 1 _ArraysJvm.kt\nkotlin/collections/ArraysKt___ArraysJvmKt$asList$5\n*L\n199#1:3043,2\n201#1:3045,6\n202#1:3051,6\n*E\n"})
        public static final class e extends c implements RandomAccess {
            final float[] c;

            e(float[] arr_f) {
                this.c = arr_f;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(float f) {
                float[] arr_f = this.c;
                for(int v = 0; v < arr_f.length; ++v) {
                    if(Float.floatToIntBits(arr_f[v]) == Float.floatToIntBits(f)) {
                        return true;
                    }
                }
                return false;
            }

            public Float c(int v) {
                return (float)this.c[v];
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Float ? this.b(((Number)object0).floatValue()) : false;
            }

            public int d(float f) {
                float[] arr_f = this.c;
                int v = 0;
                while(v < arr_f.length) {
                    if(Float.floatToIntBits(arr_f[v]) != Float.floatToIntBits(f)) {
                        ++v;
                        continue;
                    }
                    return v;
                }
                return -1;
            }

            public int g(float f) {
                float[] arr_f = this.c;
                int v = arr_f.length - 1;
                if(v >= 0) {
                    while(true) {
                        if(Float.floatToIntBits(arr_f[v]) == Float.floatToIntBits(f)) {
                            return v;
                        }
                        if(v - 1 < 0) {
                            break;
                        }
                        --v;
                    }
                }
                return -1;
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Float ? this.d(((Number)object0).floatValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Float ? this.g(((Number)object0).floatValue()) : -1;
            }
        }

        L.p(arr_f, "<this>");
        return new e(arr_f);
    }

    @h0(version = "1.4")
    @f
    private static final String q0(int[] arr_v) {
        String s = Arrays.toString(arr_v);
        L.o(s, "toString(...)");
        return s;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final double[] q1(double[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        return o.h1(arr_f, v, v1);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long q2(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        long v = arr_v[0];
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 == 0) {
            return v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(v);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                long v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(v3);
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return v;
    }

    @l
    public static int[] q3(@l int[] arr_v, int v) {
        L.p(arr_v, "<this>");
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v1[arr_v.length] = v;
        L.m(arr_v1);
        return arr_v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal q4(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_object.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(arr_object[v])));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @l
    public static List r(@l int[] arr_v) {
        public static final class kotlin.collections.o.c extends c implements RandomAccess {
            final int[] c;

            kotlin.collections.o.c(int[] arr_v) {
                this.c = arr_v;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(int v) {
                return kotlin.collections.l.q8(this.c, v);
            }

            public Integer c(int v) {
                return (int)this.c[v];
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Integer ? this.b(((Number)object0).intValue()) : false;
            }

            public int d(int v) {
                return kotlin.collections.l.Gf(this.c, v);
            }

            public int g(int v) {
                return kotlin.collections.l.Kh(this.c, v);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Integer ? this.d(((Number)object0).intValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Integer ? this.g(((Number)object0).intValue()) : -1;
            }
        }

        L.p(arr_v, "<this>");
        return new kotlin.collections.o.c(arr_v);
    }

    @h0(version = "1.4")
    @f
    private static final String r0(long[] arr_v) {
        String s = Arrays.toString(arr_v);
        L.o(s, "toString(...)");
        return s;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final float[] r1(float[] arr_f, int v, int v1) {
        L.p(arr_f, "<this>");
        return kotlin.collections.l.i1(arr_f, v, v1);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Object r2(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        if(arr_object.length == 0) {
            return null;
        }
        Object object0 = arr_object[0];
        int v = kotlin.collections.l.we(arr_object);
        if(v != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(object0);
            if(1 <= v) {
                for(int v1 = 1; true; ++v1) {
                    Object object1 = arr_object[v1];
                    Comparable comparable1 = (Comparable)function10.invoke(object1);
                    if(comparable0.compareTo(comparable1) < 0) {
                        object0 = object1;
                        comparable0 = comparable1;
                    }
                    if(v1 == v) {
                        break;
                    }
                }
            }
        }
        return object0;
    }

    @l
    public static final int[] r3(@l int[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "elements");
        int v = arr_v.length;
        int[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + v);
        for(Object object0: collection0) {
            arr_v1[v] = ((Number)object0).intValue();
            ++v;
        }
        L.m(arr_v1);
        return arr_v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal r4(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_v.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(((short)arr_v[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @l
    public static List s(@l long[] arr_v) {
        public static final class d extends c implements RandomAccess {
            final long[] c;

            d(long[] arr_v) {
                this.c = arr_v;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(long v) {
                return kotlin.collections.l.r8(this.c, v);
            }

            public Long c(int v) {
                return (long)this.c[v];
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Long ? this.b(((Number)object0).longValue()) : false;
            }

            public int d(long v) {
                return kotlin.collections.l.Hf(this.c, v);
            }

            public int g(long v) {
                return kotlin.collections.l.Lh(this.c, v);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Long ? this.d(((Number)object0).longValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Long ? this.g(((Number)object0).longValue()) : -1;
            }
        }

        L.p(arr_v, "<this>");
        return new d(arr_v);
    }

    @h0(version = "1.4")
    @f
    private static final String s0(Object[] arr_object) {
        String s = Arrays.toString(arr_object);
        L.o(s, "toString(...)");
        return s;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final int[] s1(int[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.j1(arr_v, v, v1);
    }

    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Short s2(short[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        if(arr_v.length == 0) {
            return null;
        }
        int v = arr_v[0];
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 == 0) {
            return (short)v;
        }
        Comparable comparable0 = (Comparable)function10.invoke(((short)v));
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                int v3 = arr_v[v2];
                Comparable comparable1 = (Comparable)function10.invoke(((short)v3));
                if(comparable0.compareTo(comparable1) < 0) {
                    v = v3;
                    comparable0 = comparable1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return (short)v;
    }

    @l
    public static int[] s3(@l int[] arr_v, @l int[] arr_v1) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "elements");
        int[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        L.m(arr_v2);
        return arr_v2;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal s4(boolean[] arr_z, Function1 function10) {
        L.p(arr_z, "<this>");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        for(int v = 0; v < arr_z.length; ++v) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(Boolean.valueOf(arr_z[v]))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @l
    public static List t(@l Object[] arr_object) {
        L.p(arr_object, "<this>");
        List list0 = q.a(arr_object);
        L.o(list0, "asList(...)");
        return list0;
    }

    @h0(version = "1.4")
    @f
    private static final String t0(short[] arr_v) {
        String s = Arrays.toString(arr_v);
        L.o(s, "toString(...)");
        return s;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final long[] t1(long[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.k1(arr_v, v, v1);
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Boolean t2(boolean[] arr_z, Comparator comparator0) {
        L.p(arr_z, "<this>");
        L.p(comparator0, "comparator");
        return p.bl(arr_z, comparator0);
    }

    @l
    public static long[] t3(@l long[] arr_v, long v) {
        L.p(arr_v, "<this>");
        long[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length + 1);
        arr_v1[arr_v.length] = v;
        L.m(arr_v1);
        return arr_v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger t4(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_b.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(((byte)arr_b[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    @l
    public static final List u(@l short[] arr_v) {
        public static final class b extends c implements RandomAccess {
            final short[] c;

            b(short[] arr_v) {
                this.c = arr_v;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(short v) {
                return kotlin.collections.l.t8(this.c, v);
            }

            public Short c(int v) {
                return (short)this.c[v];
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Short ? this.b(((Number)object0).shortValue()) : false;
            }

            public int d(short v) {
                return kotlin.collections.l.Jf(this.c, v);
            }

            public int g(short v) {
                return kotlin.collections.l.Nh(this.c, v);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Short ? this.d(((Number)object0).shortValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Short ? this.g(((Number)object0).shortValue()) : -1;
            }
        }

        L.p(arr_v, "<this>");
        return new b(arr_v);
    }

    @h0(version = "1.4")
    @f
    private static final String u0(boolean[] arr_z) {
        String s = Arrays.toString(arr_z);
        L.o(s, "toString(...)");
        return s;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final Object[] u1(Object[] arr_object, int v, int v1) {
        L.p(arr_object, "<this>");
        return kotlin.collections.l.l1(arr_object, v, v1);
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Byte u2(byte[] arr_b, Comparator comparator0) {
        L.p(arr_b, "<this>");
        L.p(comparator0, "comparator");
        return p.cl(arr_b, comparator0);
    }

    @l
    public static final long[] u3(@l long[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "elements");
        int v = arr_v.length;
        long[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + v);
        for(Object object0: collection0) {
            arr_v1[v] = ((Number)object0).longValue();
            ++v;
        }
        L.m(arr_v1);
        return arr_v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger u4(char[] arr_c, Function1 function10) {
        L.p(arr_c, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_c.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(Character.valueOf(arr_c[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    @l
    public static final List v(@l boolean[] arr_z) {
        public static final class g extends c implements RandomAccess {
            final boolean[] c;

            g(boolean[] arr_z) {
                this.c = arr_z;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return this.c.length;
            }

            public boolean b(boolean z) {
                return p.u8(this.c, z);
            }

            public Boolean c(int v) {
                return Boolean.valueOf(this.c[v]);
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof Boolean ? this.b(((Boolean)object0).booleanValue()) : false;
            }

            public int d(boolean z) {
                return p.Kf(this.c, z);
            }

            public int g(boolean z) {
                return p.Oh(this.c, z);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return this.c(v);
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof Boolean ? this.d(((Boolean)object0).booleanValue()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return this.c.length == 0;
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof Boolean ? this.g(((Boolean)object0).booleanValue()) : -1;
            }
        }

        L.p(arr_z, "<this>");
        return new g(arr_z);
    }

    @h0(version = "1.3")
    @l
    public static byte[] v0(@l byte[] arr_b, @l byte[] arr_b1, int v, int v1, int v2) {
        L.p(arr_b, "<this>");
        L.p(arr_b1, "destination");
        System.arraycopy(arr_b, v1, arr_b1, v, v2 - v1);
        return arr_b1;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final short[] v1(short[] arr_v, int v, int v1) {
        L.p(arr_v, "<this>");
        return kotlin.collections.l.m1(arr_v, v, v1);
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Character v2(char[] arr_c, Comparator comparator0) {
        L.p(arr_c, "<this>");
        L.p(comparator0, "comparator");
        return p.dl(arr_c, comparator0);
    }

    @l
    public static long[] v3(@l long[] arr_v, @l long[] arr_v1) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "elements");
        long[] arr_v2 = Arrays.copyOf(arr_v, arr_v.length + arr_v1.length);
        System.arraycopy(arr_v1, 0, arr_v2, arr_v.length, arr_v1.length);
        L.m(arr_v2);
        return arr_v2;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger v4(double[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_f.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(((double)arr_f[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    public static final int w(@l byte[] arr_b, byte b, int v, int v1) {
        L.p(arr_b, "<this>");
        return Arrays.binarySearch(arr_b, v, v1, b);
    }

    @h0(version = "1.3")
    @l
    public static char[] w0(@l char[] arr_c, @l char[] arr_c1, int v, int v1, int v2) {
        L.p(arr_c, "<this>");
        L.p(arr_c1, "destination");
        System.arraycopy(arr_c, v1, arr_c1, v, v2 - v1);
        return arr_c1;
    }

    @f
    @i(name = "copyOfRangeInline")
    private static final boolean[] w1(boolean[] arr_z, int v, int v1) {
        L.p(arr_z, "<this>");
        return o.n1(arr_z, v, v1);
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Double w2(double[] arr_f, Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        return p.el(arr_f, comparator0);
    }

    @l
    public static Object[] w3(@l Object[] arr_object, Object object0) {
        L.p(arr_object, "<this>");
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 1);
        arr_object1[arr_object.length] = object0;
        L.m(arr_object1);
        return arr_object1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger w4(float[] arr_f, Function1 function10) {
        L.p(arr_f, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_f.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(((float)arr_f[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    public static final int x(@l char[] arr_c, char c, int v, int v1) {
        L.p(arr_c, "<this>");
        return Arrays.binarySearch(arr_c, v, v1, c);
    }

    @h0(version = "1.3")
    @l
    public static final double[] x0(@l double[] arr_f, @l double[] arr_f1, int v, int v1, int v2) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "destination");
        System.arraycopy(arr_f, v1, arr_f1, v, v2 - v1);
        return arr_f1;
    }

    @f
    private static final byte x1(byte[] arr_b, int v) {
        L.p(arr_b, "<this>");
        return arr_b[v];
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Float x2(float[] arr_f, Comparator comparator0) {
        L.p(arr_f, "<this>");
        L.p(comparator0, "comparator");
        return p.fl(arr_f, comparator0);
    }

    @l
    public static final Object[] x3(@l Object[] arr_object, @l Collection collection0) {
        L.p(arr_object, "<this>");
        L.p(collection0, "elements");
        int v = arr_object.length;
        Object[] arr_object1 = Arrays.copyOf(arr_object, collection0.size() + v);
        for(Object object0: collection0) {
            arr_object1[v] = object0;
            ++v;
        }
        L.m(arr_object1);
        return arr_object1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger x4(int[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_v.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(((int)arr_v[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    public static final int y(@l double[] arr_f, double f, int v, int v1) {
        L.p(arr_f, "<this>");
        return Arrays.binarySearch(arr_f, v, v1, f);
    }

    @h0(version = "1.3")
    @l
    public static float[] y0(@l float[] arr_f, @l float[] arr_f1, int v, int v1, int v2) {
        L.p(arr_f, "<this>");
        L.p(arr_f1, "destination");
        System.arraycopy(arr_f, v1, arr_f1, v, v2 - v1);
        return arr_f1;
    }

    @f
    private static final char y1(char[] arr_c, int v) {
        L.p(arr_c, "<this>");
        return arr_c[v];
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Integer y2(int[] arr_v, Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        return p.gl(arr_v, comparator0);
    }

    @l
    public static final Object[] y3(@l Object[] arr_object, @l Object[] arr_object1) {
        L.p(arr_object, "<this>");
        L.p(arr_object1, "elements");
        Object[] arr_object2 = Arrays.copyOf(arr_object, arr_object.length + arr_object1.length);
        System.arraycopy(arr_object1, 0, arr_object2, arr_object.length, arr_object1.length);
        L.m(arr_object2);
        return arr_object2;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger y4(long[] arr_v, Function1 function10) {
        L.p(arr_v, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_v.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(((long)arr_v[v]))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    public static final int z(@l float[] arr_f, float f, int v, int v1) {
        L.p(arr_f, "<this>");
        return Arrays.binarySearch(arr_f, v, v1, f);
    }

    @h0(version = "1.3")
    @l
    public static int[] z0(@l int[] arr_v, @l int[] arr_v1, int v, int v1, int v2) {
        L.p(arr_v, "<this>");
        L.p(arr_v1, "destination");
        System.arraycopy(arr_v, v1, arr_v1, v, v2 - v1);
        return arr_v1;
    }

    @f
    private static final double z1(double[] arr_f, int v) {
        L.p(arr_f, "<this>");
        return arr_f[v];
    }

    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final Long z2(long[] arr_v, Comparator comparator0) {
        L.p(arr_v, "<this>");
        L.p(comparator0, "comparator");
        return p.hl(arr_v, comparator0);
    }

    @l
    public static final short[] z3(@l short[] arr_v, @l Collection collection0) {
        L.p(arr_v, "<this>");
        L.p(collection0, "elements");
        int v = arr_v.length;
        short[] arr_v1 = Arrays.copyOf(arr_v, collection0.size() + v);
        for(Object object0: collection0) {
            arr_v1[v] = ((Number)object0).shortValue();
            ++v;
        }
        L.m(arr_v1);
        return arr_v1;
    }

    @U
    @h0(version = "1.4")
    @f
    @i(name = "sumOfBigInteger")
    private static final BigInteger z4(Object[] arr_object, Function1 function10) {
        L.p(arr_object, "<this>");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        for(int v = 0; v < arr_object.length; ++v) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(arr_object[v])));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }
}

