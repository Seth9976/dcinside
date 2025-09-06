package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

public final class zzfcm {
    private final JSONObject zza;

    public zzfcm(JSONObject jSONObject0) {
        this.zza = jSONObject0;
    }

    @Nullable
    public final String zza() {
        return this.zzc() - 1 == 1 ? null : "javascript";
    }

    public final boolean zzb() {
        String s = (String)zzbe.zzc().zza(zzbcl.zzfh);
        return this.zza.optBoolean(s, true);
    }

    public final int zzc() {
        switch(this.zza.optInt("media_type", -1)) {
            case 0: {
                return 2;
            }
            case 1: {
                return 1;
            }
            default: {
                return 3;
            }
        }
    }
}

