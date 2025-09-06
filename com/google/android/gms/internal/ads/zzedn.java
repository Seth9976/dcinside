package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

final class zzedn extends zzbqn {
    private final zzecz zza;

    zzedn(zzecz zzecz0, zzedo zzedo0) {
        this.zza = zzecz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbqo
    public final void zze(String s) throws RemoteException {
        ((zzees)this.zza.zzc).zzi(0, s);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqo
    public final void zzf(zze zze0) throws RemoteException {
        ((zzees)this.zza.zzc).zzh(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqo
    public final void zzg() throws RemoteException {
        ((zzees)this.zza.zzc).zzo();
    }
}

