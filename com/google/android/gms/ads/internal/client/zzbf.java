package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;

public final class zzbf extends zzcs {
    @Nullable
    private final FullScreenContentCallback zza;

    public zzbf(@Nullable FullScreenContentCallback fullScreenContentCallback0) {
        this.zza = fullScreenContentCallback0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdDismissedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzd(zze zze0) {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdFailedToShowFullScreenContent(zze0.zza());
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdImpression();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdShowedFullScreenContent();
        }
    }
}

