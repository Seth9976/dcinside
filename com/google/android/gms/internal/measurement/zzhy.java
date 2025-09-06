package com.google.android.gms.internal.measurement;

import com.google.common.base.H;
import com.google.common.collect.U2;

public final class zzhy {
    private final boolean zza;

    public zzhy(zzhx zzhx0) {
        H.F(zzhx0, "BuildInfo must be non-null");
        this.zza = !zzhx0.zza();
    }

    public final boolean zza(String s) {
        H.F(s, "flagName must not be null");
        return this.zza ? ((U2)zzia.zza.get()).containsValue(s) : true;
    }
}

