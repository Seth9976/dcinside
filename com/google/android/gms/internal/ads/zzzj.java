package com.google.android.gms.internal.ads;

final class zzzj {
    private zzzi zza;
    private zzzi zzb;
    private boolean zzc;
    private long zzd;
    private int zze;

    public zzzj() {
        this.zza = new zzzi();
        this.zzb = new zzzi();
        this.zzd = 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    public final float zza() {
        return this.zza.zzf() ? ((float)(1000000000.0 / ((double)this.zza.zza()))) : -1.0f;
    }

    public final int zzb() {
        return this.zze;
    }

    // 去混淆评级： 低(20)
    public final long zzc() {
        return this.zza.zzf() ? this.zza.zza() : 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    public final long zzd() {
        return this.zza.zzf() ? this.zza.zzb() : 0x8000000000000001L;
    }

    public final void zze(long v) {
        this.zza.zzc(v);
        int v1 = 0;
        if(this.zza.zzf()) {
            this.zzc = false;
        }
        else if(this.zzd != 0x8000000000000001L) {
            if(!this.zzc || this.zzb.zze()) {
                this.zzb.zzd();
                this.zzb.zzc(this.zzd);
            }
            this.zzc = true;
            this.zzb.zzc(v);
        }
        if(this.zzc && this.zzb.zzf()) {
            zzzi zzzi0 = this.zza;
            this.zza = this.zzb;
            this.zzb = zzzi0;
            this.zzc = false;
        }
        this.zzd = v;
        if(!this.zza.zzf()) {
            v1 = this.zze + 1;
        }
        this.zze = v1;
    }

    public final void zzf() {
        this.zza.zzd();
        this.zzb.zzd();
        this.zzc = false;
        this.zzd = 0x8000000000000001L;
        this.zze = 0;
    }

    public final boolean zzg() {
        return this.zza.zzf();
    }
}

