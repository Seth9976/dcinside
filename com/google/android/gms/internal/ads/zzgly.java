package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgly implements zzglz {
    @Override  // com.google.android.gms.internal.ads.zzglz
    public final zzgdx zza(zzgek zzgek0, Integer integer0) {
        zzgsp zzgsp0 = ((zzgll)zzgek0).zzb().zzc();
        zzgdy zzgdy0 = zzgkz.zzc().zzb("");
        if(!zzgkz.zzc().zze("")) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzgsl zzgsl0 = zzgdy0.zza(zzgsp0.zzh());
        return new zzglk(zzgnh.zza("", zzgsl0.zzf(), zzgsl0.zzb(), zzgsp0.zzg(), integer0), zzgdw.zza());
    }
}

