package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nLab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,140:1\n25#2,3:141\n*S KotlinDebug\n*F\n+ 1 Lab.kt\nandroidx/compose/ui/graphics/colorspace/Lab\n*L\n74#1:141,3\n*E\n"})
public final class Lab extends ColorSpace {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion g = null;
    private static final float h = 0.008856f;
    private static final float i = 7.787037f;
    private static final float j = 0.137931f;
    private static final float k = 0.206897f;

    static {
        Lab.g = new Companion(null);
    }

    public Lab(@l String s, int v) {
        L.p(s, "name");
        super(s, 0x300000002L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] b(@l float[] arr_f) {
        L.p(arr_f, "v");
        float f = arr_f[0] / Illuminant.a.e()[0];
        float f1 = arr_f[1] / Illuminant.a.e()[1];
        float f2 = arr_f[2] / Illuminant.a.e()[2];
        float f3 = f1 > 0.008856f ? ((float)Math.pow(f1, 0.333333)) : f1 * 7.787037f + 0.137931f;
        arr_f[0] = s.H(116.0f * f3 - 16.0f, 0.0f, 100.0f);
        arr_f[1] = s.H(((f > 0.008856f ? ((float)Math.pow(f, 0.333333)) : f * 7.787037f + 0.137931f) - f3) * 500.0f, -128.0f, 128.0f);
        arr_f[2] = s.H((f3 - (f2 > 0.008856f ? ((float)Math.pow(f2, 0.333333)) : 0.137931f + f2 * 7.787037f)) * 200.0f, -128.0f, 128.0f);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float e(int v) {
        return v == 0 ? 100.0f : 128.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float f(int v) {
        return v == 0 ? 0.0f : -128.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean j() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long k(float f, float f1, float f2) {
        float f3 = (s.H(f, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float f4 = s.H(f, -128.0f, 128.0f) * 0.002f + f3;
        float f5 = f4 > 0.206897f ? f4 * f4 * f4 : (f4 - 0.137931f) * 0.128419f;
        return f3 > 0.206897f ? ((long)Float.floatToIntBits(f5 * Illuminant.a.e()[0])) << 0x20 | ((long)Float.floatToIntBits(f3 * f3 * f3 * Illuminant.a.e()[1])) & 0xFFFFFFFFL : ((long)Float.floatToIntBits(f5 * Illuminant.a.e()[0])) << 0x20 | ((long)Float.floatToIntBits((f3 - 0.137931f) * 0.128419f * Illuminant.a.e()[1])) & 0xFFFFFFFFL;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] m(@l float[] arr_f) {
        L.p(arr_f, "v");
        arr_f[0] = s.H(arr_f[0], 0.0f, 100.0f);
        arr_f[1] = s.H(arr_f[1], -128.0f, 128.0f);
        float f = s.H(arr_f[2], -128.0f, 128.0f);
        arr_f[2] = f;
        float f1 = (arr_f[0] + 16.0f) / 116.0f;
        float f2 = arr_f[1] * 0.002f + f1;
        float f3 = f1 - f * 0.005f;
        arr_f[0] = (f2 > 0.206897f ? f2 * f2 * f2 : (f2 - 0.137931f) * 0.128419f) * Illuminant.a.e()[0];
        arr_f[1] = (f1 > 0.206897f ? f1 * f1 * f1 : (f1 - 0.137931f) * 0.128419f) * Illuminant.a.e()[1];
        arr_f[2] = (f3 > 0.206897f ? f3 * f3 * f3 : (f3 - 0.137931f) * 0.128419f) * Illuminant.a.e()[2];
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float n(float f, float f1, float f2) {
        float f3 = (s.H(f, 0.0f, 100.0f) + 16.0f) / 116.0f - s.H(f2, -128.0f, 128.0f) * 0.005f;
        return f3 > 0.206897f ? f3 * f3 * f3 * Illuminant.a.e()[2] : 0.128419f * (f3 - 0.137931f) * Illuminant.a.e()[2];
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long o(float f, float f1, float f2, float f3, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        float f4 = f / Illuminant.a.e()[0];
        float f5 = f1 / Illuminant.a.e()[1];
        float f6 = f2 / Illuminant.a.e()[2];
        float f7 = f4 > 0.008856f ? ((float)Math.pow(f4, 0.333333)) : f4 * 7.787037f + 0.137931f;
        float f8 = f5 > 0.008856f ? ((float)Math.pow(f5, 0.333333)) : f5 * 7.787037f + 0.137931f;
        return f6 > 0.008856f ? ColorKt.a(s.H(116.0f * f8 - 16.0f, 0.0f, 100.0f), s.H((f7 - f8) * 500.0f, -128.0f, 128.0f), s.H((f8 - ((float)Math.pow(f6, 0.333333))) * 200.0f, -128.0f, 128.0f), f3, colorSpace0) : ColorKt.a(s.H(116.0f * f8 - 16.0f, 0.0f, 100.0f), s.H((f7 - f8) * 500.0f, -128.0f, 128.0f), s.H((f8 - (f6 * 7.787037f + 0.137931f)) * 200.0f, -128.0f, 128.0f), f3, colorSpace0);
    }
}

