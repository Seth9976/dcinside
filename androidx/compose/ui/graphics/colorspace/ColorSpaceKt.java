package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.j;

public final class ColorSpaceKt {
    public static final double a(double f, double f1, double f2, double f3, double f4, double f5) {
        return f < 0.0 ? Math.copySign(ColorSpaceKt.s(-f, f1, f2, f3, f4, f5), f) : Math.copySign(ColorSpaceKt.s(f, f1, f2, f3, f4, f5), f);
    }

    public static final double b(double f, double f1, double f2, double f3, double f4, double f5) {
        return f < 0.0 ? Math.copySign(ColorSpaceKt.u(-f, f1, f2, f3, f4, f5), f) : Math.copySign(ColorSpaceKt.u(f, f1, f2, f3, f4, f5), f);
    }

    @l
    @j
    public static final ColorSpace c(@l ColorSpace colorSpace0, @l WhitePoint whitePoint0) {
        L.p(colorSpace0, "<this>");
        L.p(whitePoint0, "whitePoint");
        return ColorSpaceKt.e(colorSpace0, whitePoint0, null, 2, null);
    }

    @l
    @j
    public static final ColorSpace d(@l ColorSpace colorSpace0, @l WhitePoint whitePoint0, @l Adaptation adaptation0) {
        L.p(colorSpace0, "<this>");
        L.p(whitePoint0, "whitePoint");
        L.p(adaptation0, "adaptation");
        if(!ColorModel.h(colorSpace0.g(), 0x300000000L) || ColorSpaceKt.h(((Rgb)colorSpace0).i0(), whitePoint0)) {
            return colorSpace0;
        }
        float[] arr_f = whitePoint0.g();
        return new Rgb(((Rgb)colorSpace0), ColorSpaceKt.m(ColorSpaceKt.f(adaptation0.d(), ((Rgb)colorSpace0).i0().g(), arr_f), ((Rgb)colorSpace0).h0()), whitePoint0);
    }

    public static ColorSpace e(ColorSpace colorSpace0, WhitePoint whitePoint0, Adaptation adaptation0, int v, Object object0) {
        if((v & 2) != 0) {
            adaptation0 = Adaptation.b.a();
        }
        return ColorSpaceKt.d(colorSpace0, whitePoint0, adaptation0);
    }

    @l
    public static final float[] f(@l float[] arr_f, @l float[] arr_f1, @l float[] arr_f2) {
        L.p(arr_f, "matrix");
        L.p(arr_f1, "srcWhitePoint");
        L.p(arr_f2, "dstWhitePoint");
        float[] arr_f3 = ColorSpaceKt.o(arr_f, arr_f1);
        float[] arr_f4 = ColorSpaceKt.o(arr_f, arr_f2);
        float[] arr_f5 = {arr_f4[0] / arr_f3[0], arr_f4[1] / arr_f3[1], arr_f4[2] / arr_f3[2]};
        return ColorSpaceKt.m(ColorSpaceKt.l(arr_f), ColorSpaceKt.n(arr_f5, arr_f));
    }

    public static final boolean g(@l TransferParameters transferParameters0, @m TransferParameters transferParameters1) {
        L.p(transferParameters0, "a");
        return transferParameters1 != null && Math.abs(transferParameters0.j() - transferParameters1.j()) < 0.001 && Math.abs(transferParameters0.k() - transferParameters1.k()) < 0.001 && Math.abs(transferParameters0.l() - transferParameters1.l()) < 0.001 && Math.abs(transferParameters0.m() - transferParameters1.m()) < 0.002 && Math.abs(transferParameters0.n() - transferParameters1.n()) < 0.001 && Math.abs(transferParameters0.o() - transferParameters1.o()) < 0.001 && Math.abs(transferParameters0.p() - transferParameters1.p()) < 0.001;
    }

    public static final boolean h(@l WhitePoint whitePoint0, @l WhitePoint whitePoint1) {
        L.p(whitePoint0, "a");
        L.p(whitePoint1, "b");
        return whitePoint0 == whitePoint1 ? true : Math.abs(whitePoint0.e() - whitePoint1.e()) < 0.001f && Math.abs(whitePoint0.f() - whitePoint1.f()) < 0.001f;
    }

