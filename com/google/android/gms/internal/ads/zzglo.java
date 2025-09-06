package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzglo {
    public static final zzglo zza;
    private final Map zzb;

    static {
        zzglo.zza = new zzglm().zza();
    }

    zzglo(Map map0, zzgln zzgln0) {
        this.zzb = map0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzglo ? this.zzb.equals(((zzglo)object0).zzb) : false;
    }

    @Override
    public final int hashCode() {
        return this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}

