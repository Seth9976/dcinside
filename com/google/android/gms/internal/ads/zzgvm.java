package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

public final class zzgvm {
    static {
    }

    public static void zza(int v) throws InvalidAlgorithmParameterException {
        if(v != 16 && v != 0x20) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", ((int)(v * 8))));
        }
    }
}

