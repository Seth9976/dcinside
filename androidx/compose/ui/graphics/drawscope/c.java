package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;

public final class c {
    public static long a(DrawTransform drawTransform0) {
        return OffsetKt.a(Size.t(drawTransform0.b()) / 2.0f, Size.m(drawTransform0.b()) / 2.0f);
    }

    public static void c(DrawTransform drawTransform0, Path path0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if((v1 & 2) != 0) {
            v = 1;
        }
        drawTransform0.e(path0, v);
    }

    public static void d(DrawTransform drawTransform0, float f, float f1, float f2, float f3, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if((v1 & 1) != 0) {
            f = 0.0f;
        }
        if((v1 & 2) != 0) {
            f1 = 0.0f;
        }
        if((v1 & 4) != 0) {
            f2 = Size.t(drawTransform0.b());
        }
        if((v1 & 8) != 0) {
            f3 = Size.m(drawTransform0.b());
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        drawTransform0.a(f, f1, f2, f3, v);
    }

    public static void e(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
        }
        if((v1 & 2) != 0) {
            v = drawTransform0.I();
        }
        drawTransform0.g(f, v);
    }

    public static void f(DrawTransform drawTransform0, float f, float f1, long v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
        }
        if((v1 & 4) != 0) {
            v = drawTransform0.I();
        }
        drawTransform0.f(f, f1, v);
    }

    public static void g(DrawTransform drawTransform0, float f, float f1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        drawTransform0.c(f, f1);
    }
}

