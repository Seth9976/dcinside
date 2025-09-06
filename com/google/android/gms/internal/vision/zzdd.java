package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdd extends zzcy {
    private final Object zza;

    zzdd(Object object0) {
        this.zza = object0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@NullableDecl Object object0) {
        return object0 instanceof zzdd ? this.zza.equals(((zzdd)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() + 0x598DF91C;
    }

    @Override
    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    @Override  // com.google.android.gms.internal.vision.zzcy
    public final boolean zza() {
        return true;
    }

    @Override  // com.google.android.gms.internal.vision.zzcy
    public final Object zzb() {
        return this.zza;
    }
}

