package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbq.zzq;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzebv;
import java.io.InputStream;
import java.util.Map;

public class zzaa {
    zzaa(zzz zzz0) {
    }

    @Nullable
    public CookieManager zza(Context context0) {
        throw null;
    }

    public WebResourceResponse zzb(String s, String s1, int v, String s2, Map map0, InputStream inputStream0) {
        throw null;
    }

    public zzcff zzc(zzcex zzcex0, zzbbj zzbbj0, boolean z, @Nullable zzebv zzebv0) {
        throw null;
    }

    public boolean zzd(Activity activity0, Configuration configuration0) {
        return false;
    }

    @Nullable
    public Intent zzf(Activity activity0) {
        Intent intent0 = new Intent();
        intent0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent0.putExtra("app_package", "com.dcinside.app.android");
        intent0.putExtra("app_uid", activity0.getApplicationInfo().uid);
        return intent0;
    }

    public zzbbq.zzq zzg(Context context0, TelephonyManager telephonyManager0) {
        return zzbbq.zzq.zzc;
    }

    public void zzh(Context context0, String s, String s1) {
    }

    public boolean zzi(Context context0, String s) {
        return false;
    }

    public int zzj(AudioManager audioManager0) {
        return 0;
    }

    public void zzk(Activity activity0) {
    }

    public int zzm(Context context0) {
        return ((TelephonyManager)context0.getSystemService("phone")).getNetworkType();
    }
}

