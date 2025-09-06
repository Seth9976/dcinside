package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzazs {
    final long zza;
    final String zzb;
    final int zzc;

    zzazs(long v, String s, int v1) {
        this.zza = v;
        this.zzb = s;
        this.zzc = v1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        return object0 != null && object0 instanceof zzazs && ((zzazs)object0).zza == this.zza && ((zzazs)object0).zzc == this.zzc;
    }

    @Override
    public final int hashCode() {
        return (int)this.zza;
    }
}

