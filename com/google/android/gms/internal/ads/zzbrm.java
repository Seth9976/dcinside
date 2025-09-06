package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

final class zzbrm implements MediationAdLoadCallback {
    final zzbqx zza;
    final zzbpk zzb;

    zzbrm(zzbrq zzbrq0, zzbqx zzbqx0, zzbpk zzbpk0) {
        this.zza = zzbqx0;
        this.zzb = zzbpk0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError0) {
        try {
            zze zze0 = adError0.zza();
            this.zza.zzf(zze0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String s) {
        this.onFailure(new AdError(0, s, "undefined"));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @Nullable
    public final Object onSuccess(Object object0) {
        UnifiedNativeAdMapper unifiedNativeAdMapper0 = (UnifiedNativeAdMapper)object0;
        if(unifiedNativeAdMapper0 == null) {
            zzo.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
            try {
                this.zza.zze("Adapter returned null.");
            }
            catch(RemoteException remoteException0) {
                zzo.zzh("", remoteException0);
            }
            return null;
        }
        try {
            zzbql zzbql0 = new zzbql(unifiedNativeAdMapper0);
            this.zza.zzg(zzbql0);
            return new zzbrr(this.zzb);
        }
        catch(RemoteException remoteException1) {
            zzo.zzh("", remoteException1);
            return new zzbrr(this.zzb);
        }
    }
}

