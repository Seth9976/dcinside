package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public final class zzgnh implements zzgnm {
    private final String zza;
    private final zzgvo zzb;
    private final zzgwj zzc;
    private final zzgsj zzd;
    private final zzgtp zze;
    @h
    private final Integer zzf;

    private zzgnh(String s, zzgvo zzgvo0, zzgwj zzgwj0, zzgsj zzgsj0, zzgtp zzgtp0, @h Integer integer0) {
        this.zza = s;
        this.zzb = zzgvo0;
        this.zzc = zzgwj0;
        this.zzd = zzgsj0;
        this.zze = zzgtp0;
        this.zzf = integer0;
    }

    public static zzgnh zza(String s, zzgwj zzgwj0, zzgsj zzgsj0, zzgtp zzgtp0, @h Integer integer0) throws GeneralSecurityException {
        if(zzgtp0 == zzgtp.zzd) {
            if(integer0 != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        }
        else if(integer0 == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgnh(s, zzgnu.zza(s), zzgwj0, zzgsj0, zzgtp0, integer0);
    }

    public final zzgsj zzb() {
        return this.zzd;
    }

    public final zzgtp zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzgnm
    public final zzgvo zzd() {
        return this.zzb;
    }

    public final zzgwj zze() {
        return this.zzc;
    }

    @h
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}

