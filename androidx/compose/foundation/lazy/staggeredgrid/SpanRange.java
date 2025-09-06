package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.jvm.internal.s0;
import z3.g;

@s0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n879#1:1101\n878#1:1103\n48#2:1098\n55#2:1099\n62#2:1100\n62#2:1102\n55#2:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n880#1:1101\n880#1:1103\n876#1:1098\n878#1:1099\n879#1:1100\n880#1:1102\n880#1:1104\n*E\n"})
@g
final class SpanRange {
    private final long a;

    private SpanRange(long v) {
        this.a = v;
    }

    public static final SpanRange a(long v) {
        return new SpanRange(v);
    }

    public static long b(int v, int v1) {
        return ((long)(v1 + v)) & 0xFFFFFFFFL | ((long)v) << 0x20;
    }

    private static long c(long v) [...] // Inlined contents

    public static boolean d(long v, Object object0) {
        return object0 instanceof SpanRange ? v == ((SpanRange)object0).l() : false;
    }

    public static final boolean e(long v, long v1) {
        return v == v1;
    }

    @Override
    public boolean equals(Object object0) {
        return SpanRange.d(this.a, object0);
    }

    public static final int f(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public final long g() {
        return this.a;
    }

    public static final int h(long v) {
        return ((int)(0xFFFFFFFFL & v)) - ((int)(v >> 0x20));
    }

    @Override
    public int hashCode() {
        return SpanRange.j(this.a);
    }

    public static final int i(long v) {
        return (int)(v >> 0x20);
    }

    public static int j(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String k(long v) {
        return "SpanRange(packedValue=" + v + ')';
    }

    public final long l() {
        return this.a;
    }

    @Override
    public String toString() {
        return SpanRange.k(this.a);
    }
}

