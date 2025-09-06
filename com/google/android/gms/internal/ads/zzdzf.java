package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;

final class zzdzf implements zzgcd {
    final zzbuu zza;
    final zzbvd zzb;

    zzdzf(zzdzl zzdzl0, zzbvd zzbvd0, zzbuu zzbuu0) {
        this.zzb = zzbvd0;
        this.zza = zzbuu0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        try {
            zzbb zzbb0 = zzbb.zzb(throwable0);
            this.zzb.zze(zzbb0);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Service can\'t call client", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        String s = (String)object0;
        try {
            this.zzb.zzf(s, this.zza);
        }
        catch(RemoteException remoteException0) {
            zze.zzb("Service can\'t call client", remoteException0);
        }
    }
}

