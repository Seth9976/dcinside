package com.google.android.gms.ads.admanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbmj;

public abstract class AdManagerInterstitialAd extends InterstitialAd {
    @Nullable
    public abstract AppEventListener getAppEventListener();

    public static void load(@NonNull Context context0, @NonNull String s, @NonNull AdManagerAdRequest adManagerAdRequest0, @NonNull AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest0, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(adManagerInterstitialAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzi.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zzc zzc0 = new zzc(context0, s, adManagerAdRequest0, adManagerInterstitialAdLoadCallback0);
            zzb.zzb.execute(zzc0);
            return;
        }
        new zzbmj(context0, s).zza(adManagerAdRequest0.zza(), adManagerInterstitialAdLoadCallback0);
    }

    public abstract void setAppEventListener(@Nullable AppEventListener arg1);
}

