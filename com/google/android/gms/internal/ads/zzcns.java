package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcns implements zzher {
    private final zzhfj zza;

    public zzcns(zzhfj zzhfj0) {
        this.zza = zzhfj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @Nullable
    public final Object zzb() {
        zzfbo zzfbo0 = ((zzcrq)this.zza).zza();
        try {
            return new JSONObject(zzfbo0.zzz);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }
}

