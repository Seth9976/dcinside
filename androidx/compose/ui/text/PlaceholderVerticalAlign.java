package androidx.compose.ui.text;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class PlaceholderVerticalAlign {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

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
    }

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

    static {
        PlaceholderVerticalAlign.b = new Companion(null);
        PlaceholderVerticalAlign.c = 1;
        PlaceholderVerticalAlign.d = 2;
        PlaceholderVerticalAlign.e = 3;
        PlaceholderVerticalAlign.f = 4;
        PlaceholderVerticalAlign.g = 5;
        PlaceholderVerticalAlign.h = 6;
        PlaceholderVerticalAlign.i = 7;
    }

    private PlaceholderVerticalAlign(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return PlaceholderVerticalAlign.j(this.a, object0);
    }

    public static final int f() [...] // 潜在的解密器

    public static final int g() [...] // 潜在的解密器

    public static final PlaceholderVerticalAlign h(int v) {
        return new PlaceholderVerticalAlign(v);
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static int i(int v) [...] // Inlined contents

    public static boolean j(int v, Object object0) {
        return object0 instanceof PlaceholderVerticalAlign ? v == ((PlaceholderVerticalAlign)object0).n() : false;
    }

    public static final boolean k(int v, int v1) {
        return v == v1;
    }

    public static int l(int v) [...] // Inlined contents

    @l
    public static String m(int v) {
        if(PlaceholderVerticalAlign.k(v, PlaceholderVerticalAlign.c)) {
            return "AboveBaseline";
        }
        if(PlaceholderVerticalAlign.k(v, PlaceholderVerticalAlign.d)) {
            return "Top";
        }
        if(PlaceholderVerticalAlign.k(v, PlaceholderVerticalAlign.e)) {
            return "Bottom";
        }
        if(PlaceholderVerticalAlign.k(v, PlaceholderVerticalAlign.f)) {
            return "Center";
        }
        if(PlaceholderVerticalAlign.k(v, PlaceholderVerticalAlign.g)) {
            return "TextTop";
        }
        if(PlaceholderVerticalAlign.k(v, PlaceholderVerticalAlign.h)) {
            return "TextBottom";
        }
        return PlaceholderVerticalAlign.k(v, PlaceholderVerticalAlign.i) ? "TextCenter" : "Invalid";
    }

    public final int n() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return PlaceholderVerticalAlign.m(this.a);
    }
}

