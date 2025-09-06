package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzcnb implements zzbjp {
    final zzcnc zza;

    zzcnb(zzcnc zzcnc0) {
        this.zza = zzcnc0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(!zzcnc.zzg(this.zza, map0)) {
            return;
        }
        zzcna zzcna0 = new zzcna(this);
        this.zza.zzc.execute(zzcna0);
    }
}

