package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class SpanUtil {
    public static void a(Spannable spannable0, float f, int v, int v1, int v2) {
        RelativeSizeSpan[] arr_relativeSizeSpan = (RelativeSizeSpan[])spannable0.getSpans(v, v1, RelativeSizeSpan.class);
        for(int v3 = 0; v3 < arr_relativeSizeSpan.length; ++v3) {
            RelativeSizeSpan relativeSizeSpan0 = arr_relativeSizeSpan[v3];
            if(spannable0.getSpanStart(relativeSizeSpan0) <= v && spannable0.getSpanEnd(relativeSizeSpan0) >= v1) {
                f *= relativeSizeSpan0.getSizeChange();
            }
            SpanUtil.c(spannable0, relativeSizeSpan0, v, v1, v2);
        }
        spannable0.setSpan(new RelativeSizeSpan(f), v, v1, v2);
    }

    public static void b(Spannable spannable0, Object object0, int v, int v1, int v2) {
        Object[] arr_object = spannable0.getSpans(v, v1, object0.getClass());
        for(int v3 = 0; v3 < arr_object.length; ++v3) {
            SpanUtil.c(spannable0, arr_object[v3], v, v1, v2);
        }
        spannable0.setSpan(object0, v, v1, v2);
    }

    private static void c(Spannable spannable0, Object object0, int v, int v1, int v2) {
        if(spannable0.getSpanStart(object0) == v && spannable0.getSpanEnd(object0) == v1 && spannable0.getSpanFlags(object0) == v2) {
            spannable0.removeSpan(object0);
        }
    }
}

