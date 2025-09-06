package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

abstract class zzgjz {
    private final zzgjx zza;
    private final zzgjx zzb;

    public zzgjz(byte[] arr_b) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.zza = this.zza(arr_b, 1);
        this.zzb = this.zza(arr_b, 0);
    }

    abstract zzgjx zza(byte[] arg1, int arg2) throws InvalidKeyException;

    public final byte[] zzb(ByteBuffer byteBuffer0, byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(byteBuffer0.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int v = byteBuffer0.position();
        byte[] arr_b2 = new byte[16];
        byteBuffer0.position(byteBuffer0.limit() - 16);
        byteBuffer0.get(arr_b2);
        byteBuffer0.position(v);
        byteBuffer0.limit(byteBuffer0.limit() - 16);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        try {
            ByteBuffer byteBuffer1 = this.zzb.zzc(arr_b, 0);
            byte[] arr_b3 = new byte[0x20];
            byteBuffer1.get(arr_b3);
            int v1 = arr_b1.length & 15;
            int v2 = v1 == 0 ? arr_b1.length : arr_b1.length + 16 - v1;
            int v3 = byteBuffer0.remaining();
            int v4 = (v3 % 16 == 0 ? v3 : v3 + 16 - v3 % 16) + v2;
            ByteBuffer byteBuffer2 = ByteBuffer.allocate(v4 + 16).order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer2.put(arr_b1);
            byteBuffer2.position(v2);
            byteBuffer2.put(byteBuffer0);
            byteBuffer2.position(v4);
            byteBuffer2.putLong(((long)arr_b1.length));
            byteBuffer2.putLong(((long)v3));
            if(!MessageDigest.isEqual(zzgkd.zza(arr_b3, byteBuffer2.array()), arr_b2)) {
                throw new GeneralSecurityException("invalid MAC");
            }
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new AEADBadTagException(generalSecurityException0.toString());
        }
        byteBuffer0.position(v);
        return this.zza.zzd(arr_b, byteBuffer0);
    }
}

