package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;

final class zzav extends zzbb {
    final Context zza;
    final zzba zzb;

    zzav(zzba zzba0, Context context0) {
        this.zza = context0;
        this.zzb = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    protected final Object zza() {
        zzba.zzv(this.zza, "mobile_ads_settings");
        return new zzfm();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzh(ObjectWrapper.wrap(this.zza), 244410000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzau zzau0 = new zzau();
                IBinder iBinder0 = ((zzda)zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzau0)).zze(iObjectWrapper0, 244410000);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                    return iInterface0 instanceof zzcz ? ((zzcz)iInterface0) : new zzcx(iBinder0);
                }
                return null;
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
            }
            zzbuj zzbuj0 = zzbuh.zza(this.zza);
            this.zzb.zzg = zzbuj0;
            this.zzb.zzg.zzh(zzr0, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
        return this.zzb.zzc.zza(this.zza);
    }
}

