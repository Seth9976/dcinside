package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzboy {
    public final List zza;

    public zzboy(JSONObject jSONObject0) throws JSONException {
        zzbox zzbox0;
        if(zzo.zzm(2)) {
            zze.zza(("Mediation Response JSON: " + jSONObject0.toString(2)));
        }
        JSONArray jSONArray0 = jSONObject0.getJSONArray("ad_networks");
        ArrayList arrayList0 = new ArrayList(jSONArray0.length());
        int v1 = -1;
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                zzbox0 = new zzbox(jSONArray0.getJSONObject(v));
            }
            catch(JSONException unused_ex) {
                continue;
            }
            "banner".equalsIgnoreCase(zzbox0.zzc);
            arrayList0.add(zzbox0);
            if(v1 < 0) {
                for(Object object0: zzbox0.zza) {
                    if(((String)object0).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                        v1 = v;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        jSONArray0.length();
        this.zza = DesugarCollections.unmodifiableList(arrayList0);
        jSONObject0.optString("qdata");
        jSONObject0.optInt("fs_model_type", -1);
        jSONObject0.optLong("timeout_ms", -1L);
        JSONObject jSONObject1 = jSONObject0.optJSONObject("settings");
        if(jSONObject1 != null) {
            jSONObject1.optLong("ad_network_timeout_millis", -1L);
            zzboz.zza(jSONObject1, "click_urls");
            zzboz.zza(jSONObject1, "imp_urls");
            zzboz.zza(jSONObject1, "downloaded_imp_urls");
            zzboz.zza(jSONObject1, "nofill_urls");
            zzboz.zza(jSONObject1, "remote_ping_urls");
            jSONObject1.optBoolean("render_in_browser", false);
            jSONObject1.optLong("refresh", -1L);
            zzbwi.zza(jSONObject1.optJSONArray("rewards"));
            jSONObject1.optBoolean("use_displayed_impression", false);
            jSONObject1.optBoolean("allow_pub_rendered_attribution", false);
            jSONObject1.optBoolean("allow_pub_owned_ad_view", false);
            jSONObject1.optBoolean("allow_custom_click_gesture", false);
        }
    }
}

