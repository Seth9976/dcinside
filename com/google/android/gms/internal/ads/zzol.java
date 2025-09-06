package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class zzol extends BroadcastReceiver {
    final zzon zza;

    zzol(zzon zzon0, zzom zzom0) {
        this.zza = zzon0;
        super();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(!this.isInitialStickyBroadcast()) {
            zzoi zzoi0 = zzoi.zzd(context0, intent0, this.zza.zzh, this.zza.zzg);
            this.zza.zzj(zzoi0);
        }
    }
}

