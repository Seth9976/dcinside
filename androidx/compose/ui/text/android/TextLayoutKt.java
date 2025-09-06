package androidx.compose.ui.text.android;

import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,1035:1\n26#2:1036\n26#2:1037\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n*L\n1027#1:1036\n1031#1:1037\n*E\n"})
public final class TextLayoutKt {
    @l
    private static final TextAndroidCanvas a;
    @l
    private static final V b;

    static {
        TextLayoutKt.a = new TextAndroidCanvas();
        TextLayoutKt.b = new V(0, 0);
    }

    private static final V f(TextLayout textLayout0, TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0, LineHeightStyleSpan[] arr_lineHeightStyleSpan) {
        int v = textLayout0.q();
        if(textLayout0.j().getLineStart(v - 1) == textLayout0.j().getLineEnd(v - 1) && arr_lineHeightStyleSpan.length != 0) {
            SpannableString spannableString0 = new SpannableString("​");
            LineHeightStyleSpan lineHeightStyleSpan0 = (LineHeightStyleSpan)kotlin.collections.l.Rb(arr_lineHeightStyleSpan);
            spannableString0.setSpan(lineHeightStyleSpan0.b(0, spannableString0.length(), (v - 1 == 0 || !lineHeightStyleSpan0.g() ? lineHeightStyleSpan0.g() : false)), 0, spannableString0.length(), 33);
            int v1 = spannableString0.length();
            StaticLayout staticLayout0 = StaticLayoutFactory.b(StaticLayoutFactory.a, spannableString0, 0, v1, textPaint0, 0x7FFFFFFF, textDirectionHeuristic0, null, 0, null, 0, 0.0f, 0.0f, 0, textLayout0.i(), textLayout0.f(), 0, 0, 0, 0, null, null, 0x1F9FC0, null);
            Paint.FontMetricsInt paint$FontMetricsInt0 = new Paint.FontMetricsInt();
            paint$FontMetricsInt0.ascent = staticLayout0.getLineAscent(0);
            paint$FontMetricsInt0.descent = staticLayout0.getLineDescent(0);
            paint$FontMetricsInt0.top = staticLayout0.getLineTop(0);
            int v2 = staticLayout0.getLineBottom(0);
            paint$FontMetricsInt0.bottom = v2;
            return new V(paint$FontMetricsInt0, ((int)(v2 - ((int)textLayout0.x(v - 1)))));
        }
        return new V(null, 0);
    }

    private static final V g(TextLayout textLayout0, LineHeightStyleSpan[] arr_lineHeightStyleSpan) {
        int v1 = 0;
        int v2 = 0;
        for(int v = 0; v < arr_lineHeightStyleSpan.length; ++v) {
            LineHeightStyleSpan lineHeightStyleSpan0 = arr_lineHeightStyleSpan[v];
            if(lineHeightStyleSpan0.d() < 0) {
                v1 = Math.max(v1, Math.abs(lineHeightStyleSpan0.d()));
            }
            if(lineHeightStyleSpan0.e() < 0) {
                v2 = Math.max(v1, Math.abs(lineHeightStyleSpan0.e()));
            }
        }
        return v1 != 0 || v2 != 0 ? new V(v1, v2) : TextLayoutKt.b;
    }

    private static final LineHeightStyleSpan[] h(TextLayout textLayout0) {
        if(!(textLayout0.N() instanceof Spanned)) {
            return new LineHeightStyleSpan[0];
        }
        CharSequence charSequence0 = textLayout0.N();
        L.n(charSequence0, "null cannot be cast to non-null type android.text.Spanned");
        LineHeightStyleSpan[] arr_lineHeightStyleSpan = (LineHeightStyleSpan[])((Spanned)charSequence0).getSpans(0, textLayout0.N().length(), LineHeightStyleSpan.class);
        L.o(arr_lineHeightStyleSpan, "lineHeightStyleSpans");
        return arr_lineHeightStyleSpan.length == 0 ? new LineHeightStyleSpan[0] : arr_lineHeightStyleSpan;
    }

    @l
    public static final TextDirectionHeuristic i(int v) {
        TextDirectionHeuristic textDirectionHeuristic0;
        switch(v) {
            case 0: {
                textDirectionHeuristic0 = TextDirectionHeuristics.LTR;
                L.o(textDirectionHeuristic0, "LTR");
                return textDirectionHeuristic0;
            }
            case 1: {
                textDirectionHeuristic0 = TextDirectionHeuristics.RTL;
                L.o(textDirectionHeuristic0, "RTL");
                return textDirectionHeuristic0;
            }
            case 2: {
                textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                L.o(textDirectionHeuristic0, "FIRSTSTRONG_LTR");
                return textDirectionHeuristic0;
            }
            case 3: {
                textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                L.o(textDirectionHeuristic0, "FIRSTSTRONG_RTL");
                return textDirectionHeuristic0;
            }
            case 4: {
                textDirectionHeuristic0 = TextDirectionHeuristics.ANYRTL_LTR;
                L.o(textDirectionHeuristic0, "ANYRTL_LTR");
                return textDirectionHeuristic0;
            }
            case 5: {
                textDirectionHeuristic0 = TextDirectionHeuristics.LOCALE;
                L.o(textDirectionHeuristic0, "LOCALE");
                return textDirectionHeuristic0;
            }
            default: {
                textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                L.o(textDirectionHeuristic0, "FIRSTSTRONG_LTR");
                return textDirectionHeuristic0;
            }
        }
    }

    private static final V j(TextLayout textLayout0) {
        if(!textLayout0.i() && !textLayout0.Q()) {
            TextPaint textPaint0 = textLayout0.j().getPaint();
            CharSequence charSequence0 = textLayout0.j().getText();
            L.o(textPaint0, "paint");
            L.o(charSequence0, "text");
            Rect rect0 = PaintExtensionsKt.c(textPaint0, charSequence0, textLayout0.j().getLineStart(0), textLayout0.j().getLineEnd(0));
            int v = textLayout0.j().getLineAscent(0);
            int v1 = rect0.top;
            int v2 = v1 >= v ? textLayout0.j().getTopPadding() : v - v1;
            if(textLayout0.q() != 1) {
                int v3 = textLayout0.q();
                rect0 = PaintExtensionsKt.c(textPaint0, charSequence0, textLayout0.j().getLineStart(v3 - 1), textLayout0.j().getLineEnd(v3 - 1));
            }
            int v4 = textLayout0.j().getLineDescent(textLayout0.q() - 1);
            int v5 = rect0.bottom;
            int v6 = v5 <= v4 ? textLayout0.j().getBottomPadding() : v5 - v4;
            return v2 != 0 || v6 != 0 ? new V(v2, v6) : TextLayoutKt.b;
        }
        return new V(0, 0);
    }

    public static final boolean k(@l Layout layout0, int v) {
        L.p(layout0, "<this>");
        return layout0.getEllipsisCount(v) > 0;
    }
}

