package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;

public final class zzbkc implements zzbjp {
    private final zzdvs zza;

    public zzbkc(zzdvs zzdvs0) {
        this.zza = zzdvs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
            String s = (String)map0.get("action");
            String s1 = (String)map0.get("adUnitId");
            String s2 = (String)map0.get("redirectUrl");
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                String s3 = (String)map0.get("format");
                if(s.equals("load") && !TextUtils.isEmpty(s3)) {
                    this.zza.zzh(s1, s3, s2);
                    return;
                }
                if(s.equals("show")) {
                    this.zza.zzi(s1, s2);
                }
            }
        }
    }
}

