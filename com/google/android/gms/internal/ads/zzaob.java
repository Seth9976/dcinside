package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

final class zzaob implements zzaoc {
    private static final int[] zza;
    private static final int[] zzb;
    private final zzacq zzc;
    private final zzadt zzd;
    private final zzaof zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzdy zzh;
    private final int zzi;
    private final zzab zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    static {
        zzaob.zza = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        zzaob.zzb = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 0x1F, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 0x76, 130, 0x8F, 0x9D, 0xAD, 190, 209, 230, 0xFD, 279, 307, 337, 371, 408, 449, 494, 0x220, 598, 658, 724, 796, 876, 963, 1060, 0x48E, 0x502, 0x583, 0x610, 1707, 0x756, 2066, 0x8E0, 0x9C3, 0xABD, 0xBD0, 0xCFF, 3660, 0xFBA, 4428, 0x1307, 5358, 0x1706, 6484, 7132, 7845, 8630, 9493, 10442, 0x2CDF, 0x315B, 0x364B, 0x3BB9, 0x41B2, 18500, 20350, 0x5771, 0x602F, 27086, 0x7462, 0x7FFF};
    }

    public zzaob(zzacq zzacq0, zzadt zzadt0, zzaof zzaof0) throws zzbc {
        this.zzc = zzacq0;
        this.zzd = zzadt0;
        this.zze = zzaof0;
        int v = Math.max(1, zzaof0.zzc / 10);
        this.zzi = v;
        zzdy zzdy0 = new zzdy(zzaof0.zzf);
        zzdy0.zzk();
        int v1 = zzdy0.zzk();
        this.zzf = v1;
        int v2 = zzaof0.zzb;
        int v3 = zzaof0.zzd;
        int v4 = (v3 - v2 * 4) * 8 / (zzaof0.zze * v2) + 1;
        if(v1 != v4) {
            throw zzbc.zza(("Expected frames per block: " + v4 + "; got: " + v1), null);
        }
        int v5 = (v + v1 - 1) / v1;
        this.zzg = new byte[v3 * v5];
        this.zzh = new zzdy(v5 * ((v1 + v1) * v2));
        int v6 = zzaof0.zzc * zzaof0.zzd * 8 / v1;
        zzz zzz0 = new zzz();
        zzz0.zzaa("audio/raw");
        zzz0.zzy(v6);
        zzz0.zzV(v6);
        zzz0.zzR((v + v) * v2);
        zzz0.zzz(zzaof0.zzb);
        zzz0.zzab(zzaof0.zzc);
        zzz0.zzU(2);
        this.zzj = zzz0.zzag();
    }

    @Override  // com.google.android.gms.internal.ads.zzaoc
    public final void zza(int v, long v1) {
        zzaoi zzaoi0 = new zzaoi(this.zze, this.zzf, ((long)v), v1);
        this.zzc.zzO(zzaoi0);
        this.zzd.zzm(this.zzj);
    }

    @Override  // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(long v) {
        this.zzk = 0;
        this.zzl = v;
        this.zzm = 0;
        this.zzn = 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzaoc
    public final boolean zzc(zzaco zzaco0, long v) throws IOException {
        boolean z;
        int v1 = this.zzd(this.zzm);
        int v2 = (this.zzi - v1 + this.zzf - 1) / this.zzf * this.zze.zzd;
        if(v != 0L) {
            z = false;
            goto label_6;
        }
        while(true) {
            z = true;
        label_6:
            if(z) {
                break;
            }
            int v3 = this.zzk;
            if(v3 >= v2) {
                break;
            }
            int v4 = zzaco0.zza(this.zzg, this.zzk, ((int)Math.min(v2 - v3, v)));
            if(v4 == -1) {
                continue;
            }
            this.zzk += v4;
            goto label_6;
        }
        int v5 = this.zzk / this.zze.zzd;
        if(v5 > 0) {
            byte[] arr_b = this.zzg;
            zzdy zzdy0 = this.zzh;
            for(int v6 = 0; v6 < v5; ++v6) {
                for(int v7 = 0; true; ++v7) {
                    zzaof zzaof0 = this.zze;
                    int v8 = zzaof0.zzb;
                    if(v7 >= v8) {
                        break;
                    }
                    byte[] arr_b1 = zzdy0.zzN();
                    int v9 = zzaof0.zzd / v8 - 4;
                    int v10 = v6 * zzaof0.zzd + v7 * 4;
                    int v11 = arr_b[v10 + 1] & 0xFF;
                    int v12 = arr_b[v10] & 0xFF;
                    int v13 = Math.min(arr_b[v10 + 2] & 0xFF, 88);
                    int v14 = zzaob.zzb[v13];
                    int v15 = this.zzf * v6 * v8 + v7;
                    int v16 = (short)(v11 << 8 | v12);
                    int v17 = v15 + v15;
                    arr_b1[v17] = (byte)(v16 & 0xFF);
                    arr_b1[v17 + 1] = (byte)(v16 >> 8);
                    int v18 = 0;
                    while(v18 < v9 + v9) {
                        int v19 = arr_b[v8 * 4 + v10 + v18 / 8 * v8 * 4 + v18 / 2 % 4];
                        int v20 = v18 % 2 == 0 ? v19 & 15 : (v19 & 0xFF) >> 4;
                        v16 = Math.max(0xFFFF8000, Math.min(v16 + ((v20 & 8) == 0 ? ((v20 & 7) * 2 + 1) * v14 >> 3 : -(((v20 & 7) * 2 + 1) * v14 >> 3)), 0x7FFF));
                        int v21 = v8 * 2 + v17;
                        arr_b1[v21] = (byte)(v16 & 0xFF);
                        arr_b1[v21 + 1] = (byte)(v16 >> 8);
                        v13 = Math.max(0, Math.min(v13 + zzaob.zza[v20], 88));
                        v14 = zzaob.zzb[v13];
                        ++v18;
                        v17 = v21;
                    }
                }
            }
            zzdy0.zzL(0);
            zzdy0.zzK(this.zze(this.zzf * v5));
            this.zzk -= v5 * this.zze.zzd;
            int v22 = this.zzh.zze();
            this.zzd.zzr(this.zzh, v22);
            int v23 = this.zzm + v22;
            this.zzm = v23;
            int v24 = this.zzd(v23);
            int v25 = this.zzi;
            if(v24 >= v25) {
                this.zzf(v25);
            }
        }
        if(z) {
            int v26 = this.zzd(this.zzm);
            if(v26 > 0) {
                this.zzf(v26);
            }
        }
        return z;
    }

    private final int zzd(int v) {
        int v1 = this.zze.zzb;
        return v / (v1 + v1);
    }

    private final int zze(int v) {
        return (v + v) * this.zze.zzb;
    }

    private final void zzf(int v) {
        long v1 = this.zzl;
        long v2 = zzei.zzu(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int v3 = this.zze(v);
        this.zzd.zzt(v1 + v2, 1, v3, this.zzm - v3, null);
        this.zzn += (long)v;
        this.zzm -= v3;
    }
}

