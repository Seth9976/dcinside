package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgfe implements zzglz {
    @Override  // com.google.android.gms.internal.ads.zzglz
    public final zzgdx zza(zzgek zzgek0, Integer integer0) {
        switch(((zzgfk)zzgek0).zzb()) {
            case 16: 
            case 0x20: {
                zzgez zzgez0 = new zzgez(null);
                zzgez0.zzd(((zzgfk)zzgek0));
                zzgez0.zzc(integer0);
                zzgez0.zza(zzgvp.zzc(((zzgfk)zzgek0).zzb()));
                zzgez0.zzb(zzgvp.zzc(((zzgfk)zzgek0).zzc()));
                return zzgez0.zze();
            }
            default: {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
        }
    }
}

