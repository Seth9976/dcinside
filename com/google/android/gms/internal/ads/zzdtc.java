package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzdtc {
    private final zzbko zza;

    zzdtc(zzbko zzbko0) {
        this.zza = zzbko0;
    }

    public final void zza() throws RemoteException {
        this.zzs(new zzdta("initialize", null));
    }

    public final void zzb(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("interstitial", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onAdClicked";
        String s = zzdta.zza(zzdta0);
        this.zza.zzb(s);
    }

    public final void zzc(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("interstitial", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onAdClosed";
        this.zzs(zzdta0);
    }

    public final void zzd(long v, int v1) throws RemoteException {
        zzdta zzdta0 = new zzdta("interstitial", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onAdFailedToLoad";
        zzdta0.zzd = v1;
        this.zzs(zzdta0);
    }

    public final void zze(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("interstitial", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onAdLoaded";
        this.zzs(zzdta0);
    }

    public final void zzf(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("interstitial", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onNativeAdObjectNotAvailable";
        this.zzs(zzdta0);
    }

    public final void zzg(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("interstitial", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onAdOpened";
        this.zzs(zzdta0);
    }

    public final void zzh(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("creation", null);
        zzdta0.zza = v;
        zzdta0.zzc = "nativeObjectCreated";
        this.zzs(zzdta0);
    }

    public final void zzi(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("creation", null);
        zzdta0.zza = v;
        zzdta0.zzc = "nativeObjectNotCreated";
        this.zzs(zzdta0);
    }

    public final void zzj(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onAdClicked";
        this.zzs(zzdta0);
    }

    public final void zzk(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onRewardedAdClosed";
        this.zzs(zzdta0);
    }

    public final void zzl(long v, zzbwm zzbwm0) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onUserEarnedReward";
        zzdta0.zze = zzbwm0.zzf();
        zzdta0.zzf = zzbwm0.zze();
        this.zzs(zzdta0);
    }

    public final void zzm(long v, int v1) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onRewardedAdFailedToLoad";
        zzdta0.zzd = v1;
        this.zzs(zzdta0);
    }

    public final void zzn(long v, int v1) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onRewardedAdFailedToShow";
        zzdta0.zzd = v1;
        this.zzs(zzdta0);
    }

    public final void zzo(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onAdImpression";
        this.zzs(zzdta0);
    }

    public final void zzp(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onRewardedAdLoaded";
        this.zzs(zzdta0);
    }

    public final void zzq(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onNativeAdObjectNotAvailable";
        this.zzs(zzdta0);
    }

    public final void zzr(long v) throws RemoteException {
        zzdta zzdta0 = new zzdta("rewarded", null);
        zzdta0.zza = v;
        zzdta0.zzc = "onRewardedAdOpened";
        this.zzs(zzdta0);
    }

    private final void zzs(zzdta zzdta0) throws RemoteException {
        String s = zzdta.zza(zzdta0);
        zzo.zzi(("Dispatching AFMA event on publisher webview: " + s));
        this.zza.zzb(s);
    }
}

