package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class zzclu implements zzclb {
    private final zzbxz zza;

    zzclu(zzbxz zzbxz0) {
        this.zza = zzbxz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzclb
    public final void zza(JSONObject jSONObject0) {
        long v = jSONObject0.optLong("timestamp");
        boolean z = jSONObject0.optBoolean("npa_reset") ? true : jSONObject0.optBoolean("npa");
        this.zza.zzb(((int)z), v);
    }
}

