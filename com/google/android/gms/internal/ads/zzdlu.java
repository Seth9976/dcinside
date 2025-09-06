package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzdlu {
    private final Executor zza;
    private final zzdlp zzb;

    public zzdlu(Executor executor0, zzdlp zzdlp0) {
        this.zza = executor0;
        this.zzb = zzdlp0;
    }

    public final t0 zza(JSONObject jSONObject0, String s) {
        t0 t00;
        JSONArray jSONArray0 = jSONObject0.optJSONArray("custom_assets");
        if(jSONArray0 == null) {
            return zzgch.zzh(Collections.emptyList());
        }
        ArrayList arrayList0 = new ArrayList();
        int v = jSONArray0.length();
        for(int v1 = 0; v1 < v; ++v1) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
            if(jSONObject1 == null) {
                t00 = zzgch.zzh(null);
            }
            else {
                String s1 = jSONObject1.optString("name");
                if(s1 == null) {
                    t00 = zzgch.zzh(null);
                }
                else {
                    String s2 = jSONObject1.optString("type");
                    if("string".equals(s2)) {
                        t00 = zzgch.zzh(new zzdlt(s1, jSONObject1.optString("string_value")));
                    }
                    else {
                        t00 = "image".equals(s2) ? zzgch.zzm(this.zzb.zze(jSONObject1, "image_value"), new zzdlr(s1), this.zza) : zzgch.zzh(null);
                    }
                }
            }
            arrayList0.add(t00);
        }
        return zzgch.zzm(zzgch.zzd(arrayList0), new zzdls(), this.zza);
    }
}

