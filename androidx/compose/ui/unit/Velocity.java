package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,144:1\n34#2:145\n41#2:146\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n45#1:145\n52#1:146\n*E\n"})
@g
public final class Velocity {
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
        Velocity.b = new Companion(null);
        Velocity.c = 0L;
    }

    private Velocity(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final Velocity b(long v) {
        return new Velocity(v);
    }

    @Stable
    public static final float c(long v) {
        return Velocity.l(v);
    }

    @Stable
    public static final float d(long v) {
        return Velocity.n(v);
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return Velocity.i(this.a, object0);
    }

    public static final long f(long v, float f, float f1) {
        return VelocityKt.a(f, f1);
    }

    public static long g(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Velocity.l(v);
        }
        if((v1 & 2) != 0) {
            f1 = Velocity.n(v);
        }
        return Velocity.f(v, f, f1);
    }

    @Stable
    public static final long h(long v, float f) {
        return VelocityKt.a(Velocity.l(v) / f, Velocity.n(v) / f);
    }

    @Override
    public int hashCode() {
        return Velocity.o(this.a);
    }

    public static boolean i(long v, Object object0) {
        return object0 instanceof Velocity ? v == ((Velocity)object0).v() : false;
    }

    public static final boolean j(long v, long v1) {
        return v == v1;
    }

    @Stable
    public static void k() {
    }

    public static final float l(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Stable
    public static void m() {
    }

    public static final float n(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int o(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Stable
    public static final long p(long v, long v1) {
        return VelocityKt.a(Velocity.l(v) - Velocity.l(v1), Velocity.n(v) - Velocity.n(v1));
    }

    @Stable
    public static final long q(long v, long v1) {
        return VelocityKt.a(Velocity.l(v) + Velocity.l(v1), Velocity.n(v) + Velocity.n(v1));
    }

    @Stable
    public static final long r(long v, float f) {
        return VelocityKt.a(Velocity.l(v) % f, Velocity.n(v) % f);
    }

    @Stable
    public static final long s(long v, float f) {
        return VelocityKt.a(Velocity.l(v) * f, Velocity.n(v) * f);
    }

    @l
    public static String t(long v) {
        return '(' + Velocity.l(v) + ", " + Velocity.n(v) + ") px/sec";
    }

    @Override
    @l
    public String toString() {
        return Velocity.t(this.a);
    }

    @Stable
    public static final long u(long v) {
        return VelocityKt.a(-Velocity.l(v), -Velocity.n(v));
    }

    public final long v() {
        return this.a;
    }
}

