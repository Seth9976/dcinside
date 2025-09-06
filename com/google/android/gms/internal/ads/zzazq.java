package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

public final class zzazq extends zzazl {
    private MessageDigest zzb;

    @Override  // com.google.android.gms.internal.ads.zzazl
    public final byte[] zzb(String s) {
        byte[] arr_b1;
        byte[] arr_b;
        String[] arr_s = s.split(" ");
        int v = 4;
        if(arr_s.length == 1) {
            int v1 = zzazp.zza(arr_s[0]);
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(4);
            byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer0.putInt(v1);
            arr_b = byteBuffer0.array();
        }
        else {
            if(arr_s.length < 5) {
                arr_b1 = new byte[arr_s.length + arr_s.length];
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    int v3 = zzazp.zza(arr_s[v2]);
                    int v4 = v3 >> 16 ^ ((char)v3);
                    int v5 = v2 + v2;
                    arr_b1[v5] = (byte)v4;
                    arr_b1[v5 + 1] = (byte)(v4 >> 8);
                }
            }
            else {
                arr_b1 = new byte[arr_s.length];
                for(int v6 = 0; v6 < arr_s.length; ++v6) {
                    int v7 = zzazp.zza(arr_s[v6]);
                    arr_b1[v6] = (byte)(v7 >> 24 ^ (v7 & 0xFF ^ v7 >> 8 & 0xFF ^ v7 >> 16 & 0xFF));
                }
            }
            arr_b = arr_b1;
        }
        this.zzb = this.zza();
        synchronized(this.zza) {
            MessageDigest messageDigest0 = this.zzb;
            if(messageDigest0 == null) {
                return new byte[0];
            }
            messageDigest0.reset();
            this.zzb.update(arr_b);
            byte[] arr_b2 = this.zzb.digest();
            if(arr_b2.length <= 4) {
                v = arr_b2.length;
            }
            byte[] arr_b3 = new byte[v];
            System.arraycopy(arr_b2, 0, arr_b3, 0, v);
            return arr_b3;
        }
    }
}

