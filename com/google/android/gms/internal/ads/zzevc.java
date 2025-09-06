package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevc implements zzetq {
    @Nullable
    @VisibleForTesting
    final String zza;
    @VisibleForTesting
    final int zzb;

    public zzevc(@Nullable String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        if(!TextUtils.isEmpty(this.zza) && this.zzb != -1) {
            try {
                JSONObject jSONObject1 = zzbs.zzg(jSONObject0, "pii");
                jSONObject1.put("pvid", this.zza);
                jSONObject1.put("pvid_s", this.zzb);
            }
            catch(JSONException jSONException0) {
                zze.zzb("Failed putting gms core app set ID info.", jSONException0);
            }
        }
    }
}

