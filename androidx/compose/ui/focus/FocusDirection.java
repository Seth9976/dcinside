package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.c0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import y4.l;
import z3.g;

@g
public final class FocusDirection {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @ExperimentalComposeUiApi
        public final int b() [...] // 潜在的解密器

        @ExperimentalComposeUiApi
        public static void c() {
        }

        // 去混淆评级： 低(20)
        @ExperimentalComposeUiApi
        public final int d() [...] // 潜在的解密器

        @ExperimentalComposeUiApi
        public static void e() {
        }

        // 去混淆评级： 低(20)
        @ExperimentalComposeUiApi
        public final int f() {
            return 7;
        }

        @ExperimentalComposeUiApi
        @k(level = m.a, message = "Use FocusDirection.Enter instead.", replaceWith = @c0(expression = "Enter", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Enter"}))
        public static void g() {
        }

        // 去混淆评级： 低(20)
        public final int h() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int i() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        @ExperimentalComposeUiApi
        public final int j() {
            return 8;
        }

        @ExperimentalComposeUiApi
        @k(level = m.a, message = "Use FocusDirection.Exit instead.", replaceWith = @c0(expression = "Exit", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Exit"}))
        public static void k() {
        }

        // 去混淆评级： 低(20)
        public final int l() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int m() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int n() [...] // 潜在的解密器
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

    static {
        FocusDirection.b = new Companion(null);
        FocusDirection.c = 1;
        FocusDirection.d = 2;
        FocusDirection.e = 3;
        FocusDirection.f = 4;
        FocusDirection.g = 5;
        FocusDirection.h = 6;
        FocusDirection.i = 7;
        FocusDirection.j = 8;
        FocusDirection.k = 7;
        FocusDirection.l = 8;
    }

    private FocusDirection(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return FocusDirection.m(this.a, object0);
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

    public static final FocusDirection k(int v) {
        return new FocusDirection(v);
    }

    public static int l(int v) [...] // Inlined contents

    public static boolean m(int v, Object object0) {
        return object0 instanceof FocusDirection ? v == ((FocusDirection)object0).q() : false;
    }

    public static final boolean n(int v, int v1) {
        return v == v1;
    }

    public static int o(int v) [...] // Inlined contents

    @l
    public static String p(int v) {
        if(FocusDirection.n(v, FocusDirection.c)) {
            return "Next";
        }
        if(FocusDirection.n(v, FocusDirection.d)) {
            return "Previous";
        }
        if(FocusDirection.n(v, FocusDirection.e)) {
            return "Left";
        }
        if(FocusDirection.n(v, FocusDirection.f)) {
            return "Right";
        }
        if(FocusDirection.n(v, FocusDirection.g)) {
            return "Up";
        }
        if(FocusDirection.n(v, FocusDirection.h)) {
            return "Down";
        }
        if(FocusDirection.n(v, FocusDirection.i)) {
            return "Enter";
        }
        return FocusDirection.n(v, FocusDirection.j) ? "Exit" : "Invalid FocusDirection";
    }

    public final int q() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return FocusDirection.p(this.a);
    }
}

