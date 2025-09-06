package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

final class zzbdp extends QueryInfoGenerationCallback {
    final String zza;
    final zzbdq zzb;

    zzbdp(zzbdq zzbdq0, String s) {
        this.zza = s;
        this.zzb = zzbdq0;
        super();
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String s) {
        zzo.zzj(("Failed to generate query info for Custom Tab error: " + s));
        try {
            this.zzb.zzg.l(this.zzb.zzc(this.zza, s).toString(), null);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error creating PACT Error Response JSON: ", jSONException0);
        }
    }

    @Override  // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo0) {
        String s = queryInfo0.getQuery();
        try {
            this.zzb.zzg.l(this.zzb.zzd(this.zza, s).toString(), null);
        }
        catch(JSONException jSONException0) {
            zzo.zzh("Error creating PACT Signal Response JSON: ", jSONException0);
        }
    }
}

