package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

final class zzaei {
    protected final zzadt zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private long[] zzl;
    private int[] zzm;

    public zzaei(int v, int v1, long v2, int v3, zzadt zzadt0) {
        if(v1 != 1) {
            v1 = 2;
        }
        this.zzd = v2;
        this.zze = v3;
        this.zza = zzadt0;
        this.zzb = v % 10 + 0x30 << 8 | v / 10 + 0x30 | (v1 == 2 ? 0x63640000 : 0x62770000);
        this.zzc = v1 == 2 ? v % 10 + 0x30 << 8 | v / 10 + 0x30 | 0x62640000 : -1;
        this.zzk = -1L;
        this.zzl = new long[0x200];
        this.zzm = new int[0x200];
    }

    public final zzadk zza(long v) {
        if(this.zzj != 0) {
            int v1 = (int)(v / this.zzi(1));
            int v2 = zzei.zzc(this.zzm, v1, true, true);
            if(this.zzm[v2] == v1) {
                zzadn zzadn0 = this.zzj(v2);
                return new zzadk(zzadn0, zzadn0);
            }
            zzadn zzadn1 = this.zzj(v2);
            return v2 + 1 >= this.zzl.length ? new zzadk(zzadn1, zzadn1) : new zzadk(zzadn1, this.zzj(v2 + 1));
        }
        zzadn zzadn2 = new zzadn(0L, this.zzk);
        return new zzadk(zzadn2, zzadn2);
    }

    public final void zzb(long v, boolean z) {
        if(this.zzk == -1L) {
            this.zzk = v;
        }
        if(z) {
            if(this.zzj == this.zzm.length) {
                this.zzl = Arrays.copyOf(this.zzl, this.zzl.length * 3 / 2);
                this.zzm = Arrays.copyOf(this.zzm, this.zzm.length * 3 / 2);
            }
            int v1 = this.zzj;
            this.zzl[v1] = v;
            this.zzm[v1] = this.zzi;
            this.zzj = v1 + 1;
        }
        ++this.zzi;
    }

    public final void zzc() {
        this.zzl = Arrays.copyOf(this.zzl, this.zzj);
        this.zzm = Arrays.copyOf(this.zzm, this.zzj);
    }

    public final void zzd(int v) {
        this.zzf = v;
        this.zzg = v;
    }

    public final void zze(long v) {
        if(this.zzj == 0) {
            this.zzh = 0;
            return;
        }
        this.zzh = this.zzm[zzei.zzd(this.zzl, v, true, true)];
    }

    public final boolean zzf(int v) {
        return this.zzb == v || this.zzc == v;
    }

    public final boolean zzg(zzaco zzaco0) throws IOException {
        int v = this.zzg - this.zza.zzf(zzaco0, this.zzg, false);
        this.zzg = v;
        if(v == 0) {
            if(this.zzf > 0) {
                long v1 = this.zzi(this.zzh);
                int v2 = Arrays.binarySearch(this.zzm, this.zzh) < 0 ? 0 : 1;
                this.zza.zzt(v1, v2, this.zzf, 0, null);
            }
            ++this.zzh;
        }
        return v == 0;
    }

    private static int zzh(int v, int v1) [...] // Inlined contents

    private final long zzi(int v) {
        return this.zzd * ((long)v) / ((long)this.zze);
    }

    private final zzadn zzj(int v) {
        return new zzadn(((long)this.zzm[v]) * this.zzi(1), this.zzl[v]);
    }
}

