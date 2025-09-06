package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;

final class zzfju extends ConnectivityManager.NetworkCallback {
    final zzfjv zza;

    zzfju(zzfjv zzfjv0) {
        this.zza = zzfjv0;
        super();
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onAvailable(Network network0) {
        this.zza.zzs(true);
    }

    @Override  // android.net.ConnectivityManager$NetworkCallback
    public final void onLost(Network network0) {
        this.zza.zzs(false);
    }
}

