package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,179:1\n55#2:180\n62#2:181\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n53#1:180\n60#1:181\n*E\n"})
@g
public final class IntOffset {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;

    static {
        IntOffset.b = new Companion(null);
        IntOffset.c = IntOffsetKt.a(0, 0);
    }

    private IntOffset(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final IntOffset b(long v) {
        return new IntOffset(v);
    }

    @Stable
    public static final int c(long v) {
        return (int)(v >> 0x20);
    }

    @Stable
    public static final int d(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return IntOffset.i(this.a, object0);
    }

    public static final long f(long v, int v1, int v2) {
        return IntOffsetKt.a(v1, v2);
    }

    public static long g(long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v1 = (int)(v >> 0x20);
        }
        if((v3 & 2) != 0) {
            v2 = (int)(v & 0xFFFFFFFFL);
        }
        return IntOffset.f(v, v1, v2);
    }

    @Stable
    public static final long h(long v, float f) {
        return IntOffsetKt.a(b.L0(((float)(((int)(v >> 0x20)))) / f), b.L0(((float)(((int)(v & 0xFFFFFFFFL)))) / f));
    }

    @Override
    public int hashCode() {
        return IntOffset.p(this.a);
    }

    public static boolean i(long v, Object object0) {
        return object0 instanceof IntOffset ? v == ((IntOffset)object0).w() : false;
    }

    public static final boolean j(long v, long v1) {
        return v == v1;
    }

    @b0
    public static void k() {
    }

    @Stable
    public static void l() {
    }

    public static final int m(long v) [...] // Inlined contents

    @Stable
    public static void n() {
    }

    public static final int o(long v) [...] // Inlined contents

    public static int p(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final long q(long v, long v1) {
        return IntOffsetKt.a(((int)(v >> 0x20)) - ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) - ((int)(v1 & 0xFFFFFFFFL)));
    }

    @Stable
    public static final long r(long v, long v1) {
        return IntOffsetKt.a(((int)(v >> 0x20)) + ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL)));
    }

    @Stable
    public static final long s(long v, int v1) {
        return IntOffsetKt.a(IntOffset.m(v) % v1, ((int)(v & 0xFFFFFFFFL)) % v1);
    }

    @Stable
    public static final long t(long v, float f) {
        return IntOffsetKt.a(b.L0(((float)(((int)(v >> 0x20)))) * f), b.L0(((float)(((int)(v & 0xFFFFFFFFL)))) * f));
    }

    @Override
    @Stable
    @l
    public String toString() {
        return IntOffset.u(this.a);
    }

    @Stable
    @l
    public static String u(long v) {
        return '(' + ((int)(v >> 0x20)) + ", " + ((int)(v & 0xFFFFFFFFL)) + ')';
    }

    @Stable
    public static final long v(long v) {
        return IntOffsetKt.a(-((int)(v >> 0x20)), -((int)(v & 0xFFFFFFFFL)));
    }

    public final long w() {
        return this.a;
    }
}

