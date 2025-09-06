package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzdwz {
    private final ScheduledExecutorService zza;
    private final zzgcs zzb;
    private final zzgcs zzc;
    private final zzdxu zzd;
    private final zzhel zze;

    public zzdwz(ScheduledExecutorService scheduledExecutorService0, zzgcs zzgcs0, zzgcs zzgcs1, zzdxu zzdxu0, zzhel zzhel0) {
        this.zza = scheduledExecutorService0;
        this.zzb = zzgcs0;
        this.zzc = zzgcs1;
        this.zzd = zzdxu0;
        this.zze = zzhel0;
    }

    // 检测为 Lambda 实现
    final zzdyi zza(zzbvk zzbvk0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzb(zzbvk zzbvk0, int v, Throwable throwable0) throws Exception [...]

    public final t0 zzc(zzbvk zzbvk0) {
        t0 t00;
        if(zzs.zzD(zzbvk0.zzd)) {
            t00 = zzgch.zzg(new zzdyh(1));
        }
        else if(((Boolean)zzbe.zzc().zza(zzbcl.zzhn)).booleanValue()) {
            zzdwx zzdwx0 = () -> ((zzdyi)this.zzd.zza(zzbvk0).get(((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfy)))))), TimeUnit.SECONDS));
            t00 = this.zzc.zzb(zzdwx0);
        }
        else {
            t00 = this.zzd.zza(zzbvk0);
        }
        int v = Binder.getCallingUid();
        zzgby zzgby0 = (zzgby)zzgch.zzo(zzgby.zzu(t00), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzfy)))))), TimeUnit.SECONDS, this.zza);
        zzdwy zzdwy0 = (Throwable throwable0) -> {
            if(zzbvk0 != null) {
                Bundle bundle0 = zzbvk0.zzm;
                if(bundle0 != null) {
                    bundle0.putBoolean("ls", true);
                }
            }
            return zzgch.zzn(((zzdzl)this.zze.zzb()).zzd(zzbvk0, v), new zzdww(zzbvk0), this.zzb);
        };
        return (zzgby)zzgch.zzf(zzgby0, Throwable.class, zzdwy0, this.zzb);
    }
}

