package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

public final class zzbcg implements zzfvf {
    public final SharedPreferences zza;

    public zzbcg(SharedPreferences sharedPreferences0) {
        this.zza = sharedPreferences0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        return this.zza.getString("flag_configuration", "{}");
    }
}

