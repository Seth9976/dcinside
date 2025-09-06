package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class zzgjx {
    int[] zza;
    private final int zzb;

    public zzgjx(byte[] arr_b, int v) throws InvalidKeyException {
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzgjv.zze(arr_b);
        this.zzb = v;
    }

    abstract int zza();

    abstract int[] zzb(int[] arg1, int arg2);

    final ByteBuffer zzc(byte[] arr_b, int v) {
        int[] arr_v = this.zzb(zzgjv.zze(arr_b), v);
        int[] arr_v1 = (int[])arr_v.clone();
        zzgjv.zzc(arr_v1);
        for(int v1 = 0; v1 < 16; ++v1) {
            arr_v[v1] += arr_v1[v1];
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(0x40).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.asIntBuffer().put(arr_v, 0, 16);
        return byteBuffer0;
    }

    public final byte[] zzd(byte[] arr_b, ByteBuffer byteBuffer0) throws GeneralSecurityException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(byteBuffer0.remaining());
        int v = this.zza();
        if(arr_b.length != v) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + this.zza());
        }
        int v1 = byteBuffer0.remaining();
        for(int v2 = 0; v2 < v1 / 0x40 + 1; ++v2) {
            ByteBuffer byteBuffer2 = this.zzc(arr_b, this.zzb + v2);
            if(v2 == v1 / 0x40) {
                zzguo.zza(byteBuffer1, byteBuffer0, byteBuffer2, v1 % 0x40);
            }
            else {
                zzguo.zza(byteBuffer1, byteBuffer0, byteBuffer2, 0x40);
            }
        }
        return byteBuffer1.array();
    }
}

