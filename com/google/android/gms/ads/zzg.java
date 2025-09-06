package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzbuh;

public final class zzg implements Runnable {
    public final BaseAdView zza;
    public final AdRequest zzb;

    public zzg(BaseAdView baseAdView0, AdRequest adRequest0) {
        this.zza = baseAdView0;
        this.zzb = adRequest0;
    }

    @Override
    public final void run() {
        BaseAdView baseAdView0;
        try {
            baseAdView0 = this.zza;
            baseAdView0.zza.zzm(this.zzb.zza);
        }
        catch(IllegalStateException illegalStateException0) {
            zzbuh.zza(baseAdView0.getContext()).zzh(illegalStateException0, "BaseAdView.loadAd");
        }
    }
}