    public static final boolean i(@l float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f, "a");
        L.p(arr_f1, "b");
        if(arr_f == arr_f1) {
            return true;
        }
        for(int v = 0; v < arr_f.length; ++v) {
            if(Float.compare(arr_f[v], arr_f1[v]) != 0 && Math.abs(arr_f[v] - arr_f1[v]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    @l
    public static final Connector j(@l ColorSpace colorSpace0, @l ColorSpace colorSpace1, int v) {
        L.p(colorSpace0, "$this$connect");
        L.p(colorSpace1, "destination");
        ColorSpaces colorSpaces0 = ColorSpaces.a;
        if(colorSpace0 == colorSpaces0.x()) {
            if(colorSpace1 == colorSpaces0.x()) {
                return Connector.g.d();
            }
            if(colorSpace1 == colorSpaces0.u() && RenderIntent.h(v, 0)) {
                return Connector.g.e();
            }
        }
        else if(colorSpace0 == colorSpaces0.u() && colorSpace1 == colorSpaces0.x() && RenderIntent.h(v, 0)) {
            return Connector.g.c();
        }
        if(colorSpace0 == colorSpace1) {
            return Connector.g.f(colorSpace0);
        }
        return ColorModel.h(colorSpace0.g(), 0x300000000L) && ColorModel.h(colorSpace1.g(), 0x300000000L) ? new RgbConnector(((Rgb)colorSpace0), ((Rgb)colorSpace1), v, null) : new Connector(colorSpace0, colorSpace1, v, null);
    }

    public static Connector k(ColorSpace colorSpace0, ColorSpace colorSpace1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            colorSpace1 = ColorSpaces.a.x();
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return ColorSpaceKt.j(colorSpace0, colorSpace1, v);
    }

    @l
    public static final float[] l(@l float[] arr_f) {
        L.p(arr_f, "m");
        float f = arr_f[0];
        float f1 = arr_f[3];
        float f2 = arr_f[6];
        float f3 = arr_f[1];
        float f4 = arr_f[4];
        float f5 = arr_f[7];
        float f6 = arr_f[2];
        float f7 = arr_f[5];
        float f8 = arr_f[8];
        float f9 = f4 * f8 - f5 * f7;
        float f10 = f5 * f6 - f3 * f8;
        float f11 = f3 * f7 - f4 * f6;
        float f12 = f * f9 + f1 * f10 + f2 * f11;
        float[] arr_f1 = new float[arr_f.length];
        arr_f1[0] = f9 / f12;
        arr_f1[1] = f10 / f12;
        arr_f1[2] = f11 / f12;
        arr_f1[3] = (f2 * f7 - f1 * f8) / f12;
        arr_f1[4] = (f8 * f - f2 * f6) / f12;
        arr_f1[5] = (f6 * f1 - f7 * f) / f12;
        arr_f1[6] = (f1 * f5 - f2 * f4) / f12;
        arr_f1[7] = (f2 * f3 - f5 * f) / f12;
        arr_f1[8] = (f * f4 - f1 * f3) / f12;
        return arr_f1;
    }

    @l
    public static final float[] m(@l float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f, "lhs");
        L.p(arr_f1, "rhs");
        float f = arr_f[0];
        float f1 = arr_f1[0];
        float f2 = arr_f[3];
        float f3 = arr_f1[1];
        float f4 = arr_f[6];
        float f5 = arr_f1[2];
        float f6 = arr_f[1];
        float f7 = arr_f[4];
        float f8 = arr_f[7];
        float f9 = arr_f[2];
        float f10 = arr_f[5];
        float f11 = arr_f[8];
        float f12 = arr_f1[3];
        float f13 = arr_f1[4];
        float f14 = f * f12 + f2 * f13 + f4 * arr_f1[5];
        float f15 = f6 * f12 + f7 * f13 + f8 * arr_f1[5];
        float f16 = f12 * f9 + f13 * f10 + arr_f1[5] * f11;
        float f17 = arr_f1[6];
        float f18 = arr_f1[7];
        return new float[]{f * f1 + f2 * f3 + f4 * f5, f6 * f1 + f7 * f3 + f8 * f5, f1 * f9 + f3 * f10 + f5 * f11, f14, f15, f16, f * f17 + f2 * f18 + f4 * arr_f1[8], f6 * f17 + f7 * f18 + f8 * arr_f1[8], f9 * f17 + f10 * f18 + f11 * arr_f1[8]};
    }

    @l
    public static final float[] n(@l float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f, "lhs");
        L.p(arr_f1, "rhs");
        float f = arr_f[0];
        float f1 = arr_f1[0] * f;
        float f2 = arr_f[1];
        float f3 = arr_f1[1] * f2;
        float f4 = arr_f[2];
        return new float[]{f1, f3, arr_f1[2] * f4, arr_f1[3] * f, arr_f1[4] * f2, arr_f1[5] * f4, f * arr_f1[6], f2 * arr_f1[7], f4 * arr_f1[8]};
    }

    @l
    public static final float[] o(@l float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f, "lhs");
        L.p(arr_f1, "rhs");
        float f = arr_f1[0];
        float f1 = arr_f1[1];
        float f2 = arr_f1[2];
        arr_f1[0] = arr_f[0] * f + arr_f[3] * f1 + arr_f[6] * f2;
        arr_f1[1] = arr_f[1] * f + arr_f[4] * f1 + arr_f[7] * f2;
        arr_f1[2] = arr_f[2] * f + arr_f[5] * f1 + arr_f[8] * f2;
        return arr_f1;
    }

    public static final float p(@l float[] arr_f, float f, float f1, float f2) {
        L.p(arr_f, "lhs");
        return arr_f[0] * f + arr_f[3] * f1 + arr_f[6] * f2;
    }

    public static final float q(@l float[] arr_f, float f, float f1, float f2) {
        L.p(arr_f, "lhs");
        return arr_f[1] * f + arr_f[4] * f1 + arr_f[7] * f2;
    }

    public static final float r(@l float[] arr_f, float f, float f1, float f2) {
        L.p(arr_f, "lhs");
        return arr_f[2] * f + arr_f[5] * f1 + arr_f[8] * f2;
    }

    public static final double s(double f, double f1, double f2, double f3, double f4, double f5) {
        return f >= f4 * f3 ? (Math.pow(f, 1.0 / f5) - f2) / f1 : f / f3;
    }

    public static final double t(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7) {
        return f >= f4 * f3 ? (Math.pow(f - f5, 1.0 / f7) - f2) / f1 : (f - f6) / f3;
    }

    public static final double u(double f, double f1, double f2, double f3, double f4, double f5) {
        return f >= f4 ? Math.pow(f1 * f + f2, f5) : f * f3;
    }

    public static final double v(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7) {
        return f >= f4 ? Math.pow(f1 * f + f2, f7) + f5 : f3 * f + f6;
    }
}

