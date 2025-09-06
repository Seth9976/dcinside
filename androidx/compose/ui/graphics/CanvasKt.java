package androidx.compose.ui.graphics;

import A3.a;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.internal.L;
import y4.l;

public final class CanvasKt {
    @l
    public static final Canvas a(@l ImageBitmap imageBitmap0) {
        L.p(imageBitmap0, "image");
        return AndroidCanvas_androidKt.a(imageBitmap0);
    }

    public static final void b(@l Canvas canvas0, float f, float f1, float f2) {
        L.p(canvas0, "<this>");
        if(f == 0.0f) {
            return;
        }
        canvas0.c(f1, f2);
        canvas0.A(f);
        canvas0.c(-f1, -f2);
    }

    public static final void c(@l Canvas canvas0, float f, float f1, float f2) {
        L.p(canvas0, "<this>");
        CanvasKt.b(canvas0, f * 57.29578f, f1, f2);
    }

    public static void d(Canvas canvas0, float f, float f1, float f2, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        CanvasKt.c(canvas0, f, f1, f2);
    }

    public static final void e(@l Canvas canvas0, float f, float f1, float f2, float f3) {
        L.p(canvas0, "<this>");
        if(f == 1.0f && f1 == 1.0f) {
            return;
        }
        canvas0.c(f2, f3);
        canvas0.r(f, f1);
        canvas0.c(-f2, -f3);
    }

    public static void f(Canvas canvas0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 2) != 0) {
            f1 = f;
        }
        CanvasKt.e(canvas0, f, f1, f2, f3);
    }

    public static final void g(@l Canvas canvas0, @l a a0) {
        L.p(canvas0, "<this>");
        L.p(a0, "block");
        try {
            canvas0.f();
            a0.invoke();
        }
        finally {
            canvas0.v();
        }
    }

    public static final void h(@l Canvas canvas0, @l Rect rect0, @l Paint paint0, @l a a0) {
        L.p(canvas0, "<this>");
        L.p(rect0, "bounds");
        L.p(paint0, "paint");
        L.p(a0, "block");
        try {
            canvas0.m(rect0, paint0);
            a0.invoke();
        }
        finally {
            canvas0.v();
        }
    }
}

