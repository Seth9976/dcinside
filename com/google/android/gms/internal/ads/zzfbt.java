package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfbt {
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzfbt(JsonReader jsonReader0) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject jSONObject0 = zzbs.zzi(jsonReader0);
        this.zzd = jSONObject0;
        this.zza = jSONObject0.optString("ad_html", null);
        this.zzb = jSONObject0.optString("ad_base_url", null);
        this.zzc = jSONObject0.optJSONObject("ad_json");
    }
}

