package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgpx implements zzgej {
    private zzgpx(zzgej zzgej0, zzgtp zzgtp0, byte[] arr_b) {
    }

    public static zzgej zza(zzglk zzglk0) throws GeneralSecurityException {
        zzgnh zzgnh0 = zzglk0.zza(zzgdw.zza());
        zzgsi zzgsi0 = zzgsl.zza();
        zzgsi0.zzb(zzgnh0.zzg());
        zzgsi0.zzc(zzgnh0.zze());
        zzgsi0.zza(zzgnh0.zzb());
        zzgej zzgej0 = (zzgej)zzgen.zzb(((zzgsl)zzgsi0.zzbn()), zzgej.class);
        zzgtp zzgtp0 = zzgnh0.zzc();
        switch(zzgtp0.ordinal()) {
            case 1: {
                return new zzgpx(zzgej0, zzgtp0, zzgml.zzb(((int)zzglk0.zzb())).zzc());
            }
            case 3: {
                return new zzgpx(zzgej0, zzgtp0, zzgml.zza.zzc());
            }
            case 2: 
            case 4: {
                return new zzgpx(zzgej0, zzgtp0, zzgml.zza(((int)zzglk0.zzb())).zzc());
            }
            default: {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
    }
}

