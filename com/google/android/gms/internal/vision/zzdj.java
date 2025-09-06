package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzdj implements zzdf, Serializable {
    @NullableDecl
    private final Object zza;

    zzdj(@NullableDecl Object object0) {
        this.zza = object0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(@NullableDecl Object object0) {
        return object0 instanceof zzdj ? zzcz.zza(this.zza, ((zzdj)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @Override
    public final String toString() {
        return "Suppliers.ofInstance(" + this.zza + ")";
    }

    @Override  // com.google.android.gms.internal.vision.zzdf
    public final Object zza() {
        return this.zza;
    }
}

