package com.google.android.gms.internal.vision;

import java.io.IOException;

final class zzhl {
    static int zza(int v, byte[] arr_b, int v1, int v2, zzhn zzhn0) throws zzjk {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    return zzhl.zzb(arr_b, v1, zzhn0);
                }
                case 1: {
                    return v1 + 8;
                }
                case 2: {
                    return zzhl.zza(arr_b, v1, zzhn0) + zzhn0.zza;
                }
                case 3: {
                    int v3 = v & -8 | 4;
                    int v4 = 0;
                    while(v1 < v2) {
                        v1 = zzhl.zza(arr_b, v1, zzhn0);
                        v4 = zzhn0.zza;
                        if(v4 == v3) {
                            break;
                        }
                        v1 = zzhl.zza(v4, arr_b, v1, v2, zzhn0);
                    }
                    if(v1 > v2 || v4 != v3) {
                        throw zzjk.zzg();
                    }
                    return v1;
                }
                case 5: {
                    return v1 + 4;
                }
                default: {
                    throw zzjk.zzd();
                }
            }
        }
        throw zzjk.zzd();
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzjl zzjl0, zzhn zzhn0) {
        int v3 = zzhl.zza(arr_b, v1, zzhn0);
        ((zzjd)zzjl0).zzc(zzhn0.zza);
        while(v3 < v2) {
            int v4 = zzhl.zza(arr_b, v3, zzhn0);
            if(v != zzhn0.zza) {
                break;
            }
            v3 = zzhl.zza(arr_b, v4, zzhn0);
            ((zzjd)zzjl0).zzc(zzhn0.zza);
        }
        return v3;
    }

    static int zza(int v, byte[] arr_b, int v1, int v2, zzlx zzlx0, zzhn zzhn0) throws zzjk {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = zzhl.zzb(arr_b, v1, zzhn0);
                    zzlx0.zza(v, zzhn0.zzb);
                    return v3;
                }
                case 1: {
                    zzlx0.zza(v, zzhl.zzb(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = zzhl.zza(arr_b, v1, zzhn0);
                    int v5 = zzhn0.zza;
                    if(v5 < 0) {
                        throw zzjk.zzb();
                    }
                    if(v5 > arr_b.length - v4) {
                        throw zzjk.zza();
                    }
                    if(v5 == 0) {
                        zzlx0.zza(v, zzht.zza);
                        return v4;
                    }
                    zzlx0.zza(v, zzht.zza(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    zzlx zzlx1 = zzlx.zzb();
                    int v6 = v & -8 | 4;
                    int v7 = 0;
                    while(v1 < v2) {
                        int v8 = zzhl.zza(arr_b, v1, zzhn0);
                        int v9 = zzhn0.zza;
                        v7 = v9;
                        if(v9 == v6) {
                            v1 = v8;
                            if(true) {
                                break;
                            }
                        }
                        else {
                            int v10 = zzhl.zza(v7, arr_b, v8, v2, zzlx1, zzhn0);
                            v7 = v9;
                            v1 = v10;
                        }
                    }
                    if(v1 > v2 || v7 != v6) {
                        throw zzjk.zzg();
                    }
                    zzlx0.zza(v, zzlx1);
                    return v1;
                }
                case 5: {
                    zzlx0.zza(v, zzhl.zza(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw zzjk.zzd();
                }
            }
        }
        throw zzjk.zzd();
    }

    static int zza(int v, byte[] arr_b, int v1, zzhn zzhn0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            zzhn0.zza = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            zzhn0.zza = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            zzhn0.zza = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            zzhn0.zza = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        zzhn0.zza = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int zza(zzlc zzlc0, int v, byte[] arr_b, int v1, int v2, zzjl zzjl0, zzhn zzhn0) throws IOException {
        int v3 = zzhl.zza(zzlc0, arr_b, v1, v2, zzhn0);
        zzjl0.add(zzhn0.zzc);
        while(v3 < v2) {
            int v4 = zzhl.zza(arr_b, v3, zzhn0);
            if(v != zzhn0.zza) {
                break;
            }
            v3 = zzhl.zza(zzlc0, arr_b, v4, v2, zzhn0);
            zzjl0.add(zzhn0.zzc);
        }
        return v3;
    }

    static int zza(zzlc zzlc0, byte[] arr_b, int v, int v1, int v2, zzhn zzhn0) throws IOException {
        Object object0 = ((zzko)zzlc0).zza();
        int v3 = ((zzko)zzlc0).zza(object0, arr_b, v, v1, v2, zzhn0);
        ((zzko)zzlc0).zzc(object0);
        zzhn0.zzc = object0;
        return v3;
    }

    static int zza(zzlc zzlc0, byte[] arr_b, int v, int v1, zzhn zzhn0) throws IOException {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = zzhl.zza(v3, arr_b, v2, zzhn0);
            v3 = zzhn0.zza;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw zzjk.zza();
        }
        Object object0 = zzlc0.zza();
        int v4 = v3 + v2;
        zzlc0.zza(object0, arr_b, v2, v4, zzhn0);
        zzlc0.zzc(object0);
        zzhn0.zzc = object0;
        return v4;
    }

    static int zza(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | (arr_b[v] & 0xFF | (arr_b[v + 1] & 0xFF) << 8 | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int zza(byte[] arr_b, int v, zzhn zzhn0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            zzhn0.zza = v1;
            return v + 1;
        }
        return zzhl.zza(v1, arr_b, v + 1, zzhn0);
    }

    static int zza(byte[] arr_b, int v, zzjl zzjl0, zzhn zzhn0) throws IOException {
        int v1 = zzhl.zza(arr_b, v, zzhn0);
        int v2 = zzhn0.zza + v1;
        while(v1 < v2) {
            v1 = zzhl.zza(arr_b, v1, zzhn0);
            ((zzjd)zzjl0).zzc(zzhn0.zza);
        }
        if(v1 != v2) {
            throw zzjk.zza();
        }
        return v1;
    }

    static int zzb(byte[] arr_b, int v, zzhn zzhn0) {
        long v1 = (long)arr_b[v];
        if(v1 >= 0L) {
            zzhn0.zzb = v1;
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
        zzhn0.zzb = v4;
        return v2;
    }

    static long zzb(byte[] arr_b, int v) {
        return (((long)arr_b[v + 7]) & 0xFFL) << 56 | (((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30);
    }

    static double zzc(byte[] arr_b, int v) {
        return Double.longBitsToDouble(zzhl.zzb(arr_b, v));
    }

    static int zzc(byte[] arr_b, int v, zzhn zzhn0) throws zzjk {
        int v1 = zzhl.zza(arr_b, v, zzhn0);
        int v2 = zzhn0.zza;
        if(v2 < 0) {
            throw zzjk.zzb();
        }
        if(v2 == 0) {
            zzhn0.zzc = "";
            return v1;
        }
        zzhn0.zzc = new String(arr_b, v1, v2, zzjf.zza);
        return v1 + v2;
    }

    static float zzd(byte[] arr_b, int v) {
        return Float.intBitsToFloat(zzhl.zza(arr_b, v));
    }

    static int zzd(byte[] arr_b, int v, zzhn zzhn0) throws zzjk {
        int v1 = zzhl.zza(arr_b, v, zzhn0);
        int v2 = zzhn0.zza;
        if(v2 < 0) {
            throw zzjk.zzb();
        }
        if(v2 == 0) {
            zzhn0.zzc = "";
            return v1;
        }
        zzhn0.zzc = zzmd.zzb(arr_b, v1, v2);
        return v1 + v2;
    }

    static int zze(byte[] arr_b, int v, zzhn zzhn0) throws zzjk {
        int v1 = zzhl.zza(arr_b, v, zzhn0);
        int v2 = zzhn0.zza;
        if(v2 < 0) {
            throw zzjk.zzb();
        }
        if(v2 > arr_b.length - v1) {
            throw zzjk.zza();
        }
        if(v2 == 0) {
            zzhn0.zzc = zzht.zza;
            return v1;
        }
        zzhn0.zzc = zzht.zza(arr_b, v1, v2);
        return v1 + v2;
    }
}

