package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public final class zzbtk {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbtk(boolean z, String s, boolean z1) {
        this.zza = z;
        this.zzb = s;
        this.zzc = z1;
    }

    @Nullable
    public static zzbtk zza(JSONObject jSONObject0) {
        return new zzbtk(jSONObject0.optBoolean("enable_prewarming", false), jSONObject0.optString("prefetch_url", ""), jSONObject0.optBoolean("skip_offline_notification_flow", false));
    }
}

