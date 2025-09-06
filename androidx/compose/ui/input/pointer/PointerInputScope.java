package androidx.compose.ui.input.pointer;

import A3.o;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface PointerInputScope extends Density {
    public static final class DefaultImpls {
        @Deprecated
        public static long a(@l PointerInputScope pointerInputScope0) {
            return f.a(pointerInputScope0);
        }

        @Deprecated
        public static boolean b(@l PointerInputScope pointerInputScope0) {
            return f.e(pointerInputScope0);
        }

        public static void c() {
        }

        @Stable
        @Deprecated
        public static int d(@l PointerInputScope pointerInputScope0, long v) {
            return a.a(pointerInputScope0, v);
        }

        @Stable
        @Deprecated
        public static int e(@l PointerInputScope pointerInputScope0, float f) {
            return a.b(pointerInputScope0, f);
        }

        @Deprecated
        public static void f(@l PointerInputScope pointerInputScope0, boolean z) {
        }

        @Stable
        @Deprecated
        public static float g(@l PointerInputScope pointerInputScope0, long v) {
            return a.c(pointerInputScope0, v);
        }

        @Stable
        @Deprecated
        public static float h(@l PointerInputScope pointerInputScope0, float f) {
            return a.d(pointerInputScope0, f);
        }

        @Stable
        @Deprecated
        public static float i(@l PointerInputScope pointerInputScope0, int v) {
            return a.e(pointerInputScope0, v);
        }

        @Stable
        @Deprecated
        public static long j(@l PointerInputScope pointerInputScope0, long v) {
            return a.f(pointerInputScope0, v);
        }

        @Stable
        @Deprecated
        public static float k(@l PointerInputScope pointerInputScope0, long v) {
            return a.g(pointerInputScope0, v);
        }

        @Stable
        @Deprecated
        public static float l(@l PointerInputScope pointerInputScope0, float f) {
            return a.h(pointerInputScope0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect m(@l PointerInputScope pointerInputScope0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(pointerInputScope0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long n(@l PointerInputScope pointerInputScope0, long v) {
            return a.j(pointerInputScope0, v);
        }

        @Stable
        @Deprecated
        public static long o(@l PointerInputScope pointerInputScope0, float f) {
            return a.k(pointerInputScope0, f);
        }

        @Stable
        @Deprecated
        public static long p(@l PointerInputScope pointerInputScope0, float f) {
            return a.l(pointerInputScope0, f);
        }

        @Stable
        @Deprecated
        public static long q(@l PointerInputScope pointerInputScope0, int v) {
            return a.m(pointerInputScope0, v);
        }
    }

    boolean A1();

    @m
    Object R0(@l o arg1, @l d arg2);

    long S();

    long a();

    @l
    ViewConfiguration getViewConfiguration();

    void j1(boolean arg1);
}

