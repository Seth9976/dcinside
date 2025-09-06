package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzb implements Callable {
    public final zzd zza;
    public final String zzb;
    public final JSONObject zzc;

    public zzb(zzd zzd0, String s, JSONObject jSONObject0) {
        this.zza = zzd0;
        this.zzb = s;
        this.zzc = jSONObject0;
    }

    @Override
    public final Object call() {
        return Boolean.valueOf(this.zza.zzb(this.zzb, this.zzc));
    }
}

