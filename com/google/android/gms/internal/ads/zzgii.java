package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzgii {
    private static final zzglz zza;
    private static final zzgmx zzb;

    static {
        zzgii.zza = new zzgig();
        zzgii.zzb = zzgmx.zzb(new zzgih(), zzgif.class, zzgdn.class);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zzgkj.zze(zzgmk.zzc());
        HashMap hashMap0 = new HashMap();
        hashMap0.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzgie.zzg);
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgmh.zza().zze(zzgii.zzb);
        zzgma.zzb().zzc(zzgii.zza, zzgik.class);
    }
}

