package androidx.compose.ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.L;
import y4.l;

public final class PaintExtensionsKt {
    private static final void a(Rect rect0, Rect rect1) {
        rect0.right += rect1.width();
        rect0.top = Math.min(rect0.top, rect1.top);
        rect0.bottom = Math.max(rect0.bottom, rect1.bottom);
    }

    private static final void b(Paint paint0, CharSequence charSequence0, int v, int v1, Rect rect0) {
        if(Build.VERSION.SDK_INT >= 29) {
            Paint29.a(paint0, charSequence0, v, v1, rect0);
            return;
        }
        paint0.getTextBounds(charSequence0.toString(), v, v1, rect0);
    }

    @l
    public static final Rect c(@l TextPaint textPaint0, @l CharSequence charSequence0, int v, int v1) {
        L.p(textPaint0, "<this>");
        L.p(charSequence0, "text");
        if(charSequence0 instanceof Spanned) {
            Class class0 = MetricAffectingSpan.class;
            if(SpannedExtensionsKt.b(((Spanned)charSequence0), class0, v, v1)) {
                Rect rect0 = new Rect();
                Rect rect1 = new Rect();
                TextPaint textPaint1 = new TextPaint();
                while(v < v1) {
                    int v2 = ((Spanned)charSequence0).nextSpanTransition(v, v1, class0);
                    MetricAffectingSpan[] arr_metricAffectingSpan = (MetricAffectingSpan[])((Spanned)charSequence0).getSpans(v, v2, class0);
                    textPaint1.set(textPaint0);
                    L.o(arr_metricAffectingSpan, "spans");
                    for(int v3 = 0; v3 < arr_metricAffectingSpan.length; ++v3) {
                        MetricAffectingSpan metricAffectingSpan0 = arr_metricAffectingSpan[v3];
                        if(((Spanned)charSequence0).getSpanStart(metricAffectingSpan0) != ((Spanned)charSequence0).getSpanEnd(metricAffectingSpan0)) {
                            metricAffectingSpan0.updateMeasureState(textPaint1);
                        }
                    }
                    PaintExtensionsKt.b(textPaint1, charSequence0, v, v2, rect1);
                    PaintExtensionsKt.a(rect0, rect1);
                    v = v2;
                }
                return rect0;
            }
        }
        return PaintExtensionsKt.d(textPaint0, charSequence0, v, v1);
    }

    @VisibleForTesting
    @l
    public static final Rect d(@l Paint paint0, @l CharSequence charSequence0, int v, int v1) {
        L.p(paint0, "<this>");
        L.p(charSequence0, "text");
        Rect rect0 = new Rect();
        PaintExtensionsKt.b(paint0, charSequence0, v, v1, rect0);
        return rect0;
    }
}

