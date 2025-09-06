package androidx.compose.ui.input;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class InputMode {
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
        InputMode.b = new Companion(null);
        InputMode.c = 1;
        InputMode.d = 2;
    }

    private InputMode(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final InputMode c(int v) {
        return new InputMode(v);
    }

    public static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof InputMode ? v == ((InputMode)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return InputMode.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    @l
    public static String h(int v) {
        if(InputMode.f(v, InputMode.c)) {
            return "Touch";
        }
        return InputMode.f(v, InputMode.d) ? "Keyboard" : "Error";
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
        return InputMode.h(this.a);
    }
}

