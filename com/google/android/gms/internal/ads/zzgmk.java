package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import o3.h;

public final class zzgmk {
    private static final zzgmk zza;
    private final AtomicReference zzb;

    static {
        zzgmk.zza = (zzgmk)zzgnt.zza(new zzgmi());
    }

    public zzgmk() {
        this.zzb = new AtomicReference(new zzgnr(new zzgnn(), null));
    }

    public final zzgdx zza(zzgnm zzgnm0, @h zzgeo zzgeo0) throws GeneralSecurityException {
        return ((zzgnr)this.zzb.get()).zza(zzgnm0, zzgeo0);
    }

    public final zzgek zzb(zzgnm zzgnm0) throws GeneralSecurityException {
        return ((zzgnr)this.zzb.get()).zzb(zzgnm0);
    }

    public static zzgmk zzc() {
        return zzgmk.zza;
    }

    public final zzgnm zzd(zzgdx zzgdx0, Class class0, @h zzgeo zzgeo0) throws GeneralSecurityException {
        return ((zzgnr)this.zzb.get()).zzc(zzgdx0, class0, zzgeo0);
    }

    public final zzgnm zze(zzgek zzgek0, Class class0) throws GeneralSecurityException {
        return ((zzgnr)this.zzb.get()).zzd(zzgek0, class0);
    }

    public final void zzf(zzgld zzgld0) throws GeneralSecurityException {
        synchronized(this) {
            zzgnn zzgnn0 = new zzgnn(((zzgnr)this.zzb.get()));
            zzgnn0.zza(zzgld0);
            zzgnr zzgnr0 = new zzgnr(zzgnn0, null);
            this.zzb.set(zzgnr0);
        }
    }

    public final void zzg(zzglh zzglh0) throws GeneralSecurityException {
        synchronized(this) {
            zzgnn zzgnn0 = new zzgnn(((zzgnr)this.zzb.get()));
            zzgnn0.zzb(zzglh0);
            zzgnr zzgnr0 = new zzgnr(zzgnn0, null);
            this.zzb.set(zzgnr0);
        }
    }

    public final void zzh(zzgmp zzgmp0) throws GeneralSecurityException {
        synchronized(this) {
            zzgnn zzgnn0 = new zzgnn(((zzgnr)this.zzb.get()));
            zzgnn0.zzc(zzgmp0);
            zzgnr zzgnr0 = new zzgnr(zzgnn0, null);
            this.zzb.set(zzgnr0);
        }
    }

    public final void zzi(zzgmt zzgmt0) throws GeneralSecurityException {
        synchronized(this) {
            zzgnn zzgnn0 = new zzgnn(((zzgnr)this.zzb.get()));
            zzgnn0.zzd(zzgmt0);
            zzgnr zzgnr0 = new zzgnr(zzgnn0, null);
            this.zzb.set(zzgnr0);
        }
    }

    public final boolean zzj(zzgnm zzgnm0) {
        return ((zzgnr)this.zzb.get()).zzi(zzgnm0);
    }

    public final boolean zzk(zzgnm zzgnm0) {
        return ((zzgnr)this.zzb.get()).zzj(zzgnm0);
    }
}

