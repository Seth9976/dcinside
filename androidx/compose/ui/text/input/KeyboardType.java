package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class KeyboardType {
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

        // 去混淆评级： 低(20)
        public final int i() [...] // 潜在的解密器

        @Stable
        public static void j() {
        }

        // 去混淆评级： 低(20)
        public final int k() [...] // 潜在的解密器

        @Stable
        public static void l() {
        }

        // 去混淆评级： 低(20)
        public final int m() [...] // 潜在的解密器

        @Stable
        public static void n() {
        }

        // 去混淆评级： 低(20)
        public final int o() [...] // 潜在的解密器

        @Stable
        public static void p() {
        }

        // 去混淆评级： 低(20)
        public final int q() [...] // 潜在的解密器

        @Stable
        public static void r() {
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
    private static final int i;
    private static final int j;
    private static final int k;

    static {
        KeyboardType.b = new Companion(null);
        KeyboardType.c = 1;
        KeyboardType.d = 2;
        KeyboardType.e = 3;
        KeyboardType.f = 4;
        KeyboardType.g = 5;
        KeyboardType.h = 6;
        KeyboardType.i = 7;
        KeyboardType.j = 8;
        KeyboardType.k = 9;
    }

    private KeyboardType(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return KeyboardType.l(this.a, object0);
    }

    public static final int f() [...] // 潜在的解密器

    public static final int g() [...] // 潜在的解密器

    public static final int h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final int i() [...] // 潜在的解密器

    public static final KeyboardType j(int v) {
        return new KeyboardType(v);
    }

    public static int k(int v) [...] // Inlined contents

    public static boolean l(int v, Object object0) {
        return object0 instanceof KeyboardType ? v == ((KeyboardType)object0).p() : false;
    }

    public static final boolean m(int v, int v1) {
        return v == v1;
    }

    public static int n(int v) [...] // Inlined contents

    @l
    public static String o(int v) {
        if(KeyboardType.m(v, KeyboardType.c)) {
            return "Text";
        }
        if(KeyboardType.m(v, KeyboardType.d)) {
            return "Ascii";
        }
        if(KeyboardType.m(v, KeyboardType.e)) {
            return "Number";
        }
        if(KeyboardType.m(v, KeyboardType.f)) {
            return "Phone";
        }
        if(KeyboardType.m(v, KeyboardType.g)) {
            return "Uri";
        }
        if(KeyboardType.m(v, KeyboardType.h)) {
            return "Email";
        }
        if(KeyboardType.m(v, KeyboardType.i)) {
            return "Password";
        }
        if(KeyboardType.m(v, KeyboardType.j)) {
            return "NumberPassword";
        }
        return KeyboardType.m(v, KeyboardType.k) ? "Decimal" : "Invalid";
    }

    public final int p() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return KeyboardType.o(this.a);
    }
}

