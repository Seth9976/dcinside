package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,557:1\n137#2:558\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n101#1:558\n*E\n"})
@g
public final class Dp implements Comparable {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final float a() [...] // 潜在的解密器

        @Stable
        public static void b() {
        }

        // 去混淆评级： 低(20)
        public final float c() [...] // 潜在的解密器

        @Stable
        public static void d() {
        }

        // 去混淆评级： 低(20)
        public final float e() [...] // 潜在的解密器

        @Stable
        public static void f() {
        }
    }

    private final float a;
    @l
    public static final Companion b;
    private static final float c;
    private static final float d;
    private static final float e;

    static {
        Dp.b = new Companion(null);
        Dp.c = 0.0f;
        Dp.d = Infinityf;
        Dp.e = NaNf;
    }

    private Dp(float f) {
        this.a = f;
    }

    public static final float a() [...] // 潜在的解密器

    public static final float b() [...] // 潜在的解密器

    public static final float c() [...] // 潜在的解密器

    @Override
    public int compareTo(Object object0) {
        return this.e(((Dp)object0).w());
    }

    public static final Dp d(float f) {
        return new Dp(f);
    }

    @Stable
    public int e(float f) {
        return Dp.f(this.a, f);
    }

    @Override
    public boolean equals(Object object0) {
        return Dp.k(this.a, object0);
    }

    @Stable
    public static int f(float f, float f1) {
        return Float.compare(f, f1);
    }

    public static float g(float f) [...] // Inlined contents

    @Stable
    public static final float h(float f, float f1) {
        return f / f1;
    }

    @Override
    public int hashCode() {
        return Dp.n(this.a);
    }

    @Stable
    public static final float i(float f, float f1) {
        return Dp.g(f / f1);
    }

    @Stable
    public static final float j(float f, int v) {
        return Dp.g(f / ((float)v));
    }

    public static boolean k(float f, Object object0) {
        return object0 instanceof Dp ? Float.compare(f, ((Dp)object0).w()) == 0 : false;
    }

    public static final boolean l(float f, float f1) {
        return Float.compare(f, f1) == 0;
    }

    public final float m() {
        return this.a;
    }

    public static int n(float f) {
        return Float.floatToIntBits(f);
    }

    @Stable
    public static final float p(float f, float f1) {
        return f - f1;
    }

    @Stable
    public static final float r(float f, float f1) {
        return f + f1;
    }

    @Stable
    public static final float s(float f, float f1) {
        return f * f1;
    }

    @Stable
    public static final float t(float f, int v) {
        return f * ((float)v);
    }

    @Override
    @Stable
    @l
    public String toString() {
        return Dp.u(this.a);
    }

    // 去混淆评级： 低(20)
    @Stable
    @l
    public static String u(float f) {
        return Float.isNaN(f) ? "Dp.Unspecified" : f + ".dp";
    }

    @Stable
    public static final float v(float f) {
        return -f;
    }

    public final float w() {
        return this.a;
    }
}

