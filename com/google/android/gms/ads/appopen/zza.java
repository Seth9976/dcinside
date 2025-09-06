package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbuh;

public final class zza implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdRequest zzc;
    public final AppOpenAdLoadCallback zzd;

    public zza(Context context0, String s, AdRequest adRequest0, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adRequest0;
        this.zzd = appOpenAd$AppOpenAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzbal(context0, this.zzb, this.zzc.zza(), 3, this.zzd).zza();
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(context0).zzh(illegalStateException0, "AppOpenAd.load");
        }
    }
}

