package com.google.android.gms.internal.ads;

import android.os.Bundle;
import o3.h;
import org.json.JSONObject;

public final class zzeoq implements zzetq {
    @h
    private final JSONObject zza;
    @h
    private final JSONObject zzb;

    public zzeoq(@h JSONObject jSONObject0, @h JSONObject jSONObject1) {
        this.zza = jSONObject0;
        this.zzb = jSONObject1;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        JSONObject jSONObject0 = this.zzb;
        if(jSONObject0 != null) {
            ((zzcuv)object0).zzb.putString("fwd_common_cld", jSONObject0.toString());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        JSONObject jSONObject0 = this.zza;
        if(jSONObject0 != null) {
            bundle0.putString("fwd_cld", jSONObject0.toString());
        }
        JSONObject jSONObject1 = this.zzb;
        if(jSONObject1 != null) {
            bundle0.putString("fwd_common_cld", jSONObject1.toString());
        }
    }
}

