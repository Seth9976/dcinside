package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class Constraints {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final int a(int v) {
            if(v < 0x1FFF) {
                return 13;
            }
            if(v < 0x7FFF) {
                return 15;
            }
            if(v < 0xFFFF) {
                return 16;
            }
            if(v >= 0x3FFFF) {
                throw new IllegalArgumentException("Can\'t represent a size of " + v + " in Constraints");
            }
            return 18;
        }

        public final long b(int v, int v1, int v2, int v3) {
            long v8;
            int v4 = v3 == 0x7FFFFFFF ? v2 : v3;
            int v5 = this.a(v4);
            int v6 = v1 == 0x7FFFFFFF ? v : v1;
            int v7 = this.a(v6);
            if(v5 + v7 > 0x1F) {
                throw new IllegalArgumentException("Can\'t represent a width of " + v6 + " and height of " + v4 + " in Constraints");
            }
            switch(v7) {
                case 13: {
                    v8 = 3L;
                    break;
                }
                case 15: {
                    v8 = 2L;
                    break;
                }
                case 16: {
                    v8 = 0L;
                    break;
                }
                case 18: {
                    v8 = 1L;
                    break;
                }
                default: {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
            }
            int v9 = Constraints.q[((int)v8)];
            return ((long)(v1 == 0x7FFFFFFF ? 0 : v1 + 1)) << 33 | (v8 | ((long)v) << 2) | ((long)v2) << v9 | ((long)(v3 == 0x7FFFFFFF ? 0 : v3 + 1)) << v9 + 0x1F;
        }

        @Stable
        public final long c(int v, int v1) {
            if(v < 0 || v1 < 0) {
                throw new IllegalArgumentException(("width(" + v + ") and height(" + v1 + ") must be >= 0").toString());
            }
            return this.b(v, v, v1, v1);
        }

        @Stable
        public final long d(int v) {
            if(v < 0) {
                throw new IllegalArgumentException(("height(" + v + ") must be >= 0").toString());
            }
            return this.b(0, 0x7FFFFFFF, v, v);
        }

        @Stable
        public final long e(int v) {
            if(v < 0) {
                throw new IllegalArgumentException(("width(" + v + ") must be >= 0").toString());
            }
            return this.b(v, v, 0, 0x7FFFFFFF);
        }
    }

    private final long a;
    @l
    public static final Companion b = null;
    public static final int c = 0x7FFFFFFF;
    private static final long d = 0L;
    private static final long e = 1L;
    private static final long f = 2L;
    private static final long g = 3L;
    private static final long h = 3L;
    private static final int i = 16;
    private static final int j = 0xFFFF;
    private static final int k = 15;
    private static final int l = 0x7FFF;
    private static final int m = 18;
    private static final int n = 0x3FFFF;
    private static final int o = 13;
    private static final int p = 0x1FFF;
    @l
    private static final int[] q;
    @l
    private static final int[] r;
    @l
    private static final int[] s;

    static {
        Constraints.b = new Companion(null);
        Constraints.q = new int[]{18, 20, 17, 15};
        Constraints.r = new int[]{0xFFFF, 0x3FFFF, 0x7FFF, 0x1FFF};
        Constraints.s = new int[]{0x7FFF, 0x1FFF, 0xFFFF, 0x3FFFF};
    }

    private Constraints(long v) {
        this.a = v;
    }

    public static final Constraints b(long v) {
        return new Constraints(v);
    }

    public static long c(long v) [...] // Inlined contents

    public static final long d(long v, int v1, int v2, int v3, int v4) {
        if(v3 < 0 || v1 < 0) {
            throw new IllegalArgumentException(("minHeight(" + v3 + ") and minWidth(" + v1 + ") must be >= 0").toString());
        }
        if(v2 < v1 && v2 != 0x7FFFFFFF) {
            throw new IllegalArgumentException(("maxWidth(" + v2 + ") must be >= minWidth(" + v1 + ')').toString());
        }
        if(v4 < v3 && v4 != 0x7FFFFFFF) {
            throw new IllegalArgumentException(("maxHeight(" + v4 + ") must be >= minHeight(" + v3 + ')').toString());
        }
        return Constraints.b.b(v1, v2, v3, v4);
    }

    public static long e(long v, int v1, int v2, int v3, int v4, int v5, Object object0) {
        if((v5 & 1) != 0) {
            v1 = Constraints.r(v);
        }
        if((v5 & 2) != 0) {
            v2 = Constraints.p(v);
        }
        if((v5 & 4) != 0) {
            v3 = Constraints.q(v);
        }
        if((v5 & 8) != 0) {
            v4 = Constraints.o(v);
        }
        return Constraints.d(v, v1, v2, v3, v4);
    }

    @Override
    public boolean equals(Object object0) {
        return Constraints.f(this.a, object0);
    }

    public static boolean f(long v, Object object0) {
        return object0 instanceof Constraints ? v == ((Constraints)object0).x() : false;
    }

    public static final boolean g(long v, long v1) {
        return v == v1;
    }

    private static final int h(long v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return Constraints.t(this.a);
    }

    public static final boolean i(long v) {
        int v1 = (int)(v & 3L);
        return (((int)(v >> Constraints.q[v1] + 0x1F)) & Constraints.s[v1]) != 0;
    }

    public static final boolean j(long v) {
        return (((int)(v >> 33)) & Constraints.r[((int)(v & 3L))]) != 0;
    }

    @Stable
    public static void k() {
    }

    public static final boolean l(long v) {
        return Constraints.o(v) == Constraints.q(v);
    }

    @Stable
    public static void m() {
    }

    public static final boolean n(long v) {
        return Constraints.p(v) == Constraints.r(v);
    }

    public static final int o(long v) {
        int v1 = (int)(v & 3L);
        int v2 = ((int)(v >> Constraints.q[v1] + 0x1F)) & Constraints.s[v1];
        return v2 == 0 ? 0x7FFFFFFF : v2 - 1;
    }

    public static final int p(long v) {
        int v1 = ((int)(v >> 33)) & Constraints.r[((int)(v & 3L))];
        return v1 == 0 ? 0x7FFFFFFF : v1 - 1;
    }

    public static final int q(long v) {
        int v1 = (int)(v & 3L);
        return ((int)(v >> Constraints.q[v1])) & Constraints.s[v1];
    }

    public static final int r(long v) {
        return ((int)(v >> 2)) & Constraints.r[((int)(v & 3L))];
    }

    @b0
    public static void s() {
    }

    public static int t(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    @l
    public String toString() {
        return Constraints.w(this.a);
    }

    @Stable
    public static void u() {
    }

    public static final boolean v(long v) {
        return Constraints.p(v) == 0 || Constraints.o(v) == 0;
    }

    @l
    public static String w(long v) {
        int v1 = Constraints.p(v);
        String s = "Infinity";
        String s1 = v1 == 0x7FFFFFFF ? "Infinity" : String.valueOf(v1);
        int v2 = Constraints.o(v);
        if(v2 != 0x7FFFFFFF) {
            s = String.valueOf(v2);
        }
        return "Constraints(minWidth = " + Constraints.r(v) + ", maxWidth = " + s1 + ", minHeight = " + Constraints.q(v) + ", maxHeight = " + s + ')';
    }

    public final long x() {
        return this.a;
    }
}

