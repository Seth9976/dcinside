package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface PressGestureScope extends Density {
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        public static int a(@l PressGestureScope pressGestureScope0, long v) {
            return a.a(pressGestureScope0, v);
        }

        @Stable
        @Deprecated
        public static int b(@l PressGestureScope pressGestureScope0, float f) {
            return a.b(pressGestureScope0, f);
        }

        @Stable
        @Deprecated
        public static float c(@l PressGestureScope pressGestureScope0, long v) {
            return a.c(pressGestureScope0, v);
        }

        @Stable
        @Deprecated
        public static float d(@l PressGestureScope pressGestureScope0, float f) {
            return a.d(pressGestureScope0, f);
        }

        @Stable
        @Deprecated
        public static float e(@l PressGestureScope pressGestureScope0, int v) {
            return a.e(pressGestureScope0, v);
        }

        @Stable
        @Deprecated
        public static long f(@l PressGestureScope pressGestureScope0, long v) {
            return a.f(pressGestureScope0, v);
        }

        @Stable
        @Deprecated
        public static float g(@l PressGestureScope pressGestureScope0, long v) {
            return a.g(pressGestureScope0, v);
        }

        @Stable
        @Deprecated
        public static float h(@l PressGestureScope pressGestureScope0, float f) {
            return a.h(pressGestureScope0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect i(@l PressGestureScope pressGestureScope0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(pressGestureScope0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long j(@l PressGestureScope pressGestureScope0, long v) {
            return a.j(pressGestureScope0, v);
        }

        @Stable
        @Deprecated
        public static long k(@l PressGestureScope pressGestureScope0, float f) {
            return a.k(pressGestureScope0, f);
        }

        @Stable
        @Deprecated
        public static long l(@l PressGestureScope pressGestureScope0, float f) {
            return a.l(pressGestureScope0, f);
        }

        @Stable
        @Deprecated
        public static long m(@l PressGestureScope pressGestureScope0, int v) {
            return a.m(pressGestureScope0, v);
        }
    }

    @m
    Object e1(@l d arg1);

    @m
    Object s1(@l d arg1);
}

