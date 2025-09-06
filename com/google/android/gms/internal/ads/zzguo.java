package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzguo {
    public static final void zza(ByteBuffer byteBuffer0, ByteBuffer byteBuffer1, ByteBuffer byteBuffer2, int v) {
        if(v < 0 || byteBuffer1.remaining() < v || byteBuffer2.remaining() < v || byteBuffer0.remaining() < v) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            byteBuffer0.put(((byte)(byteBuffer1.get() ^ byteBuffer2.get())));
        }
    }

    public static byte[] zzb(byte[][] arr2_b) throws GeneralSecurityException {
        int v1 = 0;
        for(int v = 0; v < arr2_b.length; ++v) {
            int v2 = arr2_b[v].length;
            if(v1 > 0x7FFFFFFF - v2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            v1 += v2;
        }
        byte[] arr_b = new byte[v1];
        int v4 = 0;
        for(int v3 = 0; v3 < arr2_b.length; ++v3) {
            byte[] arr_b1 = arr2_b[v3];
            System.arraycopy(arr_b1, 0, arr_b, v4, arr_b1.length);
            v4 += arr_b1.length;
        }
        return arr_b;
    }

    public static final byte[] zzc(byte[] arr_b, int v, byte[] arr_b1, int v1, int v2) {
        if(arr_b.length - 16 < v) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] arr_b2 = new byte[16];
        for(int v3 = 0; v3 < 16; ++v3) {
            arr_b2[v3] = (byte)(arr_b[v3 + v] ^ arr_b1[v3]);
        }
        return arr_b2;
    }
}

