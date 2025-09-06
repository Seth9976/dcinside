package androidx.compose.ui.text.style;

import A3.a;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "TextDrawStyleKt")
public final class TextDrawStyleKt {
    @l
    public static final TextForegroundStyle b(@l TextForegroundStyle textForegroundStyle0, @l TextForegroundStyle textForegroundStyle1, float f) {
        L.p(textForegroundStyle0, "start");
        L.p(textForegroundStyle1, "stop");
        if(!(textForegroundStyle0 instanceof BrushStyle) && !(textForegroundStyle1 instanceof BrushStyle)) {
            long v = ColorKt.n(textForegroundStyle0.a(), textForegroundStyle1.a(), f);
            return TextForegroundStyle.a.b(v);
        }
        if(textForegroundStyle0 instanceof BrushStyle && textForegroundStyle1 instanceof BrushStyle) {
            Brush brush0 = ((BrushStyle)textForegroundStyle0).d();
            Brush brush1 = ((BrushStyle)textForegroundStyle1).d();
            float f1 = MathHelpersKt.a(textForegroundStyle0.i(), textForegroundStyle1.i(), f);
            return TextForegroundStyle.a.a(((Brush)SpanStyleKt.c(brush0, brush1, f)), f1);
        }
        return (TextForegroundStyle)SpanStyleKt.c(textForegroundStyle0, textForegroundStyle1, f);
    }

    public static final long c(long v, float f) {
        return Float.isNaN(f) || f >= 1.0f ? v : Color.w(v, Color.A(v) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    // 去混淆评级： 低(20)
    private static final float d(float f, a a0) {
        return Float.isNaN(f) ? ((Number)a0.invoke()).floatValue() : f;
    }
}

