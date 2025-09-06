package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzdrq;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzw implements zzdee {
    private final zzdrq zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    @VisibleForTesting
    public zzw(zzdrq zzdrq0, zzv zzv0, String s, int v) {
        this.zza = zzdrq0;
        this.zzb = zzv0;
        this.zzc = s;
        this.zzd = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbk0) {
        String s;
        if(zzbk0 != null && this.zzd != 2) {
            if(TextUtils.isEmpty(zzbk0.zzc)) {
                this.zzb.zzd(this.zzc, zzbk0.zzb, this.zza);
            }
            else {
                try {
                    s = new JSONObject(zzbk0.zzc).optString("request_id");
                }
                catch(JSONException jSONException0) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(jSONException0, "RenderSignals.getRequestId");
                    s = null;
                }
                if(!TextUtils.isEmpty(s)) {
                    this.zzb.zzd(s, zzbk0.zzc, this.zza);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String s) {
    }
}

