package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

public final class zzbjv implements zzbjp {
    private final Context zza;
    private final Map zzb;

    public zzbjv(Context context0, Map map0) {
        this.zza = context0;
        this.zzb = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(!zzv.zzo().zzp(this.zza)) {
            return;
        }
        String s = (String)map0.get("eventName");
        String s1 = (String)map0.get("eventId");
        switch(s) {
            case "_aa": {
                zzv.zzo().zzh(this.zza, s1);
                return;
            }
            case "_ac": {
                Map map1 = (Map)this.zzb.get("_ac");
                zzv.zzo().zzj(this.zza, s1, map1);
                return;
            }
            case "_ai": {
                Map map2 = (Map)this.zzb.get("_ai");
                zzv.zzo().zzk(this.zza, s1, map2);
                return;
            }
            default: {
                zzo.zzg("logScionEvent gmsg contained unsupported eventName");
            }
        }
    }
}

