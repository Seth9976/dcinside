package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import org.json.JSONObject;

public final class zzefm implements zzgbo {
    public final zzefq zza;
    public final zzdnl zzb;

    public zzefm(zzefq zzefq0, zzdnl zzdnl0) {
        this.zza = zzefq0;
        this.zzb = zzdnl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzd(this.zzb, ((JSONObject)object0));
    }
}

