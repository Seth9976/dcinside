package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzgvy {
    public static final int zza = 0;
    private static volatile int zzb = 100;

    static {
    }

    static int zza(byte[] arr_b, int v, zzgvx zzgvx0) throws zzgyg {
        int v1 = zzgvy.zzh(arr_b, v, zzgvx0);
        int v2 = zzgvx0.zza;
        if(v2 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if(v2 > arr_b.length - v1) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if(v2 == 0) {
            zzgvx0.zzc = zzgwj.zzb;
            return v1;
        }
        zzgvx0.zzc = zzgwj.zzv(arr_b, v1, v2);
        return v1 + v2;
    }

    static int zzb(byte[] arr_b, int v) {
        return (arr_b[v + 3] & 0xFF) << 24 | ((arr_b[v + 1] & 0xFF) << 8 | arr_b[v] & 0xFF | (arr_b[v + 2] & 0xFF) << 16);
    }

    static int zzc(zzgzv zzgzv0, byte[] arr_b, int v, int v1, int v2, zzgvx zzgvx0) throws IOException {
        Object object0 = zzgzv0.zze();
        int v3 = zzgvy.zzl(object0, zzgzv0, arr_b, v, v1, v2, zzgvx0);
        zzgzv0.zzf(object0);
        zzgvx0.zzc = object0;
        return v3;
    }

    static int zzd(zzgzv zzgzv0, byte[] arr_b, int v, int v1, zzgvx zzgvx0) throws IOException {
        Object object0 = zzgzv0.zze();
        int v2 = zzgvy.zzm(object0, zzgzv0, arr_b, v, v1, zzgvx0);
        zzgzv0.zzf(object0);
        zzgvx0.zzc = object0;
        return v2;
    }

    static int zze(zzgzv zzgzv0, int v, byte[] arr_b, int v1, int v2, zzgyd zzgyd0, zzgvx zzgvx0) throws IOException {
        int v3 = zzgvy.zzd(zzgzv0, arr_b, v1, v2, zzgvx0);
        zzgyd0.add(zzgvx0.zzc);
        while(v3 < v2) {
            int v4 = zzgvy.zzh(arr_b, v3, zzgvx0);
            if(v != zzgvx0.zza) {
                break;
            }
            v3 = zzgvy.zzd(zzgzv0, arr_b, v4, v2, zzgvx0);
            zzgyd0.add(zzgvx0.zzc);
        }
        return v3;
    }

    static int zzf(byte[] arr_b, int v, zzgyd zzgyd0, zzgvx zzgvx0) throws IOException {
        int v1 = zzgvy.zzh(arr_b, v, zzgvx0);
        int v2 = zzgvx0.zza + v1;
        while(v1 < v2) {
            v1 = zzgvy.zzh(arr_b, v1, zzgvx0);
            ((zzgxs)zzgyd0).zzi(zzgvx0.zza);
        }
        if(v1 != v2) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        return v1;
    }

    static int zzg(int v, byte[] arr_b, int v1, int v2, zzhai zzhai0, zzgvx zzgvx0) throws zzgyg {
        if(v >>> 3 != 0) {
            switch(v & 7) {
                case 0: {
                    int v3 = zzgvy.zzk(arr_b, v1, zzgvx0);
                    zzhai0.zzj(v, zzgvx0.zzb);
                    return v3;
                }
                case 1: {
                    zzhai0.zzj(v, zzgvy.zzn(arr_b, v1));
                    return v1 + 8;
                }
                case 2: {
                    int v4 = zzgvy.zzh(arr_b, v1, zzgvx0);
                    int v5 = zzgvx0.zza;
                    if(v5 < 0) {
                        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    if(v5 > arr_b.length - v4) {
                        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    if(v5 == 0) {
                        zzhai0.zzj(v, zzgwj.zzb);
                        return v4;
                    }
                    zzhai0.zzj(v, zzgwj.zzv(arr_b, v4, v5));
                    return v4 + v5;
                }
                case 3: {
                    int v6 = v & -8 | 4;
                    zzhai zzhai1 = zzhai.zzf();
                    int v7 = zzgvx0.zze + 1;
                    zzgvx0.zze = v7;
                    zzgvy.zzo(v7);
                    int v8 = 0;
                    while(v1 < v2) {
                        int v9 = zzgvy.zzh(arr_b, v1, zzgvx0);
                        v8 = zzgvx0.zza;
                        if(v8 == v6) {
                            v1 = v9;
                            break;
                        }
                        v1 = zzgvy.zzg(v8, arr_b, v9, v2, zzhai1, zzgvx0);
                    }
                    --zzgvx0.zze;
                    if(v1 > v2 || v8 != v6) {
                        throw new zzgyg("Failed to parse the message.");
                    }
                    zzhai0.zzj(v, zzhai1);
                    return v1;
                }
                case 5: {
                    zzhai0.zzj(v, zzgvy.zzb(arr_b, v1));
                    return v1 + 4;
                }
                default: {
                    throw new zzgyg("Protocol message contained an invalid tag (zero).");
                }
            }
        }
        throw new zzgyg("Protocol message contained an invalid tag (zero).");
    }

    static int zzh(byte[] arr_b, int v, zzgvx zzgvx0) {
        int v1 = arr_b[v];
        if(v1 >= 0) {
            zzgvx0.zza = v1;
            return v + 1;
        }
        return zzgvy.zzi(v1, arr_b, v + 1, zzgvx0);
    }

    static int zzi(int v, byte[] arr_b, int v1, zzgvx zzgvx0) {
        int v2 = arr_b[v1];
        if(v2 >= 0) {
            zzgvx0.zza = v & 0x7F | v2 << 7;
            return v1 + 1;
        }
        int v3 = v & 0x7F | (v2 & 0x7F) << 7;
        int v4 = arr_b[v1 + 1];
        if(v4 >= 0) {
            zzgvx0.zza = v3 | v4 << 14;
            return v1 + 2;
        }
        int v5 = v3 | (v4 & 0x7F) << 14;
        int v6 = arr_b[v1 + 2];
        if(v6 >= 0) {
            zzgvx0.zza = v5 | v6 << 21;
            return v1 + 3;
        }
        int v7 = v5 | (v6 & 0x7F) << 21;
        int v8 = v1 + 4;
        int v9 = arr_b[v1 + 3];
        if(v9 >= 0) {
            zzgvx0.zza = v7 | v9 << 28;
            return v8;
        }
        while(arr_b[v8] < 0) {
            ++v8;
        }
        zzgvx0.zza = v7 | (v9 & 0x7F) << 28;
        return v8 + 1;
    }

    static int zzj(int v, byte[] arr_b, int v1, int v2, zzgyd zzgyd0, zzgvx zzgvx0) {
        int v3 = zzgvy.zzh(arr_b, v1, zzgvx0);
        ((zzgxs)zzgyd0).zzi(zzgvx0.zza);
        while(v3 < v2) {
            int v4 = zzgvy.zzh(arr_b, v3, zzgvx0);
            if(v != zzgvx0.zza) {
                break;
            }
            v3 = zzgvy.zzh(arr_b, v4, zzgvx0);
            ((zzgxs)zzgyd0).zzi(zzgvx0.zza);
        }
        return v3;
    }

    static int zzk(byte[] arr_b, int v, zzgvx zzgvx0) {
        long v1 = (long)arr_b[v];
        if(Long.compare(v1, 0L) >= 0) {
            zzgvx0.zzb = v1;
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
        zzgvx0.zzb = v4;
        return v2;
    }

    static int zzl(Object object0, zzgzv zzgzv0, byte[] arr_b, int v, int v1, int v2, zzgvx zzgvx0) throws IOException {
        int v3 = zzgvx0.zze + 1;
        zzgvx0.zze = v3;
        zzgvy.zzo(v3);
        int v4 = ((zzgzf)zzgzv0).zzc(object0, arr_b, v, v1, v2, zzgvx0);
        --zzgvx0.zze;
        zzgvx0.zzc = object0;
        return v4;
    }

    static int zzm(Object object0, zzgzv zzgzv0, byte[] arr_b, int v, int v1, zzgvx zzgvx0) throws IOException {
        int v2 = v + 1;
        int v3 = arr_b[v];
        if(v3 < 0) {
            v2 = zzgvy.zzi(v3, arr_b, v2, zzgvx0);
            v3 = zzgvx0.zza;
        }
        if(v3 < 0 || v3 > v1 - v2) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int v4 = zzgvx0.zze + 1;
        zzgvx0.zze = v4;
        zzgvy.zzo(v4);
        int v5 = v3 + v2;
        zzgzv0.zzi(object0, arr_b, v2, v5, zzgvx0);
        --zzgvx0.zze;
        zzgvx0.zzc = object0;
        return v5;
    }

    static long zzn(byte[] arr_b, int v) {
        return ((long)arr_b[v]) & 0xFFL | (((long)arr_b[v + 1]) & 0xFFL) << 8 | (((long)arr_b[v + 2]) & 0xFFL) << 16 | (((long)arr_b[v + 3]) & 0xFFL) << 24 | (((long)arr_b[v + 4]) & 0xFFL) << 0x20 | (((long)arr_b[v + 5]) & 0xFFL) << 40 | (((long)arr_b[v + 6]) & 0xFFL) << 0x30 | (((long)arr_b[v + 7]) & 0xFFL) << 56;
    }

    private static void zzo(int v) throws zzgyg {
        if(v >= zzgvy.zzb) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

