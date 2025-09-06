package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class FontWeight implements Comparable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @Stable
        public static void A() {
        }

        @l
        public final FontWeight B() {
            return FontWeight.h;
        }

        @Stable
        public static void C() {
        }

        @l
        public final FontWeight D() {
            return FontWeight.i;
        }

        @Stable
        public static void E() {
        }

        @l
        public final FontWeight F() {
            return FontWeight.j;
        }

        @Stable
        public static void G() {
        }

        @l
        public final FontWeight H() {
            return FontWeight.k;
        }

        @Stable
        public static void I() {
        }

        @l
        public final FontWeight J() {
            return FontWeight.l;
        }

        @Stable
        public static void K() {
        }

        @l
        public final FontWeight a() {
            return FontWeight.u;
        }

        @Stable
        public static void b() {
        }

        @l
        public final FontWeight c() {
            return FontWeight.s;
        }

        @Stable
        public static void d() {
        }

        @l
        public final FontWeight e() {
            return FontWeight.t;
        }

        @Stable
        public static void f() {
        }

        @l
        public final FontWeight g() {
            return FontWeight.n;
        }

        @Stable
        public static void h() {
        }

        @l
        public final FontWeight i() {
            return FontWeight.o;
        }

        @Stable
        public static void j() {
        }

        @l
        public final FontWeight k() {
            return FontWeight.q;
        }

        @Stable
        public static void l() {
        }

        @l
        public final FontWeight m() {
            return FontWeight.p;
        }

        @Stable
        public static void n() {
        }

        @l
        public final FontWeight o() {
            return FontWeight.r;
        }

        @Stable
        public static void p() {
        }

        @l
        public final FontWeight q() {
            return FontWeight.m;
        }

        @Stable
        public static void r() {
        }

        @l
        public final List s() {
            return FontWeight.v;
        }

        @l
        public final FontWeight t() {
            return FontWeight.d;
        }

        @Stable
        public static void u() {
        }

        @l
        public final FontWeight v() {
            return FontWeight.e;
        }

        @Stable
        public static void w() {
        }

        @l
        public final FontWeight x() {
            return FontWeight.f;
        }

        @Stable
        public static void y() {
        }

        @l
        public final FontWeight z() {
            return FontWeight.g;
        }
    }

    private final int a;
    @l
    public static final Companion b;
    public static final int c;
    @l
    private static final FontWeight d;
    @l
    private static final FontWeight e;
    @l
    private static final FontWeight f;
    @l
    private static final FontWeight g;
    @l
    private static final FontWeight h;
    @l
    private static final FontWeight i;
    @l
    private static final FontWeight j;
    @l
    private static final FontWeight k;
    @l
    private static final FontWeight l;
    @l
    private static final FontWeight m;
    @l
    private static final FontWeight n;
    @l
    private static final FontWeight o;
    @l
    private static final FontWeight p;
    @l
    private static final FontWeight q;
    @l
    private static final FontWeight r;
    @l
    private static final FontWeight s;
    @l
    private static final FontWeight t;
    @l
    private static final FontWeight u;
    @l
    private static final List v;

    static {
        FontWeight.b = new Companion(null);
        FontWeight fontWeight0 = new FontWeight(100);
        FontWeight.d = fontWeight0;
        FontWeight fontWeight1 = new FontWeight(200);
        FontWeight.e = fontWeight1;
        FontWeight fontWeight2 = new FontWeight(300);
        FontWeight.f = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(400);
        FontWeight.g = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(500);
        FontWeight.h = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(600);
        FontWeight.i = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(700);
        FontWeight.j = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(800);
        FontWeight.k = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(900);
        FontWeight.l = fontWeight8;
        FontWeight.m = fontWeight0;
        FontWeight.n = fontWeight1;
        FontWeight.o = fontWeight2;
        FontWeight.p = fontWeight3;
        FontWeight.q = fontWeight4;
        FontWeight.r = fontWeight5;
        FontWeight.s = fontWeight6;
        FontWeight.t = fontWeight7;
        FontWeight.u = fontWeight8;
        FontWeight.v = u.O(new FontWeight[]{fontWeight0, fontWeight1, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8});
    }

    public FontWeight(int v) {
        this.a = v;
        if(1 > v || v >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + v).toString());
        }
    }

    @Override
    public int compareTo(Object object0) {
        return this.v(((FontWeight)object0));
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FontWeight ? this.a == ((FontWeight)object0).a : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return "FontWeight(weight=" + this.a + ')';
    }

    public int v(@l FontWeight fontWeight0) {
        L.p(fontWeight0, "other");
        return L.t(this.a, fontWeight0.a);
    }

    public final int w() {
        return this.a;
    }
}

