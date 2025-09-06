package androidx.compose.ui.unit;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class TextUnitType {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long b() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long c() [...] // 潜在的解密器
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;
    private static final long d;
    private static final long e;

    static {
        TextUnitType.b = new Companion(null);
        TextUnitType.c = 0L;
        TextUnitType.d = 0x100000000L;
        TextUnitType.e = 0x200000000L;
    }

    private TextUnitType(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final long b() [...] // 潜在的解密器

    public static final long c() [...] // 潜在的解密器

    public static final TextUnitType d(long v) {
        return new TextUnitType(v);
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TextUnitType.f(this.a, object0);
    }

    public static boolean f(long v, Object object0) {
        return object0 instanceof TextUnitType ? v == ((TextUnitType)object0).j() : false;
    }

    public static final boolean g(long v, long v1) [...] // 潜在的解密器

    public static int h(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    public int hashCode() {
        return TextUnitType.h(this.a);
    }

    @l
    public static String i(long v) {
        if(TextUnitType.g(v, 0L)) {
            return "Unspecified";
        }
        if(TextUnitType.g(v, 0x100000000L)) {
            return "Sp";
        }
        return TextUnitType.g(v, 0x200000000L) ? "Em" : "Invalid";
    }

    public final long j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return TextUnitType.i(this.a);
    }
}

