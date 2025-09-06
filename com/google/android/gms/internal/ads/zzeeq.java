package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzeeq implements zzecw {
    private final zzcpq zza;
    private final zzedx zzb;
    private final zzgcs zzc;
    private final zzcvv zzd;
    private final ScheduledExecutorService zze;
    private final zzdrq zzf;

    public zzeeq(zzcpq zzcpq0, zzedx zzedx0, zzcvv zzcvv0, ScheduledExecutorService scheduledExecutorService0, zzgcs zzgcs0, zzdrq zzdrq0) {
        this.zza = zzcpq0;
        this.zzb = zzedx0;
        this.zzd = zzcvv0;
        this.zze = scheduledExecutorService0;
        this.zzc = zzgcs0;
        this.zzf = zzdrq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        zzeen zzeen0 = () -> {
            zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, null);
            zzcqh zzcqh0 = new zzcqh(zzfca0.zza.zza.zza(), () -> zzgch.zzr(zzgch.zzo(this.zzb.zza(zzfca0, zzfbo0), ((long)zzfbo0.zzR), TimeUnit.SECONDS, this.zze), new zzeep(this), this.zzc));
            return this.zza.zzb(zzcrp0, zzcqh0).zza();
        };
        return this.zzc.zzb(zzeen0);
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        zzbhn zzbhn0 = zzfca0.zza.zza.zza();
        boolean z = this.zzb.zzb(zzfca0, zzfbo0);
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlQ)).booleanValue()) {
            String s = "0";
            this.zzf.zzb().put("has_dbl", (zzbhn0 == null ? "0" : "1"));
            zzdrq zzdrq0 = this.zzf;
            if(z) {
                s = "1";
            }
            zzdrq0.zzb().put("crdb", s);
        }
        return zzbhn0 != null && z;
    }

    // 检测为 Lambda 实现
    final zzcom zzc(zzfca zzfca0, zzfbo zzfbo0) throws Exception [...]

    // 检测为 Lambda 实现
    final void zzf(zzfca zzfca0, zzfbo zzfbo0) [...]
}

