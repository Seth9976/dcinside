package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

final class zzbcv extends zzbcw {
    @Override  // com.google.android.gms.internal.ads.zzbcw
    public final String zza(@Nullable String s, String s1) {
        String s2 = zzbcv.zzb(s);
        String s3 = zzbcv.zzb(s1);
        if(TextUtils.isEmpty(s2)) {
            return s3;
        }
        return TextUtils.isEmpty(s3) ? s2 : s2 + "," + s3;
    }

    @Nullable
    private static final String zzb(@Nullable String s) {
        if(TextUtils.isEmpty(s)) {
            return s;
        }
        int v = s.length();
        int v1;
        for(v1 = 0; v1 < s.length() && s.charAt(v1) == 44; ++v1) {
        }
        while(v > 0 && s.charAt(v - 1) == 44) {
            --v;
        }
        if(v < v1) {
            return null;
        }
        if(v1 == 0) {
            return v == s.length() ? s : s.substring(0, v);
        }
        return s.substring(v1, v);
    }
}

