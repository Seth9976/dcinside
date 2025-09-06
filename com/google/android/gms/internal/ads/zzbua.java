package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import o3.g;

public final class zzbua {
    @g
    private View zza;
    private final Map zzb;

    public zzbua() {
        this.zzb = new HashMap();
    }

    public final zzbua zzb(View view0) {
        this.zza = view0;
        return this;
    }

    public final zzbua zzc(Map map0) {
        this.zzb.clear();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            View view0 = (View)map$Entry0.getValue();
            if(view0 != null) {
                String s = (String)map$Entry0.getKey();
                WeakReference weakReference0 = new WeakReference(view0);
                this.zzb.put(s, weakReference0);
            }
        }
        return this;
    }
}

