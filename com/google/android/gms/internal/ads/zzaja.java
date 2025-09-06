package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class zzaja {
    private static final int[] zza;

    static {
        zzaja.zza = new int[]{0x69736F6D, 0x69736F32, 0x69736F33, 0x69736F34, 0x69736F35, 0x69736F36, 0x69736F39, 0x61766331, 1752589105, 0x68657631, 0x61763031, 0x6D703431, 0x6D703432, 862401121, 862401122, 0x33677236, 0x33677336, 0x33676536, 0x33676736, 0x4D345620, 0x4D344120, 0x66347620, 1801741417, 1295275600, 0x71742020, 1297305174, 0x64627931, 0x69736D6C, 0x70696666};
    }

    @Nullable
    public static zzadq zza(zzaco zzaco0) throws IOException {
        return zzaja.zzc(zzaco0, true, false);
    }

    @Nullable
    public static zzadq zzb(zzaco zzaco0, boolean z) throws IOException {
        return zzaja.zzc(zzaco0, false, z);
    }

    @Nullable
    private static zzadq zzc(zzaco zzaco0, boolean z, boolean z1) throws IOException {
        int v12;
        int[] arr_v;
        long v10;
        int v9;
        int v8;
        long v = zzaco0.zzd();
        long v1 = 0x1000L;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v <= 0x1000L) {
            v1 = v;
        }
        zzdy zzdy0 = new zzdy(0x40);
        int v3 = (int)v1;
        boolean z2 = false;
        int v4 = 0;
        int v5 = 0;
    label_10:
        while(v4 < v3) {
            zzdy0.zzI(8);
            if(!zzaco0.zzm(zzdy0.zzN(), 0, 8, true)) {
                break;
            }
            long v6 = zzdy0.zzu();
            int v7 = zzdy0.zzg();
            if(v6 == 1L) {
                zzaco0.zzh(zzdy0.zzN(), 8, 8);
                v8 = 16;
                zzdy0.zzK(16);
                v9 = v3;
                v10 = zzdy0.zzt();
            }
            else {
                if(v6 == 0L) {
                    long v11 = zzaco0.zzd();
                    if(v11 != -1L) {
                        v6 = v11 - zzaco0.zze() + 8L;
                    }
                }
                v9 = v3;
                v10 = v6;
                v8 = 8;
            }
            if(v10 < ((long)v8)) {
                return new zzahy(v7, v10, v8);
            }
            v4 += v8;
            if(v7 == 0x6D6F6F76) {
                v3 = v2 == 0 || ((long)(v9 + ((int)v10))) <= v ? v9 + ((int)v10) : ((int)v);
                z2 = false;
            }
            else {
                z2 = true;
                switch(v7) {
                    case 1835295092: {
                        v12 = 0;
                    label_41:
                        v5 |= v12 ^ 1;
                        if(((long)v4) + v10 - ((long)v8) >= ((long)v9)) {
                            z2 = false;
                            break label_10;
                        }
                        z2 = false;
                        int v13 = (int)(v10 - ((long)v8));
                        v4 += v13;
                        if(v7 == 0x66747970) {
                            if(v13 < 8) {
                                return new zzahy(0x66747970, ((long)v13), 8);
                            }
                            zzdy0.zzI(v13);
                            zzaco0.zzh(zzdy0.zzN(), 0, v13);
                            int v14 = zzdy0.zzg();
                            int v15 = zzaja.zzd(v14, z1) | v5;
                            zzdy0.zzM(4);
                            int v16 = zzdy0.zzb() / 4;
                            if(v15 != 0 || v16 <= 0) {
                                arr_v = null;
                            }
                            else {
                                arr_v = new int[v16];
                                for(int v17 = 0; v17 < v16; ++v17) {
                                    int v18 = zzdy0.zzg();
                                    arr_v[v17] = v18;
                                    if(zzaja.zzd(v18, z1)) {
                                        v15 = 1;
                                        break;
                                    }
                                }
                            }
                            if(v15 != 0) {
                                v5 = v15;
                                v3 = v9;
                                continue;
                            }
                            return new zzajf(v14, arr_v);
                        }
                        else if(v13 != 0) {
                            zzaco0.zzg(v13);
                        }
                        v3 = v9;
                        continue;
                    }
                    case 0x6D6F6F66: 
                    case 0x6D766578: {
                        break;
                    }
                    default: {
                        v12 = 1;
                        goto label_41;
                    }
                }
                if(true) {
                    break;
                }
            }
        }
        if(v5 == 0) {
            return zzaiw.zza;
        }
        if(z != z2) {
            return z2 ? zzair.zza : zzair.zzb;
        }
        return null;
    }

    private static boolean zzd(int v, boolean z) {
        if(v >>> 8 == 0x336770) {
            return true;
        }
        if(v == 0x68656963) {
            if(!z) {
                v = 0x68656963;
                goto label_7;
            }
            return true;
        }
    label_7:
        int[] arr_v = zzaja.zza;
        for(int v1 = 0; v1 < 29; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }
}

