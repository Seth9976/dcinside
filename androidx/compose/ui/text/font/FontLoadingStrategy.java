package androidx.compose.ui.text.font;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class FontLoadingStrategy {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;

    static {
        FontLoadingStrategy.b = new Companion(null);
        FontLoadingStrategy.c = 0;
        FontLoadingStrategy.d = 1;
        FontLoadingStrategy.e = 2;
    }

    private FontLoadingStrategy(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final FontLoadingStrategy d(int v) {
        return new FontLoadingStrategy(v);
    }

    private static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return FontLoadingStrategy.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof FontLoadingStrategy ? v == ((FontLoadingStrategy)object0).k() : false;
    }

    public static final boolean g(int v, int v1) {
        return v == v1;
    }

    public final int h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static int i(int v) [...] // Inlined contents

    @l
    public static String j(int v) {
        if(FontLoadingStrategy.g(v, FontLoadingStrategy.c)) {
            return "Blocking";
        }
        if(FontLoadingStrategy.g(v, FontLoadingStrategy.d)) {
            return "Optional";
        }
        return FontLoadingStrategy.g(v, 2) ? "Async" : "Invalid(value=" + v + ')';
    }

    public final int k() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return FontLoadingStrategy.j(this.a);
    }
}

