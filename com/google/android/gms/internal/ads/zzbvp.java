package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Callable;

final class zzbvp implements Callable {
    final Context zza;
    final zzbvr zzb;

    zzbvp(zzbvr zzbvr0, Context context0) {
        this.zza = context0;
        this.zzb = zzbvr0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        zzbvo zzbvo0;
        zzbvq zzbvq0 = (zzbvq)this.zzb.zza.get(this.zza);
        if(zzbvq0 == null) {
            zzbvo0 = new zzbvn(this.zza).zza();
        }
        else {
            long v = (long)(((Long)zzbea.zzd.zze()));
            long v1 = zzv.zzC().currentTimeMillis();
            zzbvo0 = zzbvq0.zza + v >= v1 ? new zzbvn(this.zza, zzbvq0.zzb).zza() : new zzbvn(this.zza).zza();
        }
        zzbvq zzbvq1 = new zzbvq(this.zzb, zzbvo0);
        this.zzb.zza.put(this.zza, zzbvq1);
        return zzbvo0;
    }
}

