package com.google.android.gms.internal.ads;

import j..util.Objects;

final class zzgno {
    private final Class zza;
    private final zzgvo zzb;

    zzgno(Class class0, zzgvo zzgvo0, zzgnq zzgnq0) {
        this.zza = class0;
        this.zzb = zzgvo0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgno ? ((zzgno)object0).zza.equals(this.zza) && ((zzgno)object0).zzb.equals(this.zzb) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + this.zzb;
    }
}

