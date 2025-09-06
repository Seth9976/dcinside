package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

public final class zzg extends zzbk {
    private final AdListener zza;

    public zzg(AdListener adListener0) {
        this.zza = adListener0;
    }

    public final AdListener zzb() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() {
        AdListener adListener0 = this.zza;
        if(adListener0 != null) {
            adListener0.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() {
        AdListener adListener0 = this.zza;
        if(adListener0 != null) {
            adListener0.onAdClosed();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int v) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zze0) {
        AdListener adListener0 = this.zza;
        if(adListener0 != null) {
            adListener0.onAdFailedToLoad(zze0.zzb());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
        AdListener adListener0 = this.zza;
        if(adListener0 != null) {
            adListener0.onAdImpression();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() {
        AdListener adListener0 = this.zza;
        if(adListener0 != null) {
            adListener0.onAdLoaded();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() {
        AdListener adListener0 = this.zza;
        if(adListener0 != null) {
            adListener0.onAdOpened();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}

