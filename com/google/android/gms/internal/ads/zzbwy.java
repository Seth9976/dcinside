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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o3.j;

@j
public final class zzbwy extends RewardedAd {
    private final String zza;
    private final zzbwp zzb;
    private final Context zzc;
    private final zzbxh zzd;
    @Nullable
    private OnAdMetadataChangedListener zze;
    @Nullable
    private OnPaidEventListener zzf;
    @Nullable
    private FullScreenContentCallback zzg;
    private final long zzh;

    public zzbwy(Context context0, String s) {
        this(context0.getApplicationContext(), s, zzbc.zza().zzs(context0, s, new zzbpa()), new zzbxh());
    }

    protected zzbwy(Context context0, String s, zzbwp zzbwp0, zzbxh zzbxh0) {
        this.zzh = System.currentTimeMillis();
        this.zzc = context0.getApplicationContext();
        this.zza = s;
        this.zzb = zzbwp0;
        this.zzd = zzbxh0;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    @NonNull
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    @NonNull
    public final RewardItem getRewardItem() {
        try {
            zzbwm zzbwm0 = this.zzb == null ? null : this.zzb.zzd();
            return zzbwm0 == null ? RewardItem.DEFAULT_REWARD : new zzbwz(zzbwm0);
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
        return RewardItem.DEFAULT_REWARD;
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback0) {
        this.zzg = fullScreenContentCallback0;
        this.zzd.zzb(fullScreenContentCallback0);
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener0) {
        try {
            this.zze = onAdMetadataChangedListener0;
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                zzbwp0.zzi(new zzfr(onAdMetadataChangedListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzf = onPaidEventListener0;
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                zzbwp0.zzj(new zzfs(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions serverSideVerificationOptions0) {
        if(serverSideVerificationOptions0 != null) {
            zzbwp zzbwp0 = this.zzb;
            if(zzbwp0 != null) {
                try {
                    zzbwp0.zzl(new zzbxd(serverSideVerificationOptions0));
                }
                catch(RemoteException remoteException0) {
                    zzo.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(@NonNull Activity activity0, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener0) {
        this.zzd.zzc(onUserEarnedRewardListener0);
        if(activity0 == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    @Nullable
    public final RewardedAd zza() {
        try {
            zzbwp zzbwp0 = zzb.zza(this.zzc).zzg(this.zza);
            if(zzbwp0 == null) {
                zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
                return null;
            }
            return new zzbwy(this.zzc, this.zza, zzbwp0, this.zzd);
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
        return null;
    }

    public final void zzb(zzei zzei0, RewardedAdLoadCallback rewardedAdLoadCallback0) {
        try {
            if(this.zzb != null) {
                zzei0.zzq(this.zzh);
                zzm zzm0 = zzr.zza.zza(this.zzc, zzei0);
                zzbxc zzbxc0 = new zzbxc(rewardedAdLoadCallback0, this);
                this.zzb.zzf(zzm0, zzbxc0);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final boolean zzc() {
        try {
            return zzb.zza(this.zzc).zzl(this.zza);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            return false;
        }
    }
}

