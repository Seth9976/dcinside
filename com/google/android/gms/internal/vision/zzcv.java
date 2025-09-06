package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzcv extends zzcy {
    static final zzcv zza;

    static {
        zzcv.zza = new zzcv();
    }

    @Override
    public final boolean equals(@NullableDecl Object object0) {
        return object0 == this;
    }

    @Override
    public final int hashCode() {
        return 2040732332;
    }

    @Override
    public final String toString() {
        return "Optional.absent()";
    }

    @Override  // com.google.android.gms.internal.vision.zzcy
    public final boolean zza() {
        return false;
    }

    @Override  // com.google.android.gms.internal.vision.zzcy
    public final Object zzb() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}

