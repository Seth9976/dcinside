package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzdht implements Runnable {
    public final zzcex zza;
    public final JSONObject zzb;

    public zzdht(zzcex zzcex0, JSONObject jSONObject0) {
        this.zza = zzcex0;
        this.zzb = jSONObject0;
    }

    @Override
    public final void run() {
        this.zza.zze("onVideoEvent", this.zzb);
    }
}

