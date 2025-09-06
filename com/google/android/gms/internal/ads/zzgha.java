package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

public final class zzgha implements zzgdn {
    public static final int zza;
    private static final byte[] zzb;
    private static final Set zzc;
    private final String zzd;
    private final zzgdn zze;

    static {
        zzgha.zzb = new byte[0];
        HashSet hashSet0 = new HashSet();
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet0.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet0.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet0.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgha.zzc = DesugarCollections.unmodifiableSet(hashSet0);
    }

    @Deprecated
    zzgha(zzgsp zzgsp0, zzgdn zzgdn0) throws GeneralSecurityException {
        if(!zzgha.zzc.contains("")) {
            throw new IllegalArgumentException("Unsupported DEK key type: . Only Tink AEAD key types are supported.");
        }
        this.zzd = "";
        zzgsn zzgsn0 = zzgsp.zzb(zzgsp0);
        zzgsn0.zza(zzgtp.zzd);
        zzgeq.zza(((zzgsp)zzgsn0.zzbn()).zzaV());
        this.zze = zzgdn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        try {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            int v = byteBuffer0.getInt();
            if(v <= 0 || v > 0x1000 || v > arr_b.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] arr_b2 = new byte[v];
            byteBuffer0.get(arr_b2, 0, v);
            byte[] arr_b3 = new byte[byteBuffer0.remaining()];
            byteBuffer0.get(arr_b3, 0, byteBuffer0.remaining());
            byte[] arr_b4 = this.zze.zza(arr_b2, zzgha.zzb);
            zzgwj zzgwj0 = zzgwj.zzv(arr_b4, 0, arr_b4.length);
            return ((zzgdn)zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnh.zza(this.zzd, zzgwj0, zzgsj.zzb, zzgtp.zzd, null), zzgdw.zza()), zzgdn.class)).zza(arr_b3, arr_b1);
        }
        catch(IndexOutOfBoundsException | BufferUnderflowException | NegativeArraySizeException indexOutOfBoundsException0) {
        }
        throw new GeneralSecurityException("invalid ciphertext", indexOutOfBoundsException0);
    }
}

