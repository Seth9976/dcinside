package com.google.android.gms.internal.vision;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzet extends zzej {
    private final transient zzef zza;
    private final transient zzee zzb;

    zzet(zzef zzef0, zzee zzee0) {
        this.zza = zzef0;
        this.zzb = zzee0;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final boolean contains(@NullableDecl Object object0) {
        return this.zza.get(object0) != null;
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    public final Iterator iterator() {
        return this.zza();
    }

    @Override
    public final int size() {
        return this.zza.size();
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final int zza(Object[] arr_object, int v) {
        return this.zze().zza(arr_object, v);
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    public final zzfa zza() {
        return (zzfa)this.zze().iterator();
    }

    @Override  // com.google.android.gms.internal.vision.zzej
    public final zzee zze() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzeb
    final boolean zzf() {
        return true;
    }
}

