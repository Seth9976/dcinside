package androidx.compose.ui.input.pointer;

import z3.g;

@g
public final class ProcessResult {
    private final int a;

    private ProcessResult(int v) {
        this.a = v;
    }

    public static final ProcessResult a(int v) {
        return new ProcessResult(v);
    }

    public static int b(int v) [...] // Inlined contents

    public static boolean c(int v, Object object0) {
        return object0 instanceof ProcessResult ? v == ((ProcessResult)object0).i() : false;
    }

    public static final boolean d(int v, int v1) {
        return v == v1;
    }

    public static final boolean e(int v) {
        return (v & 2) != 0;
    }

    @Override
    public boolean equals(Object object0) {
        return ProcessResult.c(this.a, object0);
    }

    public static final boolean f(int v) {
        return (v & 1) != 0;
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
        return "ProcessResult(value=" + this.a + ')';
    }
}

