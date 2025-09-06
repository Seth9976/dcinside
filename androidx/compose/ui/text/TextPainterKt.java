package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,405:1\n261#2,11:406\n261#2,11:417\n261#2,8:428\n269#2,3:439\n261#2,11:442\n652#3:436\n658#3:437\n646#3:438\n159#4:453\n159#4:454\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n171#1:406,11\n237#1:417,11\n281#1:428,8\n281#1:439,3\n344#1:442,11\n288#1:436\n301#1:437\n301#1:438\n382#1:453\n394#1:454\n*E\n"})
public final class TextPainterKt {
    private static final int a;

    static {
        TextPainterKt.a = 3;
    }

    private static final void a(DrawTransform drawTransform0, TextLayoutResult textLayoutResult0) {
        if(textLayoutResult0.i() && !TextOverflow.g(textLayoutResult0.l().h(), 3)) {
            c.d(drawTransform0, 0.0f, 0.0f, ((float)(((int)(textLayoutResult0.B() >> 0x20)))), ((float)(((int)(textLayoutResult0.B() & 0xFFFFFFFFL)))), 0, 16, null);
        }
    }

    @ExperimentalTextApi
    public static final void b(@l DrawScope drawScope0, @l TextMeasurer textMeasurer0, @l AnnotatedString annotatedString0, long v, @l TextStyle textStyle0, int v1, boolean z, int v2, @l List list0, long v3, int v4) {
        L.p(drawScope0, "$this$drawText");
        L.p(textMeasurer0, "textMeasurer");
        L.p(annotatedString0, "text");
        L.p(textStyle0, "style");
        L.p(list0, "placeholders");
        TextLayoutResult textLayoutResult0 = TextMeasurer.d(textMeasurer0, annotatedString0, textStyle0, v1, z, v2, list0, TextPainterKt.k(drawScope0, v3, v), drawScope0.getLayoutDirection(), drawScope0, null, false, 0x600, null);
        DrawContext drawContext0 = drawScope0.J0();
        long v5 = drawContext0.b();
        drawContext0.a().f();
        DrawTransform drawTransform0 = drawContext0.d();
        drawTransform0.c(Offset.p(v), Offset.r(v));
        TextPainterKt.a(drawTransform0, textLayoutResult0);
        MultiParagraph.I(textLayoutResult0.w(), drawScope0.J0().a(), 0L, null, null, null, v4, 30, null);
        drawContext0.a().v();
        drawContext0.c(v5);
    }

    // 去混淆评级： 低(40)
    public static void c(DrawScope drawScope0, TextMeasurer textMeasurer0, AnnotatedString annotatedString0, long v, TextStyle textStyle0, int v1, boolean z, int v2, List list0, long v3, int v4, int v5, Object object0) {
        TextPainterKt.b(drawScope0, textMeasurer0, annotatedString0, ((v5 & 4) == 0 ? v : 0L), ((v5 & 8) == 0 ? textStyle0 : TextStyle.d.a()), ((v5 & 16) == 0 ? v1 : 1), ((v5 & 0x20) == 0 ? z : true), ((v5 & 0x40) == 0 ? v2 : 0x7FFFFFFF), ((v5 & 0x80) == 0 ? list0 : u.H()), ((v5 & 0x100) == 0 ? v3 : 0x7FC000007FC00000L), ((v5 & 0x200) == 0 ? v4 : 3));
    }

    @ExperimentalTextApi
    public static final void d(@l DrawScope drawScope0, @l TextLayoutResult textLayoutResult0, @l Brush brush0, long v, float f, @m Shadow shadow0, @m TextDecoration textDecoration0, @m DrawStyle drawStyle0, int v1) {
        L.p(drawScope0, "$this$drawText");
        L.p(textLayoutResult0, "textLayoutResult");
        L.p(brush0, "brush");
        Shadow shadow1 = shadow0 == null ? textLayoutResult0.l().m().I() : shadow0;
        TextDecoration textDecoration1 = textDecoration0 == null ? textLayoutResult0.l().m().L() : textDecoration0;
        DrawStyle drawStyle1 = drawStyle0 == null ? textLayoutResult0.l().m().s() : drawStyle0;
        DrawContext drawContext0 = drawScope0.J0();
        long v2 = drawContext0.b();
        drawContext0.a().f();
        DrawTransform drawTransform0 = drawContext0.d();
        drawTransform0.c(Offset.p(v), Offset.r(v));
        TextPainterKt.a(drawTransform0, textLayoutResult0);
        textLayoutResult0.w().L(drawScope0.J0().a(), brush0, (Float.isNaN(f) ? textLayoutResult0.l().m().l() : f), shadow1, textDecoration1, drawStyle1, v1);
        drawContext0.a().v();
        drawContext0.c(v2);
    }

    // 去混淆评级： 低(20)
    public static void e(DrawScope drawScope0, TextLayoutResult textLayoutResult0, Brush brush0, long v, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v1, int v2, Object object0) {
        TextPainterKt.d(drawScope0, textLayoutResult0, brush0, ((v2 & 4) == 0 ? v : 0L), ((v2 & 8) == 0 ? f : NaNf), ((v2 & 16) == 0 ? shadow0 : null), ((v2 & 0x20) == 0 ? textDecoration0 : null), ((v2 & 0x40) == 0 ? drawStyle0 : null), ((v2 & 0x80) == 0 ? v1 : 3));
    }

