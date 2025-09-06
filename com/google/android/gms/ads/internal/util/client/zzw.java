package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public abstract class zzw {
    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc();

    public static zzw zzd(@Nullable JSONObject jSONObject0) {
        return new zzm(jSONObject0.optInt("impression_prerequisite", 0), jSONObject0.optInt("click_prerequisite", 0), jSONObject0.optBoolean("notification_flow_enabled", false));
    }
}

