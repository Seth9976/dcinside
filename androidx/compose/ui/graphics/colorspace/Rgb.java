package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nRgb.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1396:1\n25#2,3:1397\n*S KotlinDebug\n*F\n+ 1 Rgb.kt\nandroidx/compose/ui/graphics/colorspace/Rgb\n*L\n915#1:1397,3\n*E\n"})
public final class Rgb extends ColorSpace {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final float f(float[] arr_f) [...] // 潜在的解密器

        private final boolean g(double f, DoubleFunction doubleFunction0, DoubleFunction doubleFunction1) {
            return Math.abs(doubleFunction0.a(f) - doubleFunction1.a(f)) <= 0.001;
        }

        @l
        public final float[] h(@l float[] arr_f) {
            L.p(arr_f, "toXYZ");
            float[] arr_f1 = ColorSpaceKt.o(arr_f, new float[]{1.0f, 0.0f, 0.0f});
            float[] arr_f2 = ColorSpaceKt.o(arr_f, new float[]{0.0f, 1.0f, 0.0f});
            float[] arr_f3 = ColorSpaceKt.o(arr_f, new float[]{0.0f, 0.0f, 1.0f});
            float f = arr_f1[0];
            float f1 = arr_f1[1];
            float f2 = f + f1 + arr_f1[2];
            float f3 = arr_f2[0];
            float f4 = arr_f2[1];
            float f5 = f3 + f4 + arr_f2[2];
            float f6 = arr_f3[0];
            float f7 = arr_f3[1];
            float f8 = f6 + f7 + arr_f3[2];
            return new float[]{f / f2, f1 / f2, f3 / f5, f4 / f5, f6 / f8, f7 / f8};
        }

        private final WhitePoint i(float[] arr_f) {
            float[] arr_f1 = ColorSpaceKt.o(arr_f, new float[]{1.0f, 1.0f, 1.0f});
            float f = arr_f1[0];
            float f1 = arr_f1[1];
            float f2 = f + f1 + arr_f1[2];
            return new WhitePoint(f / f2, f1 / f2);
        }

        private final float[] j(float[] arr_f, WhitePoint whitePoint0) {
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[2];
            float f3 = arr_f[3];
            float f4 = arr_f[4];
            float f5 = arr_f[5];
            float f6 = whitePoint0.e();
            float f7 = whitePoint0.f();
            float f8 = (1.0f - f) / f1;
            float f9 = f / f1;
            float f10 = f2 / f3 - f9;
            float f11 = f6 / f7 - f9;
            float f12 = (1.0f - f2) / f3 - f8;
            float f13 = f4 / f5 - f9;
            float f14 = (((1.0f - f6) / f7 - f8) * f10 - f11 * f12) / (((1.0f - f4) / f5 - f8) * f10 - f12 * f13);
            float f15 = (f11 - f13 * f14) / f10;
            float f16 = 1.0f - f15 - f14;
            return new float[]{f16 / f1 * f, f16, f16 / f1 * (1.0f - f - f1), f15 / f3 * f2, f15, f15 / f3 * (1.0f - f2 - f3), f14 / f5 * f4, f14, f14 / f5 * (1.0f - f4 - f5)};
        }

