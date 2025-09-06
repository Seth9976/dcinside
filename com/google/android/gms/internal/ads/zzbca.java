package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbca extends zzbcc {
    zzbca(int v, String s, String s1, String s2) {
        super(1, s, s1, s2, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zza(JSONObject jSONObject0) {
        return jSONObject0.optString(this.zzl(), ((String)this.zzk()));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzl()) ? bundle0.getString("com.google.android.gms.ads.flag." + this.zzl()) : ((String)this.zzk());
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getString(this.zzl(), ((String)this.zzk()));
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putString(this.zzl(), ((String)object0));
    }
}

