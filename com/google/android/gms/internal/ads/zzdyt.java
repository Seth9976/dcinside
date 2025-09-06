package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.concurrent.ExecutionException;

public final class zzdyt {
    private final zzgcs zza;
    private final zzdxy zzb;
    private final zzhel zzc;

    public zzdyt(zzgcs zzgcs0, zzdxy zzdxy0, zzhel zzhel0) {
        this.zza = zzgcs0;
        this.zzb = zzdxy0;
        this.zzc = zzhel0;
    }

    public final t0 zza(zzbvk zzbvk0) {
        zzdym zzdym0 = new zzdym(zzbvk0);
        Objects.requireNonNull(this.zzb);
        return this.zzg(zzbvk0, new zzdyn(this.zzb), (zzbvk zzbvk0) -> ((zzdzl)this.zzc.zzb()).zzb(zzbvk0, Binder.getCallingUid()), zzdym0);
    }

    // 检测为 Lambda 实现
    final t0 zzb(zzdys zzdys0, zzbvk zzbvk0, zzgbo zzgbo0, zzdyh zzdyh0) throws Exception [...]

    // 检测为 Lambda 实现
    final t0 zzc(zzbvk zzbvk0) [...]

    // 检测为 Lambda 实现
    final t0 zzd(zzbvk zzbvk0) [...]

    // 检测为 Lambda 实现
    final t0 zze(zzbvk zzbvk0) [...]

    public final t0 zzf(zzbvk zzbvk0) {
        zzdyj zzdyj0 = new zzdyj();
        return this.zzg(zzbvk0, (zzbvk zzbvk0) -> this.zzb.zzd(zzbvk0.zzh), (zzbvk zzbvk0) -> ((zzdzl)this.zzc.zzb()).zzj(zzbvk0.zzh), zzdyj0);
    }

    private final t0 zzg(zzbvk zzbvk0, zzdys zzdys0, zzdys zzdys1, zzgbo zzgbo0) {
        t0 t00;
        if(zzs.zzD(zzbvk0.zzd)) {
            t00 = zzgch.zzg(new zzdyh(1));
        }
        else {
            t0 t01 = zzdys0.zza(zzbvk0);
            zzdyr zzdyr0 = new zzdyr();
            t00 = zzgch.zzf(t01, ExecutionException.class, zzdyr0, this.zza);
        }
        zzgby zzgby0 = (zzgby)zzgch.zzn(((zzgby)zzgch.zzn(zzgby.zzu(t00), new zzdyp(), this.zza)), zzgbo0, this.zza);
        zzdyq zzdyq0 = (zzdyh zzdyh0) -> zzgch.zzn(zzdys1.zza(zzbvk0), zzgbo0, this.zza);
        return (zzgby)zzgch.zzf(zzgby0, zzdyh.class, zzdyq0, this.zza);
    }
}

