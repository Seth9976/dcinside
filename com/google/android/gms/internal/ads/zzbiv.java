package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

final class zzbiv implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzbfk zzbfk0 = ((zzcex)object0).zzK();
        if(zzbfk0 != null) {
            JSONObject jSONObject0 = zzbfk0.zzb();
            if(jSONObject0 != null) {
                ((zzcex)object0).zze("nativeClickMetaReady", jSONObject0);
                return;
            }
        }
        ((zzcex)object0).zze("nativeClickMetaReady", new JSONObject());
    }
}

