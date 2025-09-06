package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzfei implements zzfeg {
    private final String zza;

    public zzfei(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfeg
    public final boolean equals(@Nullable Object object0) {
        return object0 instanceof zzfei ? this.zza.equals(((zzfei)object0).zza) : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzfeg
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public final String toString() {
        return this.zza;
    }
}

