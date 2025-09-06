package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

final class zzcln implements zzcla {
    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkm)).booleanValue() && !map0.isEmpty()) {
            String s = (String)map0.get("is_topics_ad_personalization_allowed");
            if(!TextUtils.isEmpty(s)) {
                zzv.zzp().zzi().zzE(Boolean.parseBoolean(s));
            }
        }
    }
}

