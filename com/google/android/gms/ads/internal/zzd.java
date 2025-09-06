package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.common.util.concurrent.t0;
import org.json.JSONObject;

public final class zzd implements zzgbo {
    public final Long zza;
    public final zzdrw zzb;
    public final zzfhk zzc;
    public final zzfgw zzd;

    public zzd(zzf zzf0, Long long0, zzdrw zzdrw0, zzfhk zzfhk0, zzfgw zzfgw0) {
        this.zza = long0;
        this.zzb = zzdrw0;
        this.zzc = zzfhk0;
        this.zzd = zzfgw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return zzf.zzd(this.zza, this.zzb, this.zzc, this.zzd, ((JSONObject)object0));
    }
}

