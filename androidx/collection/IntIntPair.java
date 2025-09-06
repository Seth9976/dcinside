package androidx.collection;

import kotlin.b0;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.f;
import z3.g;

@s0({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
@g
public final class IntIntPair {
    @f
    public final long a;

    private IntIntPair(long v) {
        this.a = v;
    }

    public static final IntIntPair a(long v) {
        return new IntIntPair(v);
    }

    public static final int b(long v) {
        return (int)(v >> 0x20);
    }

    public static final int c(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static long d(int v, int v1) {
        return ((long)v1) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return IntIntPair.f(this.a, object0);
    }

    public static boolean f(long v, Object object0) {
        return object0 instanceof IntIntPair ? v == ((IntIntPair)object0).m() : false;
    }

    public static final boolean g(long v, long v1) {
        return v == v1;
    }

    public static final int h(long v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return IntIntPair.k(this.a);
    }

    @b0
    public static void i() {
    }

    public static final int j(long v) [...] // Inlined contents

    public static int k(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @l
    public static String l(long v) {
        return '(' + ((int)(v >> 0x20)) + ", " + ((int)(v & 0xFFFFFFFFL)) + ')';
    }

    public final long m() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return IntIntPair.l(this.a);
    }
}

