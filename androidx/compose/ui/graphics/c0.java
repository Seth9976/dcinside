package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class c0 {
    public static void a(Canvas canvas0, @l Rect rect0, int v) {
        L.p(rect0, "rect");
        canvas0.a(rect0.t(), rect0.B(), rect0.x(), rect0.j(), v);
    }

    public static void b(Canvas canvas0, @l Rect rect0, float f, float f1, boolean z, @l Paint paint0) {
        L.p(rect0, "rect");
        L.p(paint0, "paint");
        canvas0.l(rect0.t(), rect0.B(), rect0.x(), rect0.j(), f, f1, z, paint0);
    }

    public static void c(Canvas canvas0, @l Rect rect0, float f, float f1, boolean z, @l Paint paint0) {
        L.p(rect0, "rect");
        L.p(paint0, "paint");
        canvas0.k(rect0, f * 57.29578f, f1 * 57.29578f, z, paint0);
    }

    public static void d(Canvas canvas0, @l Rect rect0, @l Paint paint0) {
        L.p(rect0, "rect");
        L.p(paint0, "paint");
        canvas0.t(rect0.t(), rect0.B(), rect0.x(), rect0.j(), paint0);
    }

    public static void e(Canvas canvas0, @l Rect rect0, @l Paint paint0) {
        L.p(rect0, "rect");
        L.p(paint0, "paint");
        canvas0.s(rect0.t(), rect0.B(), rect0.x(), rect0.j(), paint0);
    }

    public static void f(Canvas canvas0, float f, float f1) {
        canvas0.B(f * 57.29578f, f1 * 57.29578f);
    }

    public static void m(Canvas canvas0, Path path0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if((v1 & 2) != 0) {
            v = 1;
        }
        canvas0.e(path0, v);
    }

    public static void n(Canvas canvas0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        canvas0.a(f, f1, f2, f3, v);
    }

    public static void o(Canvas canvas0, Rect rect0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if((v1 & 2) != 0) {
            v = 1;
        }
        canvas0.p(rect0, v);
    }

    public static void p(Canvas canvas0, ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, Paint paint0, int v4, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long v5 = (v4 & 4) == 0 ? v1 : IntSizeKt.a(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        canvas0.h(imageBitmap0, ((v4 & 2) == 0 ? v : 0L), v5, ((v4 & 8) == 0 ? v2 : 0L), ((v4 & 16) == 0 ? v3 : v5), paint0);
    }

    public static void q(Canvas canvas0, float f, float f1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if((v & 2) != 0) {
            f1 = f;
        }
        canvas0.r(f, f1);
    }
}

