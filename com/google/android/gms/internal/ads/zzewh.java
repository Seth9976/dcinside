package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzewh implements zzetr {
    private final zzbzm zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgcs zze;

    zzewh(zzbzm zzbzm0, boolean z, boolean z1, zzbzb zzbzb0, zzgcs zzgcs0, String s, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = zzbzm0;
        this.zzb = z;
        this.zzc = z1;
        this.zze = zzgcs0;
        this.zzd = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 50;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzgQ)).booleanValue() && this.zzc) {
            return zzgch.zzh(new zzewi(null));
        }
        if(!this.zzb) {
            return zzgch.zzh(new zzewi(null));
        }
        t0 t00 = zzgch.zzo(zzgch.zzm(zzgch.zzh(null), new zzewf(), this.zze), ((long)(((Long)zzbez.zzb.zze()))), TimeUnit.MILLISECONDS, this.zzd);
        zzewg zzewg0 = (Exception exception0) -> {
            this.zza.zzw(exception0, "TrustlessTokenSignal");
            return new zzewi(null);
        };
        return zzgch.zze(t00, Exception.class, zzewg0, this.zze);
    }

    // 检测为 Lambda 实现
    final zzewi zzc(Exception exception0) [...]
}

