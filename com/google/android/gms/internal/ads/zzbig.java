package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzbig implements zzbjp {
    private final zzbih zza;

    public zzbig(zzbih zzbih0) {
        this.zza = zzbih0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("name");
        if(s == null) {
            zzo.zzj("App event with no name parameter.");
            return;
        }
        String s1 = (String)map0.get("info");
        this.zza.zzb(s, s1);
    }
}

