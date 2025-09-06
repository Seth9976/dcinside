package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j..util.Objects;

final class zzq extends BroadcastReceiver {
    final zzs zza;

    zzq(zzs zzs0, zzr zzr0) {
        this.zza = zzs0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(Objects.equals(intent0.getAction(), "android.intent.action.USER_PRESENT")) {
            this.zza.zzf = true;
            return;
        }
        if("android.intent.action.SCREEN_OFF".equals(intent0.getAction())) {
            this.zza.zzf = false;
        }
    }
}

