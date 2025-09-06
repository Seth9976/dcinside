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

final class zzat extends zzbb {
    final Context zza;
    final zzbpe zzb;
    final zzba zzc;

    zzat(zzba zzba0, Context context0, zzbpe zzbpe0) {
        this.zza = context0;
        this.zzb = zzbpe0;
        this.zzc = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    protected final Object zza() {
        zzba.zzv(this.zza, "ads_preloader");
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        zzci zzci0 = zzcp0.zzg(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
        zzci0.zzh(this.zzb);
        return zzci0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    protected final Object zzc() throws RemoteException {
        zzci zzci0;
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zza);
        zzbcl.zza(this.zza);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                zzas zzas0 = new zzas();
                IBinder iBinder0 = ((zzcj)zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzas0)).zze(iObjectWrapper0, this.zzb, 244410000);
                if(iBinder0 == null) {
                    zzci0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    zzci0 = iInterface0 instanceof zzci ? ((zzci)iInterface0) : new zzcg(iBinder0);
                }
                zzci0.zzh(this.zzb);
                return zzci0;
            }
            catch(zzr | RemoteException | NullPointerException zzr0) {
            }
            zzbuj zzbuj0 = zzbuh.zza(this.zza);
            this.zzc.zzg = zzbuj0;
            this.zzc.zzg.zzh(zzr0, "ClientApiBroker.getAdPreloader");
            return null;
        }
        return this.zzc.zzh.zza(this.zza, this.zzb);
    }
}

