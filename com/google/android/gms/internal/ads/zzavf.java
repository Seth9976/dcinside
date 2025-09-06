package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;

final class zzavf extends ConnectivityManager.NetworkCallback {
    final zzavg zza;

    zzavf(zzavg zzavg0) {
        this.zza = zzavg0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
        synchronized(zzavg.class) {
            this.zza.zza = networkCapabilities0;
        }
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        synchronized(zzavg.class) {
            this.zza.zza = null;
        }
    }
}

