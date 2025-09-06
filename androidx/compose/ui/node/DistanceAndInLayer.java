package androidx.compose.ui.node;

import kotlin.jvm.internal.s0;
import z3.g;

@s0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,340:1\n34#2:341\n62#2:342\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/DistanceAndInLayer\n*L\n319#1:341\n322#1:342\n*E\n"})
@g
final class DistanceAndInLayer {
    private final long a;

    private DistanceAndInLayer(long v) {
        this.a = v;
    }

    public static final DistanceAndInLayer a(long v) {
        return new DistanceAndInLayer(v);
    }

    public static final int b(long v, long v1) {
        boolean z = DistanceAndInLayer.i(v);
        if(z != DistanceAndInLayer.i(v1)) {
            return z ? -1 : 1;
        }
        return (int)Math.signum(DistanceAndInLayer.f(v) - DistanceAndInLayer.f(v1));
    }

    public static long c(long v) [...] // Inlined contents

    public static boolean d(long v, Object object0) {
        return object0 instanceof DistanceAndInLayer ? v == ((DistanceAndInLayer)object0).k() : false;
    }

    public static final boolean e(long v, long v1) {
        return v == v1;
    }

    @Override
    public boolean equals(Object object0) {
        return DistanceAndInLayer.d(this.a, object0);
    }

    public static final float f(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public final long g() {
        return this.a;
    }

    public static int h(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    public int hashCode() {
        return DistanceAndInLayer.h(this.a);
    }

    public static final boolean i(long v) {
        return ((int)(v & 0xFFFFFFFFL)) != 0;
    }

    public static String j(long v) {
        return "DistanceAndInLayer(packedValue=" + v + ')';
    }

    public final long k() {
        return this.a;
    }

    @Override
    public String toString() {
        return DistanceAndInLayer.j(this.a);
    }
}

