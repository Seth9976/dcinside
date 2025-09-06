package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nConnector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,339:1\n34#2:340\n41#2:341\n*S KotlinDebug\n*F\n+ 1 Connector.kt\nandroidx/compose/ui/graphics/colorspace/Connector\n*L\n162#1:340\n163#1:341\n*E\n"})
public class Connector {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final float[] b(ColorSpace colorSpace0, ColorSpace colorSpace1, int v) {
            float[] arr_f1;
            if(!RenderIntent.h(v, 3)) {
                return null;
            }
            boolean z = ColorModel.h(colorSpace0.g(), 0x300000000L);
            boolean z1 = ColorModel.h(colorSpace1.g(), 0x300000000L);
            if(z && z1) {
                return null;
            }
            if(!z && !z1) {
                return null;
            }
            if(!z) {
                colorSpace0 = colorSpace1;
            }
            L.n(colorSpace0, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            float[] arr_f = z ? ((Rgb)colorSpace0).i0().g() : Illuminant.a.e();
            if(z1) {
                arr_f1 = ((Rgb)colorSpace0).i0().g();
                return new float[]{arr_f[0] / arr_f1[0], arr_f[1] / arr_f1[1], arr_f[2] / arr_f1[2]};
            }
            arr_f1 = Illuminant.a.e();
            return new float[]{arr_f[0] / arr_f1[0], arr_f[1] / arr_f1[1], arr_f[2] / arr_f1[2]};
        }

        @l
        public final Connector c() {
            return Connector.j;
        }

        @l
        public final Connector d() {
            return Connector.h;
        }

        @l
        public final Connector e() {
            return Connector.i;
        }

        @l
        public final Connector f(@l ColorSpace colorSpace0) {
            L.p(colorSpace0, "source");
            return new Connector(1) {
                {
                    super(colorSpace0, colorSpace0, v, null);
                }

                @Override  // androidx.compose.ui.graphics.colorspace.Connector
                @l
                public float[] h(@l float[] arr_f) {
                    L.p(arr_f, "v");
                    return arr_f;
                }

                @Override  // androidx.compose.ui.graphics.colorspace.Connector
                public long i(float f, float f1, float f2, float f3) {
                    return ColorKt.a(f, f1, f2, f3, this.d());
                }
            };
        }
    }

    public static final class RgbConnector extends Connector {
        @l
        private final Rgb k;
        @l
        private final Rgb l;
        @l
        private final float[] m;

        private RgbConnector(Rgb rgb0, Rgb rgb1, int v) {
            super(rgb0, rgb1, rgb0, rgb1, v, null, null);
            this.k = rgb0;
            this.l = rgb1;
            this.m = this.j(rgb0, rgb1, v);
        }

        public RgbConnector(Rgb rgb0, Rgb rgb1, int v, w w0) {
            this(rgb0, rgb1, v);
        }

        @Override  // androidx.compose.ui.graphics.colorspace.Connector
        @l
        public float[] h(@l float[] arr_f) {
            L.p(arr_f, "v");
            arr_f[0] = (float)this.k.T().a(((double)arr_f[0]));
            arr_f[1] = (float)this.k.T().a(((double)arr_f[1]));
            arr_f[2] = (float)this.k.T().a(((double)arr_f[2]));
            ColorSpaceKt.o(this.m, arr_f);
            arr_f[0] = (float)this.l.Z().a(((double)arr_f[0]));
            arr_f[1] = (float)this.l.Z().a(((double)arr_f[1]));
            arr_f[2] = (float)this.l.Z().a(((double)arr_f[2]));
            return arr_f;
        }

        @Override  // androidx.compose.ui.graphics.colorspace.Connector
        public long i(float f, float f1, float f2, float f3) {
            float f4 = (float)this.k.T().a(((double)f));
            float f5 = (float)this.k.T().a(((double)f1));
            float f6 = (float)this.k.T().a(((double)f2));
            float f7 = ColorSpaceKt.p(this.m, f4, f5, f6);
            float f8 = ColorSpaceKt.q(this.m, f4, f5, f6);
            float f9 = ColorSpaceKt.r(this.m, f4, f5, f6);
            return ColorKt.a(((float)this.l.Z().a(((double)f7))), ((float)this.l.Z().a(((double)f8))), ((float)this.l.Z().a(((double)f9))), f3, this.l);
        }

