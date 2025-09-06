package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class KeyboardCapitalization {
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

        // 去混淆评级： 低(20)
        public final int g() [...] // 潜在的解密器

        @Stable
        public static void h() {
        }
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;

    static {
        KeyboardCapitalization.b = new Companion(null);
        KeyboardCapitalization.c = 0;
        KeyboardCapitalization.d = 1;
        KeyboardCapitalization.e = 2;
        KeyboardCapitalization.f = 3;
    }

    private KeyboardCapitalization(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final KeyboardCapitalization e(int v) {
        return new KeyboardCapitalization(v);
    }

    @Override
    public boolean equals(Object object0) {
        return KeyboardCapitalization.g(this.a, object0);
    }

    public static int f(int v) [...] // Inlined contents

    public static boolean g(int v, Object object0) {
        return object0 instanceof KeyboardCapitalization ? v == ((KeyboardCapitalization)object0).k() : false;
    }

    public static final boolean h(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static int i(int v) [...] // Inlined contents

    @l
    public static String j(int v) {
        if(KeyboardCapitalization.h(v, KeyboardCapitalization.c)) {
            return "None";
        }
        if(KeyboardCapitalization.h(v, KeyboardCapitalization.d)) {
            return "Characters";
        }
        if(KeyboardCapitalization.h(v, KeyboardCapitalization.e)) {
            return "Words";
        }
        return KeyboardCapitalization.h(v, KeyboardCapitalization.f) ? "Sentences" : "Invalid";
    }

    public final int k() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return KeyboardCapitalization.j(this.a);
    }
}

