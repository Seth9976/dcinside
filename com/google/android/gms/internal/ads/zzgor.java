package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzgor {
    private static final zzgmx zza;
    private static final zzgmx zzb;
    private static final zzgdy zzc;
    private static final zzgmb zzd;
    private static final zzglz zze;
    private static final int zzf;

    static {
        zzgor.zza = zzgmx.zzb(new zzgon(), zzgom.class, zzgog.class);
        zzgor.zzb = zzgmx.zzb(new zzgoo(), zzgom.class, zzgej.class);
        zzgzk zzgzk0 = zzgsb.zzi();
        zzgor.zzc = zzgli.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgej.class, zzgsj.zzb, zzgzk0);
        zzgor.zzd = new zzgop();
        zzgor.zze = new zzgoq();
        zzgor.zzf = 2;
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        int v = zzgor.zzf;
        if(!zzgks.zza(v)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgpw.zze(zzgmk.zzc());
        zzgmh.zza().zze(zzgor.zza);
        zzgmh.zza().zze(zzgor.zzb);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("HMAC_SHA256_128BITTAG", zzgpj.zza);
        zzgos zzgos0 = new zzgos(null);
        zzgos0.zzb(0x20);
        zzgos0.zzc(16);
        zzgos0.zzd(zzgou.zzd);
        zzgos0.zza(zzgot.zzc);
        hashMap0.put("HMAC_SHA256_128BITTAG_RAW", zzgos0.zze());
        zzgos zzgos1 = new zzgos(null);
        zzgos1.zzb(0x20);
        zzgos1.zzc(0x20);
        zzgos1.zzd(zzgou.zza);
        zzgos1.zza(zzgot.zzc);
        hashMap0.put("HMAC_SHA256_256BITTAG", zzgos1.zze());
        zzgos zzgos2 = new zzgos(null);
        zzgos2.zzb(0x20);
        zzgos2.zzc(0x20);
        zzgos2.zzd(zzgou.zzd);
        zzgos2.zza(zzgot.zzc);
        hashMap0.put("HMAC_SHA256_256BITTAG_RAW", zzgos2.zze());
        zzgos zzgos3 = new zzgos(null);
        zzgos3.zzb(0x40);
        zzgos3.zzc(16);
        zzgos3.zzd(zzgou.zza);
        zzgos3.zza(zzgot.zze);
        hashMap0.put("HMAC_SHA512_128BITTAG", zzgos3.zze());
        zzgos zzgos4 = new zzgos(null);
        zzgos4.zzb(0x40);
        zzgos4.zzc(16);
        zzgos4.zzd(zzgou.zzd);
        zzgos4.zza(zzgot.zze);
        hashMap0.put("HMAC_SHA512_128BITTAG_RAW", zzgos4.zze());
        zzgos zzgos5 = new zzgos(null);
        zzgos5.zzb(0x40);
        zzgos5.zzc(0x20);
        zzgos5.zzd(zzgou.zza);
        zzgos5.zza(zzgot.zze);
        hashMap0.put("HMAC_SHA512_256BITTAG", zzgos5.zze());
        zzgos zzgos6 = new zzgos(null);
        zzgos6.zzb(0x40);
        zzgos6.zzc(0x20);
        zzgos6.zzd(zzgou.zzd);
        zzgos6.zza(zzgot.zze);
        hashMap0.put("HMAC_SHA512_256BITTAG_RAW", zzgos6.zze());
        hashMap0.put("HMAC_SHA512_512BITTAG", zzgpj.zzb);
        zzgos zzgos7 = new zzgos(null);
        zzgos7.zzb(0x40);
        zzgos7.zzc(0x40);
        zzgos7.zzd(zzgou.zzd);
        zzgos7.zza(zzgot.zze);
        hashMap0.put("HMAC_SHA512_512BITTAG_RAW", zzgos7.zze());
        zzgmg.zzb().zzd(DesugarCollections.unmodifiableMap(hashMap0));
        zzgma.zzb().zzc(zzgor.zze, zzgow.class);
        zzgmc.zza().zzb(zzgor.zzd, zzgow.class);
        zzgkz.zzc().zzf(zzgor.zzc, v, true);
    }
}

