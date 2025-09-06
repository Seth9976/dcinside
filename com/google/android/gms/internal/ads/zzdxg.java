package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdxg implements zzgbo {
    public final String zza;

    public zzdxg(zzdxl zzdxl0, String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        String s = (String)object0;
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("headers", new JSONObject());
            jSONObject2.put("body", s);
            jSONObject1.put("base_url", "");
            jSONObject1.put("signals", new JSONObject(this.zza));
            jSONObject0.put("request", jSONObject1);
            jSONObject0.put("response", jSONObject2);
            jSONObject0.put("flags", new JSONObject());
            return zzgch.zzh(jSONObject0);
        }
        catch(JSONException jSONException0) {
            throw new JSONException("Preloaded loader: " + jSONException0.getCause());
        }
    }
}

