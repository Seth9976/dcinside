package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public final class zzefj implements zzecy {
    private final zzdpm zza;

    public zzefj(zzdpm zzdpm0) {
        this.zza = zzdpm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String s, JSONObject jSONObject0) throws zzfcq {
        return new zzecz(this.zza.zzc(s, jSONObject0), new zzees(), s);
    }
}

