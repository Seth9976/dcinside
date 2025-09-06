package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzfmi extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int v = intent0.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if(v == 0) {
                zzfmj.zza = 1;
                return;
            }
            if(v == 1) {
                zzfmj.zza = 2;
            }
        }
    }
}

