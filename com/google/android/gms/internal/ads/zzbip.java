package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

public final class zzbip implements zzbjp {
    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        zzcgk zzcgk0 = (zzcgk)object0;
        String s = (String)map0.get("tx");
        String s1 = (String)map0.get("ty");
        String s2 = (String)map0.get("td");
        try {
            int v = Integer.parseInt(s);
            int v1 = Integer.parseInt(s1);
            int v2 = Integer.parseInt(s2);
            zzava zzava0 = zzcgk0.zzI();
            if(zzava0 != null) {
                zzava0.zzc().zzl(v, v1, v2);
            }
        }
        catch(NumberFormatException unused_ex) {
            zzo.zzj("Could not parse touch parameters from gmsg.");
        }
    }
}

