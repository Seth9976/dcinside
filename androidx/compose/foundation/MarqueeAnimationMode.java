package androidx.compose.foundation;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@ExperimentalFoundationApi
@g
public final class MarqueeAnimationMode {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        @ExperimentalFoundationApi
        public final int a() [...] // 潜在的解密器

        @ExperimentalFoundationApi
        public static void b() {
        }

        // 去混淆评级： 低(20)
        @ExperimentalFoundationApi
        public final int c() [...] // 潜在的解密器

        @ExperimentalFoundationApi
        public static void d() {
        }
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;

    static {
        MarqueeAnimationMode.b = new Companion(null);
        MarqueeAnimationMode.c = 0;
        MarqueeAnimationMode.d = 1;
    }

    private MarqueeAnimationMode(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final MarqueeAnimationMode c(int v) {
        return new MarqueeAnimationMode(v);
    }

    private static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof MarqueeAnimationMode ? v == ((MarqueeAnimationMode)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return MarqueeAnimationMode.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    @l
    public static String h(int v) {
        if(MarqueeAnimationMode.f(v, MarqueeAnimationMode.c)) {
            return "Immediately";
        }
        if(!MarqueeAnimationMode.f(v, MarqueeAnimationMode.d)) {
            throw new IllegalStateException(("invalid value: " + v).toString());
        }
        return "WhileFocused";
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
        return MarqueeAnimationMode.h(this.a);
    }
}

