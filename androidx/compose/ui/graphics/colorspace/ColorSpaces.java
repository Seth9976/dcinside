package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ColorSpaces {
    @l
    public static final ColorSpaces a;
    @l
    private static final float[] b;
    @l
    private static final float[] c;
    @l
    private static final TransferParameters d;
    @l
    private static final TransferParameters e;
    @l
    private static final Rgb f;
    @l
    private static final Rgb g;
    @l
    private static final Rgb h;
    @l
    private static final Rgb i;
    @l
    private static final Rgb j;
    @l
    private static final Rgb k;
    @l
    private static final Rgb l;
    @l
    private static final Rgb m;
    @l
    private static final Rgb n;
    @l
    private static final Rgb o;
    @l
    private static final Rgb p;
    @l
    private static final Rgb q;
    @l
    private static final Rgb r;
    @l
    private static final Rgb s;
    @l
    private static final ColorSpace t;
    @l
    private static final ColorSpace u;
    @l
    private static final Rgb v;
    @l
    private static final ColorSpace w;
    @l
    private static final ColorSpace[] x;

    static {
        ColorSpaces.a = new ColorSpaces();
        float[] arr_f = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        ColorSpaces.b = arr_f;
        float[] arr_f1 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        ColorSpaces.c = arr_f1;
        TransferParameters transferParameters0 = new TransferParameters(2.4, 0.947867, 0.052133, 0.077399, 0.04045, 0.0, 0.0, 0x60, null);
        ColorSpaces.d = transferParameters0;
        TransferParameters transferParameters1 = new TransferParameters(2.2, 0.947867, 0.052133, 0.077399, 0.04045, 0.0, 0.0, 0x60, null);
        ColorSpaces.e = transferParameters1;
        Rgb rgb0 = new Rgb("sRGB IEC61966-2.1", arr_f, Illuminant.a.h(), transferParameters0, 0);
        ColorSpaces.f = rgb0;
        Rgb rgb1 = new Rgb("sRGB IEC61966-2.1 (Linear)", arr_f, Illuminant.a.h(), 1.0, 0.0f, 1.0f, 1);
        ColorSpaces.g = rgb1;
        Rgb rgb2 = new Rgb("scRGB-nl IEC 61966-2-2:2003", arr_f, Illuminant.a.h(), null, (double f) -> ColorSpaceKt.a(f, 0.947867, 0.052133, 0.077399, 0.04045, 2.4), (double f) -> ColorSpaceKt.b(f, 0.947867, 0.052133, 0.077399, 0.04045, 2.4), -0.799f, 2.399f, transferParameters0, 2);
        ColorSpaces.h = rgb2;
        Rgb rgb3 = new Rgb("scRGB IEC 61966-2-2:2003", arr_f, Illuminant.a.h(), 1.0, -0.5f, 7.499f, 3);
        ColorSpaces.i = rgb3;
        WhitePoint whitePoint0 = Illuminant.a.h();
        TransferParameters transferParameters2 = new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null);
        Rgb rgb4 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, whitePoint0, transferParameters2, 4);
        ColorSpaces.j = rgb4;
        WhitePoint whitePoint1 = Illuminant.a.h();
        TransferParameters transferParameters3 = new TransferParameters(2.222222, 0.90967, 0.09033, 0.222222, 0.08145, 0.0, 0.0, 0x60, null);
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, whitePoint1, transferParameters3, 5);
        ColorSpaces.k = rgb5;
        WhitePoint whitePoint2 = new WhitePoint(0.314f, 0.351f);
        Rgb rgb6 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint2, 2.6, 0.0f, 1.0f, 6);
        ColorSpaces.l = rgb6;
        WhitePoint whitePoint3 = Illuminant.a.h();
        Rgb rgb7 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint3, transferParameters0, 7);
        ColorSpaces.m = rgb7;
        Rgb rgb8 = new Rgb("NTSC (1953)", arr_f1, Illuminant.a.c(), new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null), 8);
        ColorSpaces.n = rgb8;
        WhitePoint whitePoint4 = Illuminant.a.h();
        TransferParameters transferParameters4 = new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null);
        Rgb rgb9 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, whitePoint4, transferParameters4, 9);
        ColorSpaces.o = rgb9;
        WhitePoint whitePoint5 = Illuminant.a.h();
        Rgb rgb10 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, whitePoint5, 2.2, 0.0f, 1.0f, 10);
        ColorSpaces.p = rgb10;
        TransferParameters transferParameters5 = new TransferParameters(1.8, 1.0, 0.0, 0.0625, 0.031248, 0.0, 0.0, 0x60, null);
        Rgb rgb11 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 0.0001f}, Illuminant.a.d(), transferParameters5, 11);
        ColorSpaces.q = rgb11;
        WhitePoint whitePoint6 = Illuminant.a.g();
        Rgb rgb12 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 0.0001f, -0.077f}, whitePoint6, 1.0, -65504.0f, 65504.0f, 12);
        ColorSpaces.r = rgb12;
        WhitePoint whitePoint7 = Illuminant.a.g();
        Rgb rgb13 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, whitePoint7, 1.0, -65504.0f, 65504.0f, 13);
        ColorSpaces.s = rgb13;
        Xyz xyz0 = new Xyz("Generic XYZ", 14);
        ColorSpaces.t = xyz0;
        Lab lab0 = new Lab("Generic L*a*b*", 15);
        ColorSpaces.u = lab0;
        Rgb rgb14 = new Rgb("None", arr_f, Illuminant.a.h(), transferParameters1, 16);
        ColorSpaces.v = rgb14;
        Oklab oklab0 = new Oklab("Oklab", 17);
        ColorSpaces.w = oklab0;
        ColorSpaces.x = new ColorSpace[]{rgb0, rgb1, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, xyz0, lab0, rgb14, oklab0};
    }

    @l
    public final Rgb A() {
        return ColorSpaces.v;
    }

    @m
    public final ColorSpace B(@l float[] arr_f, @l TransferParameters transferParameters0) {
        L.p(arr_f, "toXYZD50");
        L.p(transferParameters0, "function");
        ColorSpace[] arr_colorSpace = ColorSpaces.x;
        for(int v = 0; v < arr_colorSpace.length; ++v) {
            ColorSpace colorSpace0 = arr_colorSpace[v];
            if(ColorModel.h(colorSpace0.g(), 0x300000000L)) {
                ColorSpace colorSpace1 = ColorSpaceKt.e(colorSpace0, Illuminant.a.d(), null, 2, null);
                L.n(colorSpace1, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                if(ColorSpaceKt.i(arr_f, ((Rgb)colorSpace1).h0()) && ColorSpaceKt.g(transferParameters0, ((Rgb)colorSpace1).e0())) {
                    return colorSpace0;
                }
            }
        }
        return null;
    }

    // 检测为 Lambda 实现
    private static final double c(double f) [...]

    // 检测为 Lambda 实现
    private static final double d(double f) [...]

    @l
    public final Rgb e() {
        return ColorSpaces.r;
    }

    @l
    public final Rgb f() {
        return ColorSpaces.s;
    }

    @l
    public final Rgb g() {
        return ColorSpaces.p;
    }

    @l
    public final Rgb h() {
        return ColorSpaces.k;
    }

    @l
    public final Rgb i() {
        return ColorSpaces.j;
    }

    @l
    public final ColorSpace j() {
        return ColorSpaces.u;
    }

    @l
    public final ColorSpace k() {
        return ColorSpaces.t;
    }

    @l
    public final ColorSpace l(int v) {
        return this.m()[v];
    }

    @l
    public final ColorSpace[] m() {
        return ColorSpaces.x;
    }

    @l
    public final Rgb n() {
        return ColorSpaces.l;
    }

    @l
    public final Rgb o() {
        return ColorSpaces.m;
    }

    @l
    public final Rgb p() {
        return ColorSpaces.h;
    }

    @l
    public final Rgb q() {
        return ColorSpaces.i;
    }

    @l
    public final Rgb r() {
        return ColorSpaces.g;
    }

    @l
    public final Rgb s() {
        return ColorSpaces.n;
    }

    @l
    public final float[] t() {
        return ColorSpaces.c;
    }

    @l
    public final ColorSpace u() {
        return ColorSpaces.w;
    }

    @l
    public final Rgb v() {
        return ColorSpaces.q;
    }

    @l
    public final Rgb w() {
        return ColorSpaces.o;
    }

    @l
    public final Rgb x() {
        return ColorSpaces.f;
    }

    @l
    public final float[] y() {
        return ColorSpaces.b;
    }

    @l
    public final TransferParameters z() {
        return ColorSpaces.d;
    }
}

