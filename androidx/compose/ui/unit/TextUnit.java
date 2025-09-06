package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class TextUnit {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TextUnitType[] a() {
            return TextUnit.c;
        }

        // 去混淆评级： 低(20)
        public final long b() [...] // 潜在的解密器

        @Stable
        public static void c() {
        }
    }

    private final long a;
    @l
    public static final Companion b;
    @l
    private static final TextUnitType[] c;
    private static final long d;

    // 去混淆评级： 低(20)
    static {
        TextUnit.b = new Companion(null);
        TextUnit.c = new TextUnitType[]{TextUnitType.d(0L), TextUnitType.d(0x100000000L), TextUnitType.d(0x200000000L)};
        TextUnit.d = 0x7FC00000L;
    }

    private TextUnit(long v) {
        this.a = v;
    }

    public static final long b() [...] // 潜在的解密器

    public static final TextUnit c(long v) {
        return new TextUnit(v);
    }

    public static final int d(long v, long v1) {
        TextUnitKt.c(v, v1);
        return Float.compare(TextUnit.n(v), TextUnit.n(v1));
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextUnit.i(this.a, object0);
    }

    public static final long f(long v, double f) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, ((float)(((double)TextUnit.n(v)) / f)));
    }

    public static final long g(long v, float f) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, TextUnit.n(v) / f);
    }

    public static final long h(long v, int v1) {
        TextUnitKt.b(v);
        return TextUnitKt.v(TextUnit.l(v), TextUnit.n(v) / ((float)v1));
    }

    @Override
    public int hashCode() {
        return TextUnit.o(this.a);
    }

    public static boolean i(long v, Object object0) {
        return object0 instanceof TextUnit ? v == ((TextUnit)object0).w() : false;
    }

    public static final boolean j(long v, long v1) {
        return v == v1;
    }

    @b0
    public static void k() {
    }

    public static final long l(long v) [...] // Inlined contents

    public static final long m(long v) {
        return TextUnit.c[((int)((v & 0xFF00000000L) >>> 0x20))].j();
    }

    public static final float n(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int o(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final boolean p(long v) {
        return (v & 0xFF00000000L) == 0x200000000L;
    }

    public static final boolean q(long v) {
        return (v & 0xFF00000000L) == 0x100000000L;
    }

    public static final long r(long v, double f) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, ((float)(((double)TextUnit.n(v)) * f)));
    }

    public static final long s(long v, float f) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, TextUnit.n(v) * f);
    }

    public static final long t(long v, int v1) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, TextUnit.n(v) * ((float)v1));
    }

    @Override
    @l
    public String toString() {
        return TextUnit.u(this.a);
    }

    @l
    public static String u(long v) {
        long v1 = TextUnit.m(v);
        if(TextUnitType.g(v1, 0L)) {
            return "Unspecified";
        }
        if(TextUnitType.g(v1, 0x100000000L)) {
            return TextUnit.n(v) + ".sp";
        }
        return TextUnitType.g(v1, 0x200000000L) ? TextUnit.n(v) + ".em" : "Invalid";
    }

    public static final long v(long v) {
        TextUnitKt.b(v);
        return TextUnitKt.v(v & 0xFF00000000L, -TextUnit.n(v));
    }

    public final long w() {
        return this.a;
    }
}

