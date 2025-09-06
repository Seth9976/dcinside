package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzbce {
    @Nullable
    public static final SharedPreferences zza(Context context0) {
        try {
            return context0.getSharedPreferences("google_ads_flags", 0);
        }
        catch(IllegalStateException illegalStateException0) {
            zzo.zzk("", illegalStateException0);
            return null;
        }
    }
}

