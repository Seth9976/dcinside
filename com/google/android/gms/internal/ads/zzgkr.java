package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgkr implements zzgdn {
    private static final byte[] zza;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final ThreadLocal zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    static {
        zzgkr.zza = new byte[]{0x7A, (byte)0x80, 108};
        zzgkr.zzb = new byte[]{70, -69, (byte)0x91, -61, -59};
        zzgkr.zzc = new byte[]{54, (byte)0x86, 66, 0, (byte)0xE0, -22, -11, 40, 77, -120, 74, 14, 0x77, -45, 22, 70};
        zzgkr.zzd = new byte[]{-70, -24, -29, 0x7F, -56, 52, 65, (byte)0xB1, 0x60, 52, 86, 107};
        zzgkr.zze = new byte[]{-81, 0x60, -21, 0x71, 27, -40, 91, (byte)0xC1, -28, -45, (byte)0xE0, -92, 98, (byte)0xE0, 0x74, -18, -92, 40, -88};
        zzgkr.zzf = new zzgkq();
    }

    private zzgkr(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        this.zzh = arr_b1;
        zzgvm.zza(arr_b.length);
        this.zzg = new SecretKeySpec(arr_b, "AES");
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.zzh;
        if(arr_b2.length == 0) {
            return this.zze(arr_b, arr_b1);
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return this.zze(Arrays.copyOfRange(arr_b, this.zzh.length, arr_b.length), arr_b1);
    }

    public static zzgdn zzb(zzggi zzggi0) throws GeneralSecurityException {
        return new zzgkr(zzggi0.zzd().zzd(zzgdw.zza()), zzggi0.zzc().zzc());
    }

    private static boolean zzd(Cipher cipher0) {
        try {
            GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, zzgkr.zzd, 0, zzgkr.zzd.length);
            cipher0.init(2, new SecretKeySpec(zzgkr.zzc, "AES"), gCMParameterSpec0);
            cipher0.updateAAD(zzgkr.zzb);
            return MessageDigest.isEqual(cipher0.doFinal(zzgkr.zze, 0, zzgkr.zze.length), zzgkr.zza);
        }
        catch(GeneralSecurityException unused_ex) {
            return false;
        }
    }

    private final byte[] zze(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        Cipher cipher0 = (Cipher)zzgkr.zzf.get();
        if(cipher0 == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        if(arr_b.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec0 = new GCMParameterSpec(0x80, arr_b, 0, 12);
        cipher0.init(2, this.zzg, gCMParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            cipher0.updateAAD(arr_b1);
        }
        return cipher0.doFinal(arr_b, 12, arr_b.length - 12);
    }
}

