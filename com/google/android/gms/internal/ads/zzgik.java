package com.google.android.gms.internal.ads;

import j..util.Objects;
import java.security.GeneralSecurityException;

public final class zzgik extends zzgeu {
    private final zzgij zza;
    private final int zzb;

    private zzgik(zzgij zzgij0, int v) {
        this.zza = zzgij0;
        this.zzb = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgik ? ((zzgik)object0).zza == this.zza && ((zzgik)object0).zzb == this.zzb : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzgik.class, this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + this.zza.toString() + "salt_size_bytes: " + this.zzb + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != zzgij.zzb;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zzgij zzc() {
        return this.zza;
    }

    public static zzgik zzd(zzgij zzgij0, int v) throws GeneralSecurityException {
        if(v < 8 || v > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzgik(zzgij0, v);
    }
}

