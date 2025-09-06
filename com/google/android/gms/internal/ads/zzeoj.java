package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeoj implements zzetr {
    private final AtomicReference zza;
    private final AtomicReference zzb;
    private final Clock zzc;
    private final Executor zzd;
    private final zzetr zze;
    private final long zzf;
    private final zzdrw zzg;

    public zzeoj(zzetr zzetr0, long v, Clock clock0, Executor executor0, zzdrw zzdrw0) {
        this.zza = new AtomicReference();
        this.zzc = clock0;
        this.zze = zzetr0;
        this.zzf = v;
        this.zzd = executor0;
        this.zzg = zzdrw0;
        this.zzb = new AtomicReference(Boolean.FALSE);
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return this.zze.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeoi zzeoi0;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlF)).booleanValue()) {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzlE)).booleanValue() && !((Boolean)this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                zzeog zzeog0 = () -> {
                    zzeoh zzeoh0 = () -> {
                        zzeoi zzeoi0 = new zzeoi(zzeoj0.zze.zzb(), zzeoj0.zzf, zzeoj0.zzc);
                        zzeoj0.zza.set(zzeoi0);
                    };
                    this.zzd.execute(zzeoh0);
                };
                zzbzw.zzd.scheduleWithFixedDelay(zzeog0, this.zzf, this.zzf, TimeUnit.MILLISECONDS);
            }
            synchronized(this) {
                zzeoi0 = (zzeoi)this.zza.get();
                if(zzeoi0 == null) {
                    zzeoi zzeoi2 = new zzeoi(this.zze.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzeoi2);
                    return zzeoi2.zza;
                }
            }
            if(!((Boolean)this.zzb.get()).booleanValue() && zzeoi0.zza()) {
                t0 t00 = zzeoi0.zza;
                zzeoi zzeoi3 = new zzeoi(this.zze.zzb(), this.zzf, this.zzc);
                this.zza.set(zzeoi3);
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzlG)).booleanValue()) {
                    if(((Boolean)zzbe.zzc().zza(zzbcl.zzlH)).booleanValue()) {
                        zzdrv zzdrv0 = this.zzg.zza();
                        zzdrv0.zzb("action", "scs");
                        zzdrv0.zzb("sid", String.valueOf(this.zze.zza()));
                        zzdrv0.zzg();
                    }
                    return t00;
                }
                zzeoi0 = zzeoi3;
            }
        }
        else {
            zzeoi0 = (zzeoi)this.zza.get();
            if(zzeoi0 == null || zzeoi0.zza()) {
                zzeoi zzeoi1 = new zzeoi(this.zze.zzb(), this.zzf, this.zzc);
                this.zza.set(zzeoi1);
                return zzeoi1.zza;
            }
        }
        return zzeoi0.zza;
    }

    // 检测为 Lambda 实现
    public static void zzc(zzeoj zzeoj0) [...]

    // 检测为 Lambda 实现
    final void zzd() [...]
}

