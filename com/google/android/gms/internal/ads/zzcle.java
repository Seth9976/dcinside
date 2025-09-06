package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

public final class zzcle implements zzcla {
    private final zzg zza;

    public zzcle(zzg zzg0) {
        this.zza = zzg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        boolean z = Boolean.parseBoolean(((String)map0.get("content_vertical_opted_out")));
        this.zza.zzv(z);
    }
}

