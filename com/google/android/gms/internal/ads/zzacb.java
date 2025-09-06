package com.google.android.gms.internal.ads;

public class zzacb implements zzadm {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacb(long v, long v1, int v2, int v3, boolean z) {
        long v4;
        this.zza = v;
        this.zzb = v1;
        if(v3 == -1) {
            v3 = 1;
        }
        this.zzc = v3;
        this.zze = v2;
        if(v == -1L) {
            this.zzd = -1L;
            v4 = 0x8000000000000001L;
        }
        else {
            this.zzd = v - v1;
            v4 = zzacb.zzc(v, v1, v2);
        }
        this.zzf = v4;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long v) {
        return zzacb.zzc(v, this.zzb, this.zze);
    }

    private static long zzc(long v, long v1, int v2) {
        return Math.max(0L, v - v1) * 8000000L / ((long)v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        long v1 = this.zzd;
        if(Long.compare(v1, -1L) != 0) {
            long v2 = (long)this.zzc;
            long v3 = this.zzb + Math.max(Math.min(((long)this.zze) * v / 8000000L / v2 * v2, v1 - v2), 0L);
            long v4 = this.zzb(v3);
            zzadn zzadn0 = new zzadn(v4, v3);
            if(this.zzd != -1L && v4 < v) {
                long v5 = v3 + ((long)this.zzc);
                return v5 >= this.zza ? new zzadk(zzadn0, zzadn0) : new zzadk(zzadn0, new zzadn(this.zzb(v5), v5));
            }
            return new zzadk(zzadn0, zzadn0);
        }
        zzadn zzadn1 = new zzadn(0L, this.zzb);
        return new zzadk(zzadn1, zzadn1);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return this.zzd != -1L;
    }
}

