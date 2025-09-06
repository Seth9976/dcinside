package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgkk implements zzgdn {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgkk(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if(!zzgkk.zzc()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = arr_b;
        this.zzb = arr_b1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] arr_b2 = this.zzb;
        if(arr_b.length < arr_b2.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] arr_b3 = new byte[24];
        System.arraycopy(arr_b, this.zzb.length, arr_b3, 0, 24);
        int[] arr_v = zzgjv.zzd(zzgjv.zze(this.zza), zzgjv.zze(arr_b3));
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_v.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.asIntBuffer().put(arr_v);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(byteBuffer0.array(), "ChaCha20");
        byte[] arr_b4 = new byte[12];
        System.arraycopy(arr_b3, 16, arr_b4, 4, 8);
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b4);
        Cipher cipher0 = zzgjp.zzc();
        cipher0.init(2, secretKeySpec0, ivParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            cipher0.updateAAD(arr_b1);
        }
        return cipher0.doFinal(arr_b, this.zzb.length + 24, arr_b.length - this.zzb.length - 24);
    }

    public static zzgdn zzb(zzgil zzgil0) throws GeneralSecurityException {
        return new zzgkk(zzgil0.zzd().zzd(zzgdw.zza()), zzgil0.zzc().zzc());
    }

    public static boolean zzc() {
        return zzgjp.zzc() != null;
    }
}