        private final boolean k(float[] arr_f, float[] arr_f1) {
            float f = arr_f[0];
            float f1 = arr_f1[0];
            float f2 = arr_f[1];
            float f3 = arr_f1[1];
            float f4 = arr_f[2] - arr_f1[2];
            float f5 = arr_f[3] - arr_f1[3];
            float f6 = arr_f[4];
            float f7 = arr_f1[4];
            new float[]{f - f1, f2 - f3, f4, f5, f6 - f7, arr_f[5] - arr_f1[5]};
            float f8 = arr_f[5] - arr_f1[5];
            return this.l(f - f1, f2 - f3, f1 - f7, f3 - arr_f1[5]) >= 0.0f && this.l(arr_f1[0] - arr_f1[2], arr_f1[1] - arr_f1[3], f - f1, f2 - f3) >= 0.0f && this.l(f4, f5, arr_f1[2] - arr_f1[0], arr_f1[3] - arr_f1[1]) >= 0.0f && this.l(arr_f1[2] - arr_f1[4], arr_f1[3] - arr_f1[5], f4, f5) >= 0.0f && this.l(f6 - f7, f8, arr_f1[4] - arr_f1[2], arr_f1[5] - arr_f1[3]) >= 0.0f && this.l(arr_f1[4] - arr_f1[0], arr_f1[5] - arr_f1[1], f6 - f7, f8) >= 0.0f;
        }

        private final float l(float f, float f1, float f2, float f3) {
            return f * f3 - f1 * f2;
        }

