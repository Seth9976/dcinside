package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgli implements zzgdy {
    final String zza;
    final Class zzb;
    final zzgsj zzc;

    zzgli(String s, Class class0, zzgsj zzgsj0, zzgzk zzgzk0) {
        this.zza = s;
        this.zzb = class0;
        this.zzc = zzgsj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdy
    public final zzgsl zza(zzgwj zzgwj0) throws GeneralSecurityException {
        zzgsn zzgsn0 = zzgsp.zza();
        zzgsn0.zzb(this.zza);
        zzgsn0.zzc(zzgwj0);
        zzgsn0.zza(zzgtp.zzd);
        zzgnh zzgnh0 = (zzgnh)zzgmk.zzc().zzd(zzgma.zzb().zza(zzgmk.zzc().zzb(zzgni.zza(((zzgsp)zzgsn0.zzbn()))), null), zzgnh.class, zzgdw.zza());
        zzgsi zzgsi0 = zzgsl.zza();
        zzgsi0.zzb(zzgnh0.zzg());
        zzgsi0.zzc(zzgnh0.zze());
        zzgsi0.zza(zzgnh0.zzb());
        return (zzgsl)zzgsi0.zzbn();
    }

    @Override  // com.google.android.gms.internal.ads.zzgdy
    public final Class zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdy
    public final Object zzc(zzgwj zzgwj0) throws GeneralSecurityException {
        return zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnh.zza(this.zza, zzgwj0, this.zzc, zzgtp.zzd, null), zzgdw.zza()), this.zzb);
    }

    public static zzgdy zzd(String s, Class class0, zzgsj zzgsj0, zzgzk zzgzk0) {
        return new zzgli(s, class0, zzgsj0, zzgzk0);
    }
}

