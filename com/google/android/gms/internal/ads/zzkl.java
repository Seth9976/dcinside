package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzkl {
    public final zzue zza;
    public final Object zzb;
    public final zzvy[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzkm zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzlm[] zzj;
    private final zzyb zzk;
    private final zzla zzl;
    @Nullable
    private zzkl zzm;
    private zzwj zzn;
    private zzyc zzo;
    private long zzp;

    public zzkl(zzlm[] arr_zzlm, long v, zzyb zzyb0, zzyk zzyk0, zzla zzla0, zzkm zzkm0, zzyc zzyc0, long v1) {
        this.zzj = arr_zzlm;
        this.zzp = v;
        this.zzk = zzyb0;
        this.zzl = zzla0;
        this.zzb = zzkm0.zza.zza;
        this.zzg = zzkm0;
        this.zzn = zzwj.zza;
        this.zzo = zzyc0;
        this.zzc = new zzvy[2];
        this.zzi = new boolean[2];
        long v2 = zzkm0.zzd;
        zzue zzue0 = zzla0.zzp(zzkm0.zza, zzyk0, zzkm0.zzb);
        if(v2 != 0x8000000000000001L) {
            zzue0 = new zztk(zzue0, true, 0L, v2);
        }
        this.zza = zzue0;
    }

    public final long zza(zzyc zzyc0, long v, boolean z) {
        return this.zzb(zzyc0, v, false, new boolean[2]);
    }

    public final long zzb(zzyc zzyc0, long v, boolean z, boolean[] arr_z) {
        for(int v1 = 0; true; ++v1) {
            boolean z1 = true;
            if(v1 >= zzyc0.zza) {
                break;
            }
            boolean[] arr_z1 = this.zzi;
            if(z || !zzyc0.zza(this.zzo, v1)) {
                z1 = false;
            }
            arr_z1[v1] = z1;
        }
        for(int v2 = 0; true; ++v2) {
            zzlm[] arr_zzlm = this.zzj;
            if(v2 >= 2) {
                break;
            }
            arr_zzlm[v2].zzb();
        }
        this.zzu();
        this.zzo = zzyc0;
        this.zzv();
        long v3 = this.zza.zzf(zzyc0.zzc, this.zzi, this.zzc, arr_z, v);
        for(int v4 = 0; true; ++v4) {
            zzlm[] arr_zzlm1 = this.zzj;
            if(v4 >= 2) {
                break;
            }
            arr_zzlm1[v4].zzb();
        }
        this.zzf = false;
        for(int v5 = 0; true; ++v5) {
            zzvy[] arr_zzvy = this.zzc;
            if(v5 >= 2) {
                break;
            }
            if(arr_zzvy[v5] == null) {
                zzcw.zzf(zzyc0.zzc[v5] == null);
            }
            else {
                zzcw.zzf(zzyc0.zzb(v5));
                this.zzj[v5].zzb();
                this.zzf = true;
            }
        }
        return v3;
    }

    public final long zzc() {
        if(!this.zze) {
            return this.zzg.zzb;
        }
        long v = this.zzf ? this.zza.zzb() : 0x8000000000000000L;
        return v == 0x8000000000000000L ? this.zzg.zze : v;
    }

    public final long zzd() {
        return this.zze ? this.zza.zzc() : 0L;
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    @Nullable
    public final zzkl zzg() {
        return this.zzm;
    }

    public final zzwj zzh() {
        return this.zzn;
    }

    public final zzyc zzi() {
        return this.zzo;
    }

    public final zzyc zzj(float f, zzbq zzbq0, boolean z) throws zzib {
        zzyc zzyc0 = this.zzk.zzo(this.zzj, this.zzn, this.zzg.zza, zzbq0);
        for(int v1 = 0; true; ++v1) {
            boolean z1 = true;
            if(v1 >= zzyc0.zza) {
                break;
            }
            if(zzyc0.zzb(v1)) {
                if(zzyc0.zzc[v1] == null) {
                    this.zzj[v1].zzb();
                    z1 = false;
                }
            }
            else if(zzyc0.zzc[v1] != null) {
                z1 = false;
            }
            zzcw.zzf(z1);
        }
        zzxv[] arr_zzxv = zzyc0.zzc;
        for(int v = 0; v < arr_zzxv.length; ++v) {
            zzxv zzxv0 = arr_zzxv[v];
        }
        return zzyc0;
    }

    public final void zzk(zzkj zzkj0) {
        zzcw.zzf(this.zzw());
        this.zza.zzo(zzkj0);
    }

    public final void zzl(float f, zzbq zzbq0, boolean z) throws zzib {
        this.zze = true;
        this.zzn = this.zza.zzh();
        zzyc zzyc0 = this.zzj(f, zzbq0, z);
        long v = this.zzg.zzb;
        long v1 = this.zzg.zze;
        if(v1 != 0x8000000000000001L && v >= v1) {
            v = Math.max(0L, v1 - 1L);
        }
        long v2 = this.zza(zzyc0, v, false);
        this.zzp += this.zzg.zzb - v2;
        this.zzg = this.zzg.zzb(v2);
    }

    public final void zzm(zzud zzud0, long v) {
        this.zzd = true;
        this.zza.zzl(zzud0, v);
    }

    public final void zzn(long v) {
        zzcw.zzf(this.zzw());
        if(this.zze) {
            this.zza.zzm(v - this.zzp);
        }
    }

    public final void zzo() {
        this.zzu();
        zzue zzue0 = this.zza;
        zzla zzla0 = this.zzl;
        try {
            if(zzue0 instanceof zztk) {
                zzla0.zzi(((zztk)zzue0).zza);
                return;
            }
            zzla0.zzi(zzue0);
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        zzdo.zzd("MediaPeriodHolder", "Period release failed.", runtimeException0);
    }

    public final void zzp(@Nullable zzkl zzkl0) {
        if(zzkl0 == this.zzm) {
            return;
        }
        this.zzu();
        this.zzm = zzkl0;
        this.zzv();
    }

    public final void zzq(long v) {
        this.zzp = v;
    }

    public final void zzr() {
        zzue zzue0 = this.zza;
        if(zzue0 instanceof zztk) {
            ((zztk)zzue0).zzn(0L, (this.zzg.zzd == 0x8000000000000001L ? 0x8000000000000000L : this.zzg.zzd));
        }
    }

    // 去混淆评级： 低(20)
    public final boolean zzs() {
        return this.zze && (!this.zzf || this.zza.zzb() == 0x8000000000000000L);
    }

    // 去混淆评级： 低(20)
    public final boolean zzt() {
        return this.zze && (this.zzs() || this.zzc() - this.zzg.zzb >= 0x8000000000000001L);
    }

    private final void zzu() {
        if(this.zzw()) {
            for(int v = 0; v < this.zzo.zza; ++v) {
                zzxv zzxv0 = this.zzo.zzc[v];
            }
        }
    }

    private final void zzv() {
        if(this.zzw()) {
            for(int v = 0; v < this.zzo.zza; ++v) {
                zzxv zzxv0 = this.zzo.zzc[v];
            }
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }
}

