package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

public final class zzfmo {
    private JSONObject zza;
    private final zzfmx zzb;

    public zzfmo(zzfmx zzfmx0) {
        this.zzb = zzfmx0;
    }

    @VisibleForTesting
    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        zzfmy zzfmy0 = new zzfmy(this);
        this.zzb.zzb(zzfmy0);
    }

    public final void zzc(JSONObject jSONObject0, HashSet hashSet0, long v) {
        zzfmz zzfmz0 = new zzfmz(this, hashSet0, jSONObject0, v);
        this.zzb.zzb(zzfmz0);
    }

    public final void zzd(JSONObject jSONObject0, HashSet hashSet0, long v) {
        zzfna zzfna0 = new zzfna(this, hashSet0, jSONObject0, v);
        this.zzb.zzb(zzfna0);
    }

    @VisibleForTesting
    public final void zze(JSONObject jSONObject0) {
        this.zza = jSONObject0;
    }
}

