package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgum implements zzgdn {
    private static final ThreadLocal zza;
    private static final ThreadLocal zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final SecretKeySpec zzf;
    private final int zzg;

    static {
        zzgum.zza = new zzguk();
        zzgum.zzb = new zzgul();
    }

    private zzgum(byte[] arr_b, int v, byte[] arr_b1) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if(v != 12 && v != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzg = v;
        zzgvm.zza(arr_b.length);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
        this.zzf = secretKeySpec0;
        Cipher cipher0 = (Cipher)zzgum.zza.get();
        cipher0.init(1, secretKeySpec0);
        byte[] arr_b2 = zzgum.zzd(cipher0.doFinal(new byte[16]));
        this.zzc = arr_b2;
        this.zzd = zzgum.zzd(arr_b2);
        this.zze = arr_b1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.zze;
        int v = arr_b.length - arr_b2.length - this.zzg - 16;
        if(v < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher0 = (Cipher)zzgum.zza.get();
        cipher0.init(1, this.zzf);
        byte[] arr_b3 = this.zze(cipher0, 0, arr_b, this.zze.length, this.zzg);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b4 = this.zze(cipher0, 1, arr_b1, 0, arr_b1.length);
        byte[] arr_b5 = this.zze(cipher0, 2, arr_b, this.zze.length + this.zzg, v);
        int v2 = arr_b.length - 16;
        int v3 = 0;
        for(int v1 = 0; v1 < 16; ++v1) {
            v3 = (byte)(v3 | arr_b[v2 + v1] ^ arr_b4[v1] ^ arr_b3[v1] ^ arr_b5[v1]);
        }
        if(v3 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher1 = (Cipher)zzgum.zzb.get();
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b3);
        cipher1.init(1, this.zzf, ivParameterSpec0);
        return cipher1.doFinal(arr_b, this.zze.length + this.zzg, v);
    }

    public static zzgdn zzb(zzgfn zzgfn0) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        return new zzgum(zzgfn0.zzd().zzd(zzgdw.zza()), zzgfn0.zzb().zzb(), zzgfn0.zzc().zzc());
    }

    private static void zzc(byte[] arr_b, byte[] arr_b1) {
        for(int v = 0; v < arr_b.length; ++v) {
            arr_b[v] = (byte)(arr_b[v] ^ arr_b1[v]);
        }
    }

    private static byte[] zzd(byte[] arr_b) {
        byte[] arr_b1 = new byte[16];
        for(int v = 0; v < 15; ++v) {
            int v1 = arr_b[v];
            arr_b1[v] = (byte)((v1 + v1 ^ (arr_b[v + 1] & 0xFF) >>> 7) & 0xFF);
        }
        int v2 = arr_b[15];
        arr_b1[15] = (byte)(arr_b[0] >> 7 & 0x87 ^ v2 + v2);
        return arr_b1;
    }

    private final byte[] zze(Cipher cipher0, int v, byte[] arr_b, int v1, int v2) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        byte[] arr_b1 = new byte[16];
        arr_b1[15] = (byte)v;
        if(v2 == 0) {
            zzgum.zzc(arr_b1, this.zzc);
            return cipher0.doFinal(arr_b1);
        }
        byte[] arr_b2 = new byte[16];
        cipher0.doFinal(arr_b1, 0, 16, arr_b2);
        int v3;
        for(v3 = 0; true; v3 += 16) {
            byte[] arr_b3 = arr_b1;
            arr_b1 = arr_b2;
            arr_b2 = arr_b3;
            if(v2 - v3 <= 16) {
                break;
            }
            for(int v4 = 0; v4 < 16; ++v4) {
                arr_b1[v4] = (byte)(arr_b[v1 + v3 + v4] ^ arr_b1[v4]);
            }
            cipher0.doFinal(arr_b1, 0, 16, arr_b2);
        }
        byte[] arr_b4 = Arrays.copyOfRange(arr_b, v3 + v1, v1 + v2);
        if(arr_b4.length == 16) {
            zzgum.zzc(arr_b4, this.zzc);
        }
        else {
            byte[] arr_b5 = Arrays.copyOf(this.zzd, 16);
            for(int v5 = 0; v5 < arr_b4.length; ++v5) {
                arr_b5[v5] = (byte)(arr_b5[v5] ^ arr_b4[v5]);
            }
            arr_b5[arr_b4.length] = (byte)(arr_b5[arr_b4.length] ^ 0x80);
            arr_b4 = arr_b5;
        }
        zzgum.zzc(arr_b1, arr_b4);
        cipher0.doFinal(arr_b1, 0, 16, arr_b2);
        return arr_b2;
    }
}