        private final boolean m(float[] arr_f, WhitePoint whitePoint0, DoubleFunction doubleFunction0, DoubleFunction doubleFunction1, float f, float f1, int v) {
            if(v == 0) {
                return true;
            }
            ColorSpaces colorSpaces0 = ColorSpaces.a;
            if(!ColorSpaceKt.i(arr_f, colorSpaces0.y())) {
                return false;
            }
            if(!ColorSpaceKt.h(whitePoint0, Illuminant.a.h())) {
                return false;
            }
            if(f == 0.0f && f1 == 1.0f) {
                Rgb rgb0 = colorSpaces0.x();
                for(double f2 = 0.0; f2 <= 1.0; f2 += 0.003922) {
                    if(!this.g(f2, doubleFunction0, rgb0.a0())) {
                        return false;
                    }
                    if(!this.g(f2, doubleFunction1, rgb0.U())) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        // 去混淆评级： 低(30)
        private final boolean n(float[] arr_f, float f, float f1) {
            return this.f(arr_f) / 0.1582f > 0.9f && this.k(arr_f, ColorSpaces.a.y()) || f < 0.0f && f1 > 1.0f;
        }

        private final float[] o(float[] arr_f) {
            float[] arr_f1 = new float[6];
            if(arr_f.length == 9) {
                float f = arr_f[0];
                float f1 = arr_f[1];
                float f2 = f + f1 + arr_f[2];
                arr_f1[0] = f / f2;
                arr_f1[1] = f1 / f2;
                float f3 = arr_f[3];
                float f4 = arr_f[4];
                float f5 = f3 + f4 + arr_f[5];
                arr_f1[2] = f3 / f5;
                arr_f1[3] = f4 / f5;
                float f6 = arr_f[6];
                float f7 = arr_f[7];
                float f8 = f6 + f7 + arr_f[8];
                arr_f1[4] = f6 / f8;
                arr_f1[5] = f7 / f8;
                return arr_f1;
            }
            kotlin.collections.l.H0(arr_f, arr_f1, 0, 0, 6, 6, null);
            return arr_f1;
        }
    }

    @l
    private final WhitePoint g;
    private final float h;
    private final float i;
    @m
    private final TransferParameters j;
    @l
    private final float[] k;
    @l
    private final float[] l;
    @l
    private final float[] m;
    @l
    private final DoubleFunction n;
    @l
    private final Function1 o;
    @l
    private final DoubleFunction p;
    @l
    private final DoubleFunction q;
    @l
    private final Function1 r;
    @l
    private final DoubleFunction s;
    private final boolean t;
    private final boolean u;
    @l
    public static final Companion v;
    @l
    private static final DoubleFunction w;

    static {
        Rgb.v = new Companion(null);
        Rgb.w = (double f) -> f;
    }

    public Rgb(@l Rgb rgb0, @l float[] arr_f, @l WhitePoint whitePoint0) {
        L.p(rgb0, "colorSpace");
        L.p(arr_f, "transform");
        L.p(whitePoint0, "whitePoint");
        this(rgb0.h(), rgb0.k, whitePoint0, arr_f, rgb0.n, rgb0.q, rgb0.h, rgb0.i, rgb0.j, -1);
    }

    public Rgb(@l String s, @l float[] arr_f, double f) {
        L.p(s, "name");
        L.p(arr_f, "toXYZ");
        this(s, Rgb.v.h(arr_f), Rgb.v.i(arr_f), f, 0.0f, 1.0f, -1);
    }

    public Rgb(@l String s, @l float[] arr_f, @l TransferParameters transferParameters0) {
        L.p(s, "name");
        L.p(arr_f, "toXYZ");
        L.p(transferParameters0, "function");
        this(s, Rgb.v.h(arr_f), Rgb.v.i(arr_f), transferParameters0, -1);
    }

    public Rgb(@l String s, @l float[] arr_f, @l WhitePoint whitePoint0, double f) {
        L.p(s, "name");
        L.p(arr_f, "primaries");
        L.p(whitePoint0, "whitePoint");
        this(s, arr_f, whitePoint0, f, 0.0f, 1.0f, -1);
    }

    public Rgb(@l String s, @l float[] arr_f, @l WhitePoint whitePoint0, double f, float f1, float f2, int v) {
        L.p(s, "name");
        L.p(arr_f, "primaries");
        L.p(whitePoint0, "whitePoint");
        int v1 = Double.compare(f, 1.0);
        DoubleFunction doubleFunction0 = v1 == 0 ? Rgb.w : (double f1) -> {
            if(f1 < 0.0) {
                f1 = 0.0;
            }
            return Math.pow(f1, 1.0 / f);
        };
        DoubleFunction doubleFunction1 = v1 == 0 ? Rgb.w : (double f1) -> {
            if(f1 < 0.0) {
                f1 = 0.0;
            }
            return Math.pow(f1, f);
        };
        this(s, arr_f, whitePoint0, null, doubleFunction0, doubleFunction1, f1, f2, new TransferParameters(f, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0x60, null), v);
    }

    public Rgb(@l String s, @l float[] arr_f, @l WhitePoint whitePoint0, @l TransferParameters transferParameters0) {
        L.p(s, "name");
        L.p(arr_f, "primaries");
        L.p(whitePoint0, "whitePoint");
        L.p(transferParameters0, "function");
        this(s, arr_f, whitePoint0, transferParameters0, -1);
    }

    public Rgb(@l String s, @l float[] arr_f, @l WhitePoint whitePoint0, @l TransferParameters transferParameters0, int v) {
        L.p(s, "name");
        L.p(arr_f, "primaries");
        L.p(whitePoint0, "whitePoint");
        L.p(transferParameters0, "function");
        d d0 = transferParameters0.n() != 0.0 || transferParameters0.o() != 0.0 ? (double f) -> {
            L.p(transferParameters0, "$function");
            return ColorSpaceKt.t(f, transferParameters0.j(), transferParameters0.k(), transferParameters0.l(), transferParameters0.m(), transferParameters0.n(), transferParameters0.o(), transferParameters0.p());
        } : (double f) -> {
            L.p(transferParameters0, "$function");
            return ColorSpaceKt.s(f, transferParameters0.j(), transferParameters0.k(), transferParameters0.l(), transferParameters0.m(), transferParameters0.p());
        };
        f f0 = transferParameters0.n() != 0.0 || transferParameters0.o() != 0.0 ? (double f) -> {
            L.p(transferParameters0, "$function");
            return ColorSpaceKt.v(f, transferParameters0.j(), transferParameters0.k(), transferParameters0.l(), transferParameters0.m(), transferParameters0.n(), transferParameters0.o(), transferParameters0.p());
        } : (double f) -> {
            L.p(transferParameters0, "$function");
            return ColorSpaceKt.u(f, transferParameters0.j(), transferParameters0.k(), transferParameters0.l(), transferParameters0.m(), transferParameters0.p());
        };
        this(s, arr_f, whitePoint0, null, d0, f0, 0.0f, 1.0f, transferParameters0, v);
    }

    public Rgb(@l String s, @l float[] arr_f, @l WhitePoint whitePoint0, @l Function1 function10, @l Function1 function11, float f, float f1) {
        L.p(s, "name");
        L.p(arr_f, "primaries");
        L.p(whitePoint0, "whitePoint");
        L.p(function10, "oetf");
        L.p(function11, "eotf");
        this(s, arr_f, whitePoint0, null, (double f) -> {
            L.p(function10, "$oetf");
            return ((Number)function10.invoke(f)).doubleValue();
        }, (double f) -> {
            L.p(function11, "$eotf");
            return ((Number)function11.invoke(f)).doubleValue();
        }, f, f1, null, -1);
    }

    public Rgb(@l String s, @l float[] arr_f, @l WhitePoint whitePoint0, @m float[] arr_f1, @l DoubleFunction doubleFunction0, @l DoubleFunction doubleFunction1, float f, float f1, @m TransferParameters transferParameters0, int v) {
        L.p(s, "name");
        L.p(arr_f, "primaries");
        L.p(whitePoint0, "whitePoint");
        L.p(doubleFunction0, "oetf");
        L.p(doubleFunction1, "eotf");
        super(s, 0x300000000L, v, null);
        this.g = whitePoint0;
        this.h = f;
        this.i = f1;
        this.j = transferParameters0;
        this.n = doubleFunction0;
        this.o = new Function1() {
            final Rgb e;

            {
                this.e = rgb0;
                super(1);
            }

            @l
            public final Double a(double f) {
                return s.G(this.e.a0().a(f), this.e.h, this.e.i);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).doubleValue());
            }
        };
        this.p = (double f) -> {
            L.p(this, "this$0");
            return s.G(this.n.a(f), this.h, this.i);
        };
        this.q = doubleFunction1;
        this.r = new Function1() {
            final Rgb e;

            {
                this.e = rgb0;
                super(1);
            }

            @l
            public final Double a(double f) {
                return this.e.U().a(s.G(f, this.e.h, this.e.i));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).doubleValue());
            }
        };
        this.s = (double f) -> {
            L.p(this, "this$0");
            double f1 = s.G(f, this.h, this.i);
            return this.q.a(f1);
        };
        if(arr_f.length != 6 && arr_f.length != 9) {
            throw new IllegalArgumentException("The color space\'s primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if(f >= f1) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f1 + "; min must be strictly < max");
        }
        Companion rgb$Companion0 = Rgb.v;
        float[] arr_f2 = rgb$Companion0.o(arr_f);
        this.k = arr_f2;
        if(arr_f1 == null) {
            this.l = rgb$Companion0.j(arr_f2, whitePoint0);
        }
        else if(arr_f1.length == 9) {
            this.l = arr_f1;
        }
        else {
            throw new IllegalArgumentException("Transform must have 9 entries! Has " + arr_f1.length);
        }
        this.m = ColorSpaceKt.l(this.l);
        this.t = rgb$Companion0.n(arr_f2, f, f1);
        this.u = rgb$Companion0.m(arr_f2, whitePoint0, doubleFunction0, doubleFunction1, f, f1, v);
    }

    public Rgb(@l String s, @l float[] arr_f, @l Function1 function10, @l Function1 function11) {
        L.p(s, "name");
        L.p(arr_f, "toXYZ");
        L.p(function10, "oetf");
        L.p(function11, "eotf");
        this(s, Rgb.v.h(arr_f), Rgb.v.i(arr_f), null, (double f) -> {
            L.p(function10, "$oetf");
            return ((Number)function10.invoke(f)).doubleValue();
        }, (double f) -> {
            L.p(function11, "$eotf");
            return ((Number)function11.invoke(f)).doubleValue();
        }, 0.0f, 1.0f, null, -1);
    }

    private static final double C(double f) [...] // Inlined contents

    // 检测为 Lambda 实现
    private static final double D(double f, double f1) [...]

    // 检测为 Lambda 实现
    private static final double E(double f, double f1) [...]

    // 检测为 Lambda 实现
    private static final double F(Function1 function10, double f) [...]

    // 检测为 Lambda 实现
    private static final double G(Function1 function10, double f) [...]

    // 检测为 Lambda 实现
    private static final double H(Function1 function10, double f) [...]

    // 检测为 Lambda 实现
    private static final double I(Function1 function10, double f) [...]

    // 检测为 Lambda 实现
    private static final double J(TransferParameters transferParameters0, double f) [...]

    // 检测为 Lambda 实现
    private static final double K(TransferParameters transferParameters0, double f) [...]

    // 检测为 Lambda 实现
    private static final double L(TransferParameters transferParameters0, double f) [...]

    // 检测为 Lambda 实现
    private static final double M(TransferParameters transferParameters0, double f) [...]

    // 检测为 Lambda 实现
    private static final double P(Rgb rgb0, double f) [...]

    @l
    public final float[] Q(float f, float f1, float f2) {
        return this.R(new float[]{f, f1, f2});
    }

    @l
    public final float[] R(@l float[] arr_f) {
        L.p(arr_f, "v");
        arr_f[0] = (float)this.p.a(((double)arr_f[0]));
        arr_f[1] = (float)this.p.a(((double)arr_f[1]));
        arr_f[2] = (float)this.p.a(((double)arr_f[2]));
        return arr_f;
    }

    @l
    public final Function1 S() {
        return this.r;
    }

    @l
    public final DoubleFunction T() {
        return this.s;
    }

    @l
    public final DoubleFunction U() {
        return this.q;
    }

    @l
    public final float[] V() {
        float[] arr_f = Arrays.copyOf(this.m, this.m.length);
        L.o(arr_f, "copyOf(this, size)");
        return arr_f;
    }

    @l
    public final float[] W(@l float[] arr_f) {
        L.p(arr_f, "inverseTransform");
        return kotlin.collections.l.H0(this.m, arr_f, 0, 0, 0, 14, null);
    }

    @l
    public final float[] X() {
        return this.m;
    }

    @l
    public final Function1 Y() {
        return this.o;
    }

    @l
    public final DoubleFunction Z() {
        return this.p;
    }

    @l
    public final DoubleFunction a0() {
        return this.n;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] b(@l float[] arr_f) {
        L.p(arr_f, "v");
        ColorSpaceKt.o(this.m, arr_f);
        arr_f[0] = (float)this.p.a(((double)arr_f[0]));
        arr_f[1] = (float)this.p.a(((double)arr_f[1]));
        arr_f[2] = (float)this.p.a(((double)arr_f[2]));
        return arr_f;
    }

    @l
    public final float[] b0() {
        float[] arr_f = Arrays.copyOf(this.k, this.k.length);
        L.o(arr_f, "copyOf(this, size)");
        return arr_f;
    }

    @l
    public final float[] c0(@l float[] arr_f) {
        L.p(arr_f, "primaries");
        return kotlin.collections.l.H0(this.k, arr_f, 0, 0, 0, 14, null);
    }

    @l
    public final float[] d0() {
        return this.k;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float e(int v) {
        return this.i;
    }

    @m
    public final TransferParameters e0() {
        return this.j;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(Rgb.class != class0 || !super.equals(object0)) {
                return false;
            }
            if(Float.compare(((Rgb)object0).h, this.h) != 0) {
                return false;
            }
            if(Float.compare(((Rgb)object0).i, this.i) != 0) {
                return false;
            }
            if(!L.g(this.g, ((Rgb)object0).g)) {
                return false;
            }
            if(!Arrays.equals(this.k, ((Rgb)object0).k)) {
                return false;
            }
            TransferParameters transferParameters0 = this.j;
            if(transferParameters0 != null) {
                return L.g(transferParameters0, ((Rgb)object0).j);
            }
            if(((Rgb)object0).j == null) {
                return true;
            }
            return L.g(this.n, ((Rgb)object0).n) ? L.g(this.q, ((Rgb)object0).q) : false;
        }
        return false;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float f(int v) {
        return this.h;
    }

    @l
    public final float[] f0() {
        float[] arr_f = Arrays.copyOf(this.l, this.l.length);
        L.o(arr_f, "copyOf(this, size)");
        return arr_f;
    }

    @l
    public final float[] g0(@l float[] arr_f) {
        L.p(arr_f, "transform");
        return kotlin.collections.l.H0(this.l, arr_f, 0, 0, 0, 14, null);
    }

    @l
    public final float[] h0() {
        return this.l;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int v = super.hashCode();
        int v1 = this.g.hashCode();
        int v2 = Arrays.hashCode(this.k);
        int v3 = 0;
        int v4 = this.h == 0.0f ? 0 : Float.floatToIntBits(this.h);
        int v5 = this.i == 0.0f ? 0 : Float.floatToIntBits(this.i);
        TransferParameters transferParameters0 = this.j;
        if(transferParameters0 != null) {
            v3 = transferParameters0.hashCode();
        }
        int v6 = ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v3;
        return this.j == null ? (v6 * 0x1F + this.n.hashCode()) * 0x1F + this.q.hashCode() : v6;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean i() {
        return this.u;
    }

    @l
    public final WhitePoint i0() {
        return this.g;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean j() {
        return this.t;
    }

    // 检测为 Lambda 实现
    private static final double j0(Rgb rgb0, double f) [...]

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long k(float f, float f1, float f2) {
        float f3 = (float)this.s.a(((double)f));
        float f4 = (float)this.s.a(((double)f1));
        float f5 = (float)this.s.a(((double)f2));
        return ((long)Float.floatToIntBits(ColorSpaceKt.p(this.l, f3, f4, f5))) << 0x20 | ((long)Float.floatToIntBits(ColorSpaceKt.q(this.l, f3, f4, f5))) & 0xFFFFFFFFL;
    }

    @l
    public final float[] k0(float f, float f1, float f2) {
        return this.l0(new float[]{f, f1, f2});
    }

    @l
    public final float[] l0(@l float[] arr_f) {
        L.p(arr_f, "v");
        arr_f[0] = (float)this.s.a(((double)arr_f[0]));
        arr_f[1] = (float)this.s.a(((double)arr_f[1]));
        arr_f[2] = (float)this.s.a(((double)arr_f[2]));
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    @l
    public float[] m(@l float[] arr_f) {
        L.p(arr_f, "v");
        arr_f[0] = (float)this.s.a(((double)arr_f[0]));
        arr_f[1] = (float)this.s.a(((double)arr_f[1]));
        arr_f[2] = (float)this.s.a(((double)arr_f[2]));
        return ColorSpaceKt.o(this.l, arr_f);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float n(float f, float f1, float f2) {
        float f3 = (float)this.s.a(((double)f));
        float f4 = (float)this.s.a(((double)f1));
        float f5 = (float)this.s.a(((double)f2));
        return ColorSpaceKt.r(this.l, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long o(float f, float f1, float f2, float f3, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        float f4 = ColorSpaceKt.p(this.m, f, f1, f2);
        float f5 = ColorSpaceKt.q(this.m, f, f1, f2);
        float f6 = ColorSpaceKt.r(this.m, f, f1, f2);
        return ColorKt.a(((float)this.p.a(((double)f4))), ((float)this.p.a(((double)f5))), ((float)this.p.a(((double)f6))), f3, colorSpace0);
    }

    // 检测为 Lambda 实现
    public static double w(double f) [...]
}

