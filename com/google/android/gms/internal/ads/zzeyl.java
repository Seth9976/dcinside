package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzeyl implements zzezf {
    private final zzezf zza;
    private final zzezf zzb;
    private final zzfes zzc;
    private final String zzd;
    private zzcuz zze;
    private final Executor zzf;

    public zzeyl(zzezf zzezf0, zzezf zzezf1, zzfes zzfes0, String s, Executor executor0) {
        this.zza = zzezf0;
        this.zzb = zzezf1;
        this.zzc = zzfes0;
        this.zzd = s;
        this.zzf = executor0;
    }

    public final zzcuz zza() {
        synchronized(this) {
        }
        return this.zze;
    }

    // 检测为 Lambda 实现
    final t0 zzb(zzezg zzezg0, zzeyk zzeyk0, zzeze zzeze0, zzcuz zzcuz0, zzeyq zzeyq0) throws Exception [...]

    @Override  // com.google.android.gms.internal.ads.zzezf
    public final t0 zzc(zzezg zzezg0, zzeze zzeze0, Object object0) {
        return this.zzf(zzezg0, zzeze0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzezf
    public final Object zzd() {
        return this.zza();
    }

    // 检测为 Lambda 实现
    final t0 zze(zzfep zzfep0) throws Exception [...]

    public final t0 zzf(zzezg zzezg0, zzeze zzeze0, zzcuz zzcuz0) {
        synchronized(this) {
            zzcuy zzcuy0 = zzeze0.zza(zzezg0.zzb);
            zzcuy0.zza(new zzeym(this.zzd));
            Object object0 = zzcuy0.zzh();
            ((zzcuz)object0).zzg();
            ((zzcuz)object0).zzg();
            zzm zzm0 = ((zzcuz)object0).zzg().zzd;
            if(zzm0.zzs == null && zzm0.zzx == null) {
                zzfcj zzfcj0 = ((zzcuz)object0).zzg();
                zzeyk zzeyk0 = new zzeyk(zzeze0, zzezg0, zzfcj0.zzd, zzfcj0.zzf, this.zzf, zzfcj0.zzj, null);
                return (zzgby)zzgch.zzn(zzgby.zzu(((zzeyr)this.zzb).zzb(zzezg0, zzeze0, ((zzcuz)object0))), (zzeyq zzeyq0) -> {
                    if(zzeyq0 != null) {
                        zzeyk zzeyk1 = new zzeyk(zzeyk0.zza, zzeyk0.zzb, zzeyk0.zzc, zzeyk0.zzd, zzeyk0.zze, zzeyk0.zzf, zzeyq0.zza);
                        if(zzeyq0.zzc != null) {
                            this.zze = null;
                            this.zzc.zze(zzeyk1);
                            return this.zzg(zzeyq0.zzc, zzezg0);
                        }
                        t0 t00 = this.zzc.zza(zzeyk1);
                        if(t00 != null) {
                            this.zze = null;
                            return zzgch.zzn(t00, (zzfep zzfep0) -> {
                                if(zzfep0 != null && zzfep0.zza != null) {
                                    zzfer zzfer0 = zzfep0.zzb;
                                    if(zzfer0 != null) {
                                        zzbbq.zzb.zzc zzbbq$zzb$zzc0 = zzbbq.zzb.zzd();
                                        zzbbq.zzb.zza.zza zzbbq$zzb$zza$zza0 = zzbbq.zzb.zza.zza();
                                        zzbbq$zzb$zza$zza0.zzf(zzbbq.zzb.zzd.zzb);
                                        zzbbq$zzb$zza$zza0.zzh(zzbbq.zzb.zze.zzi());
                                        zzbbq$zzb$zzc0.zzd(zzbbq$zzb$zza$zza0);
                                        zzbbq.zzb zzbbq$zzb0 = (zzbbq.zzb)zzbbq$zzb$zzc0.zzbn();
                                        zzfep0.zza.zza.zzb().zzc().zzm(zzbbq$zzb0);
                                        return this.zzg(zzfep0.zza, ((zzeyk)zzfer0).zzb);
                                    }
                                }
                                throw new zzdvy(1, "Empty prefetch");
                            }, this.zzf);
                        }
                        this.zzc.zze(zzeyk1);
                        zzezg0 = new zzezg(zzezg0.zzb, zzeyq0.zzb);
                    }
                    t0 t01 = ((zzeyv)this.zza).zzb(zzezg0, zzeze0, ((zzcuz)object0));
                    this.zze = ((zzcuz)object0);
                    return t01;
                }, this.zzf);
            }
            this.zze = (zzcuz)object0;
            return ((zzeyv)this.zza).zzb(zzezg0, zzeze0, ((zzcuz)object0));
        }
    }

    private final t0 zzg(zzfef zzfef0, zzezg zzezg0) {
        zzcuz zzcuz0 = zzfef0.zza;
        this.zze = zzcuz0;
        if(zzfef0.zzc != null) {
            if(zzcuz0.zzf() != null) {
                zzfef0.zzc.zzp().zzl(zzfef0.zza.zzf());
            }
            return zzgch.zzh(zzfef0.zzc);
        }
        zzcuz0.zzb().zzk(zzfef0.zzb);
        return ((zzeyv)this.zza).zzb(zzezg0, null, zzfef0.zza);
    }
}

