package androidx.compose.ui.text.font;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class FontSynthesis {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;

    static {
        FontSynthesis.b = new Companion(null);
        FontSynthesis.c = 0;
        FontSynthesis.d = 1;
        FontSynthesis.e = 2;
        FontSynthesis.f = 3;
    }

    private FontSynthesis(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final FontSynthesis e(int v) {
        return new FontSynthesis(v);
    }

    @Override
    public boolean equals(Object object0) {
        return FontSynthesis.g(this.a, object0);
    }

    public static int f(int v) [...] // Inlined contents

    public static boolean g(int v, Object object0) {
        return object0 instanceof FontSynthesis ? v == ((FontSynthesis)object0).m() : false;
    }

    public static final boolean h(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static int i(int v) [...] // Inlined contents

    // 去混淆评级： 低(20)
    public static final boolean j(int v) {
        return FontSynthesis.h(v, 1) || FontSynthesis.h(v, FontSynthesis.f);
    }

    // 去混淆评级： 低(20)
    public static final boolean k(int v) {
        return FontSynthesis.h(v, 1) || FontSynthesis.h(v, FontSynthesis.e);
    }

    @l
    public static String l(int v) {
        if(FontSynthesis.h(v, 0)) {
            return "None";
        }
        if(FontSynthesis.h(v, 1)) {
            return "All";
        }
        if(FontSynthesis.h(v, FontSynthesis.e)) {
            return "Weight";
        }
        return FontSynthesis.h(v, FontSynthesis.f) ? "Style" : "Invalid";
    }

    public final int m() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return FontSynthesis.l(this.a);
    }
}

