package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzggu {
    public static final int zza;
    private static final zzgmx zzb;
    private static final zzglz zzc;
    private static final zzgdy zzd;

    static {
        zzggu.zzb = zzgmx.zzb(new zzggs(), zzggr.class, zzgdn.class);
        zzggu.zzc = new zzggt();
        zzgzk zzgzk0 = zzgru.zzg();
        zzggu.zzd = zzgli.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgdn.class, zzgsj.zzb, zzgzk0);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        zzgju.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzggu.zzb);
        zzgma.zzb().zzc(zzggu.zzc, zzggw.class);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("CHACHA20_POLY1305", zzggw.zzc(zzggv.zza));
        hashMap0.put("CHACHA20_POLY1305_RAW", zzggw.zzc(zzggv.zzc));
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgkz.zzc().zzd(zzggu.zzd, true);
    }
}

