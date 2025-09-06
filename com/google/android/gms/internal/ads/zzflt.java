package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzflt extends BroadcastReceiver {
    final zzflu zza;

    zzflt(zzflu zzflu0) {
        this.zza = zzflu0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.zza.zzd(true, this.zza.zzd);
            this.zza.zzc = true;
            return;
        }
        if(intent0.getAction().equals("android.intent.action.SCREEN_ON")) {
            this.zza.zzd(false, this.zza.zzd);
            this.zza.zzc = false;
        }
    }
}

