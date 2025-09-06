package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgpd implements zzgng {
    private static final zzgpd zza;
    private static final zzgmx zzb;

    static {
        zzgpd.zza = new zzgpd();
        zzgpd.zzb = zzgmx.zzb(new zzgpa(), zzglk.class, zzgej.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Class zza() {
        return zzgej.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Class zzb() {
        return zzgej.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Object zzc(zzgnf zzgnf0) throws GeneralSecurityException {
        return new zzgpb(zzgnf0, null);
    }

    static void zzd() throws GeneralSecurityException {
        zzgmh.zza().zzf(zzgpd.zza);
        zzgmh.zza().zze(zzgpd.zzb);
    }
}

