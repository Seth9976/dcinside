package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface ContentDrawScope extends DrawScope {
    public static final class DefaultImpls {
        @Deprecated
        public static void a(@l ContentDrawScope contentDrawScope0, @l ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v4, int v5) {
            L.p(imageBitmap0, "image");
            L.p(drawStyle0, "style");
            b.a(contentDrawScope0, imageBitmap0, v, v1, v2, v3, f, drawStyle0, colorFilter0, v4, v5);
        }

        @Deprecated
        public static long b(@l ContentDrawScope contentDrawScope0) {
            return b.b(contentDrawScope0);
        }

        @Deprecated
        public static long c(@l ContentDrawScope contentDrawScope0) {
            return b.c(contentDrawScope0);
        }

        @Stable
        @Deprecated
        public static int d(@l ContentDrawScope contentDrawScope0, long v) {
            return a.a(contentDrawScope0, v);
        }

        @Stable
        @Deprecated
        public static int e(@l ContentDrawScope contentDrawScope0, float f) {
            return a.b(contentDrawScope0, f);
        }

        @Stable
        @Deprecated
        public static float f(@l ContentDrawScope contentDrawScope0, long v) {
            return a.c(contentDrawScope0, v);
        }

        @Stable
        @Deprecated
        public static float g(@l ContentDrawScope contentDrawScope0, float f) {
            return a.d(contentDrawScope0, f);
        }

        @Stable
        @Deprecated
        public static float h(@l ContentDrawScope contentDrawScope0, int v) {
            return a.e(contentDrawScope0, v);
        }

        @Stable
        @Deprecated
        public static long i(@l ContentDrawScope contentDrawScope0, long v) {
            return a.f(contentDrawScope0, v);
        }

        @Stable
        @Deprecated
        public static float j(@l ContentDrawScope contentDrawScope0, long v) {
            return a.g(contentDrawScope0, v);
        }

        @Stable
        @Deprecated
        public static float k(@l ContentDrawScope contentDrawScope0, float f) {
            return a.h(contentDrawScope0, f);
        }

        @Stable
        @Deprecated
        @l
        public static Rect l(@l ContentDrawScope contentDrawScope0, @l DpRect dpRect0) {
            L.p(dpRect0, "$receiver");
            return a.i(contentDrawScope0, dpRect0);
        }

        @Stable
        @Deprecated
        public static long m(@l ContentDrawScope contentDrawScope0, long v) {
            return a.j(contentDrawScope0, v);
        }

        @Stable
        @Deprecated
        public static long n(@l ContentDrawScope contentDrawScope0, float f) {
            return a.k(contentDrawScope0, f);
        }

        @Stable
        @Deprecated
        public static long o(@l ContentDrawScope contentDrawScope0, float f) {
            return a.l(contentDrawScope0, f);
        }

        @Stable
        @Deprecated
        public static long p(@l ContentDrawScope contentDrawScope0, int v) {
            return a.m(contentDrawScope0, v);
        }
    }

    void Q0();
}

