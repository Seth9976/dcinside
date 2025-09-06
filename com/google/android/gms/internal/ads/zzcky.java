package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class zzcky {
    private final Map zza;
    private final Map zzb;

    zzcky(Map map0, Map map1) {
        this.zza = map0;
        this.zzb = map1;
    }

    public final void zza(zzfca zzfca0) throws Exception {
        for(Object object0: zzfca0.zzb.zzc) {
            zzfby zzfby0 = (zzfby)object0;
            if(this.zza.containsKey(zzfby0.zza) && zzfby0.zzb != null) {
                ((zzclb)this.zza.get(zzfby0.zza)).zza(zzfby0.zzb);
            }
            else if(this.zzb.containsKey(zzfby0.zza) && zzfby0.zzb != null) {
                zzcla zzcla0 = (zzcla)this.zzb.get(zzfby0.zza);
                JSONObject jSONObject0 = zzfby0.zzb;
                HashMap hashMap0 = new HashMap();
                Iterator iterator1 = jSONObject0.keys();
                while(iterator1.hasNext()) {
                    Object object1 = iterator1.next();
                    String s = (String)object1;
                    String s1 = jSONObject0.optString(s);
                    if(s1 != null) {
                        hashMap0.put(s, s1);
                    }
                }
                zzcla0.zza(hashMap0);
            }
        }
    }
}

