package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzghn {
    @h
    private zzghp zza;
    @h
    private String zzb;
    @h
    private zzgho zzc;
    @h
    private zzgeu zzd;

    private zzghn() {
        throw null;
    }

    zzghn(zzghq zzghq0) {
    }

    public final zzghn zza(zzgeu zzgeu0) {
        this.zzd = zzgeu0;
        return this;
    }

    public final zzghn zzb(zzgho zzgho0) {
        this.zzc = zzgho0;
        return this;
    }

    public final zzghn zzc(String s) {
        this.zzb = s;
        return this;
    }

    public final zzghn zzd(zzghp zzghp0) {
        this.zza = zzghp0;
        return this;
    }

    public final zzghr zze() throws GeneralSecurityException {
        if(this.zza == null) {
            this.zza = zzghp.zzb;
        }
        if(this.zzb == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        zzgho zzgho0 = this.zzc;
        if(zzgho0 == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        zzgeu zzgeu0 = this.zzd;
        if(zzgeu0 == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if(zzgeu0.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if((!zzgho0.equals(zzgho.zza) || !(zzgeu0 instanceof zzggf)) && (!zzgho0.equals(zzgho.zzc) || !(zzgeu0 instanceof zzggw)) && (!zzgho0.equals(zzgho.zzb) || !(zzgeu0 instanceof zzgir)) && (!zzgho0.equals(zzgho.zzd) || !(zzgeu0 instanceof zzgfk)) && (!zzgho0.equals(zzgho.zze) || !(zzgeu0 instanceof zzgfu)) && (!zzgho0.equals(zzgho.zzf) || !(zzgeu0 instanceof zzggq))) {
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzc.toString() + " when new keys are picked according to " + this.zzd + ".");
        }
        return new zzghr(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

