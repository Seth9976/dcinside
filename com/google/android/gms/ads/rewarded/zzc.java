package com.google.android.gms.ads.rewarded;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbwy;

public final class zzc implements Runnable {
    public final Context zza;
    public final String zzb;
    public final AdRequest zzc;
    public final RewardedAdLoadCallback zzd;

    public zzc(Context context0, String s, AdRequest adRequest0, RewardedAdLoadCallback rewardedAdLoadCallback0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = adRequest0;
        this.zzd = rewardedAdLoadCallback0;
    }

    @Override
    public final void run() {
        Context context0;
        try {
            context0 = this.zza;
            new zzbwy(context0, this.zzb).zzb(this.zzc.zza(), this.zzd);
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(context0).zzh(illegalStateException0, "RewardedAd.load");
        }
    }
}

