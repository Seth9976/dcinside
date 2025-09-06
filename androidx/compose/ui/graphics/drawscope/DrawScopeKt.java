package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,971:1\n66#1,4:972\n261#1,11:976\n261#1,11:987\n261#1,11:998\n261#1,11:1009\n261#1,11:1020\n261#1,11:1031\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n104#1:972,4\n140#1:976,11\n157#1:987,11\n178#1:998,11\n195#1:1009,11\n221#1:1020,11\n237#1:1031,11\n*E\n"})
public final class DrawScopeKt {
    public static final void a(@l DrawScope drawScope0, @l Path path0, int v, @l Function1 function10) {
        L.p(drawScope0, "$this$clipPath");
        L.p(path0, "path");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().e(path0, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    public static void b(DrawScope drawScope0, Path path0, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 1;
        }
        L.p(drawScope0, "$this$clipPath");
        L.p(path0, "path");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v2 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().e(path0, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v2);
    }

    public static final void c(@l DrawScope drawScope0, float f, float f1, float f2, float f3, int v, @l Function1 function10) {
        L.p(drawScope0, "$this$clipRect");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().a(f, f1, f2, f3, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    public static void d(DrawScope drawScope0, float f, float f1, float f2, float f3, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 4) != 0) {
            f2 = Size.t(drawScope0.b());
        }
        if((v1 & 8) != 0) {
            f3 = Size.m(drawScope0.b());
        }
        if((v1 & 16) != 0) {
            v = 1;
        }
        L.p(drawScope0, "$this$clipRect");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v2 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().a(((v1 & 1) == 0 ? f : 0.0f), ((v1 & 2) == 0 ? f1 : 0.0f), f2, f3, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v2);
    }

    public static final void e(@l DrawScope drawScope0, @l Function1 function10) {
        L.p(drawScope0, "<this>");
        L.p(function10, "block");
        function10.invoke(drawScope0.J0().a());
    }

    public static final void f(@l DrawScope drawScope0, float f, float f1, float f2, float f3, @l Function1 function10) {
        L.p(drawScope0, "<this>");
        L.p(function10, "block");
        drawScope0.J0().d().h(f, f1, f2, f3);
        function10.invoke(drawScope0);
        drawScope0.J0().d().h(-f, -f1, -f2, -f3);
    }

    public static final void g(@l DrawScope drawScope0, float f, float f1, @l Function1 function10) {
        L.p(drawScope0, "<this>");
        L.p(function10, "block");
        drawScope0.J0().d().h(f, f1, f, f1);
        function10.invoke(drawScope0);
        drawScope0.J0().d().h(-f, -f1, -f, -f1);
    }

    public static final void h(@l DrawScope drawScope0, float f, @l Function1 function10) {
        L.p(drawScope0, "<this>");
        L.p(function10, "block");
        drawScope0.J0().d().h(f, f, f, f);
        function10.invoke(drawScope0);
        float f1 = -f;
        drawScope0.J0().d().h(f1, f1, f1, f1);
    }

    public static void i(DrawScope drawScope0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        L.p(drawScope0, "<this>");
        L.p(function10, "block");
        drawScope0.J0().d().h(f, f1, f, f1);
        function10.invoke(drawScope0);
        drawScope0.J0().d().h(-f, -f1, -f, -f1);
    }

    public static final void j(@l DrawScope drawScope0, float f, long v, @l Function1 function10) {
        L.p(drawScope0, "$this$rotate");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().g(f, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    public static void k(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.I();
        }
        L.p(drawScope0, "$this$rotate");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v2 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().g(f, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v2);
    }

    public static final void l(@l DrawScope drawScope0, float f, long v, @l Function1 function10) {
        L.p(drawScope0, "$this$rotateRad");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().g(f * 57.29578f, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    public static void m(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.I();
        }
        L.p(drawScope0, "$this$rotateRad");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v2 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().g(f * 57.29578f, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v2);
    }

    public static final void n(@l DrawScope drawScope0, float f, float f1, long v, @l Function1 function10) {
        L.p(drawScope0, "$this$scale");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().f(f, f1, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    public static void o(DrawScope drawScope0, float f, float f1, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 4) != 0) {
            v = drawScope0.I();
        }
        L.p(drawScope0, "$this$scale");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v2 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().f(f, f1, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v2);
    }

    public static final void p(@l DrawScope drawScope0, float f, long v, @l Function1 function10) {
        L.p(drawScope0, "$this$scale");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v1 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().f(f, f, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v1);
    }

    public static void q(DrawScope drawScope0, float f, long v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = drawScope0.I();
        }
        L.p(drawScope0, "$this$scale");
        L.p(function10, "block");
        DrawContext drawContext0 = drawScope0.J0();
        long v2 = drawContext0.b();
        drawContext0.a().f();
        drawContext0.d().f(f, f, v);
        function10.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v2);
    }

    public static final void r(@l DrawScope drawScope0, float f, float f1, @l Function1 function10) {
        L.p(drawScope0, "<this>");
        L.p(function10, "block");
        drawScope0.J0().d().c(f, f1);
        function10.invoke(drawScope0);
        drawScope0.J0().d().c(-f, -f1);
    }

    public static void s(DrawScope drawScope0, float f, float f1, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        L.p(drawScope0, "<this>");
        L.p(function10, "block");
        drawScope0.J0().d().c(f, f1);
        function10.invoke(drawScope0);
        drawScope0.J0().d().c(-f, -f1);
    }

    public static final void t(@l DrawScope drawScope0, @l Function1 function10, @l Function1 function11) {
        L.p(drawScope0, "<this>");
        L.p(function10, "transformBlock");
        L.p(function11, "drawBlock");
        DrawContext drawContext0 = drawScope0.J0();
        long v = drawContext0.b();
        drawContext0.a().f();
        function10.invoke(drawContext0.d());
        function11.invoke(drawScope0);
        drawContext0.a().v();
        drawContext0.c(v);
    }
}

