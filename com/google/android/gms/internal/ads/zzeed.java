package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;

public final class zzeed implements zzcqx {
    public final zzecz zza;

    public zzeed(zzecz zzecz0) {
        this.zza = zzecz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcqx
    public final zzeb zza() {
        try {
            return ((zzbrd)this.zza.zzb).zze();
        }
        catch(RemoteException remoteException0) {
            throw new zzfcq(remoteException0);
        }
    }
}

