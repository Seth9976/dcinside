package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzanh {
    private final zzef zza;
    private final zzdy zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    zzanh() {
        this.zza = new zzef(0L);
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = 0x8000000000000001L;
        this.zzb = new zzdy();
    }

    public final int zza(zzaco zzaco0, zzadj zzadj0) throws IOException {
        long v = 0x8000000000000001L;
        if(!this.zze) {
            long v1 = zzaco0.zzd();
            int v2 = (int)Math.min(20000L, v1);
            long v3 = v1 - ((long)v2);
            if(zzaco0.zzf() != v3) {
                zzadj0.zza = v3;
                return 1;
            }
            this.zzb.zzI(v2);
            zzaco0.zzj();
            zzaco0.zzh(this.zzb.zzN(), 0, v2);
            zzdy zzdy0 = this.zzb;
            int v4 = zzdy0.zzd();
            for(int v5 = zzdy0.zze() - 4; v5 >= v4; --v5) {
                if(zzanh.zzg(zzdy0.zzN(), v5) == 442) {
                    zzdy0.zzL(v5 + 4);
                    long v6 = zzanh.zzc(zzdy0);
                    if(v6 != 0x8000000000000001L) {
                        v = v6;
                        break;
                    }
                }
            }
            this.zzg = v;
            this.zze = true;
            return 0;
        }
        if(this.zzg == 0x8000000000000001L) {
            this.zzf(zzaco0);
            return 0;
        }
        if(!this.zzd) {
            int v7 = (int)Math.min(20000L, zzaco0.zzd());
            if(zzaco0.zzf() != 0L) {
                zzadj0.zza = 0L;
                return 1;
            }
            this.zzb.zzI(v7);
            zzaco0.zzj();
            zzaco0.zzh(this.zzb.zzN(), 0, v7);
            zzdy zzdy1 = this.zzb;
            int v8 = zzdy1.zzd();
            int v9 = zzdy1.zze();
            while(v8 < v9 - 3) {
                if(zzanh.zzg(zzdy1.zzN(), v8) == 442) {
                    zzdy1.zzL(v8 + 4);
                    long v10 = zzanh.zzc(zzdy1);
                    if(v10 != 0x8000000000000001L) {
                        v = v10;
                        break;
                    }
                }
                ++v8;
            }
            this.zzf = v;
            this.zzd = true;
            return 0;
        }
        long v11 = this.zzf;
        if(v11 == 0x8000000000000001L) {
            this.zzf(zzaco0);
            return 0;
        }
        long v12 = this.zza.zzb(v11);
        this.zzh = this.zza.zzc(this.zzg) - v12;
        this.zzf(zzaco0);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public static long zzc(zzdy zzdy0) {
        int v = zzdy0.zzd();
        if(zzdy0.zzb() >= 9) {
            byte[] arr_b = new byte[9];
            zzdy0.zzH(arr_b, 0, 9);
            zzdy0.zzL(v);
            int v1 = arr_b[0];
            if((v1 & 0xC4) == 68) {
                int v2 = arr_b[2];
                if((v2 & 4) == 4) {
                    int v3 = arr_b[4];
                    return (v3 & 4) != 4 || (arr_b[5] & 1) != 1 || (arr_b[8] & 3) != 3 ? 0x8000000000000001L : (((long)v2) & 3L) << 13 | ((((long)arr_b[1]) & 0xFFL) << 20 | ((((long)v1) & 3L) << 28 | (((long)v1) & 56L) >> 3 << 30) | (0xF8L & ((long)v2)) >> 3 << 15) | (((long)arr_b[3]) & 0xFFL) << 5 | (((long)v3) & 0xF8L) >> 3;
                }
            }
        }
        return 0x8000000000000001L;
    }

    public final zzef zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }

    private final int zzf(zzaco zzaco0) {
        this.zzb.zzJ(zzei.zzf, 0);
        this.zzc = true;
        zzaco0.zzj();
        return 0;
    }

    private static final int zzg(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }
}

