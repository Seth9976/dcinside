package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzbri implements MediationAdLoadCallback {
    final zzbqr zza;
    final zzbpk zzb;

    zzbri(zzbrq zzbrq0, zzbqr zzbqr0, zzbpk zzbpk0) {
        this.zza = zzbqr0;
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
        MediationBannerAd mediationBannerAd0 = (MediationBannerAd)object0;
        if(mediationBannerAd0 == null) {
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
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(mediationBannerAd0.getView());
            this.zza.zzg(iObjectWrapper0);
            return new zzbrr(this.zzb);
        }
        catch(RemoteException remoteException1) {
            zzo.zzh("", remoteException1);
            return new zzbrr(this.zzb);
        }
    }
}

