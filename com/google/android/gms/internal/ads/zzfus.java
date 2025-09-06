package com.google.android.gms.internal.ads;

import o3.a;

final class zzfus extends zzful {
    private final Object zza;

    zzfus(Object object0) {
        this.zza = object0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@a Object object0) {
        return object0 instanceof zzfus ? this.zza.equals(((zzfus)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() + 0x598DF91C;
    }

    @Override
    public final String toString() {
        return "Optional.of(" + this.zza.toString() + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzful
    public final zzful zza(zzfuc zzfuc0) {
        Object object0 = zzfuc0.apply(this.zza);
        zzfun.zzc(object0, "the Function passed to Optional.transform() must not return null.");
        return new zzfus(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzful
    public final Object zzb(Object object0) {
        return this.zza;
    }
}

