package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfr;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o3.j;

@j
public final class zzbxj extends RewardedInterstitialAd {
    private final String zza;
    private final zzbwp zzb;
    private final Context zzc;
    private final zzbxh zzd;
    @Nullable
    private FullScreenContentCallback zze;
    @Nullable
    private OnAdMetadataChangedListener zzf;
    @Nullable
    private OnPaidEventListener zzg;
    private final long zzh;

    public zzbxj(Context context0, String s) {
        this.zzh = System.currentTimeMillis();
        this.zza = s;
        this.zzc = context0.getApplicationContext();
        this.zzb = zzbc.zza().zzs(context0, s, new zzbpa());
        this.zzd = new zzbxh();
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        zzbwp zzbwp0 = this.zzb;
        if(zzbwp0 != null) {
            try {
                return zzbwp0.zzb();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @Nullable
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        zzbwp zzbwp0 = this.zzb;
        if(zzbwp0 != null) {
            try {
                return ResponseInfo.zzb(zzbwp0.zzc());
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zzb(null);
            }
        }
        return ResponseInfo.zzb(null);
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    @NonNull
    public final RewardItem getRewardItem() {
        try {
            zzbwm zzbwm0 = this.zzb == null ? null : this.zzb.zzd();
            if(zzbwm0 != null) {
                return new zzbwz(zzbwm0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback0) {
        this.zze = fullScreenContentCallback0;
        this.zzd.zzb(fullScreenContentCallback0);
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                zzbwp0.zzh(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        try {
            this.zzf = onAdMetadataChangedListener0;
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                zzbwp0.zzi(new zzfr(onAdMetadataChangedListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzg = onPaidEventListener0;
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                zzbwp0.zzj(new zzfs(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions0) {
        try {
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                zzbwp0.zzl(new zzbxd(serverSideVerificationOptions0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(@NonNull Activity activity0, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener0) {
        this.zzd.zzc(onUserEarnedRewardListener0);
        try {
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                zzbwp0.zzk(this.zzd);
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(activity0);
                this.zzb.zzm(iObjectWrapper0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zza(zzei zzei0, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback0) {
        try {
            if(this.zzb != null) {
                zzei0.zzq(this.zzh);
                zzm zzm0 = zzr.zza.zza(this.zzc, zzei0);
                zzbxi zzbxi0 = new zzbxi(rewardedInterstitialAdLoadCallback0, this);
                this.zzb.zzg(zzm0, zzbxi0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

