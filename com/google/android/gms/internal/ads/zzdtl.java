package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

final class zzdtl extends zzbwv {
    final zzdtn zza;

    zzdtl(zzdtn zzdtn0) {
        this.zza = zzdtn0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zze(int v) throws RemoteException {
        this.zza.zzb.zzm(this.zza.zza, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzf(zze zze0) throws RemoteException {
        this.zza.zzb.zzm(this.zza.zza, zze0.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzg() throws RemoteException {
        this.zza.zzb.zzp(this.zza.zza);
    }
}

