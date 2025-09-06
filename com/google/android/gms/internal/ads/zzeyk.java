package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.concurrent.Executor;

final class zzeyk implements zzfer {
    public final zzeze zza;
    public final zzezg zzb;
    public final zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final zzy zzf;
    public final zzfeg zzg;

    public zzeyk(zzeze zzeze0, zzezg zzezg0, zzm zzm0, String s, Executor executor0, zzy zzy0, zzfeg zzfeg0) {
        this.zza = zzeze0;
        this.zzb = zzezg0;
        this.zzc = zzm0;
        this.zzd = s;
        this.zze = executor0;
        this.zzf = zzy0;
        this.zzg = zzfeg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfer
    public final zzfeg zza() {
        return this.zzg;
    }

    @Override  // com.google.android.gms.internal.ads.zzfer
    public final Executor zzb() {
        return this.zze;
    }
}

