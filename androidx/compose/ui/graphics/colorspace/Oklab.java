package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nOklab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,172:1\n25#2,3:173\n*S KotlinDebug\n*F\n+ 1 Oklab.kt\nandroidx/compose/ui/graphics/colorspace/Oklab\n*L\n78#1:173,3\n*E\n"})
public final class Oklab extends ColorSpace {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion g;
    @l
    private static final float[] h;
    @l
    private static final float[] i;
    @l
    private static final float[] j;
    @l
    private static final float[] k;

    static {
        Oklab.g = new Companion(null);
        float[] arr_f = Illuminant.a.d().g();
        float[] arr_f1 = Illuminant.a.h().g();
        float[] arr_f2 = ColorSpaceKt.f(Adaptation.b.a().d(), arr_f, arr_f1);
        float[] arr_f3 = ColorSpaceKt.m(new float[]{0.818933f, 0.032985f, 0.0482f, 0.361867f, 0.929312f, 0.264366f, -0.12886f, 0.036146f, 0.633852f}, arr_f2);
        Oklab.h = arr_f3;
        float[] arr_f4 = {0.210454f, 1.977998f, 0.025904f, 0.793618f, -2.428592f, 0.782772f, -0.004072f, 0.450594f, -0.808676f};
        Oklab.i = arr_f4;
        Oklab.j = ColorSpaceKt.l(arr_f3);
        Oklab.k = ColorSpaceKt.l(arr_f4);
    }

    public Oklab(@l String s, int v) {
        L.p(s, "name");
        super(s, 0x300000002L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] b(@l float[] arr_f) {
        L.p(arr_f, "v");
        ColorSpaceKt.o(Oklab.h, arr_f);
        arr_f[0] = Math.signum(arr_f[0]) * ((float)Math.pow(Math.abs(arr_f[0]), 0.333333));
        arr_f[1] = Math.signum(arr_f[1]) * ((float)Math.pow(Math.abs(arr_f[1]), 0.333333));
        arr_f[2] = Math.signum(arr_f[2]) * ((float)Math.pow(Math.abs(arr_f[2]), 0.333333));
        ColorSpaceKt.o(Oklab.i, arr_f);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float e(int v) {
        return v == 0 ? 1.0f : 0.5f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float f(int v) {
        return v == 0 ? 0.0f : -0.5f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean j() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long k(float f, float f1, float f2) {
        float f3 = s.H(f, 0.0f, 1.0f);
        float f4 = s.H(f1, -0.5f, 0.5f);
        float f5 = s.H(f2, -0.5f, 0.5f);
        float f6 = ColorSpaceKt.p(Oklab.k, f3, f4, f5);
        float f7 = ColorSpaceKt.q(Oklab.k, f3, f4, f5);
        float f8 = ColorSpaceKt.r(Oklab.k, f3, f4, f5);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        return ((long)Float.floatToIntBits(ColorSpaceKt.p(Oklab.j, f9, f10, f11))) << 0x20 | ((long)Float.floatToIntBits(ColorSpaceKt.q(Oklab.j, f9, f10, f11))) & 0xFFFFFFFFL;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] m(@l float[] arr_f) {
        L.p(arr_f, "v");
        arr_f[0] = s.H(arr_f[0], 0.0f, 1.0f);
        arr_f[1] = s.H(arr_f[1], -0.5f, 0.5f);
        arr_f[2] = s.H(arr_f[2], -0.5f, 0.5f);
        ColorSpaceKt.o(Oklab.k, arr_f);
        float f = arr_f[0];
        arr_f[0] = f * f * f;
        float f1 = arr_f[1];
        arr_f[1] = f1 * f1 * f1;
        float f2 = arr_f[2];
        arr_f[2] = f2 * f2 * f2;
        ColorSpaceKt.o(Oklab.j, arr_f);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float n(float f, float f1, float f2) {
        float f3 = s.H(f, 0.0f, 1.0f);
        float f4 = s.H(f1, -0.5f, 0.5f);
        float f5 = s.H(f2, -0.5f, 0.5f);
        float f6 = ColorSpaceKt.p(Oklab.k, f3, f4, f5);
        float f7 = ColorSpaceKt.q(Oklab.k, f3, f4, f5);
        float f8 = ColorSpaceKt.r(Oklab.k, f3, f4, f5);
        return ColorSpaceKt.r(Oklab.j, f6 * f6 * f6, f7 * f7 * f7, f8 * f8 * f8);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long o(float f, float f1, float f2, float f3, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        float f4 = ColorSpaceKt.p(Oklab.h, f, f1, f2);
        float f5 = ColorSpaceKt.q(Oklab.h, f, f1, f2);
        float f6 = ColorSpaceKt.r(Oklab.h, f, f1, f2);
        float f7 = Math.signum(f4) * ((float)Math.pow(Math.abs(f4), 0.333333));
        float f8 = Math.signum(f5) * ((float)Math.pow(Math.abs(f5), 0.333333));
        float f9 = Math.signum(f6) * ((float)Math.pow(Math.abs(f6), 0.333333));
        return ColorKt.a(ColorSpaceKt.p(Oklab.i, f7, f8, f9), ColorSpaceKt.q(Oklab.i, f7, f8, f9), ColorSpaceKt.r(Oklab.i, f7, f8, f9), f3, colorSpace0);
    }
}

