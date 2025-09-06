package androidx.compose.ui.graphics.drawscope;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,178:1\n37#1:179\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:179\n*E\n"})
public final class DrawTransformKt {
    public static final void a(@l DrawTransform drawTransform0, float f) {
        L.p(drawTransform0, "<this>");
        drawTransform0.h(f, f, f, f);
    }

    public static final void b(@l DrawTransform drawTransform0, float f, float f1) {
        L.p(drawTransform0, "<this>");
        drawTransform0.h(f, f1, f, f1);
    }

    public static void c(DrawTransform drawTransform0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        L.p(drawTransform0, "<this>");
        drawTransform0.h(f, f1, f, f1);
    }

    public static final void d(@l DrawTransform drawTransform0, float f, long v) {
        L.p(drawTransform0, "$this$rotateRad");
        drawTransform0.g(f * 57.29578f, v);
    }

    public static void e(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawTransform0.I();
        }
        L.p(drawTransform0, "$this$rotateRad");
        drawTransform0.g(f * 57.29578f, v);
    }

    public static final void f(@l DrawTransform drawTransform0, float f, long v) {
        L.p(drawTransform0, "$this$scale");
        drawTransform0.f(f, f, v);
    }

    public static void g(DrawTransform drawTransform0, float f, long v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawTransform0.I();
        }
        L.p(drawTransform0, "$this$scale");
        drawTransform0.f(f, f, v);
    }
}

