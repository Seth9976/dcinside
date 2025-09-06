package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import org.json.JSONObject;

public final class zzdlx implements zzgbo {
    public final zzdmh zza;
    public final JSONObject zzb;

    public zzdlx(zzdmh zzdmh0, JSONObject jSONObject0) {
        this.zza = zzdmh0;
        this.zzb = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzc(this.zzb, ((zzcex)object0));
    }
}

