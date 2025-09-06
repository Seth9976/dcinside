package androidx.compose.foundation.lazy.grid;

import z3.g;

@g
public final class ItemIndex {
    private final int a;

    private ItemIndex(int v) {
        this.a = v;
    }

    public static final ItemIndex a(int v) {
        return new ItemIndex(v);
    }

    public static final int b(int v, int v1) {
        return v - v1;
    }

    public static int c(int v) [...] // Inlined contents

    public static final int d(int v) {
        return v - 1;
    }

    public static boolean e(int v, Object object0) {
        return object0 instanceof ItemIndex ? v == ((ItemIndex)object0).n() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return ItemIndex.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public final int g() {
        return this.a;
    }

    public static int h(int v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final int i(int v) {
        return v + 1;
    }

    public static final int j(int v, int v1) {
        return v - v1;
    }

    public static final int k(int v, int v1) {
        return v - v1;
    }

    public static final int l(int v, int v1) {
        return v + v1;
    }

    public static String m(int v) [...] // Inlined contents

    public final int n() {
        return this.a;
    }

    @Override
    public String toString() {
        return "ItemIndex(value=" + this.a + ')';
    }
}

