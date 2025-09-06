package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import kotlin.J;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ShapeContainingUtilKt {
    private static final boolean a(RoundRect roundRect0) {
        return CornerRadius.m(roundRect0.t()) + CornerRadius.m(roundRect0.u()) <= roundRect0.v() && CornerRadius.m(roundRect0.n()) + CornerRadius.m(roundRect0.o()) <= roundRect0.v() && CornerRadius.o(roundRect0.t()) + CornerRadius.o(roundRect0.n()) <= roundRect0.p() && CornerRadius.o(roundRect0.u()) + CornerRadius.o(roundRect0.o()) <= roundRect0.p();
    }

    public static final boolean b(@l Outline outline0, float f, float f1, @m Path path0, @m Path path1) {
        L.p(outline0, "outline");
        if(outline0 instanceof Rectangle) {
            return ShapeContainingUtilKt.e(((Rectangle)outline0).b(), f, f1);
        }
        if(outline0 instanceof Rounded) {
            return ShapeContainingUtilKt.f(((Rounded)outline0), f, f1, path0, path1);
        }
        if(!(outline0 instanceof Generic)) {
            throw new J();
        }
        return ShapeContainingUtilKt.d(((Generic)outline0).b(), f, f1, path0, path1);
    }

    public static boolean c(Outline outline0, float f, float f1, Path path0, Path path1, int v, Object object0) {
        if((v & 8) != 0) {
            path0 = null;
        }
        if((v & 16) != 0) {
            path1 = null;
        }
        return ShapeContainingUtilKt.b(outline0, f, f1, path0, path1);
    }

    private static final boolean d(Path path0, float f, float f1, Path path1, Path path2) {
        Rect rect0 = new Rect(f - 0.005f, f1 - 0.005f, f + 0.005f, f1 + 0.005f);
        if(path1 == null) {
            path1 = AndroidPath_androidKt.a();
        }
        path1.r(rect0);
        if(path2 == null) {
            path2 = AndroidPath_androidKt.a();
        }
        path2.t(path0, path1, 1);
        path2.reset();
        path1.reset();
        return !path2.isEmpty();
    }

    private static final boolean e(Rect rect0, float f, float f1) {
        return rect0.t() <= f && f < rect0.x() && rect0.B() <= f1 && f1 < rect0.j();
    }

    private static final boolean f(Rounded outline$Rounded0, float f, float f1, Path path0, Path path1) {
        RoundRect roundRect0 = outline$Rounded0.b();
        if(f >= roundRect0.q() && f < roundRect0.r() && f1 >= roundRect0.s() && f1 < roundRect0.m()) {
            if(!ShapeContainingUtilKt.a(roundRect0)) {
                Path path2 = path1 == null ? AndroidPath_androidKt.a() : path1;
                path2.j(roundRect0);
                return ShapeContainingUtilKt.d(path2, f, f1, path0, path1);
            }
            float f2 = CornerRadius.m(roundRect0.t()) + roundRect0.q();
            float f3 = CornerRadius.o(roundRect0.t()) + roundRect0.s();
            float f4 = roundRect0.r() - CornerRadius.m(roundRect0.u());
            float f5 = CornerRadius.o(roundRect0.u()) + roundRect0.s();
            float f6 = roundRect0.r() - CornerRadius.m(roundRect0.o());
            float f7 = roundRect0.m() - CornerRadius.o(roundRect0.o());
            float f8 = roundRect0.m() - CornerRadius.o(roundRect0.n());
            float f9 = CornerRadius.m(roundRect0.n()) + roundRect0.q();
            if(f < f2 && f1 < f3) {
                return ShapeContainingUtilKt.g(f, f1, roundRect0.t(), f2, f3);
            }
            if(f < f9 && f1 > f8) {
                return ShapeContainingUtilKt.g(f, f1, roundRect0.n(), f9, f8);
            }
            if(f > f4 && f1 < f5) {
                return ShapeContainingUtilKt.g(f, f1, roundRect0.u(), f4, f5);
            }
            return f <= f6 || f1 <= f7 ? true : ShapeContainingUtilKt.g(f, f1, roundRect0.o(), f6, f7);
        }
        return false;
    }

    private static final boolean g(float f, float f1, long v, float f2, float f3) {
        float f4 = CornerRadius.m(v);
        float f5 = CornerRadius.o(v);
        return (f - f2) * (f - f2) / (f4 * f4) + (f1 - f3) * (f1 - f3) / (f5 * f5) <= 1.0f;
    }
}

