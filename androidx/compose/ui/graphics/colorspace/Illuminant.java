package androidx.compose.ui.graphics.colorspace;

import y4.l;

public final class Illuminant {
    @l
    public static final Illuminant a;
    @l
    private static final WhitePoint b;
    @l
    private static final WhitePoint c;
    @l
    private static final WhitePoint d;
    @l
    private static final WhitePoint e;
    @l
    private static final WhitePoint f;
    @l
    private static final WhitePoint g;
    @l
    private static final WhitePoint h;
    @l
    private static final WhitePoint i;
    @l
    private static final WhitePoint j;
    @l
    private static final float[] k;

    static {
        Illuminant.a = new Illuminant();
        Illuminant.b = new WhitePoint(0.44757f, 0.40745f);
        Illuminant.c = new WhitePoint(0.34842f, 0.35161f);
        Illuminant.d = new WhitePoint(0.31006f, 0.31616f);
        Illuminant.e = new WhitePoint(0.34567f, 0.3585f);
        Illuminant.f = new WhitePoint(0.33242f, 0.34743f);
        Illuminant.g = new WhitePoint(0.32168f, 0.33767f);
        Illuminant.h = new WhitePoint(0.31271f, 0.32902f);
        Illuminant.i = new WhitePoint(0.29902f, 0.31485f);
        Illuminant.j = new WhitePoint(0.33333f, 0.33333f);
        Illuminant.k = new float[]{0.964212f, 1.0f, 0.825188f};
    }

    @l
    public final WhitePoint a() {
        return Illuminant.b;
    }

    @l
    public final WhitePoint b() {
        return Illuminant.c;
    }

    @l
    public final WhitePoint c() {
        return Illuminant.d;
    }

    @l
    public final WhitePoint d() {
        return Illuminant.e;
    }

    @l
    public final float[] e() {
        return Illuminant.k;
    }

    @l
    public final WhitePoint f() {
        return Illuminant.f;
    }

    @l
    public final WhitePoint g() {
        return Illuminant.g;
    }

    @l
    public final WhitePoint h() {
        return Illuminant.h;
    }

    @l
    public final WhitePoint i() {
        return Illuminant.i;
    }

    @l
    public final WhitePoint j() {
        return Illuminant.j;
    }
}

