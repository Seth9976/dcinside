package androidx.compose.ui.node;

import z3.g;

@g
public final class NodeKind {
    private final int a;

    private NodeKind(int v) {
        this.a = v;
    }

    public static final NodeKind a(int v) {
        return new NodeKind(v);
    }

    public static int b(int v) [...] // Inlined contents

    public static boolean c(int v, Object object0) {
        return object0 instanceof NodeKind ? v == ((NodeKind)object0).j() : false;
    }

    public static final boolean d(int v, int v1) {
        return v == v1;
    }

    public final int e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return NodeKind.c(this.a, object0);
    }

    public static int f(int v) [...] // Inlined contents

    public static final int g(int v, int v1) {
        return v | v1;
    }

    public static final int h(int v, int v1) {
        return v | v1;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static String i(int v) [...] // Inlined contents

    public final int j() {
        return this.a;
    }

    @Override
    public String toString() {
        return "NodeKind(mask=" + this.a + ')';
    }
}

