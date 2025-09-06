package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class BlendMode {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int A() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int B() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int C() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int d() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int e() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int f() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int g() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int h() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int i() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int j() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int k() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int l() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int m() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int n() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int o() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int p() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int q() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int r() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int s() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int t() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int u() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int v() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int w() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int x() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int y() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int z() [...] // 潜在的解密器
    }

    private static final int A;
    private static final int B;
    private static final int C;
    private static final int D;
    private static final int E;
    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;
    private static final int r;
    private static final int s;
    private static final int t;
    private static final int u;
    private static final int v;
    private static final int w;
    private static final int x;
    private static final int y;
    private static final int z;

    static {
        BlendMode.b = new Companion(null);
        BlendMode.c = 0;
        BlendMode.d = 1;
        BlendMode.e = 2;
        BlendMode.f = 3;
        BlendMode.g = 4;
        BlendMode.h = 5;
        BlendMode.i = 6;
        BlendMode.j = 7;
        BlendMode.k = 8;
        BlendMode.l = 9;
        BlendMode.m = 10;
        BlendMode.n = 11;
        BlendMode.o = 12;
        BlendMode.p = 13;
        BlendMode.q = 14;
        BlendMode.r = 15;
        BlendMode.s = 16;
        BlendMode.t = 17;
        BlendMode.u = 18;
        BlendMode.v = 19;
        BlendMode.w = 20;
        BlendMode.x = 21;
        BlendMode.y = 22;
        BlendMode.z = 23;
        BlendMode.A = 24;
        BlendMode.B = 25;
        BlendMode.C = 26;
        BlendMode.D = 27;
        BlendMode.E = 28;
    }

    private BlendMode(int v) {
        this.a = v;
    }

    public static final int A() [...] // 潜在的解密器

    public static final int B() [...] // 潜在的解密器

    public static final int C() [...] // 潜在的解密器

    public static final BlendMode D(int v) {
        return new BlendMode(v);
    }

    public static int E(int v) [...] // Inlined contents

    public static boolean F(int v, Object object0) {
        return object0 instanceof BlendMode ? v == ((BlendMode)object0).J() : false;
    }

    public static final boolean G(int v, int v1) {
        return v == v1;
    }

    public static int H(int v) [...] // Inlined contents

    @l
    public static String I(int v) {
        if(BlendMode.G(v, 0)) {
            return "Clear";
        }
        if(BlendMode.G(v, BlendMode.d)) {
            return "Src";
        }
        if(BlendMode.G(v, BlendMode.e)) {
            return "Dst";
        }
        if(BlendMode.G(v, 3)) {
            return "SrcOver";
        }
        if(BlendMode.G(v, BlendMode.g)) {
            return "DstOver";
        }
        if(BlendMode.G(v, 5)) {
            return "SrcIn";
        }
        if(BlendMode.G(v, BlendMode.i)) {
            return "DstIn";
        }
        if(BlendMode.G(v, BlendMode.j)) {
            return "SrcOut";
        }
        if(BlendMode.G(v, BlendMode.k)) {
            return "DstOut";
        }
        if(BlendMode.G(v, BlendMode.l)) {
            return "SrcAtop";
        }
        if(BlendMode.G(v, BlendMode.m)) {
            return "DstAtop";
        }
        if(BlendMode.G(v, BlendMode.n)) {
            return "Xor";
        }
        if(BlendMode.G(v, BlendMode.o)) {
            return "Plus";
        }
        if(BlendMode.G(v, BlendMode.p)) {
            return "Modulate";
        }
        if(BlendMode.G(v, BlendMode.q)) {
            return "Screen";
        }
        if(BlendMode.G(v, BlendMode.r)) {
            return "Overlay";
        }
        if(BlendMode.G(v, BlendMode.s)) {
            return "Darken";
        }
        if(BlendMode.G(v, BlendMode.t)) {
            return "Lighten";
        }
        if(BlendMode.G(v, BlendMode.u)) {
            return "ColorDodge";
        }
        if(BlendMode.G(v, BlendMode.v)) {
            return "ColorBurn";
        }
        if(BlendMode.G(v, BlendMode.w)) {
            return "HardLight";
        }
        if(BlendMode.G(v, BlendMode.x)) {
            return "Softlight";
        }
        if(BlendMode.G(v, BlendMode.y)) {
            return "Difference";
        }
        if(BlendMode.G(v, BlendMode.z)) {
            return "Exclusion";
        }
        if(BlendMode.G(v, BlendMode.A)) {
            return "Multiply";
        }
        if(BlendMode.G(v, BlendMode.B)) {
            return "Hue";
        }
        if(BlendMode.G(v, BlendMode.C)) {
            return "Saturation";
        }
        if(BlendMode.G(v, BlendMode.D)) {
            return "Color";
        }
        return BlendMode.G(v, BlendMode.E) ? "Luminosity" : "Unknown";
    }

    public final int J() {
        return this.a;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return BlendMode.F(this.a, object0);
    }

    public static final int f() [...] // 潜在的解密器

    public static final int g() [...] // 潜在的解密器

    public static final int h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final int i() [...] // 潜在的解密器

    public static final int j() [...] // 潜在的解密器

    public static final int k() [...] // 潜在的解密器

    public static final int l() [...] // 潜在的解密器

    public static final int m() [...] // 潜在的解密器

    public static final int n() [...] // 潜在的解密器

    public static final int o() [...] // 潜在的解密器

    public static final int p() [...] // 潜在的解密器

    public static final int q() [...] // 潜在的解密器

    public static final int r() [...] // 潜在的解密器

    public static final int s() [...] // 潜在的解密器

    public static final int t() [...] // 潜在的解密器

    @Override
    @l
    public String toString() {
        return BlendMode.I(this.a);
    }

    public static final int u() [...] // 潜在的解密器

    public static final int v() [...] // 潜在的解密器

    public static final int w() [...] // 潜在的解密器

    public static final int x() [...] // 潜在的解密器

    public static final int y() [...] // 潜在的解密器

    public static final int z() [...] // 潜在的解密器
}

