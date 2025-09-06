package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzia implements zzkk {
    private final zzls zza;
    private final zzhz zzb;
    @Nullable
    private zzlj zzc;
    @Nullable
    private zzkk zzd;
    private boolean zze;
    private boolean zzf;

    public zzia(zzhz zzhz0, zzcx zzcx0) {
        this.zzb = zzhz0;
        this.zza = new zzls(zzcx0);
        this.zze = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        if(this.zze) {
            return this.zza.zza();
        }
        zzkk zzkk0 = this.zzd;
        zzkk0.getClass();
        return zzkk0.zza();
    }

    public final long zzb(boolean z) {
        if(this.zzc == null || this.zzc.zzW() || z && this.zzc.zzcT() != 2 || !this.zzc.zzX() && (z || this.zzc.zzQ())) {
            this.zze = true;
            if(this.zzf) {
                this.zza.zzd();
            }
        }
        else {
            zzkk zzkk0 = this.zzd;
            zzkk0.getClass();
            long v = zzkk0.zza();
            if(this.zze) {
                if(v < this.zza.zza()) {
                    this.zza.zze();
                    return this.zza();
                }
                this.zze = false;
                if(this.zzf) {
                    this.zza.zzd();
                }
            }
            this.zza.zzb(v);
            zzbe zzbe0 = zzkk0.zzc();
            if(!zzbe0.equals(this.zza.zzc())) {
                this.zza.zzg(zzbe0);
                this.zzb.zza(zzbe0);
                return this.zza();
            }
        }
        return this.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        return this.zzd == null ? this.zza.zzc() : this.zzd.zzc();
    }

    public final void zzd(zzlj zzlj0) {
        if(zzlj0 == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlj zzlj0) throws zzib {
        zzkk zzkk0 = zzlj0.zzl();
        if(zzkk0 != null) {
            zzkk zzkk1 = this.zzd;
            if(zzkk0 != zzkk1) {
                if(zzkk1 != null) {
                    throw zzib.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                }
                this.zzd = zzkk0;
                this.zzc = zzlj0;
                zzkk0.zzg(this.zza.zzc());
            }
        }
    }

    public final void zzf(long v) {
        this.zza.zzb(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbe0) {
        zzkk zzkk0 = this.zzd;
        if(zzkk0 != null) {
            zzkk0.zzg(zzbe0);
            zzbe0 = this.zzd.zzc();
        }
        this.zza.zzg(zzbe0);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        if(this.zze) {
            return false;
        }
        zzkk zzkk0 = this.zzd;
        zzkk0.getClass();
        return zzkk0.zzj();
    }
}

