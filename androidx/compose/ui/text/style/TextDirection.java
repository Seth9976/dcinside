package androidx.compose.ui.text.style;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class TextDirection {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;

    static {
        TextDirection.b = new Companion(null);
        TextDirection.c = 1;
        TextDirection.d = 2;
        TextDirection.e = 3;
        TextDirection.f = 4;
        TextDirection.g = 5;
    }

    private TextDirection(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return TextDirection.h(this.a, object0);
    }

    public static final TextDirection f(int v) {
        return new TextDirection(v);
    }

    public static int g(int v) [...] // Inlined contents

    public static boolean h(int v, Object object0) {
        return object0 instanceof TextDirection ? v == ((TextDirection)object0).l() : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final boolean i(int v, int v1) {
        return v == v1;
    }

    public static int j(int v) [...] // Inlined contents

    @l
    public static String k(int v) {
        if(TextDirection.i(v, TextDirection.c)) {
            return "Ltr";
        }
        if(TextDirection.i(v, TextDirection.d)) {
            return "Rtl";
        }
        if(TextDirection.i(v, 3)) {
            return "Content";
        }
        if(TextDirection.i(v, TextDirection.f)) {
            return "ContentOrLtr";
        }
        return TextDirection.i(v, TextDirection.g) ? "ContentOrRtl" : "Invalid";
    }

    public final int l() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return TextDirection.k(this.a);
    }
}

