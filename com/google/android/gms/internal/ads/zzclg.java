package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzclg implements zzcla {
    private final zzduv zza;

    zzclg(zzduv zzduv0) {
        this.zza = zzduv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        String s = (String)map0.get("gesture");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        switch(s) {
            case "flick": {
                this.zza.zzm(zzdur.zzc);
                return;
            }
            case "shake": {
                this.zza.zzm(zzdur.zzb);
                return;
            }
            default: {
                this.zza.zzm(zzdur.zza);
            }
        }
    }
}

