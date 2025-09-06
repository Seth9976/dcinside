package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgfp implements zzglz {
    @Override  // com.google.android.gms.internal.ads.zzglz
    public final zzgdx zza(zzgek zzgek0, Integer integer0) {
        if(((zzgfu)zzgek0).zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzgfl zzgfl0 = new zzgfl(null);
        zzgfl0.zzc(((zzgfu)zzgek0));
        zzgfl0.zza(integer0);
        zzgfl0.zzb(zzgvp.zzc(((zzgfu)zzgek0).zzc()));
        return zzgfl0.zzd();
    }
}

