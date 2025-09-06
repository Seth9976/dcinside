package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzazz extends AppOpenAd {
    @Nullable
    FullScreenContentCallback zza;
    private final zzbad zzb;
    @NonNull
    private final String zzc;
    private final zzbaa zzd;
    @Nullable
    private OnPaidEventListener zze;

    public zzazz(zzbad zzbad0, String s) {
        this.zzd = new zzbaa();
        this.zzb = zzbad0;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.zzc;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        try {
            return ResponseInfo.zzb(this.zzb.zzf());
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            return ResponseInfo.zzb(null);
        }
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback0) {
        this.zza = fullScreenContentCallback0;
        this.zzd.zzg(fullScreenContentCallback0);
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.zzb.zzg(z);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener0) {
        try {
            this.zze = onPaidEventListener0;
            zzfs zzfs0 = new zzfs(onPaidEventListener0);
            this.zzb.zzh(zzfs0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(@NonNull Activity activity0) {
        try {
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(activity0);
            this.zzb.zzi(iObjectWrapper0, this.zzd);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

