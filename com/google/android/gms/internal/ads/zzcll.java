package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

public final class zzcll implements zzclb {
    private final zzduv zza;

    zzcll(zzduv zzduv0) {
        this.zza = zzduv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzclb
    public final void zza(JSONObject jSONObject0) {
        if(jSONObject0 != null && ((Boolean)zzbe.zzc().zza(zzbcl.zzjd)).booleanValue()) {
            this.zza.zzn(jSONObject0);
        }
    }
}

