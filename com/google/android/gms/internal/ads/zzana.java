package com.google.android.gms.internal.ads;

final class zzana {
    public static zzamy zza(zzdx zzdx0) throws zzbc {
        int v13;
        int v12;
        double f;
        byte[] arr_b;
        int v5;
        int v4;
        int v2;
        int v = zzdx0.zzd(8);
        int v1 = zzdx0.zzd(5);
        if(v1 == 0x1F) {
            v2 = zzdx0.zzd(24);
        }
        else {
            switch(v1) {
                case 0: {
                    v2 = 96000;
                    break;
                }
                case 1: {
                    v2 = 88200;
                    break;
                }
                case 2: {
                    v2 = 0xFA00;
                    break;
                }
                case 3: {
                    v2 = 48000;
                    break;
                }
                case 4: {
                    v2 = 44100;
                    break;
                }
                case 5: {
                    v2 = 32000;
                    break;
                }
                case 6: {
                    v2 = 24000;
                    break;
                }
                case 7: {
                    v2 = 22050;
                    break;
                }
                case 8: {
                    v2 = 16000;
                    break;
                }
                case 9: {
                    v2 = 12000;
                    break;
                }
                case 10: {
                    v2 = 11025;
                    break;
                }
                case 11: {
                    v2 = 8000;
                    break;
                }
                case 12: {
                    v2 = 7350;
                    break;
                }
                case 15: {
                    v2 = 0xE100;
                    break;
                }
                case 16: {
                    v2 = 0xC800;
                    break;
                }
                case 17: {
                    v2 = 40000;
                    break;
                }
                case 18: {
                    v2 = 0x9600;
                    break;
                }
                case 19: {
                    v2 = 34150;
                    break;
                }
                case 20: {
                    v2 = 0x7080;
                    break;
                }
                case 21: {
                    v2 = 0x6400;
                    break;
                }
                case 22: {
                    v2 = 20000;
                    break;
                }
                case 23: {
                    v2 = 0x4B00;
                    break;
                }
                case 24: {
                    v2 = 17075;
                    break;
                }
                case 25: {
                    v2 = 14400;
                    break;
                }
                case 26: {
                    v2 = 0x3200;
                    break;
                }
                case 27: {
                    v2 = 9600;
                    break;
                }
                default: {
                    throw zzbc.zzc(("Unsupported sampling rate index " + v1));
                }
            }
        }
        int v3 = zzdx0.zzd(3);
        switch(v3) {
            case 0: {
                v4 = 0x300;
                break;
            }
            case 1: {
                v4 = 0x400;
                break;
            }
            case 2: 
            case 3: {
                v4 = 0x800;
                break;
            }
            case 4: {
                v4 = 0x1000;
                break;
            }
            default: {
                throw zzbc.zzc(("Unsupported coreSbrFrameLengthIndex " + v3));
            }
        }
        switch(v3) {
            case 0: 
            case 1: {
                v5 = 0;
                break;
            }
            case 2: {
                v5 = 2;
                break;
            }
            case 3: {
                v5 = 3;
                break;
            }
            case 4: {
                v5 = 1;
                break;
            }
            default: {
                throw zzbc.zzc(("Unsupported coreSbrFrameLengthIndex " + v3));
            }
        }
        zzdx0.zzn(2);
        zzana.zze(zzdx0);
        int v6 = zzdx0.zzd(5);
        int v8 = 0;
        for(int v7 = 0; v7 < v6 + 1; ++v7) {
            int v9 = zzdx0.zzd(3);
            v8 += zzana.zzc(zzdx0, 5, 8, 16) + 1;
            if((v9 == 0 || v9 == 2) && zzdx0.zzp()) {
                zzana.zze(zzdx0);
            }
        }
        int v10 = zzana.zzc(zzdx0, 4, 8, 16);
        zzdx0.zzm();
        for(int v11 = 0; true; ++v11) {
            arr_b = null;
            f = 2.0;
            if(v11 >= v10 + 1) {
                break;
            }
            switch(zzdx0.zzd(2)) {
                case 0: {
                    zzana.zzf(zzdx0);
                    if(v5 > 0) {
                        zzana.zzd(zzdx0);
                    }
                    break;
                }
                case 1: {
                    if(zzana.zzf(zzdx0)) {
                        zzdx0.zzm();
                    }
                    if(v5 > 0) {
                        zzana.zzd(zzdx0);
                        v12 = zzdx0.zzd(2);
                        v13 = v5;
                    }
                    else {
                        v13 = 0;
                        v12 = 0;
                    }
                    if(v12 > 0) {
                        zzdx0.zzn(6);
                        int v14 = zzdx0.zzd(2);
                        zzdx0.zzn(4);
                        if(zzdx0.zzp()) {
                            zzdx0.zzn(5);
                        }
                        if(v12 == 2 || v12 == 3) {
                            zzdx0.zzn(6);
                        }
                        if(v14 == 2) {
                            zzdx0.zzm();
                        }
                    }
                    int v15 = ((int)Math.floor(Math.log(v8 - 1) / 0.693147)) + 1;
                    int v16 = zzdx0.zzd(2);
                    if(v16 > 0 && zzdx0.zzp()) {
                        zzdx0.zzn(v15);
                    }
                    if(zzdx0.zzp()) {
                        zzdx0.zzn(v15);
                    }
                    if(v13 == 0 && v16 == 0) {
                        zzdx0.zzm();
                    }
                    break;
                }
                case 3: {
                    zzana.zzc(zzdx0, 4, 8, 16);
                    int v17 = zzana.zzc(zzdx0, 4, 8, 16);
                    if(zzdx0.zzp()) {
                        zzana.zzc(zzdx0, 8, 16, 0);
                    }
                    zzdx0.zzm();
                    if(v17 > 0) {
                        zzdx0.zzn(v17 * 8);
                    }
                }
            }
        }
        if(zzdx0.zzp()) {
            int v18 = zzana.zzc(zzdx0, 2, 4, 8);
            for(int v19 = 0; v19 < v18 + 1; ++v19) {
                int v20 = zzana.zzc(zzdx0, 4, 8, 16);
                int v21 = zzana.zzc(zzdx0, 4, 8, 16);
                if(v20 == 7) {
                    int v22 = zzdx0.zzd(4);
                    zzdx0.zzn(4);
                    byte[] arr_b1 = new byte[v22 + 1];
                    for(int v23 = 0; v23 < v22 + 1; ++v23) {
                        arr_b1[v23] = (byte)zzdx0.zzd(8);
                    }
                    arr_b = arr_b1;
                }
                else {
                    zzdx0.zzn(v21 * 8);
                }
            }
        }
        switch(v2) {
            case 14700: 
            case 16000: {
                f = 3.0;
                break;
            }
            case 22050: 
            case 24000: {
                break;
            }
            case 29400: 
            case 32000: 
            case 58800: 
            case 0xFA00: {
                return new zzamy(v, ((int)(((double)v2) * 1.5)), ((int)(((double)v4) * 1.5)), arr_b, null);
            }
            case 44100: 
            case 48000: 
            case 88200: 
            case 96000: {
                return new zzamy(v, ((int)(((double)v2) * 1.0)), ((int)(((double)v4) * 1.0)), arr_b, null);
            }
            default: {
                throw zzbc.zzc(("Unsupported sampling rate " + v2));
            }
        }
        return new zzamy(v, ((int)(((double)v2) * f)), ((int)(((double)v4) * f)), arr_b, null);
    }

