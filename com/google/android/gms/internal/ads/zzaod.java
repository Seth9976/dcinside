package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

final class zzaod implements zzaoc {
    private final zzacq zza;
    private final zzadt zzb;
    private final zzaof zzc;
    private final zzab zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaod(zzacq zzacq0, zzadt zzadt0, zzaof zzaof0, String s, int v) throws zzbc {
        this.zza = zzacq0;
        this.zzb = zzadt0;
        this.zzc = zzaof0;
        int v1 = zzaof0.zzd;
        int v2 = zzaof0.zzb * zzaof0.zze / 8;
        if(v1 != v2) {
            throw zzbc.zza(("Expected block size: " + v2 + "; got: " + v1), null);
        }
        int v3 = zzaof0.zzc * v2;
        int v4 = Math.max(v2, v3 / 10);
        this.zze = v4;
        zzz zzz0 = new zzz();
        zzz0.zzaa(s);
        zzz0.zzy(v3 * 8);
        zzz0.zzV(v3 * 8);
        zzz0.zzR(v4);
        zzz0.zzz(zzaof0.zzb);
        zzz0.zzab(zzaof0.zzc);
        zzz0.zzU(v);
        this.zzd = zzz0.zzag();
    }

    @Override  // com.google.android.gms.internal.ads.zzaoc
    public final void zza(int v, long v1) {
        zzaoi zzaoi0 = new zzaoi(this.zzc, 1, ((long)v), v1);
        this.zza.zzO(zzaoi0);
        this.zzb.zzm(this.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(long v) {
        this.zzf = v;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaoc
    public final boolean zzc(zzaco zzaco0, long v) throws IOException {
        int v1;
        while((v1 = Long.compare(v, 0L)) > 0) {
            int v2 = this.zzg;
            int v3 = this.zze;
            if(v2 >= v3) {
                break;
            }
            int v4 = this.zzb.zzf(zzaco0, ((int)Math.min(v3 - v2, v)), true);
            if(v4 == -1) {
                v = 0L;
            }
            else {
                this.zzg += v4;
                v -= (long)v4;
            }
        }
        zzaof zzaof0 = this.zzc;
        int v5 = zzaof0.zzd;
        int v6 = this.zzg / v5;
        if(v6 > 0) {
            long v7 = this.zzf;
            long v8 = zzei.zzu(this.zzh, 1000000L, zzaof0.zzc, RoundingMode.DOWN);
            int v9 = v6 * v5;
            int v10 = this.zzg - v9;
            this.zzb.zzt(v7 + v8, 1, v9, v10, null);
            this.zzh += (long)v6;
            this.zzg = v10;
        }
        return v1 <= 0;
    }
}

