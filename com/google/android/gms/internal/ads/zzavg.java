package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;

public final class zzavg {
    private NetworkCapabilities zza;

    zzavg(ConnectivityManager connectivityManager0) {
        if(connectivityManager0 != null && Build.VERSION.SDK_INT >= 24) {
            try {
                connectivityManager0.registerDefaultNetworkCallback(new zzavf(this));
            }
            catch(RuntimeException unused_ex) {
                synchronized(zzavg.class) {
                    this.zza = null;
                }
            }
        }
    }

    public final long zza() {
        synchronized(zzavg.class) {
            NetworkCapabilities networkCapabilities0 = this.zza;
            if(networkCapabilities0 != null) {
                if(networkCapabilities0.hasTransport(4)) {
                    return 2L;
                }
                if(this.zza.hasTransport(1)) {
                    return 1L;
                }
                if(this.zza.hasTransport(0)) {
                    return 0L;
                }
            }
            return -1L;
        }
    }

    public final NetworkCapabilities zzb() {
        return this.zza;
    }

    public static zzavg zzc(Context context0) {
        return context0 == null ? null : new zzavg(((ConnectivityManager)context0.getSystemService("connectivity")));
    }
}

