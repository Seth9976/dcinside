package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o3.a;

public final class zzgaq extends zzgar {
    static int zza(int[] arr_v, int v, int v1, int v2) {
        while(v1 < v2) {
            if(arr_v[v1] != v) {
                ++v1;
                continue;
            }
            return v1;
        }
        return -1;
    }

    public static int zzb(long v) {
        zzfun.zzh(((long)(((int)v))) == v, "Out of range: %s", v);
        return (int)v;
    }

    // 去混淆评级： 中等(73)
    // This method was un-flattened
    public static int zzc(int v, int v1, int v2) {
        zzfun.zzj(true, "min (%s) must be less than or equal to max (%s)", v1, 0x3FFFFFFF);
        int v3 = v1 <= v ? v : v1;
        return 0x3FFFFFFF >= v3 ? v3 : 0x3FFFFFFF;
    }

    public static int zzd(byte[] arr_b) {
        zzfun.zzj(arr_b.length >= 4, "array too small: %s < %s", arr_b.length, 4);
        return arr_b[3] & 0xFF | (arr_b[0] << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8);
    }

    public static int zze(long v) {
        if(v > 0x7FFFFFFFL) {
            return 0x7FFFFFFF;
        }
        return v >= 0xFFFFFFFF80000000L ? ((int)v) : 0x80000000;
    }

    @a
    public static Integer zzf(String s, int v) {
        Long long0;
        s.getClass();
        if(!s.isEmpty()) {
            int v1 = 0;
            int v2 = s.charAt(0);
            if(v2 == 45) {
                v1 = 1;
            }
            if(v1 != s.length()) {
                int v3 = v1 + 1;
                int v4 = zzgas.zza(s.charAt(v1));
                if(v4 >= 0 && v4 < 10) {
                    long v5 = (long)(-v4);
                    while(v3 < s.length()) {
                        int v6 = zzgas.zza(s.charAt(v3));
                        if(v6 < 0 || v6 >= 10 || v5 < -922337203685477580L || v5 * 10L < (((long)v6) ^ 0x8000000000000000L)) {
                            throw new NullPointerException();
                        }
                        v5 = v5 * 10L - ((long)v6);
                        ++v3;
                    }
                    if(v2 == 45) {
                        long0 = v5;
                        return long0 == null || ((long)long0) != ((long)long0.intValue()) ? null : long0.intValue();
                    }
                    if(v5 != 0x8000000000000000L) {
                        long0 = (long)(-v5);
                        return long0 == null || ((long)long0) != ((long)long0.intValue()) ? null : long0.intValue();
                    }
                }
            }
        }
        throw new NullPointerException();
    }

    public static List zzg(int[] arr_v) {
        return arr_v.length == 0 ? Collections.emptyList() : new zzgap(arr_v, 0, arr_v.length);
    }

    public static int[] zzh(Collection collection0) {
        Object[] arr_object = collection0.toArray();
        int[] arr_v = new int[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            object0.getClass();
            arr_v[v] = ((Number)object0).intValue();
        }
        return arr_v;
    }
}

