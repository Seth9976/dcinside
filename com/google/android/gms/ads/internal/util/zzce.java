package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import java.util.concurrent.Callable;

public final class zzce implements Callable {
    public final Context zza;

    public zzce(Context context0) {
        this.zza = context0;
    }

    @Override
    public final Object call() {
        Context context0 = this.zza;
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("admob_user_agent", 0);
        String s = sharedPreferences0.getString("user_agent", "");
        if(TextUtils.isEmpty(s)) {
            zze.zza("User agent is not initialized on Google Play Services. Initializing.");
            s = WebSettings.getDefaultUserAgent(context0);
            SharedPreferencesUtils.publishWorldReadableSharedPreferences(context0, sharedPreferences0.edit().putString("user_agent", s), "admob_user_agent");
            return s;
        }
        zze.zza("User agent is already initialized on Google Play Services.");
        return s;
    }
}

