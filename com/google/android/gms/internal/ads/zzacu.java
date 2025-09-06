package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzacu {
    public static int zza(zzdy zzdy0, int v) {
        switch(v) {
            case 1: {
                return 0xC0;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 0x240 << v - 2;
            }
            case 6: {
                return zzdy0.zzm() + 1;
            }
            case 7: {
                return zzdy0.zzq() + 1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 0x100 << v - 8;
            }
            default: {
                return -1;
            }
        }
    }

    public static long zzb(zzaco zzaco0, zzacy zzacy0) throws IOException {
        zzaco0.zzj();
        zzaco0.zzg(1);
        byte[] arr_b = new byte[1];
        zzaco0.zzh(arr_b, 0, 1);
        int v = arr_b[0] & 1;
        zzaco0.zzg(2);
        int v1 = 1 == v ? 7 : 6;
        zzdy zzdy0 = new zzdy(v1);
        zzdy0.zzK(zzacr.zza(zzaco0, zzdy0.zzN(), 0, v1));
        zzaco0.zzj();
        zzact zzact0 = new zzact();
        if(!zzacu.zzd(zzdy0, zzacy0, 1 == v, zzact0)) {
            throw zzbc.zza(null, null);
        }
        return zzact0.zza;
    }

    public static boolean zzc(zzdy zzdy0, zzacy zzacy0, int v, zzact zzact0) {
        int v1 = zzdy0.zzd();
        long v2 = zzdy0.zzu();
        if(v2 >>> 16 != ((long)v)) {
            return false;
        }
        int v3 = (int)(v2 >> 4 & 15L);
        if(v3 <= 7) {
            if(v3 == zzacy0.zzg - 1) {
                goto label_9;
            }
            return false;
        }
        else if(v3 <= 10 && zzacy0.zzg == 2) {
        label_9:
            int v4 = (int)(v2 >> 1 & 7L);
            if((v4 == 0 || v4 == zzacy0.zzi) && (v2 & 1L) != 1L && zzacu.zzd(zzdy0, zzacy0, (v2 >>> 16 & 1L) == 1L, zzact0)) {
                int v5 = zzacu.zza(zzdy0, ((int)(v2 >> 12 & 15L)));
                if(v5 != -1 && v5 <= zzacy0.zzb) {
                    int v6 = zzacy0.zze;
                    int v7 = (int)(v2 >> 8 & 15L);
                    if(v7 == 0) {
                        return zzdy0.zzm() == zzei.zzg(zzdy0.zzN(), v1, zzdy0.zzd() - 1, 0);
                    }
                    if(v7 <= 11) {
                        return v7 == zzacy0.zzf ? zzdy0.zzm() == zzei.zzg(zzdy0.zzN(), v1, zzdy0.zzd() - 1, 0) : false;
                    }
                    if(v7 == 12) {
                        return zzdy0.zzm() * 1000 == v6 ? zzdy0.zzm() == zzei.zzg(zzdy0.zzN(), v1, zzdy0.zzd() - 1, 0) : false;
                    }
                    if(v7 <= 14) {
                        int v8 = zzdy0.zzq();
                        if(v7 == 14) {
                            v8 *= 10;
                        }
                        return v8 == v6 ? zzdy0.zzm() == zzei.zzg(zzdy0.zzN(), v1, zzdy0.zzd() - 1, 0) : false;
                    }
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzdy zzdy0, zzacy zzacy0, boolean z, zzact zzact0) {
        long v;
        try {
            v = zzdy0.zzx();
        }
        catch(NumberFormatException unused_ex) {
            return false;
        }
        if(!z) {
            v *= (long)zzacy0.zzb;
        }
        zzact0.zza = v;
        return true;
    }
}

