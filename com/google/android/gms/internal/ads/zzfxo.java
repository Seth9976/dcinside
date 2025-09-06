package com.google.android.gms.internal.ads;

final class zzfxo {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzfxo(Object object0, Object object1, Object object2) {
        this.zza = object0;
        this.zzb = object1;
        this.zzc = object2;
    }

    final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.zza + "=" + this.zzb + " and " + this.zza + "=" + this.zzc);
    }
}

