package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzcnf implements Runnable {
    public final zzcex zza;
    public final JSONObject zzb;

    public zzcnf(zzcex zzcex0, JSONObject jSONObject0) {
        this.zza = zzcex0;
        this.zzb = jSONObject0;
    }

    @Override
    public final void run() {
        this.zza.zzl("AFMA_updateActiveView", this.zzb);
    }
}

