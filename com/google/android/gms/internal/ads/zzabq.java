package com.google.android.gms.internal.ads;

public final class zzabq {
    public static final int zza;
    private static final int[] zzb;

    static {
        zzabq.zzb = new int[]{2002, 2000, 0x780, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 0x800};
    }

    public static zzabo zza(zzdx zzdx0) {
        int v6;
        int v2;
        int v = zzdx0.zzd(16);
        int v1 = zzdx0.zzd(16);
        if(v1 == 0xFFFF) {
            v1 = zzdx0.zzd(24);
            v2 = 7;
        }
        else {
            v2 = 4;
        }
        int v3 = v == 44097 ? v1 + v2 + 2 : v1 + v2;
        int v4 = zzdx0.zzd(2);
        if(v4 == 3) {
            for(int v5 = 0; true; v5 = v6 + 1 << 2) {
                v6 = v5 + zzdx0.zzd(2);
                if(!zzdx0.zzp()) {
                    break;
                }
            }
            v4 = v6 + 3;
        }
        int v7 = zzdx0.zzd(10);
        if(zzdx0.zzp() && zzdx0.zzd(3) > 0) {
            zzdx0.zzn(2);
        }
        int v8 = zzdx0.zzp() ? 48000 : 44100;
        int v9 = zzdx0.zzd(4);
        if(v8 == 44100 && v9 == 13) {
            return new zzabo(v4, 2, v8, v3, zzabq.zzb[13], null);
        }
        if(v8 == 48000 && v9 < 14) {
            int v10 = zzabq.zzb[v9];
            if(v7 % 5 != 1) {
                switch(v7 % 5) {
                    case 2: {
                        return v9 != 8 && v9 != 11 ? new zzabo(v4, 2, v8, v3, v10, null) : new zzabo(v4, 2, v8, v3, v10 + 1, null);
                    }
                    case 3: {
                        break;
                    }
                    case 4: {
                        return v9 != 3 && v9 != 8 && v9 != 11 ? new zzabo(v4, 2, v8, v3, v10, null) : new zzabo(v4, 2, v8, v3, v10 + 1, null);
                    }
                    default: {
                        return new zzabo(v4, 2, v8, v3, v10, null);
                    }
                }
            }
            if(v9 == 3 || v9 == 8) {
                ++v10;
            }
            return new zzabo(v4, 2, v8, v3, v10, null);
        }
        return new zzabo(v4, 2, v8, v3, 0, null);
    }

    public static void zzb(int v, zzdy zzdy0) {
        zzdy0.zzI(7);
        byte[] arr_b = zzdy0.zzN();
        arr_b[0] = -84;
        arr_b[1] = 0x40;
        arr_b[2] = -1;
        arr_b[3] = -1;
        arr_b[4] = (byte)(v >> 16 & 0xFF);
        arr_b[5] = (byte)(v >> 8 & 0xFF);
        arr_b[6] = (byte)(v & 0xFF);
    }
}

