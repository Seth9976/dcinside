package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

final class zzf {
    private final zzjh zza;

    zzf(zzjh zzjh0) {
        this.zza = zzjh0;
    }

    static zzf zza(String s) {
        return TextUtils.isEmpty(s) || s.length() > 1 ? new zzf(zzjh.zza) : new zzf(zzje.zza(s.charAt(0)));
    }

    final zzjh zza() {
        return this.zza;
    }

    final String zzb() {
        return String.valueOf(zzje.zza(this.zza));
    }
}

