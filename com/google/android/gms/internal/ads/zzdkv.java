package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdkv implements Callable {
    public final zzfca zza;
    public final zzfbo zzb;
    public final JSONObject zzc;

    public zzdkv(zzdla zzdla0, zzfca zzfca0, zzfbo zzfbo0, JSONObject jSONObject0) {
        this.zza = zzfca0;
        this.zzb = zzfbo0;
        this.zzc = jSONObject0;
    }

    @Override
    public final Object call() {
        zzdif zzdif0 = new zzdif();
        JSONObject jSONObject0 = this.zzc;
        zzdif0.zzaa(jSONObject0.optInt("template_id", -1));
        zzdif0.zzK(jSONObject0.optString("custom_template_id"));
        JSONObject jSONObject1 = jSONObject0.optJSONObject("omid_settings");
        zzdif0.zzV((jSONObject1 == null ? null : jSONObject1.optString("omid_partner_name")));
        zzfcj zzfcj0 = this.zza.zza.zza;
        String s = Integer.toString(zzdif0.zzc());
        if(!zzfcj0.zzg.contains(s)) {
            throw new zzegu(1, "Invalid template ID: " + zzdif0.zzc());
        }
        if(zzdif0.zzc() == 3) {
            if(zzdif0.zzA() == null) {
                throw new zzegu(1, "No custom template id for custom template ad response.");
            }
            String s1 = zzdif0.zzA();
            if(!zzfcj0.zzh.contains(s1)) {
                throw new zzegu(1, "Unexpected custom template id in the response.");
            }
        }
        zzdif0.zzY(jSONObject0.optDouble("rating", -1.0));
        String s2 = jSONObject0.optString("headline", null);
        if(this.zzb.zzM) {
            s2 = zzs.zzz() + " : " + s2;
        }
        zzdif0.zzZ("headline", s2);
        zzdif0.zzZ("body", jSONObject0.optString("body", null));
        zzdif0.zzZ("call_to_action", jSONObject0.optString("call_to_action", null));
        zzdif0.zzZ("store", jSONObject0.optString("store", null));
        zzdif0.zzZ("price", jSONObject0.optString("price", null));
        zzdif0.zzZ("advertiser", jSONObject0.optString("advertiser", null));
        return zzdif0;
    }
}

