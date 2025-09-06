package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

public final class zzcf implements Callable {
    public final Context zza;
    public final Context zzb;

    public zzcf(Context context0, Context context1) {
        this.zza = context0;
        this.zzb = context1;
    }

    @Override
    public final Object call() {
        SharedPreferences sharedPreferences0;
        Context context0 = this.zza;
        Context context1 = this.zzb;
        boolean z = false;
        if(context0 == null) {
            zze.zza("Attempting to read user agent from local cache.");
            sharedPreferences0 = context1.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        else {
            zze.zza("Attempting to read user agent from Google Play Services.");
            sharedPreferences0 = context0.getSharedPreferences("admob_user_agent", 0);
        }
        String s = sharedPreferences0.getString("user_agent", "");
        if(TextUtils.isEmpty(s)) {
            zze.zza("Reading user agent from WebSettings");
            s = WebSettings.getDefaultUserAgent(context1);
            if(z) {
                sharedPreferences0.edit().putString("user_agent", s).apply();
                zze.zza("Persisting user agent.");
            }
        }
        return s;
    }
}

