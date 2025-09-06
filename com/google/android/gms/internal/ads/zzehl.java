package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzehl implements zzecy {
    private final Map zza;
    private final zzdpm zzb;

    public zzehl(zzdpm zzdpm0) {
        this.zza = new HashMap();
        this.zzb = zzdpm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String s, JSONObject jSONObject0) throws zzfcq {
        synchronized(this) {
            zzecz zzecz0 = (zzecz)this.zza.get(s);
            if(zzecz0 == null) {
                zzecz0 = new zzecz(this.zzb.zzc(s, jSONObject0), new zzeet(), s);
                this.zza.put(s, zzecz0);
            }
            return zzecz0;
        }
    }
}

