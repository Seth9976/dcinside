package com.google.android.gms.ads.rewardedinterstitial;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbxj;

public final class zza implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdManagerAdRequest zzc;
    public final RewardedInterstitialAdLoadCallback zzd;

    public zza(Context context0, String s, AdManagerAdRequest adManagerAdRequest0, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adManagerAdRequest0;
        this.zzd = rewardedInterstitialAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzbxj(context0, this.zzb).zza(this.zzc.zza(), this.zzd);
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(context0).zzh(illegalStateException0, "RewardedInterstitialAdManager.load");
        }
    }
}