    public static boolean zzb(zzdx zzdx0, zzamx zzamx0) throws zzbc {
        long v1;
        zzdx0.zzb();
        int v = zzana.zzc(zzdx0, 3, 8, 8);
        zzamx0.zza = v;
        if(v != -1) {
            zzcw.zzd(true);
            zzgal.zza(zzgal.zza(3L, 0xFFL), 0x100000000L);
            if(zzdx0.zza() >= 2) {
                v1 = zzdx0.zze(2);
                if(v1 == 3L) {
                    if(zzdx0.zza() >= 8) {
                        long v2 = zzdx0.zze(8);
                        if(v2 != 0xFFL) {
                            v1 = v2 + 3L;
                        }
                        else if(zzdx0.zza() >= 0x20) {
                            v1 = zzdx0.zze(0x20) + 0x102L;
                        }
                        else {
                            v1 = -1L;
                        }
                    }
                    else {
                        v1 = -1L;
                    }
                }
            }
            else {
                v1 = -1L;
            }
            zzamx0.zzb = v1;
            if(v1 == -1L) {
                return false;
            }
            if(v1 > 16L) {
                throw zzbc.zzc(("Contains sub-stream with an invalid packet label " + v1));
            }
            if(v1 == 0L) {
                int v3 = zzamx0.zza;
                switch(v3) {
                    case 1: {
                        throw zzbc.zza("Mpegh3daConfig packet with invalid packet label 0", null);
                    }
                    case 2: {
                        throw zzbc.zza("Mpegh3daFrame packet with invalid packet label 0", null);
                    label_32:
                        if(v3 == 17) {
                            throw zzbc.zza("AudioTruncation packet with invalid packet label 0", null);
                        }
                        break;
                    }
                    default: {
                        goto label_32;
                    }
                }
            }
            int v4 = zzana.zzc(zzdx0, 11, 24, 24);
            zzamx0.zzc = v4;
            return v4 != -1;
        }
        return false;
    }

