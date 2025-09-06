package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzgfq {
    public static final int zza;
    private static final zzgmx zzb;
    private static final zzgdy zzc;
    private static final zzglz zzd;

    static {
        zzgfq.zzb = zzgmx.zzb(new zzgfo(), zzgfn.class, zzgdn.class);
        zzgzk zzgzk0 = zzgqz.zzh();
        zzgfq.zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgdn.class, zzgsj.zzb, zzgzk0);
        zzgfq.zzd = new zzgfp();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        zzgjb.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzgfq.zzb);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("AES128_EAX", zzgie.zzc);
        zzgfr zzgfr0 = new zzgfr(null);
        zzgfr0.zza(16);
        zzgfr0.zzb(16);
        zzgfr0.zzc(16);
        zzgfr0.zzd(zzgfs.zzc);
        hashMap0.put("AES128_EAX_RAW", zzgfr0.zze());
        hashMap0.put("AES256_EAX", zzgie.zzd);
        zzgfr zzgfr1 = new zzgfr(null);
        zzgfr1.zza(16);
        zzgfr1.zzb(0x20);
        zzgfr1.zzc(16);
        zzgfr1.zzd(zzgfs.zzc);
        hashMap0.put("AES256_EAX_RAW", zzgfr1.zze());
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgma.zzb().zzc(zzgfq.zzd, zzgfu.class);
        zzgkz.zzc().zzd(zzgfq.zzc, true);
    }
}

