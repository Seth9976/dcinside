package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;
import java.util.function.Consumer;

public final class zzccq implements zzbjp {
    private final Consumer zza;

    public zzccq(Consumer consumer0) {
        this.zza = consumer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcbs zzcbs0 = (zzcbs)object0;
        String s = (String)map0.get("action");
        if(s == null) {
            zzo.zzj("Action missing from video GMSG.");
            return;
        }
        if(s.equals("src")) {
            String s1 = (String)map0.get("src");
            if(s1 == null) {
                zzo.zzj("src missing from video GMSG.");
                return;
            }
            this.zza.accept(s1);
        }
    }
}

