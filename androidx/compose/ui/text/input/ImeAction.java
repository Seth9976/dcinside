package androidx.compose.ui.text.input;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class ImeAction {
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

    static {
        ImeAction.b = new Companion(null);
        ImeAction.c = 1;
        ImeAction.d = 0;
        ImeAction.e = 2;
        ImeAction.f = 3;
        ImeAction.g = 4;
        ImeAction.h = 5;
        ImeAction.i = 6;
        ImeAction.j = 7;
    }

    private ImeAction(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return ImeAction.k(this.a, object0);
    }

    public static final int f() [...] // 潜在的解密器

    public static final int g() [...] // 潜在的解密器

    public static final int h() [...] // 潜在的解密器

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final ImeAction i(int v) {
        return new ImeAction(v);
    }

    public static int j(int v) [...] // Inlined contents

    public static boolean k(int v, Object object0) {
        return object0 instanceof ImeAction ? v == ((ImeAction)object0).o() : false;
    }

    public static final boolean l(int v, int v1) {
        return v == v1;
    }

    public static int m(int v) [...] // Inlined contents

    @l
    public static String n(int v) {
        if(ImeAction.l(v, ImeAction.d)) {
            return "None";
        }
        if(ImeAction.l(v, 1)) {
            return "Default";
        }
        if(ImeAction.l(v, ImeAction.e)) {
            return "Go";
        }
        if(ImeAction.l(v, ImeAction.f)) {
            return "Search";
        }
        if(ImeAction.l(v, ImeAction.g)) {
            return "Send";
        }
        if(ImeAction.l(v, ImeAction.h)) {
            return "Previous";
        }
        if(ImeAction.l(v, ImeAction.i)) {
            return "Next";
        }
        return ImeAction.l(v, ImeAction.j) ? "Done" : "Invalid";
    }

    public final int o() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return ImeAction.n(this.a);
    }
}

