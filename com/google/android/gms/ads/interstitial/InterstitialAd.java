package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbmj;

public abstract class InterstitialAd {
    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    public static boolean isAdAvailable(@NonNull Context context0, @NonNull String s) {
        try {
            return zzb.zza(context0).zzk(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            return false;
        }
    }

    public static void load(@NonNull Context context0, @NonNull String s, @NonNull AdRequest adRequest0, @NonNull InterstitialAdLoadCallback interstitialAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "AdUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest0, "AdRequest cannot be null.");
        Preconditions.checkNotNull(interstitialAdLoadCallback0, "LoadCallback cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzi.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zza zza0 = new zza(context0, s, adRequest0, interstitialAdLoadCallback0);
            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(zza0);
            return;
        }
        new zzbmj(context0, s).zza(adRequest0.zza(), interstitialAdLoadCallback0);
    }

    @Nullable
    public static InterstitialAd pollAd(@NonNull Context context0, @NonNull String s) {
        try {
            zzby zzby0 = zzb.zza(context0).zzf(s);
            if(zzby0 == null) {
                zzo.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
                return null;
            }
            return new zzbmj(context0, s, zzby0);
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
        return null;
    }

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback arg1);

    public abstract void setImmersiveMode(boolean arg1);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener arg1);

    public abstract void show(@NonNull Activity arg1);
}

