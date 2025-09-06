package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class zzguq implements zzgdn {
    private final zzgvg zza;
    private final zzgej zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzguq(zzgvg zzgvg0, zzgej zzgej0, int v, byte[] arr_b) {
        this.zza = zzgvg0;
        this.zzb = zzgej0;
        this.zzc = v;
        this.zzd = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.zzd;
        if(arr_b.length < this.zzc + arr_b2.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, this.zzd.length, arr_b.length - this.zzc);
        byte[] arr_b4 = Arrays.copyOfRange(arr_b, arr_b.length - this.zzc, arr_b.length);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b5 = zzguo.zzb(new byte[][]{arr_b1, arr_b3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long)arr_b1.length) * 8L).array(), 8)});
        if(!MessageDigest.isEqual(((zzgvl)this.zzb).zzc(arr_b5), arr_b4)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        return this.zza.zza(arr_b3);
    }

    public static zzgdn zzb(zzgfb zzgfb0) throws GeneralSecurityException {
        return new zzguq(new zzguj(zzgfb0.zzd().zzd(zzgdw.zza()), zzgfb0.zzb().zzd()), new zzgvl(new zzgvk("HMAC" + zzgfb0.zzb().zzg(), new SecretKeySpec(zzgfb0.zze().zzd(zzgdw.zza()), "HMAC")), zzgfb0.zzb().zze()), zzgfb0.zzb().zze(), zzgfb0.zzc().zzc());
    }
}

