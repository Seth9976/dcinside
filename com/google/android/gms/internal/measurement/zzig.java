package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzig {
    private static volatile int zza = 100;

    static {
    }

    static double zza(byte[] arr_b, int v) {
        return Double.longBitsToDouble(zzig.zzd(arr_b, v));
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzij zzij0) throws zzkb {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return zzig.zzd(arr_b, v1, zzij0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return zzig.zzc(arr_b, v1, zzij0) + zzij0.zza;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = zzig.zzc(arr_b, v1, zzij0);
                        v4 = zzij0.zza;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = zzig.zza(v4, arr_b, v1, v2, zzij0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw zzkb.zzg();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw zzkb.zzc();
                }
            }
        }
        throw zzkb.zzc();
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzkc zzkc0, zzij zzij0) {
        int v3 = zzig.zzc(arr_b, v1, zzij0);
        ((zzjw)zzkc0).zzd(zzij0.zza);
        while(v3 < v2) {
            int v4 = zzig.zzc(arr_b, v3, zzij0);
            if(v != zzij0.zza) {
                break;
            }
            v3 = zzig.zzc(arr_b, v4, zzij0);
            ((zzjw)zzkc0).zzd(zzij0.zza);
        }
        return v3;
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzmj zzmj0, zzij zzij0) throws zzkb {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = zzig.zzd(arr_b, v1, zzij0);
                    zzmj0.zza(v, zzij0.zzb);
                    return v3;
                }
                case 1: {
                    zzmj0.zza(v, zzig.zzd(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = zzig.zzc(arr_b, v1, zzij0);
                    int v5 = zzij0.zza;
                    if(v5 < 0) {
                        throw zzkb.zzf();
                    }
                    if(v5 > arr_b.length - v4) {
                        throw zzkb.zzi();
                    }
                    if(v5 == 0) {
                        zzmj0.zza(v, zzik.zza);
                        return v4;
                    }
                    zzmj0.zza(v, zzik.zza(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    zzmj zzmj1 = zzmj.zzd();
                    int v6 = v & -8 | 4;
                    int v7 = zzij0.zze + 1;
                    zzij0.zze = v7;
                    zzig.zza(v7);
                    int v8 = 0;
                    while(v1 < v2) {
                        int v9 = zzig.zzc(arr_b, v1, zzij0);
                        int v10 = zzij0.zza;
                        v8 = v10;
                        if(v10 == v6) {
                            v1 = v9;
                            if(true) {
                                break;
                            }
                        }
                        else {
                            int v11 = zzig.zza(v8, arr_b, v9, v2, zzmj1, zzij0);
                            v8 = v10;
                            v1 = v11;
                        }
                    }
                    --zzij0.zze;
                    if(v1 > v2 || v8 != v6) {
                        throw zzkb.zzg();
                    }
                    zzmj0.zza(v, zzmj1);
                    return v1;
                }
                case 5: {
                    zzmj0.zza(v, zzig.zzc(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw zzkb.zzc();
                }
            }
        }
        throw zzkb.zzc();
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, Object object0, zzlc zzlc0, zzmk zzmk0, zzij zzij0) throws IOException {
        if(zzij0.zzd.zza(zzlc0, v >>> 3) == null) {
            return zzig.zza(v, arr_b, v1, v2, zzlg.zzc(object0), zzij0);
        }
        ((zzd)object0).zza();
        throw new NoSuchMethodError();
    }

    static int zza(int v, byte[] arr_b, int v1, zzij zzij0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            zzij0.zza = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            zzij0.zza = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            zzij0.zza = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            zzij0.zza = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        zzij0.zza = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int zza(zzlu zzlu0, int v, byte[] arr_b, int v1, int v2, zzkc zzkc0, zzij zzij0) throws IOException {
        int v3 = v & -8 | 4;
        int v4 = zzig.zza(zzlu0, arr_b, v1, v2, v3, zzij0);
        zzkc0.add(zzij0.zzc);
        while(v4 < v2) {
            int v5 = zzig.zzc(arr_b, v4, zzij0);
            if(v != zzij0.zza) {
                break;
            }
            v4 = zzig.zza(zzlu0, arr_b, v5, v2, v3, zzij0);
            zzkc0.add(zzij0.zzc);
        }
        return v4;
    }

    private static int zza(zzlu zzlu0, byte[] arr_b, int v, int v1, int v2, zzij zzij0) throws IOException {
        Object object0 = zzlu0.zza();
        int v3 = zzig.zza(object0, zzlu0, arr_b, v, v1, v2, zzij0);
        zzlu0.zzd(object0);
        zzij0.zzc = object0;
        return v3;
    }

    static int zza(zzlu zzlu0, byte[] arr_b, int v, int v1, zzij zzij0) throws IOException {
        Object object0 = zzlu0.zza();
        int v2 = zzig.zza(object0, zzlu0, arr_b, v, v1, zzij0);
        zzlu0.zzd(object0);
        zzij0.zzc = object0;
        return v2;
    }

    static int zza(Object object0, zzlu zzlu0, byte[] arr_b, int v, int v1, int v2, zzij zzij0) throws IOException {
        int v3 = zzij0.zze + 1;
        zzij0.zze = v3;
        zzig.zza(v3);
        int v4 = ((zzlg)zzlu0).zza(object0, arr_b, v, v1, v2, zzij0);
        --zzij0.zze;
        zzij0.zzc = object0;
        return v4;
    }

    static int zza(Object object0, zzlu zzlu0, byte[] arr_b, int v, int v1, zzij zzij0) throws IOException {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = zzig.zza(v3, arr_b, v2, zzij0);
            v3 = zzij0.zza;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzkb.zzi();
        }
        int v4 = zzij0.zze + 1;
        zzij0.zze = v4;
        zzig.zza(v4);
        int v5 = v3 + v2;
        zzlu0.zza(object0, arr_b, v2, v5, zzij0);
        --zzij0.zze;
        zzij0.zzc = object0;
        return v5;
    }

    static int zza(byte[] arr_b, int v, zzij zzij0) throws zzkb {
        int v1 = zzig.zzc(arr_b, v, zzij0);
        int v2 = zzij0.zza;
        if(v2 < 0) {
            throw zzkb.zzf();
        }
        if(v2 > arr_b.length - v1) {
            throw zzkb.zzi();
        }
        if(v2 == 0) {
            zzij0.zzc = zzik.zza;
            return v1;
        }
        zzij0.zzc = zzik.zza(arr_b, v1, v2);
        return v1 + v2;
    }

    static int zza(byte[] arr_b, int v, zzkc zzkc0, zzij zzij0) throws IOException {
        int v1 = zzig.zzc(arr_b, v, zzij0);
        int v2 = zzij0.zza + v1;
        while(v1 < v2) {
            v1 = zzig.zzc(arr_b, v1, zzij0);
            ((zzjw)zzkc0).zzd(zzij0.zza);
        }
        if(v1 != v2) {
            throw zzkb.zzi();
        }
        return v1;
    }

    private static void zza(int v) throws zzkb {
        if(v >= zzig.zza) {
            throw zzkb.zzh();
        }
    }

    static float zzb(byte[] arr_b, int v) {
        return Float.intBitsToFloat(zzig.zzc(arr_b, v));
    }

    static int zzb(zzlu zzlu0, int v, byte[] arr_b, int v1, int v2, zzkc zzkc0, zzij zzij0) throws IOException {
        int v3 = zzig.zza(zzlu0, arr_b, v1, v2, zzij0);
        zzkc0.add(zzij0.zzc);
        while(v3 < v2) {
            int v4 = zzig.zzc(arr_b, v3, zzij0);
            if(v != zzij0.zza) {
                break;
            }
            v3 = zzig.zza(zzlu0, arr_b, v4, v2, zzij0);
            zzkc0.add(zzij0.zzc);
        }
        return v3;
    }

    static int zzb(byte[] arr_b, int v, zzij zzij0) throws zzkb {
        int v1 = zzig.zzc(arr_b, v, zzij0);
        int v2 = zzij0.zza;
        if(v2 < 0) {
            throw zzkb.zzf();
        }
        if(v2 == 0) {
            zzij0.zzc = "";
            return v1;
        }
        zzij0.zzc = zzmp.zzb(arr_b, v1, v2);
        return v1 + v2;
    }

    static int zzc(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int zzc(byte[] arr_b, int v, zzij zzij0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            zzij0.zza = v1;
            return v + 1;
        }
        return zzig.zza(v1, arr_b, v + 1, zzij0);
    }

    static int zzd(byte[] arr_b, int v, zzij zzij0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            zzij0.zzb = v1;
            return v + 1;
        }
        int v2 = v + 2;
        int v3 = arr_b[v + 1];
        long v4 = v1 & 0x7FL | ((long)(v3 & 0x7F)) << 7;
        int v5 = 7;
        while(v3 < 0) {
            int v6 = arr_b[v2];
            v5 += 7;
            v4 |= ((long)(v6 & 0x7F)) << v5;
            v3 = v6;
            ++v2;
        }
        zzij0.zzb = v4;
        return v2;
    }

    static long zzd(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }
}

