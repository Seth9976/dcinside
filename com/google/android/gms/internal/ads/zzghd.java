package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzghd {
    public static final int zza;
    private static final zzgdy zzb;
    private static final zzglz zzc;
    private static final zzgmx zzd;

    static {
        zzgzk zzgzk0 = zzgtl.zzg();
        zzghd.zzb = zzgli.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgdn.class, zzgsj.zzb, zzgzk0);
        zzghd.zzc = new zzghb();
        zzghd.zzd = zzgmx.zzb(new zzghc(), zzghm.class, zzgdn.class);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if(!zzgks.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        zzghw.zze(zzgmk.zzc());
        zzgma.zzb().zzc(zzghd.zzc, zzghr.class);
        zzgmh.zza().zze(zzghd.zzd);
        zzgkz.zzc().zzd(zzghd.zzb, true);
    }
}

