package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgup implements zzgdn {
    private final zzgjy zza;
    private final byte[] zzb;

    private zzgup(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        this.zza = new zzgjy(arr_b);
        this.zzb = arr_b1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.zzb;
        if(arr_b2.length == 0) {
            return this.zzc(arr_b, arr_b1);
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return this.zzc(Arrays.copyOfRange(arr_b, this.zzb.length, arr_b.length), arr_b1);
    }

    public static zzgdn zzb(zzggr zzggr0) throws GeneralSecurityException {
        return new zzgup(zzggr0.zzd().zzd(zzgdw.zza()), zzggr0.zzc().zzc());
    }

    private final byte[] zzc(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, 12);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 12, arr_b.length - 12);
        return this.zza.zzb(byteBuffer0, arr_b2, arr_b1);
    }
}

