package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class zzggm {
    private static final zzgmx zza;
    private static final zzglz zzb;
    private static final zzgmb zzc;
    private static final zzgdy zzd;

    static {
        zzggm.zza = zzgmx.zzb(new zzggj(), zzggi.class, zzgdn.class);
        zzggm.zzb = new zzggk();
        zzggm.zzc = new zzggl();
        zzgzk zzgzk0 = zzgro.zzg();
        zzggm.zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgdn.class, zzgsj.zzb, zzgzk0);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        zzgjn.zze(zzgmk.zzc());
        if(zzggm.zzb()) {
            zzgmh.zza().zze(zzggm.zza);
            HashMap hashMap0 = new HashMap();
            zzggn zzggn0 = new zzggn(null);
            zzggn0.zza(16);
            zzggn0.zzb(zzggo.zza);
            hashMap0.put("AES128_GCM_SIV", zzggn0.zzc());
            zzggn zzggn1 = new zzggn(null);
            zzggn1.zza(16);
            zzggn1.zzb(zzggo.zzc);
            hashMap0.put("AES128_GCM_SIV_RAW", zzggn1.zzc());
            zzggn zzggn2 = new zzggn(null);
            zzggn2.zza(0x20);
            zzggn2.zzb(zzggo.zza);
            hashMap0.put("AES256_GCM_SIV", zzggn2.zzc());
            zzggn zzggn3 = new zzggn(null);
            zzggn3.zza(0x20);
            zzggn3.zzb(zzggo.zzc);
            hashMap0.put("AES256_GCM_SIV_RAW", zzggn3.zzc());
            zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
            zzgmc.zza().zzb(zzggm.zzc, zzggq.class);
            zzgma.zzb().zzc(zzggm.zzb, zzggq.class);
            zzgkz.zzc().zzd(zzggm.zzd, true);
        }
    }

    private static boolean zzb() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException unused_ex) {
            return false;
        }
    }
}

