package com.google.android.gms.internal.vision;

import java.io.IOException;

final class zzlw extends zzlu {
    private static void zza(Object object0, zzlx zzlx0) {
        ((zzjb)object0).zzb = zzlx0;
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final Object zza() {
        return zzlx.zzb();
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final Object zza(Object object0) {
        ((zzlx)object0).zzc();
        return (zzlx)object0;
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zza(Object object0, int v, int v1) {
        ((zzlx)object0).zza(v << 3 | 5, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zza(Object object0, int v, long v1) {
        ((zzlx)object0).zza(v << 3, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zza(Object object0, int v, zzht zzht0) {
        ((zzlx)object0).zza(v << 3 | 2, zzht0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zza(Object object0, int v, Object object1) {
        ((zzlx)object0).zza(v << 3 | 3, ((zzlx)object1));
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zza(Object object0, zzmr zzmr0) throws IOException {
        ((zzlx)object0).zzb(zzmr0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zza(Object object0, Object object1) {
        zzlw.zza(object0, ((zzlx)object1));
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final boolean zza(zzld zzld0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final Object zzb(Object object0) {
        return ((zzjb)object0).zzb;
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zzb(Object object0, int v, long v1) {
        ((zzlx)object0).zza(v << 3 | 1, v1);
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zzb(Object object0, zzmr zzmr0) throws IOException {
        ((zzlx)object0).zza(zzmr0);
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zzb(Object object0, Object object1) {
        zzlw.zza(object0, ((zzlx)object1));
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final Object zzc(Object object0) {
        zzlx zzlx0 = ((zzjb)object0).zzb;
        if(zzlx0 == zzlx.zza()) {
            zzlx0 = zzlx.zzb();
            zzlw.zza(object0, zzlx0);
        }
        return zzlx0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.vision.zzlu
    final Object zzc(Object object0, Object object1) {
        return ((zzlx)object1).equals(zzlx.zza()) ? ((zzlx)object0) : zzlx.zza(((zzlx)object0), ((zzlx)object1));
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final void zzd(Object object0) {
        ((zzjb)object0).zzb.zzc();
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final int zze(Object object0) {
        return ((zzlx)object0).zzd();
    }

    @Override  // com.google.android.gms.internal.vision.zzlu
    final int zzf(Object object0) {
        return ((zzlx)object0).zze();
    }
}

