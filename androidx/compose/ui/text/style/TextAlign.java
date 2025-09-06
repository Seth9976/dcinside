package androidx.compose.ui.text.style;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class TextAlign {
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

        // 去混淆评级： 中等(120)
        @l
        public final List g() {
            return u.O(new TextAlign[]{TextAlign.g(1), TextAlign.g(2), TextAlign.g(3), TextAlign.g(4), TextAlign.g(5), TextAlign.g(6)});
        }
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

    static {
        TextAlign.b = new Companion(null);
        TextAlign.c = 1;
        TextAlign.d = 2;
        TextAlign.e = 3;
        TextAlign.f = 4;
        TextAlign.g = 5;
        TextAlign.h = 6;
    }

    private TextAlign(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return TextAlign.i(this.a, object0);
    }

    public static final int f() [...] // 潜在的解密器

    public static final TextAlign g(int v) {
        return new TextAlign(v);
    }

    public static int h(int v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return this.a;
    }

    public static boolean i(int v, Object object0) {
        return object0 instanceof TextAlign ? v == ((TextAlign)object0).m() : false;
    }

    public static final boolean j(int v, int v1) {
        return v == v1;
    }

    public static int k(int v) [...] // Inlined contents

    @l
    public static String l(int v) {
        if(TextAlign.j(v, TextAlign.c)) {
            return "Left";
        }
        if(TextAlign.j(v, TextAlign.d)) {
            return "Right";
        }
        if(TextAlign.j(v, TextAlign.e)) {
            return "Center";
        }
        if(TextAlign.j(v, TextAlign.f)) {
            return "Justify";
        }
        if(TextAlign.j(v, 5)) {
            return "Start";
        }
        return TextAlign.j(v, TextAlign.h) ? "End" : "Invalid";
    }

    public final int m() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return TextAlign.l(this.a);
    }
}

