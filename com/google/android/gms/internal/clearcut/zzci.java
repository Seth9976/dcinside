package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzci {
    private static final Charset ISO_8859_1;
    static final Charset UTF_8;
    public static final byte[] zzkt;
    private static final ByteBuffer zzku;
    private static final zzbk zzkv;

    static {
        zzci.UTF_8 = Charset.forName("UTF-8");
        zzci.ISO_8859_1 = Charset.forName("ISO-8859-1");
        byte[] arr_b = new byte[0];
        zzci.zzkt = arr_b;
        zzci.zzku = ByteBuffer.wrap(arr_b);
        zzci.zzkv = zzbk.zza(arr_b, 0, 0, false);
    }

    static Object checkNotNull(Object object0) {
        object0.getClass();
        return object0;
    }

    public static int hashCode(byte[] arr_b) {
        int v = zzci.zza(arr_b.length, arr_b, 0, arr_b.length);
        return v == 0 ? 1 : v;
    }

    static int zza(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = v1; v3 < v1 + v2; ++v3) {
            v = v * 0x1F + arr_b[v3];
        }
        return v;
    }

    static Object zza(Object object0, Object object1) {
        return ((zzdo)object0).zzbc().zza(((zzdo)object1)).zzbi();
    }

    static Object zza(Object object0, String s) {
        if(object0 == null) {
            throw new NullPointerException(s);
        }
        return object0;
    }

    // 去混淆评级： 低(20)
    public static int zzc(boolean z) {
        return z ? 0x4CF : 0x4D5;
    }

    public static boolean zze(byte[] arr_b) {
        return zzff.zze(arr_b);
    }

    public static String zzf(byte[] arr_b) {
        return new String(arr_b, zzci.UTF_8);
    }

    static boolean zzf(zzdo zzdo0) {
        return false;
    }

    public static int zzl(long v) [...] // Inlined contents
}

