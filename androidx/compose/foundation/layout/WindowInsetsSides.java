package androidx.compose.foundation.layout;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class WindowInsetsSides {
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
        public final int g() {
            return 15;
        }

        // 去混淆评级： 低(20)
        public final int h() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int i() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int j() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int k() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int l() {
            return 0x30;
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
    private static final int l;
    private static final int m;
    private static final int n;

    static {
        WindowInsetsSides.b = new Companion(null);
        WindowInsetsSides.c = 8;
        WindowInsetsSides.d = 4;
        WindowInsetsSides.e = 2;
        WindowInsetsSides.f = 1;
        WindowInsetsSides.g = 9;
        WindowInsetsSides.h = 6;
        WindowInsetsSides.i = 16;
        WindowInsetsSides.j = 0x20;
        WindowInsetsSides.k = 10;
        WindowInsetsSides.l = 5;
        WindowInsetsSides.m = 15;
        WindowInsetsSides.n = 0x30;
    }

    private WindowInsetsSides(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return WindowInsetsSides.o(this.a, object0);
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

    public static final WindowInsetsSides m(int v) {
        return new WindowInsetsSides(v);
    }

    private static int n(int v) [...] // Inlined contents

    public static boolean o(int v, Object object0) {
        return object0 instanceof WindowInsetsSides ? v == ((WindowInsetsSides)object0).u() : false;
    }

    public static final boolean p(int v, int v1) {
        return v == v1;
    }

    public static final boolean q(int v, int v1) {
        return (v & v1) != 0;
    }

    public static int r(int v) [...] // Inlined contents

    public static final int s(int v, int v1) [...] // 潜在的解密器

    @l
    public static String t(int v) {
        return "WindowInsetsSides(" + WindowInsetsSides.v(v) + ')';
    }

    @Override
    @l
    public String toString() {
        return WindowInsetsSides.t(this.a);
    }

    public final int u() {
        return this.a;
    }

    private static final String v(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        if((v & WindowInsetsSides.g) == WindowInsetsSides.g) {
            WindowInsetsSides.w(stringBuilder0, "Start");
        }
        if((v & WindowInsetsSides.k) == WindowInsetsSides.k) {
            WindowInsetsSides.w(stringBuilder0, "Left");
        }
        if((v & WindowInsetsSides.i) == WindowInsetsSides.i) {
            WindowInsetsSides.w(stringBuilder0, "Top");
        }
        if((v & WindowInsetsSides.h) == WindowInsetsSides.h) {
            WindowInsetsSides.w(stringBuilder0, "End");
        }
        if((v & WindowInsetsSides.l) == WindowInsetsSides.l) {
            WindowInsetsSides.w(stringBuilder0, "Right");
        }
        if((v & 0x20) == 0x20) {
            WindowInsetsSides.w(stringBuilder0, "Bottom");
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    private static final void w(StringBuilder stringBuilder0, String s) {
        if(stringBuilder0.length() > 0) {
            stringBuilder0.append('+');
        }
        stringBuilder0.append(s);
    }
}

