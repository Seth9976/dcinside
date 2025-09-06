package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzazz;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;

public abstract class AppOpenAd {
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback {
    }

    public @interface AppOpenAdOrientation {
    }

    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

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
            return zzb.zza(context0).zzj(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            return false;
        }
    }

    @Deprecated
    public static void load(@NonNull Context context0, @NonNull String s, @NonNull AdRequest adRequest0, @AppOpenAdOrientation int v, @NonNull AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest0, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzd.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            com.google.android.gms.ads.appopen.zzb zzb0 = new com.google.android.gms.ads.appopen.zzb(context0, s, adRequest0, v, appOpenAd$AppOpenAdLoadCallback0);
            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(zzb0);
            return;
        }
        new zzbal(context0, s, adRequest0.zza(), v, appOpenAd$AppOpenAdLoadCallback0).zza();
    }

    public static void load(@NonNull Context context0, @NonNull String s, @NonNull AdRequest adRequest0, @NonNull AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest0, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzd.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zza zza0 = new zza(context0, s, adRequest0, appOpenAd$AppOpenAdLoadCallback0);
            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(zza0);
            return;
        }
        new zzbal(context0, s, adRequest0.zza(), 3, appOpenAd$AppOpenAdLoadCallback0).zza();
    }

    @Deprecated
    public static void load(@NonNull Context context0, @NonNull String s, @NonNull AdManagerAdRequest adManagerAdRequest0, @AppOpenAdOrientation int v, @NonNull AppOpenAdLoadCallback appOpenAd$AppOpenAdLoadCallback0) {
        Preconditions.checkNotNull(context0, "Context cannot be null.");
        Preconditions.checkNotNull(s, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest0, "AdManagerAdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbcl.zza(context0);
        if(((Boolean)zzbej.zzd.zze()).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
            zzc zzc0 = new zzc(context0, s, adManagerAdRequest0, v, appOpenAd$AppOpenAdLoadCallback0);
            com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(zzc0);
            return;
        }
        new zzbal(context0, s, adManagerAdRequest0.zza(), v, appOpenAd$AppOpenAdLoadCallback0).zza();
    }

    @Nullable
    public static AppOpenAd pollAd(@NonNull Context context0, @NonNull String s) {
        try {
            zzbad zzbad0 = zzb.zza(context0).zze(s);
            if(zzbad0 == null) {
                zzo.zzl("Failed to obtain an App Open ad from the preloader.", null);
                return null;
            }
            return new zzazz(zzbad0, s);
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

