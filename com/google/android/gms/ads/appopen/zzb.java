package com.google.android.gms.ads.appopen;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbuh;

public final class zzb implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdRequest zzc;
    public final int zzd;
    public final AppOpenAdLoadCallback zze;

    public zzb(Context context0, String s, AdRequest adRequest0, int v, AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adRequest0;
        this.zzd = v;
        this.zze = appOpenAd$AppOpenAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzbal(context0, this.zzb, this.zzc.zza(), this.zzd, this.zze).zza();
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(context0).zzh(illegalStateException0, "AppOpenAd.load");
        }
    }
}

