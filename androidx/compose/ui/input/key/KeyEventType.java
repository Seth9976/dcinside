package androidx.compose.ui.input.key;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class KeyEventType {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;

    static {
        KeyEventType.b = new Companion(null);
        KeyEventType.c = 0;
        KeyEventType.d = 1;
        KeyEventType.e = 2;
    }

    private KeyEventType(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final KeyEventType d(int v) {
        return new KeyEventType(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return KeyEventType.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof KeyEventType ? v == ((KeyEventType)object0).j() : false;
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
        if(KeyEventType.g(v, KeyEventType.d)) {
            return "KeyUp";
        }
        if(KeyEventType.g(v, 2)) {
            return "KeyDown";
        }
        return KeyEventType.g(v, KeyEventType.c) ? "Unknown" : "Invalid";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return KeyEventType.i(this.a);
    }
}

