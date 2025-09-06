package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class RenderIntent {
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
        public final int d() {
            return 2;
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
        RenderIntent.b = new Companion(null);
        RenderIntent.c = 0;
        RenderIntent.d = 1;
        RenderIntent.e = 2;
        RenderIntent.f = 3;
    }

    private RenderIntent(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final RenderIntent e(int v) {
        return new RenderIntent(v);
    }

    @Override
    public boolean equals(Object object0) {
        return RenderIntent.g(this.a, object0);
    }

    public static int f(int v) [...] // Inlined contents

    public static boolean g(int v, Object object0) {
        return object0 instanceof RenderIntent ? v == ((RenderIntent)object0).k() : false;
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
        if(RenderIntent.h(v, 0)) {
            return "Perceptual";
        }
        if(RenderIntent.h(v, RenderIntent.d)) {
            return "Relative";
        }
        if(RenderIntent.h(v, RenderIntent.e)) {
            return "Saturation";
        }
        return RenderIntent.h(v, RenderIntent.f) ? "Absolute" : "Unknown";
    }

    public final int k() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return RenderIntent.j(this.a);
    }
}

