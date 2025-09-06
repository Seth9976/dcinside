package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzgye {
    static final Charset zza;
    public static final byte[] zzb;
    public static final ByteBuffer zzc;

    static {
        Charset.forName("US-ASCII");
        zzgye.zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        zzgye.zzb = arr_b;
        zzgye.zzc = ByteBuffer.wrap(arr_b);
        zzgwp.zzH(arr_b, 0, 0, false);
    }

    // 去混淆评级： 低(20)
    public static int zza(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    static int zzb(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    static Object zzc(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }
}

