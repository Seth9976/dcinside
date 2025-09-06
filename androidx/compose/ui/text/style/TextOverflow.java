package androidx.compose.ui.text.style;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class TextOverflow {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        @Stable
        public static void b() {
        }

        // 去混淆评级： 低(20)
        public final int c() [...] // 潜在的解密器

        @Stable
        public static void d() {
        }

        // 去混淆评级： 低(20)
        public final int e() [...] // 潜在的解密器

        @Stable
        public static void f() {
        }
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;

    static {
        TextOverflow.b = new Companion(null);
        TextOverflow.c = 1;
        TextOverflow.d = 2;
        TextOverflow.e = 3;
    }

    private TextOverflow(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final TextOverflow d(int v) {
        return new TextOverflow(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextOverflow.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof TextOverflow ? v == ((TextOverflow)object0).j() : false;
    }

    public static final boolean g(int v, int v1) {
        return v == v1;
    }

    public static int h(int v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return this.a;
    }

    @l
    public static String i(int v) {
        if(TextOverflow.g(v, 1)) {
            return "Clip";
        }
        if(TextOverflow.g(v, 2)) {
            return "Ellipsis";
        }
        return TextOverflow.g(v, 3) ? "Visible" : "Invalid";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return TextOverflow.i(this.a);
    }
}

