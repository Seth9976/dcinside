package com.google.android.gms.internal.ads;

public final class zzabk {
    public static final int zza;
    private static final int[] zzb;
    private static final int[] zzc;

    static {
        zzabk.zzb = new int[]{96000, 88200, 0xFA00, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        zzabk.zzc = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static zzabi zza(byte[] arr_b) throws zzbc {
        return zzabk.zzb(new zzdx(arr_b, arr_b.length), false);
    }

    public static zzabi zzb(zzdx zzdx0, boolean z) throws zzbc {
        int v = zzabk.zzc(zzdx0);
        int v1 = zzabk.zzd(zzdx0);
        int v2 = zzdx0.zzd(4);
        String s = "mp4a.40." + v;
        int v3 = 22;
        if(v == 5 || v == 29) {
            v1 = zzabk.zzd(zzdx0);
            v = zzabk.zzc(zzdx0);
            if(v == 22) {
                v2 = zzdx0.zzd(4);
            }
        }
        int v4 = 3;
        if(z) {
            if(v != 1 && v != 2 && v != 3 && v != 4 && v != 6 && (v != 7 && v != 17) && (v != 19 && v != 20 && v != 21 && v != 22 && v != 23)) {
                throw zzbc.zzc(("Unsupported audio object type: " + v));
            }
            if(zzdx0.zzp()) {
                zzdo.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if(zzdx0.zzp()) {
                zzdx0.zzn(14);
            }
            boolean z1 = zzdx0.zzp();
            if(v2 == 0) {
                throw new UnsupportedOperationException();
            }
            switch(v) {
                case 6: {
                    zzdx0.zzn(3);
                    break;
                }
                case 20: {
                    v = 20;
                    zzdx0.zzn(3);
                }
            }
            if(z1) {
                if(v == 22) {
                    zzdx0.zzn(16);
                }
                else {
                    v3 = v;
                }
                if(v3 == 17 || (v3 == 19 || v3 == 20) || v3 == 23) {
                    zzdx0.zzn(3);
                }
                zzdx0.zzn(1);
            }
            switch(v) {
                case 17: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: {
                    int v5 = zzdx0.zzd(2);
                    if(v5 == 2) {
                        v4 = 2;
                    }
                    else if(v5 != 3) {
                        break;
                    }
                    throw zzbc.zzc(("Unsupported epConfig: " + v4));
                }
            }
        }
        int v6 = zzabk.zzc[v2];
        if(v6 == -1) {
            throw zzbc.zza(null, null);
        }
        return new zzabi(v1, v6, s, null);
    }

    private static int zzc(zzdx zzdx0) {
        int v = zzdx0.zzd(5);
        return v == 0x1F ? zzdx0.zzd(6) + 0x20 : v;
    }

    private static int zzd(zzdx zzdx0) throws zzbc {
        int v = zzdx0.zzd(4);
        if(v == 15) {
            if(zzdx0.zza() < 24) {
                throw zzbc.zza("AAC header insufficient data", null);
            }
            return zzdx0.zzd(24);
        }
        if(v >= 13) {
            throw zzbc.zza("AAC header wrong Sampling Frequency Index", null);
        }
        return zzabk.zzb[v];
    }
}