        private final float[] j(Rgb rgb0, Rgb rgb1, int v) {
            if(ColorSpaceKt.h(rgb0.i0(), rgb1.i0())) {
                return ColorSpaceKt.m(rgb1.X(), rgb0.h0());
            }
            float[] arr_f = rgb0.h0();
            float[] arr_f1 = rgb1.X();
            float[] arr_f2 = rgb0.i0().g();
            float[] arr_f3 = rgb1.i0().g();
            Illuminant illuminant0 = Illuminant.a;
            if(!ColorSpaceKt.h(rgb0.i0(), illuminant0.d())) {
                float[] arr_f4 = illuminant0.e();
                float[] arr_f5 = Arrays.copyOf(arr_f4, arr_f4.length);
                L.o(arr_f5, "copyOf(this, size)");
                arr_f = ColorSpaceKt.m(ColorSpaceKt.f(Adaptation.b.a().d(), arr_f2, arr_f5), rgb0.h0());
            }
            if(!ColorSpaceKt.h(rgb1.i0(), illuminant0.d())) {
                float[] arr_f6 = illuminant0.e();
                float[] arr_f7 = Arrays.copyOf(arr_f6, arr_f6.length);
                L.o(arr_f7, "copyOf(this, size)");
                arr_f1 = ColorSpaceKt.l(ColorSpaceKt.m(ColorSpaceKt.f(Adaptation.b.a().d(), arr_f3, arr_f7), rgb1.h0()));
            }
            if(RenderIntent.h(v, 3)) {
                arr_f = ColorSpaceKt.n(new float[]{arr_f2[0] / arr_f3[0], arr_f2[1] / arr_f3[1], arr_f2[2] / arr_f3[2]}, arr_f);
            }
            return ColorSpaceKt.m(arr_f1, arr_f);
        }
    }

    @l
    private final ColorSpace a;
    @l
    private final ColorSpace b;
    @l
    private final ColorSpace c;
    @l
    private final ColorSpace d;
    private final int e;
    @m
    private final float[] f;
    @l
    public static final Companion g;
    @l
    private static final Connector h;
    @l
    private static final Connector i;
    @l
    private static final Connector j;

    static {
        Companion connector$Companion0 = new Companion(null);
        Connector.g = connector$Companion0;
        Connector.h = connector$Companion0.f(ColorSpaces.a.x());
        Connector.i = new Connector(ColorSpaces.a.x(), ColorSpaces.a.u(), 0, null);
        Connector.j = new Connector(ColorSpaces.a.u(), ColorSpaces.a.x(), 0, null);
    }

    // 去混淆评级： 低(40)
    private Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, int v) {
        this(colorSpace0, colorSpace1, (ColorModel.h(colorSpace0.g(), 0x300000000L) ? ColorSpaceKt.e(colorSpace0, Illuminant.a.d(), null, 2, null) : colorSpace0), (ColorModel.h(colorSpace1.g(), 0x300000000L) ? ColorSpaceKt.e(colorSpace1, Illuminant.a.d(), null, 2, null) : colorSpace1), v, Connector.g.b(colorSpace0, colorSpace1, v), null);
    }

    public Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, int v, w w0) {
        this(colorSpace0, colorSpace1, v);
    }

    private Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, ColorSpace colorSpace2, ColorSpace colorSpace3, int v, float[] arr_f) {
        this.a = colorSpace0;
        this.b = colorSpace1;
        this.c = colorSpace2;
        this.d = colorSpace3;
        this.e = v;
        this.f = arr_f;
    }

    public Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, ColorSpace colorSpace2, ColorSpace colorSpace3, int v, float[] arr_f, w w0) {
        this(colorSpace0, colorSpace1, colorSpace2, colorSpace3, v, arr_f);
    }

    @l
    public final ColorSpace d() {
        return this.b;
    }

    public final int e() {
        return this.e;
    }

    @l
    public final ColorSpace f() {
        return this.a;
    }

    @l
    public final float[] g(float f, float f1, float f2) {
        return this.h(new float[]{f, f1, f2});
    }

    @l
    public float[] h(@l float[] arr_f) {
        L.p(arr_f, "v");
        float[] arr_f1 = this.c.m(arr_f);
        float[] arr_f2 = this.f;
        if(arr_f2 != null) {
            arr_f1[0] *= arr_f2[0];
            arr_f1[1] *= arr_f2[1];
            arr_f1[2] *= arr_f2[2];
        }
        return this.d.b(arr_f1);
    }

    public long i(float f, float f1, float f2, float f3) {
        long v = this.c.k(f, f1, f2);
        float f4 = Float.intBitsToFloat(((int)(v >> 0x20)));
        float f5 = Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
        float f6 = this.c.n(f, f1, f2);
        float[] arr_f = this.f;
        if(arr_f != null) {
            f4 *= arr_f[0];
            f5 *= arr_f[1];
            f6 *= arr_f[2];
        }
        return this.d.o(f4, f5, f6, f3, this.b);
    }
}

