package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgey implements zzgng {
    private static final zzgey zza;
    private static final zzgmx zzb;

    static {
        zzgey.zza = new zzgey();
        zzgey.zzb = zzgmx.zzb(new zzgev(), zzglk.class, zzgdn.class);
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Class zza() {
        return zzgdn.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Class zzb() {
        return zzgdn.class;
    }

    @Override  // com.google.android.gms.internal.ads.zzgng
    public final Object zzc(zzgnf zzgnf0) throws GeneralSecurityException {
        return new zzgew(zzgnf0, null);
    }

    public static void zzd() throws GeneralSecurityException {
        zzgmh.zza().zzf(zzgey.zza);
        zzgmh.zza().zze(zzgey.zzb);
    }
}

