package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzaaq {
    private final zzaal zza;
    private final zzaaj zzb;
    private final zzee zzc;
    private final zzee zzd;
    private final zzdq zze;
    @Nullable
    private zzcd zzf;
    private zzcd zzg;
    private long zzh;
    private long zzi;
    private final zzzx zzj;

    public zzaaq(zzzx zzzx0, zzaal zzaal0) {
        this.zzj = zzzx0;
        this.zza = zzaal0;
        this.zzb = new zzaaj();
        this.zzc = new zzee(10);
        this.zzd = new zzee(10);
        this.zze = new zzdq(16);
        this.zzg = zzcd.zza;
        this.zzi = 0x8000000000000001L;
    }

    public final void zza() {
        this.zze.zzc();
        this.zzi = 0x8000000000000001L;
        zzee zzee0 = this.zzd;
        if(zzee0.zza() > 0) {
            Long long0 = (Long)zzaaq.zzf(zzee0);
            long0.longValue();
            this.zzd.zzd(0L, long0);
        }
        if(this.zzf == null) {
            zzee zzee1 = this.zzc;
            if(zzee1.zza() > 0) {
                this.zzf = (zzcd)zzaaq.zzf(zzee1);
            }
            return;
        }
        this.zzc.zze();
    }

    public final void zzb(int v, int v1) {
        this.zzf = new zzcd(v, v1, 1.0f);
    }

    public final void zzc(long v, long v1) {
        this.zzd.zzd(v, v1);
    }

    public final void zzd(long v, long v1) throws zzib {
        long v4;
        while(true) {
            zzdq zzdq0 = this.zze;
            if(zzdq0.zzd()) {
                break;
            }
            long v2 = zzdq0.zza();
            Long long0 = (Long)this.zzd.zzc(v2);
            if(long0 != null && ((long)long0) != this.zzh) {
                this.zzh = (long)long0;
                this.zza.zzf();
            }
            int v3 = this.zza.zza(v2, v, v1, this.zzh, false, this.zzb);
            switch(v3) {
                case 0: 
                case 1: {
                    this.zzi = v2;
                    v4 = this.zze.zzb();
                    zzcd zzcd0 = (zzcd)this.zzc.zzc(v4);
                    if(zzcd0 != null && !zzcd0.equals(zzcd.zza) && !zzcd0.equals(this.zzg)) {
                        this.zzg = zzcd0;
                        this.zzj.zza(zzcd0);
                    }
                    break;
                }
                case 2: 
                case 3: 
                case 4: {
                    this.zzi = v2;
                    this.zze.zzb();
                    zzzx zzzx0 = this.zzj;
                    for(Object object0: zzzx0.zza.zzj) {
                        ((zzaac)object0).zzz(zzzx0.zza);
                    }
                    zzcw.zzb(null);
                    throw null;
                }
                default: {
                    return;
                }
            }
            boolean z = this.zza.zzp();
            this.zzj.zzb((v3 == 0 ? -1L : this.zzb.zzd()), v4, z);
        }
    }

    public final boolean zze(long v) {
        return this.zzi != 0x8000000000000001L && this.zzi >= v;
    }

    private static Object zzf(zzee zzee0) {
        zzcw.zzd(zzee0.zza() > 0);
        while(zzee0.zza() > 1) {
            zzee0.zzb();
        }
        Object object0 = zzee0.zzb();
        object0.getClass();
        return object0;
    }
}

