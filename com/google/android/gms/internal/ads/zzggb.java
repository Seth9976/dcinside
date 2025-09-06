package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzggb {
    public static final int zza;
    private static final zzgmx zzb;
    private static final zzgdy zzc;
    private static final zzgmb zzd;
    private static final zzglz zze;
    private static final int zzf;

    static {
        zzggb.zzb = zzgmx.zzb(new zzgfy(), zzgfx.class, zzgdn.class);
        zzgzk zzgzk0 = zzgri.zzg();
        zzggb.zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgdn.class, zzgsj.zzb, zzgzk0);
        zzggb.zzd = new zzgfz();
        zzggb.zze = new zzgga();
        zzggb.zzf = 2;
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        int v = zzggb.zzf;
        if(!zzgks.zza(v)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgji.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzggb.zzb);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_GCM", zzgie.zza);
        zzggc zzggc0 = new zzggc(null);
        zzggc0.zza(12);
        zzggc0.zzb(16);
        zzggc0.zzc(16);
        zzggc0.zzd(zzggd.zzc);
        hashMap0.put("AES128_GCM_RAW", zzggc0.zze());
        hashMap0.put("AES256_GCM", zzgie.zzb);
        zzggc zzggc1 = new zzggc(null);
        zzggc1.zza(12);
        zzggc1.zzb(0x20);
        zzggc1.zzc(16);
        zzggc1.zzd(zzggd.zzc);
        hashMap0.put("AES256_GCM_RAW", zzggc1.zze());
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgmc.zza().zzb(zzggb.zzd, zzggf.class);
        zzgma.zzb().zzc(zzggb.zze, zzggf.class);
        zzgkz.zzc().zzf(zzggb.zzc, v, true);
    }
}

