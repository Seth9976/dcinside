package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzghc implements zzgmv {
    @Override  // com.google.android.gms.internal.ads.zzgmv
    public final Object zza(zzgdx zzgdx0) {
        String s = ((zzghm)zzgdx0).zzb().zzd();
        zzgeu zzgeu0 = ((zzghm)zzgdx0).zzb().zzb();
        zzgdn zzgdn0 = zzgei.zza(s).zzb();
        try {
            return zzgkc.zzc(new zzgha(zzgsp.zzf(zzgeq.zzb(zzgeu0), zzgxb.zza()), zzgdn0), ((zzghm)zzgdx0).zzc());
        }
        catch(zzgyg zzgyg0) {
            throw new GeneralSecurityException(zzgyg0);
        }
    }
}

