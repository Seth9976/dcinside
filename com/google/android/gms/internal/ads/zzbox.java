package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import o3.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@j
public final class zzbox {
    public final List zza;
    public final String zzb;
    @Nullable
    public final String zzc;

    public zzbox(JSONObject jSONObject0) throws JSONException {
        jSONObject0.optString("id");
        JSONArray jSONArray0 = jSONObject0.getJSONArray("adapters");
        ArrayList arrayList0 = new ArrayList(jSONArray0.length());
        for(int v = 0; v < jSONArray0.length(); ++v) {
            arrayList0.add(jSONArray0.getString(v));
        }
        this.zza = DesugarCollections.unmodifiableList(arrayList0);
        jSONObject0.optString("allocation_id", null);
        zzboz.zza(jSONObject0, "clickurl");
        zzboz.zza(jSONObject0, "imp_urls");
        zzboz.zza(jSONObject0, "downloaded_imp_urls");
        zzboz.zza(jSONObject0, "fill_urls");
        zzboz.zza(jSONObject0, "video_start_urls");
        zzboz.zza(jSONObject0, "video_complete_urls");
        zzboz.zza(jSONObject0, "video_reward_urls");
        jSONObject0.optString("transaction_id");
        jSONObject0.optString("valid_from_timestamp");
        JSONObject jSONObject1 = jSONObject0.optJSONObject("ad");
        if(jSONObject1 != null) {
            zzboz.zza(jSONObject1, "manual_impression_urls");
        }
        if(jSONObject1 != null) {
            jSONObject1.toString();
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject("data");
        this.zzb = jSONObject2 == null ? null : jSONObject2.toString();
        if(jSONObject2 != null) {
            jSONObject2.optString("class_name");
        }
        jSONObject0.optString("html_template", null);
        jSONObject0.optString("ad_base_url", null);
        JSONObject jSONObject3 = jSONObject0.optJSONObject("assets");
        if(jSONObject3 != null) {
            jSONObject3.toString();
        }
        zzboz.zza(jSONObject0, "template_ids");
        JSONObject jSONObject4 = jSONObject0.optJSONObject("ad_loader_options");
        if(jSONObject4 != null) {
            jSONObject4.toString();
        }
        this.zzc = jSONObject0.optString("response_type", null);
        jSONObject0.optLong("ad_network_timeout_millis", -1L);
    }
}

