package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public final class zzv {
    private final zzx zza;

    public zzv() {
        zzn zzn0 = new zzn(1, 0, 1.0, false);
        super();
        this.zza = zzn0;
    }

    private zzv(zzx zzx0) {
        this.zza = zzx0;
    }

    public static zzv zza(@Nullable JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("ping_strategy");
        return jSONObject1 == null ? new zzv(new zzn(1, 0, 1.0, false)) : new zzv(new zzn(jSONObject1.optInt("max_attempts", 1), jSONObject1.optInt("initial_backoff_ms", 0), jSONObject1.optDouble("backoff_multiplier", 1.0), jSONObject1.optBoolean("buffer_after_max_attempts", false)));
    }

    public final zzx zzb() {
        return this.zza;
    }
}

