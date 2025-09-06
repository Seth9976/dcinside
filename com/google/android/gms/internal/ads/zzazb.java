package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

final class zzazb implements Runnable {
    final zzazc zza;

    zzazb(zzazc zzazc0) {
        this.zza = zzazc0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza.zzc) {
            zzazc zzazc0 = this.zza;
            if(!zzazc0.zzd || !zzazc0.zze) {
                zzo.zze("App is still foreground");
            }
            else {
                zzazc.zze(zzazc0, false);
                zzo.zze("App went background");
                for(Object object1: this.zza.zzf) {
                    zzazd zzazd0 = (zzazd)object1;
                    try {
                        zzazd0.zza(false);
                    }
                    catch(Exception exception0) {
                        zzo.zzh("", exception0);
                    }
                }
            }
        }
    }
}

