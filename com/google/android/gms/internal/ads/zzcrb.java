package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

public final class zzcrb implements zzcrc {
    private final Map zza;

    zzcrb(Map map0) {
        this.zza = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcrc
    @Nullable
    public final zzecw zza(int v, String s) {
        return (zzecw)this.zza.get(s);
    }
}

