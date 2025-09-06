package androidx.compose.ui.text.style;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class Hyphens {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;

    static {
        Hyphens.b = new Companion(null);
        Hyphens.c = 1;
        Hyphens.d = 2;
    }

    private Hyphens(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final Hyphens c(int v) {
        return new Hyphens(v);
    }

    private static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof Hyphens ? v == ((Hyphens)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return Hyphens.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    @l
    public static String h(int v) {
        if(Hyphens.f(v, Hyphens.c)) {
            return "Hyphens.None";
        }
        return Hyphens.f(v, Hyphens.d) ? "Hyphens.Auto" : "Invalid";
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public final int i() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return Hyphens.h(this.a);
    }
}

