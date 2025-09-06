package com.google.android.gms.internal.ads;

final class zzgxa {
    private final Object zza;
    private final int zzb;

    zzgxa(Object object0, int v) {
        this.zza = object0;
        this.zzb = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgxa ? this.zza == ((zzgxa)object0).zza && this.zzb == ((zzgxa)object0).zzb : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.zza) * 0xFFFF + this.zzb;
    }
}

