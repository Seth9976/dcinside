package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzs;
import com.google.common.util.concurrent.t0;

public final class zzdlw implements zzgbo {
    public final zzdmh zza;
    public final zzs zzb;
    public final zzfbo zzc;
    public final zzfbr zzd;
    public final String zze;
    public final String zzf;

    public zzdlw(zzdmh zzdmh0, zzs zzs0, zzfbo zzfbo0, zzfbr zzfbr0, String s, String s1) {
        this.zza = zzdmh0;
        this.zzb = zzs0;
        this.zzc = zzfbo0;
        this.zzd = zzfbr0;
        this.zze = s;
        this.zzf = s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, object0);
    }
}

