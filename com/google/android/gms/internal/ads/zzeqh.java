package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeqh implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzeqh(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzetf zzetf0 = ((zzeth)this.zza).zza();
        zzeoj zzeoj0 = (zzeoj)this.zzb.zzb();
        List list0 = (List)this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zzd.zzb();
        return list0.contains("35") ? new zzesd(zzeoj0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlW)))))), scheduledExecutorService0) : new zzesd(zzetf0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzlW)))))), scheduledExecutorService0);
    }
}

