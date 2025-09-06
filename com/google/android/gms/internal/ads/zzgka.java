package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

public final class zzgka extends zzgjx {
    public zzgka(byte[] arr_b, int v) throws InvalidKeyException {
        super(arr_b, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    final int zza() {
        return 24;
    }

    @Override  // com.google.android.gms.internal.ads.zzgjx
    final int[] zzb(int[] arr_v, int v) {
        if(arr_v.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", ((int)(arr_v.length * 0x20))));
        }
        int[] arr_v1 = new int[16];
        zzgjv.zzb(arr_v1, zzgjv.zzd(this.zza, arr_v));
        arr_v1[12] = v;
        arr_v1[13] = 0;
        arr_v1[14] = arr_v[4];
        arr_v1[15] = arr_v[5];
        return arr_v1;
    }
}

