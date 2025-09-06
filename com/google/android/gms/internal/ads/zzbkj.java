package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

public final class zzbkj implements zzbjp {
    private final zzduv zza;

    public zzbkj(zzduv zzduv0) {
        Preconditions.checkNotNull(zzduv0, "The Inspector Manager must not be null");
        this.zza = zzduv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        long v = 0x7FFFFFFFFFFFFFFFL;
        if(map0 != null && map0.containsKey("extras")) {
            if(map0.containsKey("expires")) {
                try {
                    v = Long.parseLong(((String)map0.get("expires")));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            String s = (String)map0.get("extras");
            this.zza.zzi(s, v);
        }
    }
}

