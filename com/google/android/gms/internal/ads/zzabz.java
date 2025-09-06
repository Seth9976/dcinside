package com.google.android.gms.internal.ads;

public final class zzabz {
    public static void zza(long v, zzdy zzdy0, zzadt[] arr_zzadt) {
        int v9;
        int v6;
        while(zzdy0.zzb() > 1) {
            int v1 = zzabz.zzc(zzdy0);
            int v2 = zzabz.zzc(zzdy0);
            int v3 = zzdy0.zzd() + v2;
            if(v2 == -1 || v2 > zzdy0.zzb()) {
                zzdo.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                v3 = zzdy0.zze();
            }
            else if(v1 == 4 && v2 >= 8) {
                int v4 = zzdy0.zzm();
                int v5 = zzdy0.zzq();
                if(v5 == 49) {
                    v6 = zzdy0.zzg();
                    v5 = 49;
                }
                else {
                    v6 = 0;
                }
                int v7 = zzdy0.zzm();
                if(v5 == 0x2F) {
                    zzdy0.zzM(1);
                    v5 = 0x2F;
                }
                int v8 = v4 != 0xB5 || v5 != 0x2F && v5 != 49 || v7 != 3 ? 0 : 1;
                if(v5 == 49) {
                    if(v6 != 1195456820) {
                        v9 = 0;
                    }
                    v8 &= v9;
                }
                if(v8 != 0) {
                    zzabz.zzb(v, zzdy0, arr_zzadt);
                }
            }
            v9 = 1;
            zzdy0.zzL(v3);
        }
    }

    public static void zzb(long v, zzdy zzdy0, zzadt[] arr_zzadt) {
        int v1 = zzdy0.zzm();
        if((v1 & 0x40) != 0) {
            zzdy0.zzM(1);
            int v2 = zzdy0.zzd();
            for(int v3 = 0; v3 < arr_zzadt.length; ++v3) {
                int v4 = (v1 & 0x1F) * 3;
                zzadt zzadt0 = arr_zzadt[v3];
                zzdy0.zzL(v2);
                zzadt0.zzr(zzdy0, v4);
                zzcw.zzf(v != 0x8000000000000001L);
                zzadt0.zzt(v, 1, v4, 0, null);
            }
        }
    }

    private static int zzc(zzdy zzdy0) {
        int v = 0;
        do {
            if(zzdy0.zzb() == 0) {
                return -1;
            }
            int v1 = zzdy0.zzm();
            v += v1;
        }
        while(v1 == 0xFF);
        return v;
    }
}

