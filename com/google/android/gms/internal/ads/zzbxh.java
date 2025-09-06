package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbxh extends zzbwr {
    @Nullable
    private FullScreenContentCallback zza;
    private OnUserEarnedRewardListener zzb;

    public final void zzb(@Nullable FullScreenContentCallback fullScreenContentCallback0) {
        this.zza = fullScreenContentCallback0;
    }

    public final void zzc(OnUserEarnedRewardListener onUserEarnedRewardListener0) {
        this.zzb = onUserEarnedRewardListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdImpression();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdDismissedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzh(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzi(zze zze0) {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdFailedToShowFullScreenContent(zze0.zza());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback0 = this.zza;
        if(fullScreenContentCallback0 != null) {
            fullScreenContentCallback0.onAdShowedFullScreenContent();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzk(zzbwm zzbwm0) {
        OnUserEarnedRewardListener onUserEarnedRewardListener0 = this.zzb;
        if(onUserEarnedRewardListener0 != null) {
            onUserEarnedRewardListener0.onUserEarnedReward(new zzbwz(zzbwm0));
        }
    }
}

