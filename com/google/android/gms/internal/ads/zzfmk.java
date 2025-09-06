package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzfmk {
    // 去混淆评级： 低(30)
    public static void zza() {
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public static void zzb(String s, String s1) {
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException(s1);
        }
    }

    public static void zzc(Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException(s);
        }
    }

    public static void zzd(String s, int v, String s1) {
        if(s.length() > 0x100) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
    }
}

