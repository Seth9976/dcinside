package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.A0;
import kotlin.D0;
import kotlin.E0;
import kotlin.H0;
import kotlin.I0;
import kotlin.N0;
import kotlin.O0;
import kotlin.U;
import kotlin.V0;
import kotlin.c0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.l;
import kotlin.t;
import kotlin.z0;
import z3.i;

class b {
    @h0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final N0 A(short[] arr_v, Comparator comparator0) {
        L.p(arr_v, "$this$maxWith");
        L.p(comparator0, "comparator");
        return c.A6(arr_v, comparator0);
    }

    @h0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final H0 B(long[] arr_v, Comparator comparator0) {
        L.p(arr_v, "$this$maxWith");
        L.p(comparator0, "comparator");
        return c.B6(arr_v, comparator0);
    }

    @h0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final D0 C(int[] arr_v) {
        L.p(arr_v, "$this$min");
        return c.u7(arr_v);
    }

    @h0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final z0 D(byte[] arr_b) {
        L.p(arr_b, "$this$min");
        return c.v7(arr_b);
    }

    @h0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final H0 E(long[] arr_v) {
        L.p(arr_v, "$this$min");
        return c.w7(arr_v);
    }

    @h0(version = "1.3")
    @k(message = "Use minOrNull instead.", replaceWith = @c0(expression = "this.minOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final N0 F(short[] arr_v) {
        L.p(arr_v, "$this$min");
        return c.x7(arr_v);
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final z0 G(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$minBy");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(z0.b(((byte)v)));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    int v3 = A0.l(arr_b, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(z0.b(((byte)v3)));
                    if(comparable0.compareTo(comparable1) > 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final H0 H(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minBy");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(H0.b(v));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    long v3 = I0.l(arr_v, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(H0.b(v3));
                    if(comparable0.compareTo(comparable1) > 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final D0 I(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minBy");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(D0.b(v));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    int v3 = E0.l(arr_v, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(D0.b(v3));
                    if(comparable0.compareTo(comparable1) > 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use minByOrNull instead.", replaceWith = @c0(expression = "this.minByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final N0 J(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$minBy");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(N0.b(((short)v)));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    int v3 = O0.l(arr_v, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(N0.b(((short)v3)));
                    if(comparable0.compareTo(comparable1) > 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final z0 K(byte[] arr_b, Comparator comparator0) {
        L.p(arr_b, "$this$minWith");
        L.p(comparator0, "comparator");
        return c.C7(arr_b, comparator0);
    }

    @h0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final D0 L(int[] arr_v, Comparator comparator0) {
        L.p(arr_v, "$this$minWith");
        L.p(comparator0, "comparator");
        return c.D7(arr_v, comparator0);
    }

    @h0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final N0 M(short[] arr_v, Comparator comparator0) {
        L.p(arr_v, "$this$minWith");
        L.p(comparator0, "comparator");
        return c.E7(arr_v, comparator0);
    }

    @h0(version = "1.3")
    @k(message = "Use minWithOrNull instead.", replaceWith = @c0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final H0 N(long[] arr_v, Comparator comparator0) {
        L.p(arr_v, "$this$minWith");
        L.p(comparator0, "comparator");
        return c.F7(arr_v, comparator0);
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal O(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumOf");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(z0.b(A0.l(arr_b, v1)))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal P(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(D0.b(E0.l(arr_v, v1)))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal Q(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(H0.b(I0.l(arr_v, v1)))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigDecimal")
    private static final BigDecimal R(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        L.o(bigDecimal0, "valueOf(...)");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(N0.b(O0.l(arr_v, v1)))));
            L.o(bigDecimal0, "add(...)");
        }
        return bigDecimal0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigInteger")
    private static final BigInteger S(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$sumOf");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        int v = A0.o(arr_b);
        for(int v1 = 0; v1 < v; ++v1) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(z0.b(A0.l(arr_b, v1)))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigInteger")
    private static final BigInteger T(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        int v = E0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(D0.b(E0.l(arr_v, v1)))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigInteger")
    private static final BigInteger U(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        int v = I0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(H0.b(I0.l(arr_v, v1)))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    @U
    @h0(version = "1.4")
    @f
    @t
    @i(name = "sumOfBigInteger")
    private static final BigInteger V(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$sumOf");
        L.p(function10, "selector");
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        L.o(bigInteger0, "valueOf(...)");
        int v = O0.o(arr_v);
        for(int v1 = 0; v1 < v; ++v1) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(N0.b(O0.l(arr_v, v1)))));
            L.o(bigInteger0, "add(...)");
        }
        return bigInteger0;
    }

    @h0(version = "1.3")
    @t
    @y4.l
    public static final List a(@y4.l int[] arr_v) {
        public static final class a extends kotlin.collections.c implements RandomAccess {
            final int[] c;

            a(int[] arr_v) {
                this.c = arr_v;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return E0.o(this.c);
            }

            public boolean b(int v) {
                return E0.h(this.c, v);
            }

            public int c(int v) {
                return E0.l(this.c, v);
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof D0 ? this.b(((D0)object0).l0()) : false;
            }

            public int d(int v) {
                return kotlin.collections.l.Gf(this.c, v);
            }

            public int g(int v) {
                return kotlin.collections.l.Kh(this.c, v);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return D0.b(this.c(v));
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof D0 ? this.d(((D0)object0).l0()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return E0.r(this.c);
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof D0 ? this.g(((D0)object0).l0()) : -1;
            }
        }

        L.p(arr_v, "$this$asList");
        return new a(arr_v);
    }

    @h0(version = "1.3")
    @t
    @y4.l
    public static final List b(@y4.l byte[] arr_b) {
        public static final class kotlin.collections.unsigned.b.c extends kotlin.collections.c implements RandomAccess {
            final byte[] c;

            kotlin.collections.unsigned.b.c(byte[] arr_b) {
                this.c = arr_b;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return A0.o(this.c);
            }

            public boolean b(byte b) {
                return A0.h(this.c, b);
            }

            public byte c(int v) {
                return A0.l(this.c, v);
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof z0 ? this.b(((z0)object0).j0()) : false;
            }

            public int d(byte b) {
                return kotlin.collections.l.Cf(this.c, b);
            }

            public int g(byte b) {
                return kotlin.collections.l.Gh(this.c, b);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return z0.b(this.c(v));
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof z0 ? this.d(((z0)object0).j0()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return A0.r(this.c);
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof z0 ? this.g(((z0)object0).j0()) : -1;
            }
        }

        L.p(arr_b, "$this$asList");
        return new kotlin.collections.unsigned.b.c(arr_b);
    }

    @h0(version = "1.3")
    @t
    @y4.l
    public static final List c(@y4.l long[] arr_v) {
        public static final class kotlin.collections.unsigned.b.b extends kotlin.collections.c implements RandomAccess {
            final long[] c;

            kotlin.collections.unsigned.b.b(long[] arr_v) {
                this.c = arr_v;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return I0.o(this.c);
            }

            public boolean b(long v) {
                return I0.h(this.c, v);
            }

            public long c(int v) {
                return I0.l(this.c, v);
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof H0 ? this.b(((H0)object0).l0()) : false;
            }

            public int d(long v) {
                return kotlin.collections.l.Hf(this.c, v);
            }

            public int g(long v) {
                return kotlin.collections.l.Lh(this.c, v);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return H0.b(this.c(v));
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof H0 ? this.d(((H0)object0).l0()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return I0.r(this.c);
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof H0 ? this.g(((H0)object0).l0()) : -1;
            }
        }

        L.p(arr_v, "$this$asList");
        return new kotlin.collections.unsigned.b.b(arr_v);
    }

    @h0(version = "1.3")
    @t
    @y4.l
    public static final List d(@y4.l short[] arr_v) {
        public static final class d extends kotlin.collections.c implements RandomAccess {
            final short[] c;

            d(short[] arr_v) {
                this.c = arr_v;
                super();
            }

            @Override  // kotlin.collections.c
            public int a() {
                return O0.o(this.c);
            }

            public boolean b(short v) {
                return O0.h(this.c, v);
            }

            public short c(int v) {
                return O0.l(this.c, v);
            }

            @Override  // kotlin.collections.a
            public final boolean contains(Object object0) {
                return object0 instanceof N0 ? this.b(((N0)object0).j0()) : false;
            }

            public int d(short v) {
                return kotlin.collections.l.Jf(this.c, v);
            }

            public int g(short v) {
                return kotlin.collections.l.Nh(this.c, v);
            }

            @Override  // kotlin.collections.c
            public Object get(int v) {
                return N0.b(this.c(v));
            }

            @Override  // kotlin.collections.c
            public final int indexOf(Object object0) {
                return object0 instanceof N0 ? this.d(((N0)object0).j0()) : -1;
            }

            @Override  // kotlin.collections.a
            public boolean isEmpty() {
                return O0.r(this.c);
            }

            @Override  // kotlin.collections.c
            public final int lastIndexOf(Object object0) {
                return object0 instanceof N0 ? this.g(((N0)object0).j0()) : -1;
            }
        }

        L.p(arr_v, "$this$asList");
        return new d(arr_v);
    }

    @h0(version = "1.3")
    @t
    public static final int e(@y4.l int[] arr_v, int v, int v1, int v2) {
        L.p(arr_v, "$this$binarySearch");
        kotlin.collections.c.a.d(v1, v2, E0.o(arr_v));
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = V0.e(arr_v[v4], v);
            if(v5 < 0) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v1 + 1);
    }

    public static int f(int[] arr_v, int v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = E0.o(arr_v);
        }
        return b.e(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @t
    public static final int g(@y4.l short[] arr_v, short v, int v1, int v2) {
        L.p(arr_v, "$this$binarySearch");
        kotlin.collections.c.a.d(v1, v2, O0.o(arr_v));
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = V0.e(arr_v[v4], v & 0xFFFF);
            if(v5 < 0) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v1 + 1);
    }

    public static int h(short[] arr_v, short v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = O0.o(arr_v);
        }
        return b.g(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @t
    public static final int i(@y4.l long[] arr_v, long v, int v1, int v2) {
        L.p(arr_v, "$this$binarySearch");
        kotlin.collections.c.a.d(v1, v2, I0.o(arr_v));
        int v3 = v2 - 1;
        while(v1 <= v3) {
            int v4 = v1 + v3 >>> 1;
            int v5 = V0.n(arr_v[v4], v);
            if(v5 < 0) {
                v1 = v4 + 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v1 + 1);
    }

    public static int j(long[] arr_v, long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = 0;
        }
        if((v3 & 4) != 0) {
            v2 = I0.o(arr_v);
        }
        return b.i(arr_v, v, v1, v2);
    }

    @h0(version = "1.3")
    @t
    public static final int k(@y4.l byte[] arr_b, byte b, int v, int v1) {
        L.p(arr_b, "$this$binarySearch");
        kotlin.collections.c.a.d(v, v1, A0.o(arr_b));
        int v2 = v1 - 1;
        while(v <= v2) {
            int v3 = v + v2 >>> 1;
            int v4 = V0.e(arr_b[v3], b & 0xFF);
            if(v4 < 0) {
                v = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v2 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v + 1);
    }

    public static int l(byte[] arr_b, byte b, int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v = 0;
        }
        if((v2 & 4) != 0) {
            v1 = A0.o(arr_b);
        }
        return b.k(arr_b, b, v, v1);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final byte m(byte[] arr_b, int v) {
        L.p(arr_b, "$this$elementAt");
        return A0.l(arr_b, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final short n(short[] arr_v, int v) {
        L.p(arr_v, "$this$elementAt");
        return O0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final int o(int[] arr_v, int v) {
        L.p(arr_v, "$this$elementAt");
        return E0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @f
    @t
    private static final long p(long[] arr_v, int v) {
        L.p(arr_v, "$this$elementAt");
        return I0.l(arr_v, v);
    }

    @h0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final D0 q(int[] arr_v) {
        L.p(arr_v, "$this$max");
        return c.q6(arr_v);
    }

    @h0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final z0 r(byte[] arr_b) {
        L.p(arr_b, "$this$max");
        return c.r6(arr_b);
    }

    @h0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final H0 s(long[] arr_v) {
        L.p(arr_v, "$this$max");
        return c.s6(arr_v);
    }

    @h0(version = "1.3")
    @k(message = "Use maxOrNull instead.", replaceWith = @c0(expression = "this.maxOrNull()", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final N0 t(short[] arr_v) {
        L.p(arr_v, "$this$max");
        return c.t6(arr_v);
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final z0 u(byte[] arr_b, Function1 function10) {
        L.p(arr_b, "$this$maxBy");
        L.p(function10, "selector");
        if(A0.r(arr_b)) {
            return null;
        }
        int v = A0.l(arr_b, 0);
        int v1 = kotlin.collections.l.qe(arr_b);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(z0.b(((byte)v)));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    int v3 = A0.l(arr_b, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(z0.b(((byte)v3)));
                    if(comparable0.compareTo(comparable1) < 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return z0.b(((byte)v));
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final H0 v(long[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxBy");
        L.p(function10, "selector");
        if(I0.r(arr_v)) {
            return null;
        }
        long v = I0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ve(arr_v);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(H0.b(v));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    long v3 = I0.l(arr_v, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(H0.b(v3));
                    if(comparable0.compareTo(comparable1) < 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return H0.b(v);
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final D0 w(int[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxBy");
        L.p(function10, "selector");
        if(E0.r(arr_v)) {
            return null;
        }
        int v = E0.l(arr_v, 0);
        int v1 = kotlin.collections.l.ue(arr_v);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(D0.b(v));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    int v3 = E0.l(arr_v, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(D0.b(v3));
                    if(comparable0.compareTo(comparable1) < 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return D0.b(v);
    }

    @h0(version = "1.3")
    @f
    @k(message = "Use maxByOrNull instead.", replaceWith = @c0(expression = "this.maxByOrNull(selector)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    private static final N0 x(short[] arr_v, Function1 function10) {
        L.p(arr_v, "$this$maxBy");
        L.p(function10, "selector");
        if(O0.r(arr_v)) {
            return null;
        }
        int v = O0.l(arr_v, 0);
        int v1 = kotlin.collections.l.xe(arr_v);
        if(v1 != 0) {
            Comparable comparable0 = (Comparable)function10.invoke(N0.b(((short)v)));
            if(1 <= v1) {
                for(int v2 = 1; true; ++v2) {
                    int v3 = O0.l(arr_v, v2);
                    Comparable comparable1 = (Comparable)function10.invoke(N0.b(((short)v3)));
                    if(comparable0.compareTo(comparable1) < 0) {
                        v = v3;
                        comparable0 = comparable1;
                    }
                    if(v2 == v1) {
                        break;
                    }
                }
            }
        }
        return N0.b(((short)v));
    }

    @h0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final z0 y(byte[] arr_b, Comparator comparator0) {
        L.p(arr_b, "$this$maxWith");
        L.p(comparator0, "comparator");
        return c.y6(arr_b, comparator0);
    }

    @h0(version = "1.3")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @c0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @t
    public static final D0 z(int[] arr_v, Comparator comparator0) {
        L.p(arr_v, "$this$maxWith");
        L.p(comparator0, "comparator");
        return c.z6(arr_v, comparator0);
    }
}

