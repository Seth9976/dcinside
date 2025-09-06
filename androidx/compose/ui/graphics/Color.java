package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.H0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n+ 2 ColorSpaces.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpaces\n*L\n1#1,659:1\n320#2:660\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n123#1:660\n*E\n"})
@g
public final class Color {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        public final long A(float f, float f1, float f2, float f3, @l Rgb rgb0) {
            L.p(rgb0, "colorSpace");
            if(0.0f > f || f > 360.0f || 0.0f > f1 || f1 > 1.0f || 0.0f > f2 || f2 > 1.0f) {
                throw new IllegalArgumentException(("HSL (" + f + ", " + f1 + ", " + f2 + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return ColorKt.a(this.C(0, f, f1, f2), this.C(8, f, f1, f2), this.C(4, f, f1, f2), f3, rgb0);
        }

        public static long B(Companion color$Companion0, float f, float f1, float f2, float f3, Rgb rgb0, int v, Object object0) {
            if((v & 16) != 0) {
                rgb0 = ColorSpaces.a.x();
            }
            return color$Companion0.A(f, f1, f2, ((v & 8) == 0 ? f3 : 1.0f), rgb0);
        }

        private final float C(int v, float f, float f1, float f2) {
            float f3 = (((float)v) + f / 30.0f) % 12.0f;
            return f2 - f1 * Math.min(f2, 1.0f - f2) * Math.max(-1.0f, Math.min(f3 - 3.0f, Math.min(9.0f - f3, 1.0f)));
        }

        public final long D(float f, float f1, float f2, float f3, @l Rgb rgb0) {
            L.p(rgb0, "colorSpace");
            if(0.0f > f || f > 360.0f || 0.0f > f1 || f1 > 1.0f || 0.0f > f2 || f2 > 1.0f) {
                throw new IllegalArgumentException(("HSV (" + f + ", " + f1 + ", " + f2 + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return ColorKt.a(this.F(5, f, f1, f2), this.F(3, f, f1, f2), this.F(1, f, f1, f2), f3, rgb0);
        }

        public static long E(Companion color$Companion0, float f, float f1, float f2, float f3, Rgb rgb0, int v, Object object0) {
            if((v & 16) != 0) {
                rgb0 = ColorSpaces.a.x();
            }
            return color$Companion0.D(f, f1, f2, ((v & 8) == 0 ? f3 : 1.0f), rgb0);
        }

        private final float F(int v, float f, float f1, float f2) {
            float f3 = (((float)v) + f / 60.0f) % 6.0f;
            return f2 - f1 * f2 * Math.max(0.0f, Math.min(f3, Math.min(4.0f - f3, 1.0f)));
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器

        @Stable
        public static void b() {
        }

        // 去混淆评级： 低(20)
        public final long c() [...] // 潜在的解密器

        @Stable
        public static void d() {
        }

        // 去混淆评级： 低(20)
        public final long e() {
            return 0xFF00FFFF00000000L;
        }

        @Stable
        public static void f() {
        }

        // 去混淆评级： 低(20)
        public final long g() {
            return 0xFF44444400000000L;
        }

        @Stable
        public static void h() {
        }

        // 去混淆评级： 低(20)
        public final long i() {
            return 0xFF88888800000000L;
        }

        @Stable
        public static void j() {
        }

        // 去混淆评级： 低(20)
        public final long k() {
            return 0xFF00FF0000000000L;
        }

        @Stable
        public static void l() {
        }

        // 去混淆评级： 低(20)
        public final long m() {
            return 0xFFCCCCCC00000000L;
        }

        @Stable
        public static void n() {
        }

        // 去混淆评级： 低(20)
        public final long o() {
            return 0xFFFF00FF00000000L;
        }

        @Stable
        public static void p() {
        }

        // 去混淆评级： 低(20)
        public final long q() [...] // 潜在的解密器

        @Stable
        public static void r() {
        }

        // 去混淆评级： 低(20)
        public final long s() [...] // 潜在的解密器

        @Stable
        public static void t() {
        }

        // 去混淆评级： 低(20)
        public final long u() [...] // 潜在的解密器

        @Stable
        public static void v() {
        }

        // 去混淆评级： 低(20)
        public final long w() [...] // 潜在的解密器

        @Stable
        public static void x() {
        }

        // 去混淆评级： 低(20)
        public final long y() {
            return 0xFFFFFF0000000000L;
        }

        @Stable
        public static void z() {
        }
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final long n;
    private static final long o;

    static {
        Color.b = new Companion(null);
        Color.c = 0xFF00000000000000L;
        Color.d = 0xFF44444400000000L;
        Color.e = 0xFF88888800000000L;
        Color.f = 0xFFCCCCCC00000000L;
        Color.g = 0xFFFFFFFF00000000L;
        Color.h = 0xFFFF000000000000L;
        Color.i = 0xFF00FF0000000000L;
        Color.j = 0xFF0000FF00000000L;
        Color.k = 0xFFFFFF0000000000L;
        Color.l = 0xFF00FFFF00000000L;
        Color.m = 0xFFFF00FF00000000L;
        Color.n = ColorKt.b(0);
        Color.o = ColorKt.a(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.a.A());
    }

    private Color(long v) {
        this.a = v;
    }

    public static final float A(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 56 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 56 & 0xFFL)))) / 255.0f : ((float)(((double)((v >>> 6 & 0x3FFL) >>> 11)) * 2048.0 + ((double)(v >>> 6 & 0x3FFL)))) / 1023.0f;
    }

    @Stable
    public static void B() {
    }

    public static final float C(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 0x20 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 0x20 & 0xFFL)))) / 255.0f : Float16.L(((short)(((int)(v >>> 16 & 0xFFFFL)))));
    }

    @Stable
    public static void D() {
    }

    @l
    public static final ColorSpace E(long v) {
        return ColorSpaces.a.m()[((int)(v & 0x3FL))];
    }

    @Stable
    public static void F() {
    }

    public static final float G(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 40 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 40 & 0xFFL)))) / 255.0f : Float16.L(((short)(((int)(v >>> 0x20 & 0xFFFFL)))));
    }

    @Stable
    public static void H() {
    }

    public static final float I(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 0x30 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 0x30 & 0xFFL)))) / 255.0f : Float16.L(((short)(((int)(v >>> 0x30 & 0xFFFFL)))));
    }

    public final long J() {
        return this.a;
    }

    public static int K(long v) {
        return H0.w(v);
    }

    @l
    public static String L(long v) {
        return "Color(" + Color.I(v) + ", " + Color.G(v) + ", " + Color.C(v) + ", " + Color.A(v) + ", " + Color.E(v).h() + ')';
    }

    public final long M() {
        return this.a;
    }

    public static final long a() [...] // 潜在的解密器

    public static final long b() [...] // 潜在的解密器

    public static final long c() [...] // 潜在的解密器

    public static final long d() [...] // 潜在的解密器

    public static final long e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return Color.x(this.a, object0);
    }

    public static final long f() [...] // 潜在的解密器

    public static final long g() [...] // 潜在的解密器

    public static final long h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return Color.K(this.a);
    }

    public static final long i() [...] // 潜在的解密器

    public static final long j() [...] // 潜在的解密器

    public static final long k() [...] // 潜在的解密器

    public static final long l() [...] // 潜在的解密器

    public static final long m() [...] // 潜在的解密器

    public static final Color n(long v) {
        return new Color(v);
    }

    @Stable
    public static final float o(long v) {
        return Color.I(v);
    }

    @Stable
    public static final float p(long v) {
        return Color.G(v);
    }

    @Stable
    public static final float q(long v) {
        return Color.C(v);
    }

    @Stable
    public static final float r(long v) {
        return Color.A(v);
    }

    @Stable
    @l
    public static final ColorSpace s(long v) {
        return Color.E(v);
    }

    public static long t(long v) [...] // Inlined contents

    @Override
    @l
    public String toString() {
        return Color.L(this.a);
    }

    public static final long u(long v, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        ColorSpace colorSpace1 = Color.E(v);
        return L.g(colorSpace0, colorSpace1) ? v : ColorSpaceKt.k(colorSpace1, colorSpace0, 0, 2, null).i(Color.I(v), Color.G(v), Color.C(v), Color.A(v));
    }

    @Stable
    public static final long v(long v, float f, float f1, float f2, float f3) {
        return ColorKt.a(f1, f2, f3, f, Color.E(v));
    }

    public static long w(long v, float f, float f1, float f2, float f3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Color.A(v);
        }
        if((v1 & 2) != 0) {
            f1 = Color.I(v);
        }
        if((v1 & 4) != 0) {
            f2 = Color.G(v);
        }
        if((v1 & 8) != 0) {
            f3 = Color.C(v);
        }
        return Color.v(v, f, f1, f2, f3);
    }

    public static boolean x(long v, Object object0) {
        return object0 instanceof Color ? v == ((Color)object0).M() : false;
    }

    public static final boolean y(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static void z() {
    }
}

