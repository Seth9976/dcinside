package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONException;
import org.json.JSONObject;

final class zzdzj implements zzbnz {
    @Override  // com.google.android.gms.internal.ads.zzbnz
    public final JSONObject zzb(Object object0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjg)).booleanValue()) {
            jSONObject1.put("ad_request_url", ((zzdzk)object0).zzd.zzg());
            jSONObject1.put("ad_request_post_body", ((zzdzk)object0).zzd.zzf());
        }
        jSONObject1.put("base_url", ((zzdzk)object0).zzd.zzd());
        jSONObject1.put("signals", ((zzdzk)object0).zzc);
        jSONObject2.put("body", ((zzdzk)object0).zzb.zzc);
        jSONObject2.put("headers", zzbc.zzb().zzj(((zzdzk)object0).zzb.zzb));
        jSONObject2.put("response_code", ((zzdzk)object0).zzb.zza);
        jSONObject2.put("latency", ((zzdzk)object0).zzb.zzd);
        jSONObject0.put("request", jSONObject1);
        jSONObject0.put("response", jSONObject2);
        jSONObject0.put("flags", ((zzdzk)object0).zzd.zzi());
        return jSONObject0;
    }
}

