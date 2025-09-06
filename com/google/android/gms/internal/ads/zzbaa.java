package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbaa extends zzbaj {
    @Nullable
    private FullScreenContentCallback zza;

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdDismissedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzd(zze zze0) {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdFailedToShowFullScreenContent(zze0.zza());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdImpression();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdShowedFullScreenContent();
        }
    }

    public final void zzg(@Nullable FullScreenContentCallback fullScreenContentCallback0) {
        this.zza = fullScreenContentCallback0;
    }
}

