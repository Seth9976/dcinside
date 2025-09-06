package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ScheduledExecutorService;

public final class zzept implements zzher {
    private final zzhfj zza;

    public zzept(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzeol zzeol0 = zzeon.zza();
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.zza.zzb();
        zzfxs zzfxs0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzeg)).booleanValue() ? zzfxs.zzo(new zzesd(zzeol0, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzeh)))))), scheduledExecutorService0)) : zzfxs.zzn();
        zzhez.zzb(zzfxs0);
        return zzfxs0;
    }
}

