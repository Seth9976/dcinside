package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgga implements zzglz {
    @Override  // com.google.android.gms.internal.ads.zzglz
    public final zzgdx zza(zzgek zzgek0, Integer integer0) {
        if(((zzggf)zzgek0).zzb() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzgfv zzgfv0 = new zzgfv(null);
        zzgfv0.zzc(((zzggf)zzgek0));
        zzgfv0.zza(integer0);
        zzgfv0.zzb(zzgvp.zzc(((zzggf)zzgek0).zzb()));
        return zzgfv0.zzd();
    }
}

