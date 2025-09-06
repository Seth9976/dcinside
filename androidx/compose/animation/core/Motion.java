package androidx.compose.animation.core;

import kotlin.jvm.internal.s0;
import z3.g;

@s0({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,244:1\n34#2:245\n41#2:246\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/Motion\n*L\n48#1:245\n50#1:246\n*E\n"})
@g
public final class Motion {
    private final long a;

    private Motion(long v) {
        this.a = v;
    }

    public static final Motion a(long v) {
        return new Motion(v);
    }

    public static long b(long v) [...] // Inlined contents

    public static final long c(long v, float f, float f1) {
        return SpringSimulationKt.a(f, f1);
    }

    public static long d(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Motion.h(v);
        }
        if((v1 & 2) != 0) {
            f1 = Motion.i(v);
        }
        return Motion.c(v, f, f1);
    }

    public static boolean e(long v, Object object0) {
        return object0 instanceof Motion ? v == ((Motion)object0).l() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return Motion.e(this.a, object0);
    }

    public static final boolean f(long v, long v1) {
        return v == v1;
    }

    public final long g() {
        return this.a;
    }

    public static final float h(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Override
    public int hashCode() {
        return Motion.j(this.a);
    }

    public static final float i(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int j(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String k(long v) {
        return "Motion(packedValue=" + v + ')';
    }

    public final long l() {
        return this.a;
    }

    @Override
    public String toString() {
        return Motion.k(this.a);
    }
}

