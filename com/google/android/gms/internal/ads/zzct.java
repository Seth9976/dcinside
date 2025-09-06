package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

public final class zzct {
    public static void zza(Spannable spannable0, float f, int v, int v1, int v2) {
        RelativeSizeSpan[] arr_relativeSizeSpan = (RelativeSizeSpan[])spannable0.getSpans(v, v1, RelativeSizeSpan.class);
        for(int v3 = 0; v3 < arr_relativeSizeSpan.length; ++v3) {
            RelativeSizeSpan relativeSizeSpan0 = arr_relativeSizeSpan[v3];
            if(spannable0.getSpanStart(relativeSizeSpan0) <= v && spannable0.getSpanEnd(relativeSizeSpan0) >= v1) {
                f *= relativeSizeSpan0.getSizeChange();
            }
            zzct.zzc(spannable0, relativeSizeSpan0, v, v1, 33);
        }
        spannable0.setSpan(new RelativeSizeSpan(f), v, v1, 33);
    }

    public static void zzb(Spannable spannable0, Object object0, int v, int v1, int v2) {
        Object[] arr_object = spannable0.getSpans(v, v1, object0.getClass());
        for(int v3 = 0; v3 < arr_object.length; ++v3) {
            zzct.zzc(spannable0, arr_object[v3], v, v1, 33);
        }
        spannable0.setSpan(object0, v, v1, 33);
    }

    private static void zzc(Spannable spannable0, Object object0, int v, int v1, int v2) {
        if(spannable0.getSpanStart(object0) == v && spannable0.getSpanEnd(object0) == v1 && spannable0.getSpanFlags(object0) == 33) {
            spannable0.removeSpan(object0);
        }
    }
}

