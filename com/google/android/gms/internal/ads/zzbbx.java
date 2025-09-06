package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbx extends zzbcc {
    zzbbx(int v, String s, Integer integer0, Integer integer1) {
        super(1, s, integer0, integer1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zza(JSONObject jSONObject0) {
        return jSONObject0.optInt(this.zzl(), ((int)(((Integer)this.zzk()))));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzl()) ? bundle0.getInt("com.google.android.gms.ads.flag." + this.zzl()) : ((Integer)this.zzk());
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getInt(this.zzl(), ((int)(((Integer)this.zzk()))));
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putInt(this.zzl(), ((int)(((Integer)object0))));
    }
}

