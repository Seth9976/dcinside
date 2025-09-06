package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzbjl implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("action");
        if("pause".equals(s)) {
            ((zzcex)object0).zzde();
            return;
        }
        if("resume".equals(s)) {
            ((zzcex)object0).zzdf();
        }
    }
}