    @ExperimentalTextApi
    public static final void f(@l DrawScope drawScope0, @l TextMeasurer textMeasurer0, @l String s, long v, @l TextStyle textStyle0, int v1, boolean z, int v2, long v3, int v4) {
        L.p(drawScope0, "$this$drawText");
        L.p(textMeasurer0, "textMeasurer");
        L.p(s, "text");
        L.p(textStyle0, "style");
        TextLayoutResult textLayoutResult0 = TextMeasurer.d(textMeasurer0, new AnnotatedString(s, null, null, 6, null), textStyle0, v1, z, v2, null, TextPainterKt.k(drawScope0, v3, v), drawScope0.getLayoutDirection(), drawScope0, null, false, 0x620, null);
        DrawContext drawContext0 = drawScope0.J0();
        long v5 = drawContext0.b();
        drawContext0.a().f();
        DrawTransform drawTransform0 = drawContext0.d();
        drawTransform0.c(Offset.p(v), Offset.r(v));
        TextPainterKt.a(drawTransform0, textLayoutResult0);
        MultiParagraph.I(textLayoutResult0.w(), drawScope0.J0().a(), 0L, null, null, null, v4, 30, null);
        drawContext0.a().v();
        drawContext0.c(v5);
    }

    // 去混淆评级： 低(40)
    public static void g(DrawScope drawScope0, TextMeasurer textMeasurer0, String s, long v, TextStyle textStyle0, int v1, boolean z, int v2, long v3, int v4, int v5, Object object0) {
        TextPainterKt.f(drawScope0, textMeasurer0, s, ((v5 & 4) == 0 ? v : 0L), ((v5 & 8) == 0 ? textStyle0 : TextStyle.d.a()), ((v5 & 16) == 0 ? v1 : 1), ((v5 & 0x20) == 0 ? z : true), ((v5 & 0x40) == 0 ? v2 : 0x7FFFFFFF), ((v5 & 0x80) == 0 ? v3 : 0x7FC000007FC00000L), ((v5 & 0x100) == 0 ? v4 : 3));
    }

    @ExperimentalTextApi
    public static final void h(@l DrawScope drawScope0, @l TextLayoutResult textLayoutResult0, long v, long v1, float f, @m Shadow shadow0, @m TextDecoration textDecoration0, @m DrawStyle drawStyle0, int v2) {
        L.p(drawScope0, "$this$drawText");
        L.p(textLayoutResult0, "textLayoutResult");
        Shadow shadow1 = shadow0 == null ? textLayoutResult0.l().m().I() : shadow0;
        TextDecoration textDecoration1 = textDecoration0 == null ? textLayoutResult0.l().m().L() : textDecoration0;
        DrawStyle drawStyle1 = drawStyle0 == null ? textLayoutResult0.l().m().s() : drawStyle0;
        DrawContext drawContext0 = drawScope0.J0();
        long v3 = drawContext0.b();
        drawContext0.a().f();
        DrawTransform drawTransform0 = drawContext0.d();
        drawTransform0.c(Offset.p(v1), Offset.r(v1));
        TextPainterKt.a(drawTransform0, textLayoutResult0);
        Brush brush0 = textLayoutResult0.l().m().p();
        if(brush0 == null || v != 16L) {
            textLayoutResult0.w().H(drawScope0.J0().a(), TextDrawStyleKt.c((v == 16L ? textLayoutResult0.l().m().r() : v), f), shadow1, textDecoration1, drawStyle1, v2);
        }
        else {
            textLayoutResult0.w().L(drawScope0.J0().a(), brush0, (Float.isNaN(f) ? textLayoutResult0.l().m().l() : f), shadow1, textDecoration1, drawStyle1, v2);
        }
        drawContext0.a().v();
        drawContext0.c(v3);
    }

    // 去混淆评级： 低(35)
    public static void i(DrawScope drawScope0, TextLayoutResult textLayoutResult0, long v, long v1, float f, Shadow shadow0, TextDecoration textDecoration0, DrawStyle drawStyle0, int v2, int v3, Object object0) {
        TextPainterKt.h(drawScope0, textLayoutResult0, ((v3 & 2) == 0 ? v : 16L), ((v3 & 4) == 0 ? v1 : 0L), ((v3 & 8) == 0 ? f : NaNf), ((v3 & 16) == 0 ? shadow0 : null), ((v3 & 0x20) == 0 ? textDecoration0 : null), ((v3 & 0x40) == 0 ? drawStyle0 : null), ((v3 & 0x80) == 0 ? v2 : 3));
    }

    public static final int j() {
        return TextPainterKt.a;
    }

    private static final long k(DrawScope drawScope0, long v, long v1) {
        int v3;
        int v2;
        if(v != 0x7FC000007FC00000L && !Float.isNaN(Size.t(v))) {
            v3 = b.L0(((float)Math.ceil(Size.t(v))));
            v2 = v3;
        }
        else {
            v2 = b.L0(((float)Math.ceil(Size.t(drawScope0.b()) - Offset.p(v1))));
            v3 = 0;
        }
        if(v == 0x7FC000007FC00000L || Float.isNaN(Size.m(v))) {
            return ConstraintsKt.a(v3, v2, 0, b.L0(((float)Math.ceil(Size.m(drawScope0.b()) - Offset.r(v1)))));
        }
        int v4 = b.L0(((float)Math.ceil(Size.m(v))));
        return ConstraintsKt.a(v3, v2, v4, v4);
    }
}

