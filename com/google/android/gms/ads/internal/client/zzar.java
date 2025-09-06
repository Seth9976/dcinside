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
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;

final class zzar extends zzbb {
    final Context zza;
    final String zzb;
    final zzbpe zzc;
    final zzba zzd;

    zzar(zzba zzba0, Context context0, String s, zzbpe zzbpe0) {
        this.zza = context0;
        this.zzb = s;
        this.zzc = zzbpe0;
        this.zzd = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    protected final Object zza() {
        zzba.zzv(this.zza, "native_ad");
        return new zzfi();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
                zzaq zzaq0 = new zzaq();
                IBinder iBinder0 = ((zzbv)zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzaq0)).zze(iObjectWrapper0, this.zzb, this.zzc, 244410000);
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                    return iInterface0 instanceof zzbu ? ((zzbu)iInterface0) : new zzbs(iBinder0);
                }
                return null;
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
            }
            zzbuj zzbuj0 = zzbuh.zza(this.zza);
            this.zzd.zzg = zzbuj0;
            this.zzd.zzg.zzh(zzr0, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
        return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
    }
}

