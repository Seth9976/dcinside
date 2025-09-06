package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nXyz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,79:1\n25#2,3:80\n*S KotlinDebug\n*F\n+ 1 Xyz.kt\nandroidx/compose/ui/graphics/colorspace/Xyz\n*L\n52#1:80,3\n*E\n"})
public final class Xyz extends ColorSpace {
    public Xyz(@l String s, int v) {
        L.p(s, "name");
        super(s, 0x300000001L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] b(@l float[] arr_f) {
        L.p(arr_f, "v");
        arr_f[0] = this.p(arr_f[0]);
        arr_f[1] = this.p(arr_f[1]);
        arr_f[2] = this.p(arr_f[2]);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float e(int v) {
        return 2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float f(int v) {
        return -2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean j() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long k(float f, float f1, float f2) {
        float f3 = this.p(f);
        return ((long)Float.floatToIntBits(this.p(f1))) & 0xFFFFFFFFL | ((long)Float.floatToIntBits(f3)) << 0x20;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] m(@l float[] arr_f) {
        L.p(arr_f, "v");
        arr_f[0] = this.p(arr_f[0]);
        arr_f[1] = this.p(arr_f[1]);
        arr_f[2] = this.p(arr_f[2]);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float n(float f, float f1, float f2) {
        return this.p(f2);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long o(float f, float f1, float f2, float f3, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        return ColorKt.a(this.p(f), this.p(f1), this.p(f2), f3, colorSpace0);
    }

    private final float p(float f) {
        return s.H(f, -2.0f, 2.0f);
    }
}