    private static int zzc(zzdx zzdx0, int v, int v1, int v2) {
        zzcw.zzd(Math.max(Math.max(v, v1), v2) <= 0x1F);
        int v3 = (1 << v) - 1;
        int v4 = (1 << v1) - 1;
        zzgaj.zza(zzgaj.zza(v3, v4), 1 << v2);
        if(zzdx0.zza() < v) {
            return -1;
        }
        int v5 = zzdx0.zzd(v);
        if(v5 == v3) {
            if(zzdx0.zza() < v1) {
                return -1;
            }
            int v6 = zzdx0.zzd(v1);
            v5 += v6;
            if(v6 == v4) {
                return zzdx0.zza() >= v2 ? v5 + zzdx0.zzd(v2) : -1;
            }
        }
        return v5;
    }

    private static void zzd(zzdx zzdx0) {
        zzdx0.zzn(3);
        zzdx0.zzn(8);
        boolean z = zzdx0.zzp();
        boolean z1 = zzdx0.zzp();
        if(z) {
            zzdx0.zzn(5);
        }
        if(z1) {
            zzdx0.zzn(6);
        }
    }

    private static void zze(zzdx zzdx0) {
        int v5;
        int v = zzdx0.zzd(2);
        int v1 = 6;
        if(v == 0) {
            zzdx0.zzn(6);
            return;
        }
        int v2 = 5;
        int v3 = zzana.zzc(zzdx0, 5, 8, 16);
        if(v == 1) {
            zzdx0.zzn((v3 + 1) * 7);
            return;
        }
        if(v == 2) {
            boolean z = zzdx0.zzp();
            if(z) {
                v2 = 7;
            }
            if(z) {
                v1 = 8;
            }
            for(int v4 = 0; v4 < v3 + 1; ++v4) {
                if(zzdx0.zzp()) {
                    zzdx0.zzn(7);
                    v5 = 0;
                }
                else {
                    if(zzdx0.zzd(2) == 3 && zzdx0.zzd(v2) * (z ? 1 : 5) != 0) {
                        zzdx0.zzm();
                    }
                    v5 = zzdx0.zzd(v1) * (z ? 1 : 5);
                    if(v5 != 0 && v5 != 180) {
                        zzdx0.zzm();
                    }
                    zzdx0.zzm();
                }
                if(v5 != 0 && v5 != 180 && zzdx0.zzp()) {
                    ++v4;
                }
            }
        }
    }

    private static boolean zzf(zzdx zzdx0) {
        zzdx0.zzn(3);
        boolean z = zzdx0.zzp();
        if(z) {
            zzdx0.zzn(13);
        }
        return z;
    }
}

