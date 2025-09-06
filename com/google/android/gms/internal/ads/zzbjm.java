package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzbjm implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        if(map0.keySet().contains("start")) {
            ((zzcex)object0).zzN().zzm();
            return;
        }
        if(map0.keySet().contains("stop")) {
            ((zzcex)object0).zzN().zzn();
            return;
        }
        if(map0.keySet().contains("cancel")) {
            ((zzcex)object0).zzN().zzl();
        }
    }
}

