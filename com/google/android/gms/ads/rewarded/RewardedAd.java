package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbwy;

public abstract class RewardedAd {
    @NonNull
    public abstract Bundle getAdMetadata();

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    @NonNull
    public abstract RewardItem getRewardItem();

    public static boolean isAdAvailable(@NonNull Context context0, @NonNull String s) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        return new zzbwy(context0, s).zzc();
    }

    public static void load(@NonNull Context context0, @NonNull String s, @NonNull AdRequest adRequest0, @NonNull RewardedAdLoadCallback rewardedAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest0, "AdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzk.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zzc zzc0 = new zzc(context0, s, adRequest0, rewardedAdLoadCallback0);
            zzb.zzb.execute(zzc0);
            return;
        }
        zzo.zze("Loading on UI thread");
        new zzbwy(context0, s).zzb(adRequest0.zza(), rewardedAdLoadCallback0);
    }

    public static void load(@NonNull Context context0, @NonNull String s, @NonNull AdManagerAdRequest adManagerAdRequest0, @NonNull RewardedAdLoadCallback rewardedAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest0, "AdManagerAdRequest cannot be null.");
        Preconditions.checkNotNull(rewardedAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzk.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zzo.zze("Loading on background thread");
            com.google.android.gms.ads.rewarded.zzb zzb0 = new com.google.android.gms.ads.rewarded.zzb(context0, s, adManagerAdRequest0, rewardedAdLoadCallback0);
            zzb.zzb.execute(zzb0);
            return;
        }
        zzo.zze("Loading on UI thread");
        new zzbwy(context0, s).zzb(adManagerAdRequest0.zza(), rewardedAdLoadCallback0);
    }

    @Nullable
    public static RewardedAd pollAd(@NonNull Context context0, @NonNull String s) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        return new zzbwy(context0, s).zza();
    }

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback arg1);

    public abstract void setImmersiveMode(boolean arg1);

    public abstract void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener arg1);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener arg1);

    public abstract void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions arg1);

    public abstract void show(@NonNull Activity arg1, @NonNull OnUserEarnedRewardListener arg2);
}

