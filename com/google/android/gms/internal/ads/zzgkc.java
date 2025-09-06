package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgkc implements zzgdn {
    private final zzgdn zza;
    private final byte[] zzb;

    private zzgkc(zzgdn zzgdn0, byte[] arr_b) {
        this.zza = zzgdn0;
        if(arr_b.length != 0 && arr_b.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.zzb;
        if(arr_b2.length == 0) {
            return this.zza.zza(arr_b, arr_b1);
        }
        if(!zzgnu.zzc(arr_b2, arr_b)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, 5, arr_b.length);
        return this.zza.zza(arr_b3, arr_b1);
    }

    public static zzgdn zzb(zzglk zzglk0) throws GeneralSecurityException {
        zzgnh zzgnh0 = zzglk0.zza(zzgdw.zza());
        zzgsi zzgsi0 = zzgsl.zza();
        zzgsi0.zzb(zzgnh0.zzg());
        zzgsi0.zzc(zzgnh0.zze());
        zzgsi0.zza(zzgnh0.zzb());
        zzgdn zzgdn0 = (zzgdn)zzgen.zzb(((zzgsl)zzgsi0.zzbn()), zzgdn.class);
        zzgtp zzgtp0 = zzgnh0.zzc();
        switch(zzgtp0.ordinal()) {
            case 1: {
                return new zzgkc(zzgdn0, zzgml.zzb(((int)zzglk0.zzb())).zzc());
            }
            case 3: {
                return new zzgkc(zzgdn0, zzgml.zza.zzc());
            }
            case 2: 
            case 4: {
                return new zzgkc(zzgdn0, zzgml.zza(((int)zzglk0.zzb())).zzc());
            }
            default: {
                throw new GeneralSecurityException("unknown output prefix type " + zzgtp0);
            }
        }
    }

    public static zzgdn zzc(zzgdn zzgdn0, zzgvo zzgvo0) {
        return new zzgkc(zzgdn0, zzgvo0.zzc());
    }
}

