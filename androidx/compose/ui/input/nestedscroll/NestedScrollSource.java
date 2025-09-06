package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import z3.g;

@g
public final class NestedScrollSource {
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
        public final int c() {
            return 3;
        }

        @ExperimentalComposeUiApi
        @k(message = "Do not use. Will be removed in the future.")
        public static void d() {
        }
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;

    static {
        NestedScrollSource.b = new Companion(null);
        NestedScrollSource.c = 1;
        NestedScrollSource.d = 2;
        NestedScrollSource.e = 3;
    }

    private NestedScrollSource(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final NestedScrollSource d(int v) {
        return new NestedScrollSource(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return NestedScrollSource.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof NestedScrollSource ? v == ((NestedScrollSource)object0).j() : false;
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
        if(NestedScrollSource.g(v, NestedScrollSource.c)) {
            return "Drag";
        }
        if(NestedScrollSource.g(v, 2)) {
            return "Fling";
        }
        return NestedScrollSource.g(v, NestedScrollSource.e) ? "Relocate" : "Invalid";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return NestedScrollSource.i(this.a);
    }
}

