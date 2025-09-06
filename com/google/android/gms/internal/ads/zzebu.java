package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzm;
import java.util.Timer;
import java.util.TimerTask;

final class zzebu extends TimerTask {
    final AlertDialog zza;
    final Timer zzb;
    final zzm zzc;

    zzebu(zzebv zzebv0, AlertDialog alertDialog0, Timer timer0, zzm zzm0) {
        this.zza = alertDialog0;
        this.zzb = timer0;
        this.zzc = zzm0;
        super();
    }

    @Override
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        zzm zzm0 = this.zzc;
        if(zzm0 != null) {
            zzm0.zzb();
        }
    }
}

