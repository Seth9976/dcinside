package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdqy implements zzfgo {
    private final Map zza;
    private final zzbbj zzb;

    zzdqy(zzbbj zzbbj0, Map map0) {
        this.zza = map0;
        this.zzb = zzbbj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfgh0, String s) {
        if(this.zza.containsKey(zzfgh0)) {
            int v = ((zzdqx)this.zza.get(zzfgh0)).zzb;
            this.zzb.zzc(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfgh0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfgh0, String s, Throwable throwable0) {
        if(this.zza.containsKey(zzfgh0)) {
            int v = ((zzdqx)this.zza.get(zzfgh0)).zzc;
            this.zzb.zzc(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfgh0, String s) {
        if(this.zza.containsKey(zzfgh0)) {
            int v = ((zzdqx)this.zza.get(zzfgh0)).zza;
            this.zzb.zzc(v);
        }
    }
}

