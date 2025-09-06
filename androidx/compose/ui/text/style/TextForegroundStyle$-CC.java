package androidx.compose.ui.text.style;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class TextForegroundStyle.-CC {
    @l
    public static TextForegroundStyle a(TextForegroundStyle textForegroundStyle0, @l TextForegroundStyle textForegroundStyle1) {
        L.p(textForegroundStyle1, "other");
        if(textForegroundStyle1 instanceof BrushStyle && textForegroundStyle0 instanceof BrushStyle) {
            return new BrushStyle(((BrushStyle)textForegroundStyle1).j(), TextDrawStyleKt.d(textForegroundStyle1.i(), new TextForegroundStyle.merge.1(textForegroundStyle0)));
        }
        if(textForegroundStyle1 instanceof BrushStyle && !(textForegroundStyle0 instanceof BrushStyle)) {
            return textForegroundStyle1;
        }
        return !(textForegroundStyle1 instanceof BrushStyle) && textForegroundStyle0 instanceof BrushStyle ? textForegroundStyle0 : textForegroundStyle1.c(new TextForegroundStyle.merge.2(textForegroundStyle0));
    }

    @l
    public static TextForegroundStyle b(TextForegroundStyle textForegroundStyle0, @l a a0) {
        L.p(a0, "other");
        return L.g(textForegroundStyle0, Unspecified.b) ? ((TextForegroundStyle)a0.invoke()) : textForegroundStyle0;
    }
}

