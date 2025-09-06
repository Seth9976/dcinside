package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbie implements zzbjp {
    private final zzbif zza;

    public zzbie(zzbif zzbif0) {
        this.zza = zzbif0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(this.zza == null) {
            return;
        }
        String s = (String)map0.get("name");
        if(s == null) {
            zzo.zzi("Ad metadata with no name parameter.");
            s = "";
        }
        Bundle bundle0 = null;
        if(map0.containsKey("info")) {
            try {
                bundle0 = zzbs.zza(new JSONObject(((String)map0.get("info"))));
            }
            catch(JSONException jSONException0) {
                zzo.zzh("Failed to convert ad metadata to JSON.", jSONException0);
            }
        }
        if(bundle0 == null) {
            zzo.zzg("Failed to convert ad metadata to Bundle.");
            return;
        }
        this.zza.zza(s, bundle0);
    }
}

