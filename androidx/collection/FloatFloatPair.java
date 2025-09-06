package androidx.collection;

import kotlin.b0;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.f;
import z3.g;

@s0({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
@g
public final class FloatFloatPair {
    @f
    public final long a;

    private FloatFloatPair(long v) {
        this.a = v;
    }

    public static final FloatFloatPair a(long v) {
        return new FloatFloatPair(v);
    }

    public static final float b(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float c(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static long d(float f, float f1) {
        return ((long)Float.floatToRawIntBits(f1)) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(f)) << 0x20;
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return FloatFloatPair.f(this.a, object0);
    }

    public static boolean f(long v, Object object0) {
        return object0 instanceof FloatFloatPair ? v == ((FloatFloatPair)object0).m() : false;
    }

    public static final boolean g(long v, long v1) {
        return v == v1;
    }

    public static final float h(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Override
    public int hashCode() {
        return FloatFloatPair.k(this.a);
    }

    @b0
    public static void i() {
    }

    public static final float j(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int k(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @l
    public static String l(long v) {
        return '(' + Float.intBitsToFloat(((int)(v >> 0x20))) + ", " + Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL))) + ')';
    }

    public final long m() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return FloatFloatPair.l(this.a);
    }
}

