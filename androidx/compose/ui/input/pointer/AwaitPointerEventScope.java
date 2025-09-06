package androidx.compose.ui.input.pointer;

import A3.o;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@j
public interface AwaitPointerEventScope extends Density {
    public static final class DefaultImpls {
        public static Object a(AwaitPointerEventScope awaitPointerEventScope0, PointerEventPass pointerEventPass0, d d0, int v, Object object0) {
            return b.t(awaitPointerEventScope0, pointerEventPass0, d0, v, object0);
        }

        @Deprecated
        public static long b(@l AwaitPointerEventScope awaitPointerEventScope0) {
            return b.a(awaitPointerEventScope0);
        }

        @Stable
        @Deprecated
        public static int c(@l AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return a.a(awaitPointerEventScope0, v);
        }

        @Stable
        @Deprecated
        public static int d(@l AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return a.b(awaitPointerEventScope0, f);
        }

        @Stable
        @Deprecated
        public static float e(@l AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return a.c(awaitPointerEventScope0, v);
        }

        @Stable
        @Deprecated
        public static float f(@l AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return a.d(awaitPointerEventScope0, f);
        }

        @Stable
        @Deprecated
        public static float g(@l AwaitPointerEventScope awaitPointerEventScope0, int v) {
            return a.e(awaitPointerEventScope0, v);
        }

        @Stable
        @Deprecated
        public static long h(@l AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return a.f(awaitPointerEventScope0, v);
        }

        @Stable
        @Deprecated
        public static float i(@l AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return a.g(awaitPointerEventScope0, v);
        }

        @Stable
        @Deprecated
        public static float j(@l AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return a.h(awaitPointerEventScope0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect k(@l AwaitPointerEventScope awaitPointerEventScope0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(awaitPointerEventScope0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long l(@l AwaitPointerEventScope awaitPointerEventScope0, long v) {
            return a.j(awaitPointerEventScope0, v);
        }

        @Stable
        @Deprecated
        public static long m(@l AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return a.k(awaitPointerEventScope0, f);
        }

        @Stable
        @Deprecated
        public static long n(@l AwaitPointerEventScope awaitPointerEventScope0, float f) {
            return a.l(awaitPointerEventScope0, f);
        }

        @Stable
        @Deprecated
        public static long o(@l AwaitPointerEventScope awaitPointerEventScope0, int v) {
            return a.m(awaitPointerEventScope0, v);
        }

        @Deprecated
        @m
        public static Object p(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l o o0, @l d d0) {
            return b.b(awaitPointerEventScope0, v, o0, d0);
        }

        @Deprecated
        @m
        public static Object q(@l AwaitPointerEventScope awaitPointerEventScope0, long v, @l o o0, @l d d0) {
            return b.c(awaitPointerEventScope0, v, o0, d0);
        }
    }

    @m
    Object N0(long arg1, @l o arg2, @l d arg3);

    long S();

    long a();

    @l
    ViewConfiguration getViewConfiguration();

    @m
    Object k0(long arg1, @l o arg2, @l d arg3);

    @m
    Object l1(@l PointerEventPass arg1, @l d arg2);

    @l
    PointerEvent m1();
}

