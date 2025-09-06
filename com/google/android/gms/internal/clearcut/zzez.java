package com.google.android.gms.internal.clearcut;

import java.io.IOException;

final class zzez extends zzex {
    private static void zza(Object object0, zzey zzey0) {
        ((zzcg)object0).zzjp = zzey0;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final void zza(Object object0, int v, long v1) {
        ((zzey)object0).zzb(v << 3, v1);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final void zza(Object object0, int v, zzbb zzbb0) {
        ((zzey)object0).zzb(v << 3 | 2, zzbb0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final void zza(Object object0, zzfr zzfr0) throws IOException {
        ((zzey)object0).zzb(zzfr0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final void zzc(Object object0) {
        ((zzcg)object0).zzjp.zzv();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final void zzc(Object object0, zzfr zzfr0) throws IOException {
        ((zzey)object0).zza(zzfr0);
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final Object zzdz() {
        return zzey.zzeb();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final void zze(Object object0, Object object1) {
        zzez.zza(object0, ((zzey)object1));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final void zzf(Object object0, Object object1) {
        zzez.zza(object0, ((zzey)object1));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.clearcut.zzex
    final Object zzg(Object object0, Object object1) {
        return ((zzey)object1).equals(zzey.zzea()) ? ((zzey)object0) : zzey.zza(((zzey)object0), ((zzey)object1));
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final int zzm(Object object0) {
        return ((zzey)object0).zzas();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final Object zzq(Object object0) {
        return ((zzcg)object0).zzjp;
    }

    @Override  // com.google.android.gms.internal.clearcut.zzex
    final int zzr(Object object0) {
        return ((zzey)object0).zzec();
    }
}

