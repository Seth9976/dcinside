package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfa {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzfa(String s, Bundle bundle0, String s1) {
        this.zza = s;
        this.zzb = bundle0;
        this.zzc = s1;
    }

    public final Bundle zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        if(!TextUtils.isEmpty(this.zzc)) {
            try {
                return new JSONObject(this.zzc).optString("request_id", "");
            }
            catch(JSONException unused_ex) {
            }
        }
        return "";
    }
}

