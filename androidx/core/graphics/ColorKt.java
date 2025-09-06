package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace.Named;
import android.graphics.ColorSpace;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import y4.l;

public final class ColorKt {
    @RequiresApi(26)
    public static final float A(long v) {
        return Color.luminance(v);
    }

    @RequiresApi(26)
    public static final float B(long v) {
        return Color.red(v);
    }

    public static final int C(@ColorInt int v) {
        return v >> 16 & 0xFF;
    }

    @RequiresApi(26)
    public static final boolean D(long v) {
        return Color.isSrgb(v);
    }

    @RequiresApi(26)
    public static final boolean E(long v) {
        return Color.isWideGamut(v);
    }

    @RequiresApi(26)
    @l
    public static final Color F(@l Color color0, @l Color color1) {
        return ColorUtils.w(color1, color0);
    }

    @RequiresApi(26)
    @l
    public static final Color G(@ColorInt int v) {
        return Color.valueOf(v);
    }

    @RequiresApi(26)
    @l
    public static final Color H(long v) {
        return Color.valueOf(v);
    }

    @ColorInt
    @RequiresApi(26)
    public static final int I(long v) {
        return Color.toArgb(v);
    }

    @ColorInt
    public static final int J(@l String s) {
        return Color.parseColor(s);
    }

    @RequiresApi(26)
    public static final long K(@ColorInt int v) {
        return Color.pack(v);
    }

    @RequiresApi(26)
    public static final float a(long v) {
        return Color.red(v);
    }

    @RequiresApi(26)
    public static final float b(@l Color color0) {
        return color0.getComponent(0);
    }

    public static final int c(@ColorInt int v) {
        return v >> 24 & 0xFF;
    }

    @RequiresApi(26)
    public static final float d(long v) {
        return Color.green(v);
    }

    @RequiresApi(26)
    public static final float e(@l Color color0) {
        return color0.getComponent(1);
    }

    public static final int f(@ColorInt int v) {
        return v >> 16 & 0xFF;
    }

    @RequiresApi(26)
    public static final float g(long v) {
        return Color.blue(v);
    }

    @RequiresApi(26)
    public static final float h(@l Color color0) {
        return color0.getComponent(2);
    }

    public static final int i(@ColorInt int v) {
        return v >> 8 & 0xFF;
    }

    @RequiresApi(26)
    public static final float j(long v) {
        return Color.alpha(v);
    }

    @RequiresApi(26)
    public static final float k(@l Color color0) {
        return color0.getComponent(3);
    }

    public static final int l(@ColorInt int v) {
        return v & 0xFF;
    }

    @RequiresApi(26)
    public static final long m(@ColorInt int v, @l ColorSpace.Named colorSpace$Named0) {
        return Color.convert(v, ColorSpace.get(colorSpace$Named0));
    }

    @RequiresApi(26)
    public static final long n(@ColorInt int v, @l ColorSpace colorSpace0) {
        return Color.convert(v, colorSpace0);
    }

    @RequiresApi(26)
    public static final long o(long v, @l ColorSpace.Named colorSpace$Named0) {
        return Color.convert(v, ColorSpace.get(colorSpace$Named0));
    }

    @RequiresApi(26)
    public static final long p(long v, @l ColorSpace colorSpace0) {
        return Color.convert(v, colorSpace0);
    }

    @RequiresApi(26)
    @l
    public static final Color q(@l Color color0, @l ColorSpace.Named colorSpace$Named0) {
        return color0.convert(ColorSpace.get(colorSpace$Named0));
    }

    @RequiresApi(26)
    @l
    public static final Color r(@l Color color0, @l ColorSpace colorSpace0) {
        return color0.convert(colorSpace0);
    }

    @RequiresApi(26)
    public static final float s(long v) {
        return Color.alpha(v);
    }

    public static final int t(@ColorInt int v) {
        return v >> 24 & 0xFF;
    }

    @RequiresApi(26)
    public static final float u(long v) {
        return Color.blue(v);
    }

    public static final int v(@ColorInt int v) {
        return v & 0xFF;
    }

    @RequiresApi(26)
    @l
    public static final ColorSpace w(long v) {
        return Color.colorSpace(v);
    }

    @RequiresApi(26)
    public static final float x(long v) {
        return Color.green(v);
    }

    public static final int y(@ColorInt int v) {
        return v >> 8 & 0xFF;
    }

    @RequiresApi(26)
    public static final float z(@ColorInt int v) {
        return Color.luminance(v);
    }
}

