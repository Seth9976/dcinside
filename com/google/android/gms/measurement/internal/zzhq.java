package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

final class zzhq implements zzo {
    private final String zza;
    private final zzhl zzb;

    zzhq(zzhl zzhl0, String s) {
        this.zza = s;
        this.zzb = zzhl0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzo
    public final String zza(String s) {
        Map map0 = (Map)this.zzb.zzc.get(this.zza);
        return map0 == null || !map0.containsKey(s) ? null : ((String)map0.get(s));
    }
}

