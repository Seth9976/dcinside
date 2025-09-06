package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzcmz implements zzbjp {
    final zzcnc zza;

    zzcmz(zzcnc zzcnc0) {
        this.zza = zzcnc0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(!zzcnc.zzg(this.zza, map0)) {
            return;
        }
        this.zza.zzc.execute(new zzcmy(this));
    }
}

