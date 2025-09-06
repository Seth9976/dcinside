package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

public final class zzgjw extends zzgjx {
    public zzgjw(byte[] arr_b, int v) throws InvalidKeyException {
        super(arr_b, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final int zza() {
        return 12;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    public final int[] zzb(int[] arr_v, int v) {
        if(arr_v.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", ((int)(arr_v.length * 0x20))));
        }
        int[] arr_v1 = new int[16];
        zzgjv.zzb(arr_v1, this.zza);
        arr_v1[12] = v;
        System.arraycopy(arr_v, 0, arr_v1, 13, 3);
        return arr_v1;
    }
}

