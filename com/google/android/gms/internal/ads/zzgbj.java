package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o3.a;

final class zzgbj extends zzgbi {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    zzgbj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater0) {
        super(null);
        this.zza = atomicReferenceFieldUpdater0;
        this.zzb = atomicIntegerFieldUpdater0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbi
    final int zza(zzgbm zzgbm0) {
        return this.zzb.decrementAndGet(zzgbm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgbi
    final void zzb(zzgbm zzgbm0, @a Set set0, Set set1) {
        while(!androidx.concurrent.futures.a.a(this.zza, zzgbm0, null, set1) && this.zza.get(zzgbm0) == null) {
        }
    }
}

