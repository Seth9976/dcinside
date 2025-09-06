package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

public final class zzbmq implements zzcgo {
    public final zzbmy zza;

    public zzbmq(zzbmy zzbmy0) {
        this.zza = zzbmy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgo
    public final void zza() {
        Long long0 = (long)(zzv.zzC().currentTimeMillis() - this.zza.zzc);
        this.zza.zzb.add(long0);
        zze.zza(("LoadNewJavascriptEngine(onEngLoaded) latency is " + this.zza.zzb.get(0) + " ms."));
        zzbmz zzbmz0 = new zzbmz(this.zza.zza, this.zza.zzd, this.zza.zze, this.zza.zzb, this.zza.zzc);
        long v = (long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzb)))));
        zzs.zza.postDelayed(zzbmz0, v);
    }
}

