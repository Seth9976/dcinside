package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace.Named;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

@RequiresApi(26)
final class Api26Bitmap {
    @l
    public static final Api26Bitmap a;

    static {
        Api26Bitmap.a = new Api26Bitmap();
    }

    @DoNotInline
    @l
    @n
    public static final ColorSpace a(@l Bitmap bitmap0) {
        L.p(bitmap0, "<this>");
        android.graphics.ColorSpace colorSpace0 = bitmap0.getColorSpace();
        if(colorSpace0 != null) {
            ColorSpace colorSpace1 = Api26Bitmap.b(colorSpace0);
            if(colorSpace1 != null) {
                return colorSpace1;
            }
        }
        return ColorSpaces.a.x();
    }

    @DoNotInline
    @l
    @n
    public static final ColorSpace b(@l android.graphics.ColorSpace colorSpace0) {
        L.p(colorSpace0, "<this>");
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.SRGB))) {
            return ColorSpaces.a.x();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.ACES))) {
            return ColorSpaces.a.e();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return ColorSpaces.a.f();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return ColorSpaces.a.g();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.BT2020))) {
            return ColorSpaces.a.h();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.BT709))) {
            return ColorSpaces.a.i();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return ColorSpaces.a.j();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return ColorSpaces.a.k();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return ColorSpaces.a.n();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return ColorSpaces.a.o();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return ColorSpaces.a.p();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return ColorSpaces.a.q();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return ColorSpaces.a.r();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return ColorSpaces.a.s();
        }
        if(L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return ColorSpaces.a.v();
        }
        return L.g(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? ColorSpaces.a.w() : ColorSpaces.a.x();
    }

    @DoNotInline
    @l
    @n
    public static final Bitmap c(int v, int v1, int v2, boolean z, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        Bitmap bitmap0 = Bitmap.createBitmap(null, v, v1, AndroidImageBitmap_androidKt.d(v2), z, Api26Bitmap.d(colorSpace0));
        L.o(bitmap0, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmap0;
    }

    @DoNotInline
    @l
    @n
    public static final android.graphics.ColorSpace d(@l ColorSpace colorSpace0) {
        ColorSpace.Named colorSpace$Named0;
        L.p(colorSpace0, "<this>");
        ColorSpaces colorSpaces0 = ColorSpaces.a;
        if(L.g(colorSpace0, colorSpaces0.x())) {
            colorSpace$Named0 = ColorSpace.Named.SRGB;
        }
        else if(L.g(colorSpace0, colorSpaces0.e())) {
            colorSpace$Named0 = ColorSpace.Named.ACES;
        }
        else if(L.g(colorSpace0, colorSpaces0.f())) {
            colorSpace$Named0 = ColorSpace.Named.ACESCG;
        }
        else if(L.g(colorSpace0, colorSpaces0.g())) {
            colorSpace$Named0 = ColorSpace.Named.ADOBE_RGB;
        }
        else if(L.g(colorSpace0, colorSpaces0.h())) {
            colorSpace$Named0 = ColorSpace.Named.BT2020;
        }
        else if(L.g(colorSpace0, colorSpaces0.i())) {
            colorSpace$Named0 = ColorSpace.Named.BT709;
        }
        else if(L.g(colorSpace0, colorSpaces0.j())) {
            colorSpace$Named0 = ColorSpace.Named.CIE_LAB;
        }
        else if(L.g(colorSpace0, colorSpaces0.k())) {
            colorSpace$Named0 = ColorSpace.Named.CIE_XYZ;
        }
        else if(L.g(colorSpace0, colorSpaces0.n())) {
            colorSpace$Named0 = ColorSpace.Named.DCI_P3;
        }
        else if(L.g(colorSpace0, colorSpaces0.o())) {
            colorSpace$Named0 = ColorSpace.Named.DISPLAY_P3;
        }
        else if(L.g(colorSpace0, colorSpaces0.p())) {
            colorSpace$Named0 = ColorSpace.Named.EXTENDED_SRGB;
        }
        else if(L.g(colorSpace0, colorSpaces0.q())) {
            colorSpace$Named0 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        }
        else if(L.g(colorSpace0, colorSpaces0.r())) {
            colorSpace$Named0 = ColorSpace.Named.LINEAR_SRGB;
        }
        else if(L.g(colorSpace0, colorSpaces0.s())) {
            colorSpace$Named0 = ColorSpace.Named.NTSC_1953;
        }
        else if(L.g(colorSpace0, colorSpaces0.v())) {
            colorSpace$Named0 = ColorSpace.Named.PRO_PHOTO_RGB;
        }
        else {
            colorSpace$Named0 = L.g(colorSpace0, colorSpaces0.w()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
        }
        android.graphics.ColorSpace colorSpace1 = android.graphics.ColorSpace.get(colorSpace$Named0);
        L.o(colorSpace1, "get(frameworkNamedSpace)");
        return colorSpace1;
    }
}

