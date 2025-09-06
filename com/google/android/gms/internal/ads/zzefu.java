package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

final class zzefu extends zzbqw {
    final zzefw zza;
    private final zzecz zzb;

    zzefu(zzefw zzefw0, zzecz zzecz0, zzefv zzefv0) {
        this.zza = zzefw0;
        super();
        this.zzb = zzecz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqx
    public final void zze(String s) throws RemoteException {
        ((zzees)this.zzb.zzc).zzi(0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqx
    public final void zzf(zze zze0) throws RemoteException {
        ((zzees)this.zzb.zzc).zzh(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqx
    public final void zzg(zzbpt zzbpt0) throws RemoteException {
        this.zza.zzc = zzbpt0;
        ((zzees)this.zzb.zzc).zzo();
    }
}

