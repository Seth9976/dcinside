package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public final class zzgjy extends zzgjz {
    public zzgjy(byte[] arr_b) throws GeneralSecurityException {
        super(arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzgjz
    final zzgjx zza(byte[] arr_b, int v) throws InvalidKeyException {
        return new zzgjw(arr_b, v);
    }
}

