package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle.Unspecified;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class TextPainter {
    @l
    public static final TextPainter a;
    public static final int b;

    static {
        TextPainter.a = new TextPainter();
    }

    public final void a(@l Canvas canvas0, @l TextLayoutResult textLayoutResult0) {
        L.p(canvas0, "canvas");
        L.p(textLayoutResult0, "textLayoutResult");
        boolean z = textLayoutResult0.i() && !TextOverflow.g(textLayoutResult0.l().h(), 3);
        if(z) {
            Rect rect0 = RectKt.c(0L, SizeKt.a(((int)(textLayoutResult0.B() >> 0x20)), ((int)(textLayoutResult0.B() & 0xFFFFFFFFL))));
            canvas0.f();
            c0.o(canvas0, rect0, 0, 2, null);
        }
        SpanStyle spanStyle0 = textLayoutResult0.l().m().J();
        TextDecoration textDecoration0 = spanStyle0.B();
        if(textDecoration0 == null) {
            textDecoration0 = TextDecoration.b.d();
        }
        Shadow shadow0 = spanStyle0.A() == null ? Shadow.d.a() : spanStyle0.A();
        DrawStyle drawStyle0 = spanStyle0.p();
        if(drawStyle0 == null) {
            drawStyle0 = Fill.a;
        }
        try {
            Brush brush0 = spanStyle0.m();
            if(brush0 == null) {
                MultiParagraph.I(textLayoutResult0.w(), canvas0, (spanStyle0.C() == Unspecified.b ? 0xFF00000000000000L : spanStyle0.C().a()), shadow0, textDecoration0, drawStyle0, 0, 0x20, null);
            }
            else {
                MultiParagraph.M(textLayoutResult0.w(), canvas0, brush0, (spanStyle0.C() == Unspecified.b ? 1.0f : spanStyle0.C().i()), shadow0, textDecoration0, drawStyle0, 0, 0x40, null);
            }
        }
        finally {
            if(z) {
                canvas0.v();
            }
        }
    }
}

