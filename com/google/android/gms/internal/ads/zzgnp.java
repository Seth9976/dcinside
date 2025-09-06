package com.google.android.gms.internal.ads;

import j..util.Objects;

final class zzgnp {
    private final Class zza;
    private final Class zzb;

    zzgnp(Class class0, Class class1, zzgnq zzgnq0) {
        this.zza = class0;
        this.zzb = class1;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgnp ? ((zzgnp)object0).zza.equals(this.zza) && ((zzgnp)object0).zzb.equals(this.zzb) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return this.zza.getSimpleName() + " with serialization type: " + this.zzb.getSimpleName();
    }
}

