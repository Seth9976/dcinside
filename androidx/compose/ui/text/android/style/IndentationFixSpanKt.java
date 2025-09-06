package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout.Alignment;
import android.text.Layout;
import androidx.compose.ui.text.android.TextLayoutKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class IndentationFixSpanKt {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[Layout.Alignment.values().length];
            try {
                arr_v[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
        }
    }

    @l
    private static final String a = "…";

    public static final float a(@l Layout layout0, int v, @l Paint paint0) {
        L.p(layout0, "<this>");
        L.p(paint0, "paint");
        float f = layout0.getLineLeft(v);
        if(TextLayoutKt.k(layout0, v) && layout0.getParagraphDirection(v) == 1 && f < 0.0f) {
            float f1 = layout0.getPrimaryHorizontal(layout0.getLineStart(v) + layout0.getEllipsisStart(v)) - f + paint0.measureText("…");
            Layout.Alignment layout$Alignment0 = layout0.getParagraphAlignment(v);
            return (layout$Alignment0 == null ? -1 : WhenMappings.a[layout$Alignment0.ordinal()]) == 1 ? Math.abs(f) + (((float)layout0.getWidth()) - f1) / 2.0f : Math.abs(f) + (((float)layout0.getWidth()) - f1);
        }
        return 0.0f;
    }

    public static float b(Layout layout0, int v, Paint paint0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            paint0 = layout0.getPaint();
            L.o(paint0, "this.paint");
        }
        return IndentationFixSpanKt.a(layout0, v, paint0);
    }

    public static final float c(@l Layout layout0, int v, @l Paint paint0) {
        int v1 = -1;
        L.p(layout0, "<this>");
        L.p(paint0, "paint");
        if(TextLayoutKt.k(layout0, v) && layout0.getParagraphDirection(v) == -1 && ((float)layout0.getWidth()) < layout0.getLineRight(v)) {
            float f = layout0.getPrimaryHorizontal(layout0.getLineStart(v) + layout0.getEllipsisStart(v));
            float f1 = layout0.getLineRight(v) - f + paint0.measureText("…");
            Layout.Alignment layout$Alignment0 = layout0.getParagraphAlignment(v);
            if(layout$Alignment0 != null) {
                v1 = WhenMappings.a[layout$Alignment0.ordinal()];
            }
            return v1 == 1 ? ((float)layout0.getWidth()) - layout0.getLineRight(v) - (((float)layout0.getWidth()) - f1) / 2.0f : ((float)layout0.getWidth()) - layout0.getLineRight(v) - (((float)layout0.getWidth()) - f1);
        }
        return 0.0f;
    }

    public static float d(Layout layout0, int v, Paint paint0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            paint0 = layout0.getPaint();
            L.o(paint0, "this.paint");
        }
        return IndentationFixSpanKt.c(layout0, v, paint0);
    }
}

