package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

final class zzezb {
    private final zzfdw zza;
    private final zzcuz zzb;
    private final Executor zzc;
    private zzeyz zzd;

    public zzezb(zzfdw zzfdw0, zzcuz zzcuz0, Executor executor0) {
        this.zza = zzfdw0;
        this.zzb = zzcuz0;
        this.zzc = executor0;
    }

    public final t0 zzc() {
        zzeyz zzeyz0 = this.zzd;
        if(zzeyz0 == null) {
            if(!((Boolean)zzbes.zza.zze()).booleanValue()) {
                zzeyz zzeyz1 = new zzeyz(null, this.zze(), null);
                this.zzd = zzeyz1;
                return zzgch.zzm(zzgch.zzh(zzeyz1), new zzeyw(), this.zzc);
            }
            zzgby zzgby0 = (zzgby)zzgch.zzm(zzgby.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyy(this), this.zzc);
            zzeyx zzeyx0 = new zzeyx(this);
            return zzgch.zzm(((zzgby)zzgch.zze(zzgby0, zzdyh.class, zzeyx0, this.zzc)), new zzeyw(), this.zzc);
        }
        return zzgch.zzh(zzeyz0);
    }

    @Deprecated
    private final zzfeg zze() {
        zzfcj zzfcj0 = this.zzb.zzg();
        return this.zza.zzc(zzfcj0.zzd, zzfcj0.zzf, zzfcj0.zzj);
    }
}

