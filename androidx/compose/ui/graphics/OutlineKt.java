package androidx.compose.ui.graphics;

import A3.o;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import kotlin.J;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,307:1\n245#1,16:308\n245#1,16:324\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:308,16\n195#1:324,16\n*E\n"})
public final class OutlineKt {
    public static final void b(@l Path path0, @l Outline outline0) {
        L.p(path0, "<this>");
        L.p(outline0, "outline");
        if(outline0 instanceof Rectangle) {
            path0.r(((Rectangle)outline0).b());
            return;
        }
        if(outline0 instanceof Rounded) {
            path0.j(((Rounded)outline0).b());
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new J();
        }
        h0.c(path0, ((Generic)outline0).b(), 0L, 2, null);
    }

    public static final void c(@l Canvas canvas0, @l Outline outline0, @l Paint paint0) {
        L.p(canvas0, "<this>");
        L.p(outline0, "outline");
        L.p(paint0, "paint");
        if(outline0 instanceof Rectangle) {
            canvas0.q(((Rectangle)outline0).b(), paint0);
            return;
        }
        if(outline0 instanceof Rounded) {
            Path path0 = ((Rounded)outline0).c();
            if(path0 != null) {
                canvas0.D(path0, paint0);
                return;
            }
            canvas0.F(((Rounded)outline0).b().q(), ((Rounded)outline0).b().s(), ((Rounded)outline0).b().r(), ((Rounded)outline0).b().m(), CornerRadius.m(((Rounded)outline0).b().n()), CornerRadius.o(((Rounded)outline0).b().n()), paint0);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new J();
        }
        canvas0.D(((Generic)outline0).b(), paint0);
    }

    public static final void d(@l DrawScope drawScope0, @l Outline outline0, @l Brush brush0, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v) {
        Path path0;
        L.p(drawScope0, "$this$drawOutline");
        L.p(outline0, "outline");
        L.p(brush0, "brush");
        L.p(drawStyle0, "style");
        if(outline0 instanceof Rectangle) {
            Rect rect0 = ((Rectangle)outline0).b();
            drawScope0.u0(brush0, OutlineKt.l(rect0), OutlineKt.j(rect0), f, drawStyle0, colorFilter0, v);
            return;
        }
        if(outline0 instanceof Rounded) {
            path0 = ((Rounded)outline0).c();
            if(path0 != null) {
                drawScope0.l0(path0, brush0, f, drawStyle0, colorFilter0, v);
                return;
            }
            RoundRect roundRect0 = ((Rounded)outline0).b();
            drawScope0.v1(brush0, OutlineKt.m(roundRect0), OutlineKt.k(roundRect0), CornerRadiusKt.b(CornerRadius.m(roundRect0.n()), 0.0f, 2, null), f, drawStyle0, colorFilter0, v);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new J();
        }
        path0 = ((Generic)outline0).b();
        drawScope0.l0(path0, brush0, f, drawStyle0, colorFilter0, v);
    }

    public static void e(DrawScope drawScope0, Outline outline0, Brush brush0, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v, int v1, Object object0) {
        if((v1 & 8) != 0) {
            drawStyle0 = Fill.a;
        }
        if((v1 & 16) != 0) {
            colorFilter0 = null;
        }
        if((v1 & 0x20) != 0) {
            v = 3;
        }
        OutlineKt.d(drawScope0, outline0, brush0, ((v1 & 4) == 0 ? f : 1.0f), drawStyle0, colorFilter0, v);
    }

    public static final void f(@l DrawScope drawScope0, @l Outline outline0, long v, float f, @l DrawStyle drawStyle0, @m ColorFilter colorFilter0, int v1) {
        Path path0;
        L.p(drawScope0, "$this$drawOutline");
        L.p(outline0, "outline");
        L.p(drawStyle0, "style");
        if(outline0 instanceof Rectangle) {
            Rect rect0 = ((Rectangle)outline0).b();
            drawScope0.p1(v, OutlineKt.l(rect0), OutlineKt.j(rect0), f, drawStyle0, colorFilter0, v1);
            return;
        }
        if(outline0 instanceof Rounded) {
            path0 = ((Rounded)outline0).c();
            if(path0 != null) {
                drawScope0.x0(path0, v, f, drawStyle0, colorFilter0, v1);
                return;
            }
            RoundRect roundRect0 = ((Rounded)outline0).b();
            drawScope0.f1(v, OutlineKt.m(roundRect0), OutlineKt.k(roundRect0), CornerRadiusKt.b(CornerRadius.m(roundRect0.n()), 0.0f, 2, null), drawStyle0, f, colorFilter0, v1);
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new J();
        }
        path0 = ((Generic)outline0).b();
        drawScope0.x0(path0, v, f, drawStyle0, colorFilter0, v1);
    }

    public static void g(DrawScope drawScope0, Outline outline0, long v, float f, DrawStyle drawStyle0, ColorFilter colorFilter0, int v1, int v2, Object object0) {
        DrawStyle drawStyle1 = (v2 & 8) == 0 ? drawStyle0 : Fill.a;
        OutlineKt.f(drawScope0, outline0, v, ((v2 & 4) == 0 ? f : 1.0f), drawStyle1, ((v2 & 16) == 0 ? colorFilter0 : null), ((v2 & 0x20) == 0 ? v1 : 3));
    }

    private static final void h(DrawScope drawScope0, Outline outline0, o o0, o o1, o o2) {
        if(outline0 instanceof Rectangle) {
            o0.invoke(drawScope0, ((Rectangle)outline0).b());
            return;
        }
        if(outline0 instanceof Rounded) {
            Path path0 = ((Rounded)outline0).c();
            if(path0 != null) {
                o2.invoke(drawScope0, path0);
                return;
            }
            o1.invoke(drawScope0, ((Rounded)outline0).b());
            return;
        }
        if(!(outline0 instanceof Generic)) {
            throw new J();
        }
        o2.invoke(drawScope0, ((Generic)outline0).b());
    }

    // 去混淆评级： 低(20)
    private static final boolean i(RoundRect roundRect0) {
        return CornerRadius.m(roundRect0.n()) == CornerRadius.m(roundRect0.o()) && CornerRadius.m(roundRect0.o()) == CornerRadius.m(roundRect0.u()) && CornerRadius.m(roundRect0.u()) == CornerRadius.m(roundRect0.t()) && (CornerRadius.o(roundRect0.n()) == CornerRadius.o(roundRect0.o()) && CornerRadius.o(roundRect0.o()) == CornerRadius.o(roundRect0.u()) && CornerRadius.o(roundRect0.u()) == CornerRadius.o(roundRect0.t()));
    }

    private static final long j(Rect rect0) {
        return SizeKt.a(rect0.G(), rect0.r());
    }

    private static final long k(RoundRect roundRect0) {
        return SizeKt.a(roundRect0.v(), roundRect0.p());
    }

    private static final long l(Rect rect0) {
        return OffsetKt.a(rect0.t(), rect0.B());
    }

    private static final long m(RoundRect roundRect0) {
        return OffsetKt.a(roundRect0.q(), roundRect0.s());
    }
}

