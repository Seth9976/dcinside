package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;

final class zzbzj extends ConnectivityManager.NetworkCallback {
    final zzbzm zza;

    zzbzj(zzbzm zzbzm0) {
        this.zza = zzbzm0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onAvailable(Network network0) {
        this.zza.zzo.set(true);
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        this.zza.zzo.set(false);
    }
}

