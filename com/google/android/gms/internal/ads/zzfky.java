package com.google.android.gms.internal.ads;

import java.util.Timer;
import java.util.TimerTask;

final class zzfky extends TimerTask {
    final Timer zza;
    final zzfla zzb;
    final zzcfo zzc;

    zzfky(zzfla zzfla0, zzcfo zzcfo0, Timer timer0) {
        this.zzc = zzcfo0;
        this.zza = timer0;
        this.zzb = zzfla0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zzh();
        this.zzc.zza(true);
        this.zza.cancel();
    }
}

