package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzanq {
    private final zzef zza;
    private final zzdy zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private long zzh;

    zzanq(int v) {
        this.zza = new zzef(0L);
        this.zzf = 0x8000000000000001L;
        this.zzg = 0x8000000000000001L;
        this.zzh = 0x8000000000000001L;
        this.zzb = new zzdy();
    }

    public final int zza(zzaco zzaco0, zzadj zzadj0, int v) throws IOException {
        long v1 = 0x8000000000000001L;
        if(v <= 0) {
            this.zze(zzaco0);
            return 0;
        }
        if(!this.zze) {
            long v2 = zzaco0.zzd();
            int v3 = (int)Math.min(112800L, v2);
            long v4 = v2 - ((long)v3);
            if(zzaco0.zzf() != v4) {
                zzadj0.zza = v4;
                return 1;
            }
            this.zzb.zzI(v3);
            zzaco0.zzj();
            zzaco0.zzh(this.zzb.zzN(), 0, v3);
            zzdy zzdy0 = this.zzb;
            int v5 = zzdy0.zzd();
            int v6 = zzdy0.zze();
            int v7 = v6 - 0xBC;
        alab1:
            while(v7 >= v5) {
                byte[] arr_b = zzdy0.zzN();
                int v8 = 0;
                int v9 = -4;
                while(v9 <= 4) {
                    int v10 = v9 * 0xBC + v7;
                    if(v10 < v5 || v10 >= v6 || arr_b[v10] != 71) {
                        v8 = 0;
                    }
                    else if(v8 + 1 == 5) {
                        goto label_31;
                    }
                    else {
                        ++v8;
                    }
                    ++v9;
                    continue;
                label_31:
                    long v11 = zzanz.zzb(zzdy0, v7, v);
                    if(v11 == 0x8000000000000001L) {
                        break;
                    }
                    v1 = v11;
                    break alab1;
                }
                --v7;
            }
            this.zzg = v1;
            this.zze = true;
            return 0;
        }
        if(this.zzg == 0x8000000000000001L) {
            this.zze(zzaco0);
            return 0;
        }
        if(!this.zzd) {
            int v12 = (int)Math.min(112800L, zzaco0.zzd());
            if(zzaco0.zzf() != 0L) {
                zzadj0.zza = 0L;
                return 1;
            }
            this.zzb.zzI(v12);
            zzaco0.zzj();
            zzaco0.zzh(this.zzb.zzN(), 0, v12);
            zzdy zzdy1 = this.zzb;
            int v13 = zzdy1.zzd();
            int v14 = zzdy1.zze();
            while(v13 < v14) {
                if(zzdy1.zzN()[v13] == 71) {
                    long v15 = zzanz.zzb(zzdy1, v13, v);
                    if(v15 != 0x8000000000000001L) {
                        v1 = v15;
                        break;
                    }
                }
                ++v13;
            }
            this.zzf = v1;
            this.zzd = true;
            return 0;
        }
        long v16 = this.zzf;
        if(v16 == 0x8000000000000001L) {
            this.zze(zzaco0);
            return 0;
        }
        long v17 = this.zza.zzb(v16);
        this.zzh = this.zza.zzc(this.zzg) - v17;
        this.zze(zzaco0);
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzef zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    private final int zze(zzaco zzaco0) {
        this.zzb.zzJ(zzei.zzf, 0);
        this.zzc = true;
        zzaco0.zzj();
        return 0;
    }
}

