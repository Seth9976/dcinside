package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

final class zzbjx implements zzgcd {
    final Map zza;
    final zza zzb;
    final String zzc;
    final zzbkb zzd;

    zzbjx(zzbkb zzbkb0, Map map0, zza zza0, String s) {
        this.zza = map0;
        this.zzb = zza0;
        this.zzc = s;
        this.zzd = zzbkb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzv.zzp().zzw(throwable0, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjU)).booleanValue()) {
            this.zza.put("u", ((String)object0));
        }
        this.zzd.zzh(((String)object0), this.zzb, this.zza, this.zzc);
    }
}

