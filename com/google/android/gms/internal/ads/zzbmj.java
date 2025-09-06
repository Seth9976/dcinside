package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzbmj extends AdManagerInterstitialAd {
    private final Context zza;
    private final zzr zzb;
    private final zzby zzc;
    private final String zzd;
    private final zzbpa zze;
    private final long zzf;
    @Nullable
    private AppEventListener zzg;
    @Nullable
    private FullScreenContentCallback zzh;
    @Nullable
    private OnPaidEventListener zzi;

    public zzbmj(Context context0, String s) {
        zzbpa zzbpa0 = new zzbpa();
        this.zze = zzbpa0;
        this.zzf = System.currentTimeMillis();
        this.zza = context0;
        this.zzd = s;
        this.zzb = zzr.zza;
        this.zzc = zzbc.zza().zzf(context0, new zzs(), s, zzbpa0);
    }

    public zzbmj(Context context0, String s, zzby zzby0) {
        this.zze = new zzbpa();
        this.zzf = System.currentTimeMillis();
        this.zza = context0;
        this.zzd = s;
        this.zzb = zzr.zza;
        this.zzc = zzby0;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    @Nullable
    public final AppEventListener getAppEventListener() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        zzby zzby0 = this.zzc;
        if(zzby0 != null) {
            try {
                return ResponseInfo.zzb(zzby0.zzk());
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zzb(null);
            }
        }
        return ResponseInfo.zzb(null);
    }

    @Override  // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(@Nullable AppEventListener appEventListener0) {
        try {
            this.zzg = appEventListener0;
            zzby zzby0 = this.zzc;
            if(zzby0 != null) {
                zzby0.zzG((appEventListener0 == null ? null : new zzayy(appEventListener0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback0) {
        try {
            this.zzh = fullScreenContentCallback0;
            zzby zzby0 = this.zzc;
            if(zzby0 != null) {
                zzby0.zzJ(new zzbf(fullScreenContentCallback0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzby zzby0 = this.zzc;
            if(zzby0 != null) {
                zzby0.zzL(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzi = onPaidEventListener0;
            zzby zzby0 = this.zzc;
            if(zzby0 != null) {
                zzby0.zzP(new zzfs(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(@NonNull Activity activity0) {
        if(activity0 == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzby zzby0 = this.zzc;
            if(zzby0 != null) {
                zzby0.zzW(ObjectWrapper.wrap(activity0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zza(zzei zzei0, AdLoadCallback adLoadCallback0) {
        try {
            if(this.zzc != null) {
                zzei0.zzq(this.zzf);
                zzm zzm0 = this.zzb.zza(this.zza, zzei0);
                zzh zzh0 = new zzh(adLoadCallback0, this);
                this.zzc.zzy(zzm0, zzh0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            adLoadCallback0.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}

