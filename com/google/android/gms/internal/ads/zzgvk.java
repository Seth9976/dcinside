package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class zzgvk implements zzgpy {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    public zzgvk(String s, Key key0) throws GeneralSecurityException {
        int v;
        zzgvj zzgvj0 = new zzgvj(this);
        this.zza = zzgvj0;
        if(!zzgks.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = s;
        this.zzc = key0;
        if(key0.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch(s) {
            case "HMACSHA1": {
                v = 20;
                break;
            }
            case "HMACSHA224": {
                v = 28;
                break;
            }
            case "HMACSHA256": {
                v = 0x20;
                break;
            }
            case "HMACSHA384": {
                v = 0x30;
                break;
            }
            case "HMACSHA512": {
                v = 0x40;
                break;
            }
            default: {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + s);
            }
        }
        this.zzd = v;
        zzgvj0.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzgpy
    public final byte[] zza(byte[] arr_b, int v) throws GeneralSecurityException {
        if(v > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac)this.zza.get()).update(arr_b);
        return Arrays.copyOf(((Mac)this.zza.get()).doFinal(), v);
    }
}

