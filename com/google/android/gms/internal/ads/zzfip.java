package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.common.util.concurrent.t0;

public final class zzfip implements zzgbo {
    public final zzfiq zza;
    public final int zzb;
    public final long zzc;
    public final String zzd;

    public zzfip(zzfiq zzfiq0, int v, long v1, String s) {
        this.zza = zzfiq0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, ((zzt)object0));
    }
}

