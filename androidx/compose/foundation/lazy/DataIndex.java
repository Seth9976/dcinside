package androidx.compose.foundation.lazy;

import z3.g;

@g
public final class DataIndex {
    private final int a;

    private DataIndex(int v) {
        this.a = v;
    }

    public static final DataIndex a(int v) {
        return new DataIndex(v);
    }

    public static final int b(int v, int v1) {
        return v - v1;
    }

    public static int c(int v) [...] // Inlined contents

    public static final int d(int v) {
        return v - 1;
    }

    public static boolean e(int v, Object object0) {
        return object0 instanceof DataIndex ? v == ((DataIndex)object0).n() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return DataIndex.e(this.a, object0);
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
        return "DataIndex(value=" + this.a + ')';
    }
}

