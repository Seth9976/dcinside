package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

final class zzbkd implements zzbke {
    final zzcab zza;

    zzbkd(zzbkf zzbkf0, zzcab zzcab0) {
        this.zza = zzcab0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbke
    public final void zza(@Nullable String s) {
        zzbnv zzbnv0 = new zzbnv(s);
        this.zza.zzd(zzbnv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbke
    public final void zzb(JSONObject jSONObject0) {
        this.zza.zzc(jSONObject0);
    }
}

