package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzavi {
    private static Cipher zza;
    private static final Object zzb;
    private static final Object zzc;

    static {
        zzavi.zzb = new Object();
        zzavi.zzc = new Object();
    }

    public zzavi(SecureRandom secureRandom0) {
    }

    public final String zza(byte[] arr_b, byte[] arr_b1) throws zzavh {
        byte[] arr_b3;
        byte[] arr_b2;
        try {
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            synchronized(zzavi.zzb) {
                zzavi.zzc().init(1, secretKeySpec0, null);
                arr_b2 = zzavi.zzc().doFinal(arr_b1);
                arr_b3 = zzavi.zzc().getIV();
            }
            int v1 = arr_b2.length + arr_b3.length;
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(v1);
            byteBuffer0.put(arr_b3).put(arr_b2);
            byteBuffer0.flip();
            byte[] arr_b4 = new byte[v1];
            byteBuffer0.get(arr_b4);
            return zzatr.zza(arr_b4, false);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new zzavh(this, noSuchAlgorithmException0);
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new zzavh(this, invalidKeyException0);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new zzavh(this, illegalBlockSizeException0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new zzavh(this, noSuchPaddingException0);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new zzavh(this, badPaddingException0);
        }
    }

    public final byte[] zzb(byte[] arr_b, String s) throws zzavh {
        try {
            byte[] arr_b1 = zzatr.zzb(s, false);
            if(arr_b1.length <= 16) {
                throw new zzavh(this);
            }
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b1.length);
            byteBuffer0.put(arr_b1);
            byteBuffer0.flip();
            byte[] arr_b2 = new byte[16];
            byte[] arr_b3 = new byte[arr_b1.length - 16];
            byteBuffer0.get(arr_b2);
            byteBuffer0.get(arr_b3);
            SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "AES");
            synchronized(zzavi.zzb) {
                zzavi.zzc().init(2, secretKeySpec0, new IvParameterSpec(arr_b2));
            }
            return zzavi.zzc().doFinal(arr_b3);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
        }
        catch(InvalidKeyException invalidKeyException0) {
            throw new zzavh(this, invalidKeyException0);
        }
        catch(IllegalBlockSizeException illegalBlockSizeException0) {
            throw new zzavh(this, illegalBlockSizeException0);
        }
        catch(NoSuchPaddingException noSuchPaddingException0) {
            throw new zzavh(this, noSuchPaddingException0);
        }
        catch(BadPaddingException badPaddingException0) {
            throw new zzavh(this, badPaddingException0);
        }
        catch(InvalidAlgorithmParameterException invalidAlgorithmParameterException0) {
            throw new zzavh(this, invalidAlgorithmParameterException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new zzavh(this, illegalArgumentException0);
        }
        throw new zzavh(this, noSuchAlgorithmException0);
    }

    private static final Cipher zzc() throws NoSuchAlgorithmException, NoSuchPaddingException {
        synchronized(zzavi.zzc) {
            if(zzavi.zza == null) {
                zzavi.zza = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            return zzavi.zza;
        }
    }
}

