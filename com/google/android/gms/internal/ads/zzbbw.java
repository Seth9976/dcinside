package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbw extends zzbcc {
    zzbbw(int v, String s, Boolean boolean0, Boolean boolean1) {
        super(v, s, boolean0, boolean1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zza(JSONObject jSONObject0) {
        return Boolean.valueOf(jSONObject0.optBoolean(this.zzl(), ((Boolean)this.zzk()).booleanValue()));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzl()) ? Boolean.valueOf(bundle0.getBoolean("com.google.android.gms.ads.flag." + this.zzl())) : ((Boolean)this.zzk());
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return Boolean.valueOf(sharedPreferences0.getBoolean(this.zzl(), ((Boolean)this.zzk()).booleanValue()));
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putBoolean(this.zzl(), ((Boolean)object0).booleanValue());
    }
}

