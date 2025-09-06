package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;

public final class zzavw extends BroadcastReceiver {
    private boolean zza;

    zzavw(@NonNull Context context0) {
        this.zza = true;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.USER_PRESENT");
        intentFilter0.addAction("android.intent.action.SCREEN_OFF");
        context0.registerReceiver(this, intentFilter0);
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if("android.intent.action.USER_PRESENT".equals(intent0.getAction())) {
            this.zza = true;
            return;
        }
        if("android.intent.action.SCREEN_OFF".equals(intent0.getAction())) {
            this.zza = false;
        }
    }

    final boolean zza() {
        return this.zza;
    }
}

