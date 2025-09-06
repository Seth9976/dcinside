package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import com.google.android.gms.internal.measurement.zzpn;

public final class zzp extends BroadcastReceiver {
    private final zzhy zza;

    public zzp(zzhy zzhy0) {
        this.zza = zzhy0;
    }

    @Override  // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            this.zza.zzj().zzu().zza("App receiver called with null intent");
            return;
        }
        String s = intent0.getAction();
        if(s == null) {
            this.zza.zzj().zzu().zza("App receiver called with null action");
            return;
        }
        if(!s.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.zza.zzj().zzu().zza("App receiver called with unknown action");
            return;
        }
        zzhy zzhy0 = this.zza;
        if(zzpn.zza() && zzhy0.zzf().zzf(null, zzbh.zzci)) {
            zzhy0.zzj().zzp().zza("App receiver notified triggers are available");
            zzhy0.zzl().zzb(new zzr(zzhy0));
        }
    }
}

