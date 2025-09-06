package androidx.compose.ui.input.pointer;

import z3.g;

@g
public final class PointerKeyboardModifiers {
    private final int a;

    private PointerKeyboardModifiers(int v) {
        this.a = v;
    }

    public static final PointerKeyboardModifiers a(int v) {
        return new PointerKeyboardModifiers(v);
    }

    public static int b(int v) [...] // Inlined contents

    public static boolean c(int v, Object object0) {
        return object0 instanceof PointerKeyboardModifiers ? v == ((PointerKeyboardModifiers)object0).g() : false;
    }

    public static final boolean d(int v, int v1) {
        return v == v1;
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return PointerKeyboardModifiers.c(this.a, object0);
    }

    public static String f(int v) [...] // Inlined contents

    public final int g() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    public String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}

