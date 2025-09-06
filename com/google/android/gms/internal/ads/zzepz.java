package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class zzepz implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzepz(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzerg zzerg0 = ((zzeri)this.zza).zza();
        zzeoj zzeoj0 = (zzeoj)this.zzb.zzb();
        List list0 = (List)this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzd.zzb();
        return list0.contains("60") ? new zzesd(zzeoj0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmH)))))), scheduledExecutorService0) : new zzesd(zzerg0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmH)))))), scheduledExecutorService0);
    }
}

