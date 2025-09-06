package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzewi implements zzetq {
    private final String zza;

    public zzewi(String s) {
        this.zza = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            if(!TextUtils.isEmpty(this.zza)) {
                zzbs.zzg(jSONObject0, "pii").put("adsid", this.zza);
            }
        }
        catch(JSONException jSONException0) {
            zzo.zzk("Failed putting trustless token.", jSONException0);
        }
    }
}

