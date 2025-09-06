package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zznz {
    final zzoa zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzug zze;
    private boolean zzf;
    private boolean zzg;

    public zznz(zzoa zzoa0, String s, @Nullable int v, zzug zzug0) {
        this.zza = zzoa0;
        super();
        this.zzb = s;
        this.zzc = v;
        this.zzd = zzug0 == null ? -1L : zzug0.zzd;
        if(zzug0 != null && zzug0.zzb()) {
            this.zze = zzug0;
        }
    }

    static void zze(zznz zznz0, boolean z) {
        zznz0.zzg = true;
    }

    static void zzf(zznz zznz0, boolean z) {
        zznz0.zzf = true;
    }

    public final void zzg(int v, @Nullable zzug zzug0) {
        if(this.zzd == -1L && v == this.zzc && zzug0 != null) {
            long v1 = zzug0.zzd;
            if(v1 >= this.zza.zzl()) {
                this.zzd = v1;
            }
        }
    }

    public final boolean zzj(int v, @Nullable zzug zzug0) {
        if(zzug0 == null) {
            return v == this.zzc;
        }
        return this.zze == null ? !zzug0.zzb() && zzug0.zzd == this.zzd : zzug0.zzd == this.zze.zzd && zzug0.zzb == this.zze.zzb && zzug0.zzc == this.zze.zzc;
    }

    public final boolean zzk(zzlu zzlu0) {
        zzug zzug0 = zzlu0.zzd;
        if(zzug0 == null) {
            return this.zzc != zzlu0.zzc;
        }
        long v = this.zzd;
        if(v == -1L) {
            return false;
        }
        if(zzug0.zzd > v) {
            return true;
        }
        if(this.zze == null) {
            return false;
        }
        int v1 = zzlu0.zzb.zza(zzug0.zza);
        int v2 = zzlu0.zzb.zza(this.zze.zza);
        zzug zzug1 = zzlu0.zzd;
        if(zzug1.zzd >= this.zze.zzd && v1 >= v2) {
            if(v1 > v2) {
                return true;
            }
            if(zzug1.zzb()) {
                int v3 = zzlu0.zzd.zzb;
                int v4 = this.zze.zzb;
                return v3 > v4 || v3 == v4 && zzlu0.zzd.zzc > this.zze.zzc;
            }
            int v5 = zzlu0.zzd.zze;
            return v5 == -1 || v5 > this.zze.zzb;
        }
        return false;
    }

    public final boolean zzl(zzbq zzbq0, zzbq zzbq1) {
        int v = this.zzc;
        if(v < zzbq0.zzc()) {
            zzbq0.zze(v, this.zza.zzc, 0L);
            for(int v1 = this.zza.zzc.zzn; v1 <= this.zza.zzc.zzo; ++v1) {
                int v2 = zzbq1.zza(zzbq0.zzf(v1));
                if(v2 != -1) {
                    v = zzbq1.zzd(v2, this.zza.zzd, false).zzc;
                    break;
                }
            }
        }
        else if(v >= zzbq1.zzc()) {
        }
        this.zzc = v;
        if(v == -1) {
            return false;
        }
        return this.zze == null ? true : zzbq1.zza(this.zze.zza) != -1;
    }
}

