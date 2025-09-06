package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

final class zzbby extends zzbcc {
    zzbby(int v, String s, Long long0, Long long1) {
        super(1, s, long0, long1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zza(JSONObject jSONObject0) {
        return jSONObject0.optLong(this.zzl(), ((long)(((Long)this.zzk()))));
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzb(Bundle bundle0) {
        return bundle0.containsKey("com.google.android.gms.ads.flag." + this.zzl()) ? bundle0.getLong("com.google.android.gms.ads.flag." + this.zzl()) : ((Long)this.zzk());
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final Object zzc(SharedPreferences sharedPreferences0) {
        return sharedPreferences0.getLong(this.zzl(), ((long)(((Long)this.zzk()))));
    }

    @Override  // com.google.android.gms.internal.ads.zzbcc
    public final void zzd(SharedPreferences.Editor sharedPreferences$Editor0, Object object0) {
        sharedPreferences$Editor0.putLong(this.zzl(), ((long)(((Long)object0))));
    }
}

