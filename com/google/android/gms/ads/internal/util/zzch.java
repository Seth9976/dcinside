package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzch extends BroadcastReceiver {
    final zzci zza;

    zzch(zzci zzci0) {
        this.zza = zzci0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        this.zza.zze(context0, intent0);
    }
}

