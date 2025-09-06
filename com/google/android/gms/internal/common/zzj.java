package com.google.android.gms.internal.common;

import androidx.annotation.Nullable;

public class zzj {
    private final Class zza;
    @Nullable
    private final Object zzb;

    private zzj(Class class0, @Nullable Object object0) {
        this.zza = class0;
        this.zzb = object0;
    }

    zzj(Class class0, Object object0, zzk zzk0) {
        this(class0, object0);
    }

    public static zzj zzb(Class class0, @Nullable Object object0) {
        return new zzj(class0, object0);
    }

    public final Class zzc() {
        return this.zza;
    }

    @Nullable
    public final Object zzd() {
        return this.zzb;
    }
}

