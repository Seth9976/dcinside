package com.google.android.gms.ads.interstitial;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbuh;

public final class zza implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdRequest zzc;
    public final InterstitialAdLoadCallback zzd;

    public zza(Context context0, String s, AdRequest adRequest0, InterstitialAdLoadCallback interstitialAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adRequest0;
        this.zzd = interstitialAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzbmj(context0, this.zzb).zza(this.zzc.zza(), this.zzd);
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(context0).zzh(illegalStateException0, "InterstitialAd.load");
        }
    }
}

