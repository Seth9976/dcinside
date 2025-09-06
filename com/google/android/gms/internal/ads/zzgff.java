package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzgff {
    public static final int zza;
    private static final zzgmx zzb;
    private static final zzgdy zzc;
    private static final zzgmb zzd;
    private static final zzglz zze;
    private static final int zzf;

    static {
        zzgff.zzb = zzgmx.zzb(new zzgfc(), zzgfb.class, zzgdn.class);
        zzgzk zzgzk0 = zzgqk.zzh();
        zzgff.zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgdn.class, zzgsj.zzb, zzgzk0);
        zzgff.zzd = new zzgfd();
        zzgff.zze = new zzgfe();
        zzgff.zzf = 2;
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        int v = zzgff.zzf;
        if(!zzgks.zza(v)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgiw.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzgff.zzb);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_CTR_HMAC_SHA256", zzgie.zze);
        zzgfg zzgfg0 = new zzgfg(null);
        zzgfg0.zza(16);
        zzgfg0.zzc(0x20);
        zzgfg0.zze(16);
        zzgfg0.zzd(16);
        zzgfg0.zzb(zzgfh.zzc);
        zzgfg0.zzf(zzgfi.zzc);
        hashMap0.put("AES128_CTR_HMAC_SHA256_RAW", zzgfg0.zzg());
        hashMap0.put("AES256_CTR_HMAC_SHA256", zzgie.zzf);
        zzgfg zzgfg1 = new zzgfg(null);
        zzgfg1.zza(0x20);
        zzgfg1.zzc(0x20);
        zzgfg1.zze(0x20);
        zzgfg1.zzd(16);
        zzgfg1.zzb(zzgfh.zzc);
        zzgfg1.zzf(zzgfi.zzc);
        hashMap0.put("AES256_CTR_HMAC_SHA256_RAW", zzgfg1.zzg());
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgmc.zza().zzb(zzgff.zzd, zzgfk.class);
        zzgma.zzb().zzc(zzgff.zze, zzgfk.class);
        zzgkz.zzc().zzf(zzgff.zzc, v, true);
    }
}

