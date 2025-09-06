package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Immutable;
import z3.g;

@Immutable
@g
public final class GridItemSpan {
    private final long a;

    private GridItemSpan(long v) {
        this.a = v;
    }

    public static final GridItemSpan a(long v) {
        return new GridItemSpan(v);
    }

    public static long b(long v) [...] // Inlined contents

    public static boolean c(long v, Object object0) {
        return object0 instanceof GridItemSpan ? v == ((GridItemSpan)object0).i() : false;
    }

    public static final boolean d(long v, long v1) {
        return v == v1;
    }

    @ExperimentalFoundationApi
    public static void e() {
    }

    @Override
    public boolean equals(Object object0) {
        return GridItemSpan.c(this.a, object0);
    }

    public static final int f(long v) {
        return (int)v;
    }

    public static int g(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String h(long v) {
        return "GridItemSpan(packedValue=" + v + ')';
    }

    @Override
    public int hashCode() {
        return GridItemSpan.g(this.a);
    }

    public final long i() {
        return this.a;
    }

    @Override
    public String toString() {
        return GridItemSpan.h(this.a);
    }
}

