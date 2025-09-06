package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbbz extends zzbcc {
    zzbbz(int v, String s, Float float0, Float float1) {
        super(1, s, float0, float1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zza(JSONObject jSONObject0) {
        return (float)jSONObject0.optDouble(this.zzl(), ((double)(((float)(((Float)this.zzk()))))));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzl()) ? bundle0.getFloat("com.google.android.gms.ads.flag." + this.zzl()) : ((Float)this.zzk());
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getFloat(this.zzl(), ((float)(((Float)this.zzk()))));
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putFloat(this.zzl(), ((float)(((Float)object0))));
    }
}

