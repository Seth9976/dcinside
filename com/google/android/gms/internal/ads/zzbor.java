package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

final class zzbor implements zzbke {
    private final zzcab zza;

    public zzbor(zzbos zzbos0, zzcab zzcab0) {
        this.zza = zzcab0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbke
    public final void zza(@Nullable String s) {
        try {
            if(s == null) {
                zzbnv zzbnv0 = new zzbnv();
                this.zza.zzd(zzbnv0);
                return;
            }
            zzbnv zzbnv1 = new zzbnv(s);
            this.zza.zzd(zzbnv1);
        }
        catch(IllegalStateException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbke
    public final void zzb(JSONObject jSONObject0) {
        try {
            this.zza.zzc(jSONObject0);
        }
        catch(IllegalStateException jSONException0) {
            this.zza.zzd(jSONException0);
        }
        catch(JSONException unused_ex) {
        }
    }
}

