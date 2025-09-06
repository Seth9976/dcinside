package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzedl implements zzedc {
    private final Context zza;
    private final zzcoa zzb;
    private final Executor zzc;

    zzedl(Context context0, zzcoa zzcoa0, Executor executor0) {
        this.zza = context0;
        this.zzb = zzcoa0;
        this.zzc = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final Object zza(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq, zzegu {
        zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, zzecz0.zza);
        zzdeu zzdeu0 = new zzdeu(new zzedk(zzecz0), null);
        zzcny zzcny0 = new zzcny(zzfbo0.zzaa);
        zzcnx zzcnx0 = this.zzb.zza(zzcrp0, zzdeu0, zzcny0);
        zzcnx0.zzd().zzo(new zzcma(((zzfdh)zzecz0.zzb)), this.zzc);
        zzeik zzeik0 = zzcnx0.zzk();
        ((zzees)zzecz0.zzc).zzc(zzeik0);
        return zzcnx0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) throws zzfcq {
        ((zzfdh)zzecz0.zzb).zzl(this.zza, zzfca0.zza.zza.zzd, zzfbo0.zzv.toString(), ((zzbpk)zzecz0.zzc));
    }
}

