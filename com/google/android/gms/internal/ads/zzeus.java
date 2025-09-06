package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeus implements zzetq {
    @Nullable
    private final Info zza;
    @Nullable
    private final String zzb;
    private final zzfra zzc;

    public zzeus(@Nullable Info advertisingIdClient$Info0, @Nullable String s, zzfra zzfra0) {
        this.zza = advertisingIdClient$Info0;
        this.zzb = s;
        this.zzc = zzfra0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            JSONObject jSONObject1 = zzbs.zzg(jSONObject0, "pii");
            if(this.zza == null || TextUtils.isEmpty(this.zza.getId())) {
                String s = this.zzb;
                if(s != null) {
                    jSONObject1.put("pdid", s);
                    jSONObject1.put("pdidtype", "ssaid");
                }
            }
            else {
                jSONObject1.put("rdid", this.zza.getId());
                jSONObject1.put("is_lat", this.zza.isLimitAdTrackingEnabled());
                jSONObject1.put("idtype", "adid");
                zzfra zzfra0 = this.zzc;
                if(zzfra0.zzc()) {
                    jSONObject1.put("paidv1_id_android_3p", zzfra0.zzb());
                    jSONObject1.put("paidv1_creation_time_android_3p", this.zzc.zza());
                    return;
                }
            }
            return;
        }
        catch(JSONException jSONException0) {
        }
        zze.zzb("Failed putting Ad ID.", jSONException0);
    }
}

