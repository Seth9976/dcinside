package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgmh {
    private static final zzgmh zza;
    private final AtomicReference zzb;

    static {
        zzgmh.zza = new zzgmh();
    }

    zzgmh() {
        this.zzb = new AtomicReference(new zzgnb(new zzgmy(null), null));
    }

    public static zzgmh zza() {
        return zzgmh.zza;
    }

    public final Class zzb(Class class0) throws GeneralSecurityException {
        return ((zzgnb)this.zzb.get()).zza(class0);
    }

    public final Object zzc(zzgdx zzgdx0, Class class0) throws GeneralSecurityException {
        return ((zzgnb)this.zzb.get()).zzb(zzgdx0, class0);
    }

    public final Object zzd(zzgnf zzgnf0, Class class0) throws GeneralSecurityException {
        return ((zzgnb)this.zzb.get()).zzc(zzgnf0, class0);
    }

    public final void zze(zzgmx zzgmx0) throws GeneralSecurityException {
        synchronized(this) {
            zzgmy zzgmy0 = new zzgmy(((zzgnb)this.zzb.get()), null);
            zzgmy0.zza(zzgmx0);
            zzgnb zzgnb0 = new zzgnb(zzgmy0, null);
            this.zzb.set(zzgnb0);
        }
    }

    public final void zzf(zzgng zzgng0) throws GeneralSecurityException {
        synchronized(this) {
            zzgmy zzgmy0 = new zzgmy(((zzgnb)this.zzb.get()), null);
            zzgmy0.zzb(zzgng0);
            zzgnb zzgnb0 = new zzgnb(zzgmy0, null);
            this.zzb.set(zzgnb0);
        }
    }
}

