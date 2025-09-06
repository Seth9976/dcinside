package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;

final class zzan extends zzbb {
    final Context zza;
    final zzs zzb;
    final String zzc;
    final zzbpe zzd;
    final zzba zze;

    zzan(zzba zzba0, Context context0, zzs zzs0, String s, zzbpe zzbpe0) {
        this.zza = context0;
        this.zzb = zzs0;
        this.zzc = s;
        this.zzd = zzbpe0;
        this.zze = zzba0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zza() {
        zzba.zzv(this.zza, "app_open");
        return new zzfk();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzb(zzcp zzcp0) throws RemoteException {
        return zzcp0.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 244410000);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbb
    public final Object zzc() throws RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 4);
    }
}

