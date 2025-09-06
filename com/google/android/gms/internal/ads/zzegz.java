package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

public final class zzegz {
    @Nullable
    private zzegq zza;

    zzegz() {
    }

    private zzegz(zzegq zzegq0) {
        this.zza = zzegq0;
    }

    public final zzegq zza(Clock clock0, zzegs zzegs0, zzedb zzedb0, zzfja zzfja0) {
        zzegq zzegq0 = this.zza;
        return zzegq0 == null ? new zzegq(clock0, zzegs0, zzedb0, zzfja0) : zzegq0;
    }

    public static zzegz zzb(zzegq zzegq0) {
        return new zzegz(zzegq0);
    }
}

