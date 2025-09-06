package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o3.h;

public final class zzgjp implements zzgdn {
    private static final byte[] zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final ThreadLocal zzd;
    private final SecretKey zze;
    private final byte[] zzf;

    static {
        zzgjp.zza = new byte[]{(byte)0x80, (byte)0x81, (byte)0x82, (byte)0x83, (byte)0x84, (byte)0x85, (byte)0x86, (byte)0x87, -120, (byte)0x89, (byte)0x8A, (byte)0x8B, (byte)0x8C, (byte)0x8D, (byte)0x8E, (byte)0x8F, (byte)0x90, (byte)0x91, -110, -109, -108, -107, -106, -105, -104, -103, -102, -101, -100, -99, -98, -97};
        zzgjp.zzb = new byte[]{7, 0, 0, 0, 0x40, 65, 66, 67, 68, 69, 70, 71};
        zzgjp.zzc = new byte[]{(byte)0xA0, 120, 77, 0x7A, 71, 22, -13, -2, -76, -10, 78, 0x7F, 75, 57, -65, 4};
        zzgjp.zzd = new zzgjo();
    }

    private zzgjp(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if(!zzgjp.zze()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zze = new SecretKeySpec(arr_b, "ChaCha20");
        this.zzf = arr_b1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] arr_b2 = this.zzf;
        if(arr_b.length < arr_b2.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] arr_b3 = new byte[12];
        System.arraycopy(arr_b, this.zzf.length, arr_b3, 0, 12);
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b3);
        Cipher cipher0 = (Cipher)zzgjp.zzd.get();
        cipher0.init(2, this.zze, ivParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            cipher0.updateAAD(arr_b1);
        }
        return cipher0.doFinal(arr_b, this.zzf.length + 12, arr_b.length - this.zzf.length - 12);
    }

    public static zzgdn zzb(zzggr zzggr0) throws GeneralSecurityException {
        return new zzgjp(zzggr0.zzd().zzd(zzgdw.zza()), zzggr0.zzc().zzc());
    }

    @h
    static Cipher zzc() {
        return (Cipher)zzgjp.zzd.get();
    }

    public static boolean zze() {
        return zzgjp.zzd.get() != null;
    }

    private static boolean zzf(Cipher cipher0) {
        try {
            IvParameterSpec ivParameterSpec0 = new IvParameterSpec(zzgjp.zzb);
            byte[] arr_b = zzgjp.zza;
            cipher0.init(2, new SecretKeySpec(arr_b, "ChaCha20"), ivParameterSpec0);
            byte[] arr_b1 = zzgjp.zzc;
            if(cipher0.doFinal(arr_b1).length != 0) {
                return false;
            }
            cipher0.init(2, new SecretKeySpec(arr_b, "ChaCha20"), ivParameterSpec0);
            return cipher0.doFinal(arr_b1).length != 0 ? false : true;
        }
        catch(GeneralSecurityException unused_ex) {
            return false;
        }
    }
}

