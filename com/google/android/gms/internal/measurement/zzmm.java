package com.google.android.gms.internal.measurement;

import java.io.IOException;

final class zzmm extends zzmk {
    private static void zza(Object object0, zzmj zzmj0) {
        ((zzjt)object0).zzb = zzmj0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final int zza(Object object0) {
        return ((zzmj)object0).zza();
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final Object zza() {
        return zzmj.zzd();
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final Object zza(Object object0, Object object1) {
        if(zzmj.zzc().equals(((zzmj)object1))) {
            return (zzmj)object0;
        }
        return zzmj.zzc().equals(((zzmj)object0)) ? zzmj.zza(((zzmj)object0), ((zzmj)object1)) : ((zzmj)object0).zza(((zzmj)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zza(Object object0, int v, int v1) {
        ((zzmj)object0).zza(v << 3 | 5, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zza(Object object0, int v, long v1) {
        ((zzmj)object0).zza(v << 3 | 1, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zza(Object object0, int v, zzik zzik0) {
        ((zzmj)object0).zza(v << 3 | 2, zzik0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zza(Object object0, int v, Object object1) {
        ((zzmj)object0).zza(v << 3 | 3, ((zzmj)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zza(Object object0, zznb zznb0) throws IOException {
        ((zzmj)object0).zza(zznb0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final boolean zza(zzlr zzlr0) {
        return false;
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final int zzb(Object object0) {
        return ((zzmj)object0).zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zzb(Object object0, int v, long v1) {
        ((zzmj)object0).zza(v << 3, v1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zzb(Object object0, zznb zznb0) throws IOException {
        ((zzmj)object0).zzb(zznb0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zzb(Object object0, Object object1) {
        zzmm.zza(object0, ((zzmj)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final Object zzc(Object object0) {
        zzmj zzmj0 = ((zzjt)object0).zzb;
        if(zzmj0 == zzmj.zzc()) {
            zzmj0 = zzmj.zzd();
            zzmm.zza(object0, zzmj0);
        }
        return zzmj0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zzc(Object object0, Object object1) {
        zzmm.zza(object0, ((zzmj)object1));
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final Object zzd(Object object0) {
        return ((zzjt)object0).zzb;
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final Object zze(Object object0) {
        ((zzmj)object0).zze();
        return (zzmj)object0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzmk
    final void zzf(Object object0) {
        ((zzjt)object0).zzb.zze();
    }
}

