package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

final class zzhj extends BroadcastReceiver implements Runnable {
    private final Handler zza;

    public zzhj(zzhl zzhl0, Handler handler0, zzhk zzhk0) {
        this.zza = handler0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if("android.media.AUDIO_BECOMING_NOISY".equals(intent0.getAction())) {
            this.zza.post(this);
        }
    }

    @Override
    public final void run() {
    }
}

