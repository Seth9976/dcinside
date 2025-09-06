package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevs implements zzetq {
    private final List zza;

    public zzevs(List list0) {
        this.zza = list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("eid", TextUtils.join(",", this.zza));
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting experiment ids.");
        }
    }
}

