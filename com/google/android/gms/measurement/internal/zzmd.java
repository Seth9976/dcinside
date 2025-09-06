package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zzmd implements Runnable {
    private final zzlk zza;
    private final zzls zzb;

    zzmd(zzls zzls0, zzlk zzlk0) {
        this.zza = zzlk0;
        this.zzb = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0 = this.zzb.zzb;
        if(zzgb0 == null) {
            this.zzb.zzj().zzg().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzlk zzlk0 = this.zza;
            if(zzlk0 == null) {
                zzgb0.zza(0L, null, null, "com.dcinside.app.android");
            }
            else {
                zzgb0.zza(zzlk0.zzc, zzlk0.zza, zzlk0.zzb, "com.dcinside.app.android");
            }
            this.zzb.zzar();
            return;
        }
        catch(RemoteException remoteException0) {
        }
        this.zzb.zzj().zzg().zza("Failed to send current screen to the service", remoteException0);
    }
}

