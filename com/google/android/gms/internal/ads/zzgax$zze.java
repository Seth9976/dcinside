package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o3.a;

final class zzgax.zze extends zzgax.zza {
    final AtomicReferenceFieldUpdater zza;
    final AtomicReferenceFieldUpdater zzb;
    final AtomicReferenceFieldUpdater zzc;
    final AtomicReferenceFieldUpdater zzd;
    final AtomicReferenceFieldUpdater zze;

    zzgax.zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
        super(null);
        this.zza = atomicReferenceFieldUpdater0;
        this.zzb = atomicReferenceFieldUpdater1;
        this.zzc = atomicReferenceFieldUpdater2;
        this.zzd = atomicReferenceFieldUpdater3;
        this.zze = atomicReferenceFieldUpdater4;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final zzgax.zzd zza(zzgax zzgax0, zzgax.zzd zzgax$zzd0) {
        return (zzgax.zzd)this.zzd.getAndSet(zzgax0, zzgax$zzd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final zzgax.zzk zzb(zzgax zzgax0, zzgax.zzk zzgax$zzk0) {
        return (zzgax.zzk)this.zzc.getAndSet(zzgax0, zzgax$zzk0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final void zzc(zzgax.zzk zzgax$zzk0, @a zzgax.zzk zzgax$zzk1) {
        this.zzb.lazySet(zzgax$zzk0, zzgax$zzk1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final void zzd(zzgax.zzk zzgax$zzk0, Thread thread0) {
        this.zza.lazySet(zzgax$zzk0, thread0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zze(zzgax zzgax0, @a zzgax.zzd zzgax$zzd0, zzgax.zzd zzgax$zzd1) {
        return zzgay.zza(this.zzd, zzgax0, zzgax$zzd0, zzgax$zzd1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zzf(zzgax zzgax0, @a Object object0, Object object1) {
        return zzgay.zza(this.zze, zzgax0, object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zzg(zzgax zzgax0, @a zzgax.zzk zzgax$zzk0, @a zzgax.zzk zzgax$zzk1) {
        return zzgay.zza(this.zzc, zzgax0, zzgax$zzk0, zzgax$zzk1);
    }
}

