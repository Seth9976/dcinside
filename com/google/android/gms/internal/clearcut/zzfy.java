package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class zzfy {
    private static final Charset ISO_8859_1;
    private static final Charset UTF_8;
    public static final Object zzrr;

    static {
        zzfy.UTF_8 = Charset.forName("UTF-8");
        zzfy.ISO_8859_1 = Charset.forName("ISO-8859-1");
        zzfy.zzrr = new Object();
    }

    public static boolean equals(int[] arr_v, int[] arr_v1) {
        return arr_v == null || arr_v.length == 0 ? arr_v1 == null || arr_v1.length == 0 : Arrays.equals(arr_v, arr_v1);
    }

    public static boolean equals(long[] arr_v, long[] arr_v1) {
        return arr_v == null || arr_v.length == 0 ? arr_v1 == null || arr_v1.length == 0 : Arrays.equals(arr_v, arr_v1);
    }

    public static boolean equals(Object[] arr_object, Object[] arr_object1) {
        int v = arr_object == null ? 0 : arr_object.length;
        int v1 = arr_object1 == null ? 0 : arr_object1.length;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            if(v2 < v && arr_object[v2] == null) {
                ++v2;
            }
            else {
                while(v3 < v1 && arr_object1[v3] == null) {
                    ++v3;
                }
                int v4 = v2 < v ? 0 : 1;
                int v5 = v3 < v1 ? 0 : 1;
                if(v4 != 0 && v5 != 0) {
                    return true;
                }
                if(v4 != v5) {
                    return false;
                }
                if(!arr_object[v2].equals(arr_object1[v3])) {
                    return false;
                }
                ++v2;
                ++v3;
            }
        }
    }

    public static int hashCode(int[] arr_v) {
        return arr_v == null || arr_v.length == 0 ? 0 : Arrays.hashCode(arr_v);
    }

    public static int hashCode(long[] arr_v) {
        return arr_v == null || arr_v.length == 0 ? 0 : Arrays.hashCode(arr_v);
    }

    public static int hashCode(Object[] arr_object) {
        int v1 = arr_object == null ? 0 : arr_object.length;
        int v2 = 0;
        for(int v = 0; v < v1; ++v) {
            Object object0 = arr_object[v];
            if(object0 != null) {
                v2 = v2 * 0x1F + object0.hashCode();
            }
        }
        return v2;
    }

    public static int zza(byte[][] arr2_b) {
        int v1 = arr2_b == null ? 0 : arr2_b.length;
        int v2 = 0;
        for(int v = 0; v < v1; ++v) {
            byte[] arr_b = arr2_b[v];
            if(arr_b != null) {
                v2 = v2 * 0x1F + Arrays.hashCode(arr_b);
            }
        }
        return v2;
    }

    public static void zza(zzfu zzfu0, zzfu zzfu1) {
        zzfw zzfw0 = zzfu0.zzrj;
        if(zzfw0 != null) {
            zzfu1.zzrj = (zzfw)zzfw0.clone();
        }
    }

    public static boolean zza(byte[][] arr2_b, byte[][] arr2_b1) {
        int v = arr2_b == null ? 0 : arr2_b.length;
        int v1 = arr2_b1 == null ? 0 : arr2_b1.length;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            if(v2 < v && arr2_b[v2] == null) {
                ++v2;
            }
            else {
                while(v3 < v1 && arr2_b1[v3] == null) {
                    ++v3;
                }
                int v4 = v2 < v ? 0 : 1;
                int v5 = v3 < v1 ? 0 : 1;
                if(v4 != 0 && v5 != 0) {
                    return true;
                }
                if(v4 != v5) {
                    return false;
                }
                if(!Arrays.equals(arr2_b[v2], arr2_b1[v3])) {
                    return false;
                }
                ++v2;
                ++v3;
            }
        }
    }
}

