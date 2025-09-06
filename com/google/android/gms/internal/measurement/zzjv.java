package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzjv {
    static final Charset zza;
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        zzjv.zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        zzjv.zzb = arr_b;
        ByteBuffer.wrap(arr_b);
        zziw.zza(arr_b, 0, 0, false);
    }

    static int zza(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    public static int zza(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    // 去混淆评级： 低(20)
    public static int zza(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static int zza(byte[] arr_b) {
        int v = zzjv.zza(arr_b.length, arr_b, 0, arr_b.length);
        return v == 0 ? 1 : v;
    }

    static Object zza(Object object0) {
        object0.getClass();
        return object0;
    }

    static Object zza(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    static boolean zza(zzlc zzlc0) {
        return false;
    }
}

