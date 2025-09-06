package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzggz {
    public static final int zza;
    private static final zzgmx zzb;
    private static final zzgdy zzc;
    private static final zzglz zzd;

    static {
        zzggz.zzb = zzgmx.zzb(new zzggx(), zzghe.class, zzgdn.class);
        zzgzk zzgzk0 = zzgtf.zzg();
        zzggz.zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgdn.class, zzgsj.zze, zzgzk0);
        zzggz.zzd = new zzggy();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        zzghl.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzggz.zzb);
        zzgma.zzb().zzc(zzggz.zzd, zzghg.class);
        zzgkz.zzc().zzd(zzggz.zzc, true);
    }
}

