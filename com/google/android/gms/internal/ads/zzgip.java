package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzgip {
    public static final int zza;
    private static final zzgmx zzb;
    private static final zzgdy zzc;
    private static final zzgmb zzd;
    private static final zzglz zze;

    static {
        zzgip.zzb = zzgmx.zzb(new zzgim(), zzgil.class, zzgdn.class);
        zzgzk zzgzk0 = zzgue.zzg();
        zzgip.zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgdn.class, zzgsj.zzb, zzgzk0);
        zzgip.zzd = new zzgin();
        zzgip.zze = new zzgio();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        zzgkp.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzgip.zzb);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("XCHACHA20_POLY1305", zzgir.zzc(zzgiq.zza));
        hashMap0.put("XCHACHA20_POLY1305_RAW", zzgir.zzc(zzgiq.zzc));
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgma.zzb().zzc(zzgip.zze, zzgir.class);
        zzgmc.zza().zzb(zzgip.zzd, zzgir.class);
        zzgkz.zzc().zzd(zzgip.zzc, true);
    }
}

