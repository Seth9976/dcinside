package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevv implements zzetq {
    private final Bundle zza;

    public zzevv(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        if(this.zza != null) {
            try {
                zzbs.zzg(zzbs.zzg(jSONObject0, "device"), "play_store").put("parental_controls", zzbc.zzb().zzi(this.zza));
            }
            catch(JSONException unused_ex) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}

