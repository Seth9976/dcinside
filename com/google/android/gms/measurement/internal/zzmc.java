package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdo;

final class zzmc implements Runnable {
    private final zzo zza;
    private final zzdo zzb;
    private final zzls zzc;

    zzmc(zzls zzls0, zzo zzo0, zzdo zzdo0) {
        this.zza = zzo0;
        this.zzb = zzdo0;
        this.zzc = zzls0;
        super();
    }

    @Override
    public final void run() {
        String s = null;
        try {
            if(this.zzc.zzk().zzo().zzh()) {
                zzgb zzgb0 = this.zzc.zzb;
                if(zzgb0 != null) {
                    Preconditions.checkNotNull(this.zza);
                    s = zzgb0.zzb(this.zza);
                    if(s != null) {
                        this.zzc.zzm().zzc(s);
                        this.zzc.zzk().zze.zza(s);
                    }
                    this.zzc.zzar();
                    goto label_10;
                }
                goto label_12;
            }
            goto label_15;
        }
        catch(RemoteException remoteException0) {
            goto label_20;
        }
        catch(Throwable throwable0) {
            this.zzc.zzq().zza(this.zzb, s);
            throw throwable0;
        }
    label_10:
        this.zzc.zzq().zza(this.zzb, s);
        return;
        try {
        label_12:
            this.zzc.zzj().zzg().zza("Failed to get app instance id");
        }
        catch(RemoteException remoteException0) {
            goto label_20;
        }
        catch(Throwable throwable0) {
            this.zzc.zzq().zza(this.zzb, s);
            throw throwable0;
        }
        this.zzc.zzq().zza(this.zzb, null);
        return;
        try {
            try {
            label_15:
                this.zzc.zzj().zzv().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zzm().zzc(null);
                this.zzc.zzk().zze.zza(null);
                goto label_26;
            }
            catch(RemoteException remoteException0) {
            }
        label_20:
            this.zzc.zzj().zzg().zza("Failed to get app instance id", remoteException0);
        }
        catch(Throwable throwable0) {
            this.zzc.zzq().zza(this.zzb, s);
            throw throwable0;
        }
        this.zzc.zzq().zza(this.zzb, s);
        return;
    label_26:
        this.zzc.zzq().zza(this.zzb, null);
    }
}

