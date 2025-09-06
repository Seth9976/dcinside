package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import org.json.JSONObject;

public final class zzdmz implements zzgbo {
    public final zzdnl zza;
    public final String zzb;
    public final JSONObject zzc;

    public zzdmz(zzdnl zzdnl0, String s, JSONObject jSONObject0) {
        this.zza = zzdnl0;
        this.zzb = s;
        this.zzc = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzf(this.zzb, this.zzc, ((zzcex)object0));
    }
}

