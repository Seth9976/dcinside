package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzcnq implements Runnable {
    public final zzcnr zza;
    public final JSONObject zzb;

    public zzcnq(zzcnr zzcnr0, JSONObject jSONObject0) {
        this.zza = zzcnr0;
        this.zzb = jSONObject0;
    }

    @Override
    public final void run() {
        this.zza.zzd(this.zzb);
    }
}

