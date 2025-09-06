package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

public final class zzdlj implements zzfuc {
    public final zzdlp zza;
    public final JSONObject zzb;

    public zzdlj(zzdlp zzdlp0, JSONObject jSONObject0) {
        this.zza = zzdlp0;
        this.zzb = jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        return this.zza.zza(this.zzb, ((List)object0));
    }
}

