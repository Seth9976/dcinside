package androidx.compose.ui.graphics;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.c;
import kotlin.text.r;
import y4.l;
import z3.g;

@g
public final class Float16 implements Comparable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final short c(float f) {
            int v = Float.floatToRawIntBits(f);
            int v1 = v >>> 23 & 0xFF;
            int v2 = 0;
            if(v1 == 0xFF) {
                return (0x7FFFFF & v) == 0 ? ((short)(v >>> 0x1F << 15 | 0x7C00)) : ((short)(v >>> 0x1F << 15 | 0x7E00));
            }
            if(v1 - 0x70 >= 0x1F) {
                return (short)(v >>> 0x1F << 15 | 0xC400);
            }
            if(v1 - 0x70 <= 0) {
                if(v1 - 0x70 >= -10) {
                    int v3 = (0x800000 | 0x7FFFFF & v) >> 0x71 - v1;
                    v2 = ((v3 & 0x1000) == 0 ? (0x800000 | 0x7FFFFF & v) >> 0x71 - v1 : v3 + 0x2000) >> 13;
                }
                return (short)(v >>> 0x1F << 15 | v2);
            }
            v2 = (0x7FFFFF & v) >> 13;
            return (v & 0x1000) == 0 ? ((short)(v >>> 0x1F << 15 | v1 - 0x70 << 10 | v2)) : ((short)((v1 - 0x70 << 10 | v2) + 1 | v >>> 0x1F << 15));
        }

        // 去混淆评级： 低(20)
        public final short d() {
            return 0x1400;
        }

        // 去混淆评级： 低(20)
        public final short e() {
            return 0xFFFFFBFF;
        }

        // 去混淆评级： 低(20)
        public final short f() {
            return 0x7BFF;
        }

        // 去混淆评级： 低(20)
        public final short g() {
            return 0x400;
        }

        // 去混淆评级： 低(20)
        public final short h() {
            return 1;
        }

        // 去混淆评级： 低(20)
        public final short i() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final short j() {
            return 0xFFFFFC00;
        }

        // 去混淆评级： 低(20)
        public final short k() {
            return 0xFFFF8000;
        }

        // 去混淆评级： 低(20)
        public final short l() {
            return 0x7C00;
        }

        // 去混淆评级： 低(20)
        public final short m() {
            return 0;
        }

        private final int n(short v) {
            return (v & 0x8000) == 0 ? v & 0xFFFF : 0x8000 - (v & 0xFFFF);
        }
    }

    private static final int A = 23;
    private static final int B = 0xFF;
    private static final int C = 0x7FFFFF;
    private static final int D = 0x7F;
    private static final int E = 0x400000;
    private static final int F = 0x3F000000;
    private static final float G = 0.0f;
    private final short a;
    @l
    public static final Companion b = null;
    public static final int c = 16;
    private static final short d = 0;
    public static final int e = 15;
    public static final int f = -14;
    private static final short g = 0;
    private static final short h = 0;
    private static final short i = 0;
    private static final short j = 0;
    private static final short k = 0;
    private static final short l = 0;
    private static final short m = 0;
    private static final short n = 0;
    private static final short o = 0;
    private static final short p = 0;
    private static final short q = 0;
    private static final int r = 15;
    private static final int s = 0x8000;
    private static final int t = 10;
    private static final int u = 0x1F;
    private static final int v = 0x3FF;
    private static final int w = 15;
    private static final int x = 0x7FFF;
    private static final int y = 0x7C00;
    private static final int z = 0x1F;

    static {
        Float16.b = new Companion(null);
        Float16.d = 0x1400;
        Float16.g = (short)0xFBFF;
        Float16.h = 0x7BFF;
        Float16.i = 0x400;
        Float16.j = 1;
        Float16.k = 0x7E00;
        Float16.l = (short)0xFC00;
        Float16.m = (short)0x8000;
        Float16.n = 0x7C00;
        Float16.o = 0;
        Float16.p = 0x3C00;
        Float16.q = (short)0xBC00;
        Float16.G = 0.5f;
    }

    private Float16(short v) {
        this.a = v;
    }

    public static final short A(short v) {
        if(Float16.F(v)) {
            return Float16.k;
        }
        if(Float16.p(v, Float16.m) < 0) {
            return Float16.q;
        }
        return Float16.p(v, Float16.o) <= 0 ? v : Float16.p;
    }

    public static final int B(short v) {
        return v & 0x3FF;
    }

    public static int C(short v) [...] // Inlined contents

    public static final boolean D(short v) {
        return (v & 0x7FFF) != 0x7C00;
    }

    public static final boolean E(short v) {
        return (v & 0x7FFF) == 0x7C00;
    }

    public static final boolean F(short v) {
        return (v & 0x7FFF) > 0x7C00;
    }

    public static final boolean G(short v) {
        return (v & 0x7C00) != 0 && (v & 0x7C00) != 0x7C00;
    }

    public static final short H(short v) {
        int v1 = 0xFFFF;
        int v2 = v & 0xFFFF;
        if((v & 0x7FFF) < 0x3C00) {
            if((v & 0x7FFF) < 0x3800) {
                v1 = 0;
            }
            return (short)(v & 0x8000 | v1 & 0x3C00);
        }
        if((v & 0x7FFF) < 0x6400) {
            int v3 = (v & 0x7FFF) >> 10;
            v2 = v2 + (1 << 24 - v3) & ~((1 << 25 - v3) - 1);
        }
        return (short)v2;
    }

    public static final int I(short v) {
        return Float16.F(v) ? Float16.k : v & 0xFFFF;
    }

    public static final byte J(short v) {
        return (byte)(((int)Float16.L(v)));
    }

    public static final double K(short v) {
        return (double)Float16.L(v);
    }

    public static final float L(short v) {
        int v1 = (0xFFFF & v) >>> 10 & 0x1F;
        if(v1 == 0) {
            if((v & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v & 0x3FF) + 0x3F000000) - Float16.G;
                return (0x8000 & v) == 0 ? f : -f;
            }
            return Float.intBitsToFloat((0x8000 & v) << 16);
        }
        int v2 = (v & 0x3FF) << 13;
        if(v1 == 0x1F) {
            if(v2 != 0) {
                v2 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | (0x8000 & v) << 16 | v2);
        }
        return Float.intBitsToFloat(v1 + 0x70 << 23 | (0x8000 & v) << 16 | v2);
    }

    @l
    public static final String M(short v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1 = (0xFFFF & v) >>> 15;
        int v2 = (0xFFFF & v) >>> 10 & 0x1F;
        if(v2 != 0x1F) {
            if(v1 == 1) {
                stringBuilder0.append('-');
            }
            if(v2 != 0) {
                stringBuilder0.append("0x1.");
                String s1 = Integer.toString(v & 0x3FF, c.a(16));
                L.o(s1, "toString(this, checkRadix(radix))");
                stringBuilder0.append(new r("0{2,}$").o(s1, ""));
                stringBuilder0.append('p');
                stringBuilder0.append(String.valueOf(v2 - 15));
            }
            else if((v & 0x3FF) == 0) {
                stringBuilder0.append("0x0.0p0");
            }
            else {
                stringBuilder0.append("0x0.");
                String s = Integer.toString(v & 0x3FF, c.a(16));
                L.o(s, "toString(this, checkRadix(radix))");
                stringBuilder0.append(new r("0{2,}$").o(s, ""));
                stringBuilder0.append("p-14");
            }
        }
        else if((v & 0x3FF) == 0) {
            if(v1 != 0) {
                stringBuilder0.append('-');
            }
            stringBuilder0.append("Infinity");
        }
        else {
            stringBuilder0.append("NaN");
        }
        String s2 = stringBuilder0.toString();
        L.o(s2, "o.toString()");
        return s2;
    }

    public static final int N(short v) {
        return (int)Float16.L(v);
    }

    public static final long O(short v) {
        return (long)Float16.L(v);
    }

    public static final int P(short v) {
        return v & 0xFFFF;
    }

    public static final short Q(short v) {
        return (short)(((int)Float16.L(v)));
    }

    @l
    public static String R(short v) {
        return String.valueOf(Float16.L(v));
    }

    public static final short S(short v) {
        int v1 = 0xFFFF & v;
        if((v & 0x7FFF) < 0x3C00) {
            return (short)(0x8000 & v);
        }
        if((v & 0x7FFF) < 0x6400) {
            v1 &= ~((1 << 25 - ((v & 0x7FFF) >> 10)) - 1);
        }
        return (short)v1;
    }

    public final short T() {
        return this.a;
    }

    public static final short U(short v, short v1) {
        return (short)(v & 0x7FFF | v1 & 0x8000);
    }

    public static final short a(short v) {
        return (short)(v & 0x7FFF);
    }

    public static final short b() [...] // 潜在的解密器

    public static final short c() [...] // 潜在的解密器

    @Override
    public int compareTo(Object object0) {
        return this.n(((Float16)object0).T());
    }

    public static final short d() [...] // 潜在的解密器

    public static final short e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return Float16.u(this.a, object0);
    }

    public static final short f() [...] // 潜在的解密器

    public static final short g() [...] // 潜在的解密器

    public static final short h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final short i() [...] // 潜在的解密器

    public static final short j() [...] // 潜在的解密器

    public static final short k() [...] // 潜在的解密器

    public static final Float16 l(short v) {
        return new Float16(v);
    }

    public static final short m(short v) {
        int v1 = 0xFFFF & v;
        int v2 = 1;
        if((v & 0x7FFF) < 0x3C00) {
            if((v & 0x7FFF) == 0) {
                v2 = 0;
            }
            return (short)(-(~(v1 >> 15) & v2) & 0x3C00 | v & 0x8000);
        }
        if((v & 0x7FFF) < 0x6400) {
            int v3 = (1 << 25 - ((v & 0x7FFF) >> 10)) - 1;
            v1 = v1 + ((v1 >> 15) - 1 & v3) & ~v3;
        }
        return (short)v1;
    }

    public int n(short v) {
        return Float16.p(this.a, v);
    }

    public static int p(short v, short v1) {
        if(Float16.F(v)) {
            return !Float16.F(v1);
        }
        return Float16.F(v1) ? -1 : L.t(Float16.b.n(v), Float16.b.n(v1));
    }

    public static short r(double f) {
        return Float16.s(((float)f));
    }

    public static short s(float f) [...] // 潜在的解密器

    public static short t(short v) [...] // Inlined contents

    @Override
    @l
    public String toString() {
        return Float16.R(this.a);
    }

    public static boolean u(short v, Object object0) {
        return object0 instanceof Float16 ? v == ((Float16)object0).T() : false;
    }

    public static final boolean v(short v, short v1) {
        return v == v1;
    }

    public static final short w(short v) {
        int v1 = 0xFFFF;
        int v2 = v & 0xFFFF;
        if((v & 0x7FFF) < 0x3C00) {
            if(v2 <= 0x8000) {
                v1 = 0;
            }
            return (short)(v & 0x8000 | v1 & 0x3C00);
        }
        if((v & 0x7FFF) < 0x6400) {
            int v3 = (1 << 25 - ((v & 0x7FFF) >> 10)) - 1;
            v2 = v2 + (-(v2 >> 15) & v3) & ~v3;
        }
        return (short)v2;
    }

    public static final int y(short v) {
        return (v >>> 10 & 0x1F) - 15;
    }

    public final short z() {
        return this.a;
    }
}

