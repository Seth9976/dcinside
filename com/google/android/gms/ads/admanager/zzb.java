package com.google.android.gms.ads.admanager;

public final class zzb implements Runnable {
    public final AdManagerAdView zza;
    public final AdManagerAdRequest zzb;

    public zzb(AdManagerAdView adManagerAdView0, AdManagerAdRequest adManagerAdRequest0) {
        this.zza = adManagerAdView0;
        this.zzb = adManagerAdRequest0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

