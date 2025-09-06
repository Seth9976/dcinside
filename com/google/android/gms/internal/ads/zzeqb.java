package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeqb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzeqb(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj1;
        this.zzb = zzhfj2;
        this.zzc = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzero zzero0 = zzerq.zza();
        zzeoj zzeoj0 = (zzeoj)this.zza.zzb();
        List list0 = (List)this.zzb.zzb();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzc.zzb();
        return list0.contains("24") ? new zzesd(zzeoj0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmb)))))), scheduledExecutorService0) : new zzesd(zzero0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzmb)))))), scheduledExecutorService0);
    }
}

