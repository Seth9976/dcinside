package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzahx implements zzahu {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    @Nullable
    private final long[] zzg;

    private zzahx(long v, int v1, long v2, int v3, long v4, @Nullable long[] arr_v) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzg = arr_v;
        this.zzf = v4 == -1L ? -1L : v + v4;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Nullable
    public static zzahx zzb(zzahw zzahw0, long v) {
        long v1 = zzahw0.zza();
        if(v1 == 0x8000000000000001L) {
            return null;
        }
        long v2 = zzahw0.zzc;
        if(v2 != -1L) {
            return zzahw0.zzf == null ? new zzahx(v, zzahw0.zza.zzc, v1, zzahw0.zza.zzf, -1L, null) : new zzahx(v, zzahw0.zza.zzc, v1, zzahw0.zza.zzf, v2, zzahw0.zzf);
        }
        return new zzahx(v, zzahw0.zza.zzc, v1, zzahw0.zza.zzf, -1L, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zze(long v) {
        if(this.zzh()) {
            long v1 = v - this.zza;
            if(v1 > ((long)this.zzb)) {
                zzcw.zzb(this.zzg);
                double f = ((double)v1) * 256.0 / ((double)this.zze);
                int v2 = zzei.zzd(this.zzg, ((long)f), true, true);
                long v3 = this.zzf(v2);
                long v4 = this.zzg[v2];
                long v5 = this.zzf(v2 + 1);
                long v6 = v2 == 99 ? 0x100L : this.zzg[v2 + 1];
                return v4 == v6 ? v3 + Math.round(0.0 * ((double)(v5 - v3))) : v3 + Math.round((f - ((double)v4)) / ((double)(v6 - v4)) * ((double)(v5 - v3)));
            }
        }
        return 0L;
    }

    private final long zzf(int v) {
        return this.zzc * ((long)v) / 100L;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        if(!this.zzh()) {
            zzadn zzadn0 = new zzadn(0L, this.zza + ((long)this.zzb));
            return new zzadk(zzadn0, zzadn0);
        }
        long v1 = Math.max(0L, Math.min(v, this.zzc));
        double f = ((double)v1) * 100.0 / ((double)this.zzc);
        double f1 = 0.0;
        if(f > 0.0) {
            if(f >= 100.0) {
                f1 = 256.0;
            }
            else {
                zzcw.zzb(this.zzg);
                double f2 = (double)this.zzg[((int)f)];
                f1 = f2 + (f - ((double)(((int)f)))) * ((((int)f) == 99 ? 256.0 : ((double)this.zzg[((int)f) + 1])) - f2);
            }
        }
        zzadn zzadn1 = new zzadn(v1, this.zza + Math.max(this.zzb, Math.min(Math.round(f1 / 256.0 * ((double)this.zze)), this.zze - 1L)));
        return new zzadk(zzadn1, zzadn1);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return this.zzg != null;
    }
}

