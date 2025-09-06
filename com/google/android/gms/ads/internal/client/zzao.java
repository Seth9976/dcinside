package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzao extends zzbb {
    final Context zza;
    final zzs zzb;
    final String zzc;
    final zzba zzd;

    zzao(zzba zzba0, Context context0, zzs zzs0, String s) {
        this.zza = context0;
        this.zzb = zzs0;
        this.zzc = s;
        this.zzd = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zza() {
        zzba.zzv(this.zza, "search");
        return new zzfk();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzf(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzc() throws RemoteException {
        return this.zzd.zza.zza(this.zza, this.zzb, this.zzc, null, 3);
    }
}

