package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeuy implements zzetq {
    private final String zza;

    public zzeuy(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("ms", this.zza);
        }
        catch(JSONException jSONException0) {
            zze.zzb("Failed putting Ad ID.", jSONException0);
        }
    }
}

