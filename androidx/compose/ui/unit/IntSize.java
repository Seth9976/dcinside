package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,111:1\n55#2:112\n62#2:113\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:112\n53#1:113\n*E\n"})
@g
public final class IntSize {
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
        IntSize.b = new Companion(null);
        IntSize.c = 0L;
    }

    private IntSize(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final IntSize b(long v) {
        return new IntSize(v);
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
        return IntSize.g(this.a, object0);
    }

    @Stable
    public static final long f(long v, int v1) {
        return IntSizeKt.a(((int)(v >> 0x20)) / v1, ((int)(v & 0xFFFFFFFFL)) / v1);
    }

    public static boolean g(long v, Object object0) {
        return object0 instanceof IntSize ? v == ((IntSize)object0).q() : false;
    }

    public static final boolean h(long v, long v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return IntSize.n(this.a);
    }

    @Stable
    public static void i() {
    }

    public static final int j(long v) [...] // Inlined contents

    @b0
    public static void k() {
    }

    @Stable
    public static void l() {
    }

    public static final int m(long v) [...] // Inlined contents

    public static int n(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final long o(long v, int v1) {
        return IntSizeKt.a(((int)(v >> 0x20)) * v1, ((int)(v & 0xFFFFFFFFL)) * v1);
    }

    @Stable
    @l
    public static String p(long v) {
        return ((int)(v >> 0x20)) + " x " + ((int)(v & 0xFFFFFFFFL));
    }

    public final long q() {
        return this.a;
    }

    @Override
    @Stable
    @l
    public String toString() {
        return IntSize.p(this.a);
    }
}

