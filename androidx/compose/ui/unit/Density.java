package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@Immutable
@s0({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,163:1\n1#2:164\n174#3:165\n174#3:166\n473#3:167\n152#4:168\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n114#1:165\n124#1:166\n147#1:167\n157#1:168\n*E\n"})
public interface Density {
    public static final class DefaultImpls {
        @Stable
        public static void a() {
        }

        @Stable
        public static void b() {
        }

        @Stable
        @Deprecated
        public static int c(@l Density density0, long v) {
            return a.a(density0, v);
        }

        @Stable
        @Deprecated
        public static int d(@l Density density0, float f) {
            return a.b(density0, f);
        }

        @Stable
        @Deprecated
        public static float e(@l Density density0, long v) {
            return a.c(density0, v);
        }

        @Stable
        @Deprecated
        public static float f(@l Density density0, float f) {
            return a.d(density0, f);
        }

        @Stable
        @Deprecated
        public static float g(@l Density density0, int v) {
            return a.e(density0, v);
        }

        @Stable
        @Deprecated
        public static long h(@l Density density0, long v) {
            return a.f(density0, v);
        }

        @Stable
        @Deprecated
        public static float i(@l Density density0, long v) {
            return a.g(density0, v);
        }

        @Stable
        @Deprecated
        public static float j(@l Density density0, float f) {
            return a.h(density0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect k(@l Density density0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(density0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long l(@l Density density0, long v) {
            return a.j(density0, v);
        }

        @Stable
        @Deprecated
        public static long m(@l Density density0, float f) {
            return a.k(density0, f);
        }

        @Stable
        @Deprecated
        public static long n(@l Density density0, float f) {
            return a.l(density0, f);
        }

        @Stable
        @Deprecated
        public static long o(@l Density density0, int v) {
            return a.m(density0, v);
        }
    }

    @Stable
    float C(int arg1);

    @Stable
    float D(float arg1);

    @Stable
    int E1(long arg1);

    @Stable
    @l
    Rect H0(@l DpRect arg1);

    @Stable
    long J(long arg1);

    @Stable
    long M(float arg1);

    @Stable
    int b1(float arg1);

    @Stable
    float g1(long arg1);

    float getDensity();

    @Stable
    long m(long arg1);

    @Stable
    float p(long arg1);

    @Stable
    long r(int arg1);

    @Stable
    long s(float arg1);

    float w1();

    @Stable
    float y1(float arg1);
}

