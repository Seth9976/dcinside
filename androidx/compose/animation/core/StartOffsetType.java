package androidx.compose.animation.core;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class StartOffsetType {
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
        StartOffsetType.b = new Companion(null);
        StartOffsetType.c = -1;
        StartOffsetType.d = 1;
    }

    private StartOffsetType(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final StartOffsetType c(int v) {
        return new StartOffsetType(v);
    }

    private static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof StartOffsetType ? v == ((StartOffsetType)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return StartOffsetType.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    public static String h(int v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return this.a;
    }

    public final int i() {
        return this.a;
    }

    @Override
    public String toString() {
        return "StartOffsetType(value=" + this.a + ')';
    }
}

