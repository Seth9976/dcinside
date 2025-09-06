package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public final class LoadAdError extends AdError {
    @Nullable
    private final ResponseInfo zza;

    public LoadAdError(int v, @NonNull String s, @NonNull String s1, @Nullable AdError adError0, @Nullable ResponseInfo responseInfo0) {
        super(v, s, s1, adError0);
        this.zza = responseInfo0;
    }

    @Nullable
    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override  // com.google.android.gms.ads.AdError
    @NonNull
    public String toString() {
        try {
            return this.zzb().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }

    @Override  // com.google.android.gms.ads.AdError
    @NonNull
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject0 = super.zzb();
        ResponseInfo responseInfo0 = this.getResponseInfo();
        if(responseInfo0 == null) {
            jSONObject0.put("Response Info", "null");
            return jSONObject0;
        }
        jSONObject0.put("Response Info", responseInfo0.zzd());
        return jSONObject0;
    }
}

