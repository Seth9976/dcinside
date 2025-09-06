package androidx.compose.ui.graphics;

import A3.a;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.H0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,659:1\n587#1:660\n587#1:661\n587#1:662\n646#1:663\n*S KotlinDebug\n*F\n+ 1 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n567#1:660\n568#1:661\n569#1:662\n658#1:663\n*E\n"})
public final class ColorKt {
    @Stable
    public static final long a(float f, float f1, float f2, float f3, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        float f4 = colorSpace0.f(0);
        if(f <= colorSpace0.e(0) && f4 <= f) {
            float f5 = colorSpace0.f(1);
            if(f1 <= colorSpace0.e(1) && f5 <= f1) {
                float f6 = colorSpace0.f(2);
                if(f2 <= colorSpace0.e(2) && f6 <= f2 && 0.0f <= f3 && f3 <= 1.0f) {
                    if(colorSpace0.i()) {
                        return (((long)(((int)(f * 255.0f + 0.5f)) << 16 | ((int)(f3 * 255.0f + 0.5f)) << 24 | ((int)(f1 * 255.0f + 0.5f)) << 8 | ((int)(f2 * 255.0f + 0.5f)))) & 0xFFFFFFFFL) << 0x20;
                    }
                    if(colorSpace0.c() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int v = colorSpace0.d();
                    if(v == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    return (((long)Float16.s(f1)) & 0xFFFFL) << 0x20 | (((long)Float16.s(f)) & 0xFFFFL) << 0x30 | (((long)Float16.s(f2)) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)v) & 0x3FL;
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f1 + ", blue = " + f2 + ", alpha = " + f3 + " outside the range for " + colorSpace0).toString());
    }

    @Stable
    public static final long b(int v) {
        return Color.t(((long)v) << 0x20);
    }

    @Stable
    public static final long c(int v, int v1, int v2, int v3) {
        return ColorKt.b((v & 0xFF) << 16 | (v3 & 0xFF) << 24 | (v1 & 0xFF) << 8 | v2 & 0xFF);
    }

    @Stable
    public static final long d(long v) [...] // 潜在的解密器

    public static long e(float f, float f1, float f2, float f3, ColorSpace colorSpace0, int v, Object object0) {
        if((v & 8) != 0) {
            f3 = 1.0f;
        }
        if((v & 16) != 0) {
            colorSpace0 = ColorSpaces.a.x();
        }
        return ColorKt.a(f, f1, f2, f3, colorSpace0);
    }

    public static long f(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 8) != 0) {
            v3 = 0xFF;
        }
        return ColorKt.c(v, v1, v2, v3);
    }

    // 去混淆评级： 低(20)
    private static final float g(float f, float f1, float f2, float f3, float f4) {
        return f4 == 0.0f ? 0.0f : (f * f2 + f1 * f3 * (1.0f - f2)) / f4;
    }

    @Stable
    public static final long h(long v, long v1) {
        long v2 = Color.u(v, Color.E(v1));
        float f = Color.A(v1);
        float f1 = Color.A(v2);
        float f2 = f * (1.0f - f1) + f1;
        float f3 = Color.I(v2);
        float f4 = Color.I(v1);
        float f5 = 0.0f;
        int v3 = Float.compare(f2, 0.0f);
        float f6 = Color.G(v2);
        float f7 = Color.G(v1);
        float f8 = Color.C(v2);
        float f9 = Color.C(v1);
        if(v3 != 0) {
            f5 = (f8 * f1 + f9 * f * (1.0f - f1)) / f2;
        }
        return ColorKt.a((v3 == 0 ? 0.0f : (f3 * f1 + f4 * f * (1.0f - f1)) / f2), (v3 == 0 ? 0.0f : (f6 * f1 + f7 * f * (1.0f - f1)) / f2), f5, f2, Color.E(v1));
    }

    private static final float[] i(long v) {
        return new float[]{Color.I(v), Color.G(v), Color.C(v), Color.A(v)};
    }

    // 去混淆评级： 低(20)
    public static final boolean j(long v) {
        return v != 16L;
    }

    @Stable
    public static void k(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean l(long v) {
        return v == 16L;
    }

    @Stable
    public static void m(long v) {
    }

    @Stable
    public static final long n(long v, long v1, float f) {
        ColorSpace colorSpace0 = ColorSpaces.a.u();
        long v2 = Color.u(v, colorSpace0);
        long v3 = Color.u(v1, colorSpace0);
        return Color.u(ColorKt.a(MathHelpersKt.a(Color.I(v2), Color.I(v3), f), MathHelpersKt.a(Color.G(v2), Color.G(v3), f), MathHelpersKt.a(Color.C(v2), Color.C(v3), f), (1.0f - f) * Color.A(v2) + f * Color.A(v3), colorSpace0), Color.E(v1));
    }

    @Stable
    public static final float o(long v) {
        ColorSpace colorSpace0 = Color.E(v);
        if(!ColorModel.h(colorSpace0.g(), 0x300000000L)) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ColorModel.l(colorSpace0.g())).toString());
        }
        L.n(colorSpace0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction doubleFunction0 = ((Rgb)colorSpace0).T();
        return ColorKt.p(((float)(doubleFunction0.a(((double)Color.I(v))) * 0.2126 + doubleFunction0.a(((double)Color.G(v))) * 0.7152 + doubleFunction0.a(((double)Color.C(v))) * 0.0722)));
    }

    private static final float p(float f) {
        if(f <= 0.0f) {
            return 0.0f;
        }
        return f >= 1.0f ? 1.0f : f;
    }

    public static final long q(long v, @l a a0) {
        L.p(a0, "block");
        return v == 16L ? ((Color)a0.invoke()).M() : v;
    }

    @Stable
    public static final int r(long v) {
        return (int)H0.h(Color.u(v, ColorSpaces.a.x()) >>> 0x20);
    }
}

