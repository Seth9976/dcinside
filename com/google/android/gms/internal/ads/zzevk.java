package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.util.concurrent.t0;
import org.json.JSONException;
import org.json.JSONObject;

final class zzevk implements zzetr {
    private final JSONObject zza;

    zzevk(Context context0) {
        this.zza = zzbvg.zzc(context0, VersionInfoParcel.forPackage());
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 46;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzlO)).booleanValue() ? zzgch.zzh(new zzevi()) : zzgch.zzh(new zzevj(this));
    }

    final void zzc(JSONObject jSONObject0) {
        try {
            jSONObject0.put("gms_sdk_env", this.zza);
        }
        catch(JSONException unused_ex) {
            zze.zza("Failed putting version constants.");
        }
    }
}

