package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzben;

public final class zze extends zzo {
    public static void zza(String s) {
        if(zze.zzc()) {
            if(s != null && s.length() > 4000) {
                boolean z = true;
                for(Object object0: zzo.zza.zzd(s)) {
                    String s1 = (String)object0;
                    if(z) {
                        Log.v("Ads", s1);
                    }
                    else {
                        Log.v("Ads-cont", s1);
                    }
                    z = false;
                }
                return;
            }
            Log.v("Ads", s);
        }
    }

    public static void zzb(String s, Throwable throwable0) {
        if(zze.zzc()) {
            Log.v("Ads", s, throwable0);
        }
    }

    // 去混淆评级： 低(20)
    public static boolean zzc() {
        return zzo.zzm(2) && ((Boolean)zzben.zza.zze()).booleanValue();
    }
}

