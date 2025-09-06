package androidx.compose.ui.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,197:1\n34#2:198\n41#2:199\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n*L\n51#1:198\n65#1:199\n*E\n"})
@g
public final class ScaleFactor {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器

        @Stable
        public static void b() {
        }
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;

    static {
        ScaleFactor.b = new Companion(null);
        ScaleFactor.c = 0x7FC000007FC00000L;
    }

    private ScaleFactor(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final ScaleFactor b(long v) {
        return new ScaleFactor(v);
    }

    @Stable
    public static final float c(long v) {
        return ScaleFactor.m(v);
    }

    @Stable
    public static final float d(long v) {
        return ScaleFactor.o(v);
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return ScaleFactor.i(this.a, object0);
    }

    public static final long f(long v, float f, float f1) {
        return ScaleFactorKt.a(f, f1);
    }

    public static long g(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = ScaleFactor.m(v);
        }
        if((v1 & 2) != 0) {
            f1 = ScaleFactor.o(v);
        }
        return ScaleFactor.f(v, f, f1);
    }

    @Stable
    public static final long h(long v, float f) {
        return ScaleFactorKt.a(ScaleFactor.m(v) / f, ScaleFactor.o(v) / f);
    }

    @Override
    public int hashCode() {
        return ScaleFactor.p(this.a);
    }

    public static boolean i(long v, Object object0) {
        return object0 instanceof ScaleFactor ? v == ((ScaleFactor)object0).s() : false;
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

    public static final float m(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void n() {
    }

    public static final float o(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int p(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final long q(long v, float f) {
        return ScaleFactorKt.a(ScaleFactor.m(v) * f, ScaleFactor.o(v) * f);
    }

    @l
    public static String r(long v) {
        return "ScaleFactor(" + ScaleFactorKt.i(ScaleFactor.m(v)) + ", " + ScaleFactorKt.i(ScaleFactor.o(v)) + ')';
    }

    public final long s() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return ScaleFactor.r(this.a);
    }
}

