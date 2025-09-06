package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONException;
import org.json.JSONObject;

final class zzdta {
    @Nullable
    private Long zza;
    private final String zzb;
    @Nullable
    private String zzc;
    @Nullable
    private Integer zzd;
    @Nullable
    private String zze;
    @Nullable
    private Integer zzf;

    zzdta(String s, zzdtb zzdtb0) {
        this.zzb = s;
    }

    static String zza(zzdta zzdta0) {
        String s = (String)zzbe.zzc().zza(zzbcl.zzjQ);
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.putOpt("objectId", zzdta0.zza);
            jSONObject0.put("eventCategory", zzdta0.zzb);
            jSONObject0.putOpt("event", zzdta0.zzc);
            jSONObject0.putOpt("errorCode", zzdta0.zzd);
            jSONObject0.putOpt("rewardType", zzdta0.zze);
            jSONObject0.putOpt("rewardAmount", zzdta0.zzf);
            return s + "(\"h5adsEvent\"," + jSONObject0.toString() + ");";
        }
        catch(JSONException unused_ex) {
            zzo.zzj("Could not convert parameters to JSON.");
            return s + "(\"h5adsEvent\"," + jSONObject0.toString() + ");";
        }
    }
}

