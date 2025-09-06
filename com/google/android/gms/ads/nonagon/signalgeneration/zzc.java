package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;
import java.util.concurrent.ScheduledExecutorService;

public final class zzc implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzc(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzb(((zzche)this.zza).zza(), ((long)(((Long)this.zzb.zzb()))), ((PackageInfo)this.zzc.zzb()), ((zzd)this.zzd.zzb()), ((ScheduledExecutorService)this.zze.zzb()));
    }
}

