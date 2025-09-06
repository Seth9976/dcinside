package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzcj;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class zzewk implements Callable {
    @Override
    public final Object call() {
        HashMap hashMap0 = new HashMap();
        String s = (String)zzbe.zzc().zza(zzbcl.zzW);
        if(s != null && !s.isEmpty() && Build.VERSION.SDK_INT >= ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzX))))) {
            String[] arr_s = s.split(",", -1);
            for(int v = 0; v < arr_s.length; ++v) {
                String s1 = arr_s[v];
                hashMap0.put(s1, zzcj.zza(s1));
            }
        }
        return new zzewm(hashMap0);
    }
}

