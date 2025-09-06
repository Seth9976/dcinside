package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdo;

final class zzmi implements Runnable {
    private final zzbf zza;
    private final String zzb;
    private final zzdo zzc;
    private final zzls zzd;

    zzmi(zzls zzls0, zzbf zzbf0, String s, zzdo zzdo0) {
        this.zza = zzbf0;
        this.zzb = s;
        this.zzc = zzdo0;
        this.zzd = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0;
        byte[] arr_b = null;
        try {
            zzgb0 = this.zzd.zzb;
            if(zzgb0 == null) {
                this.zzd.zzj().zzg().zza("Discarding data. Failed to send event to service to bundle");
                goto label_4;
            }
            goto label_6;
        }
        catch(RemoteException remoteException0) {
            goto label_10;
        }
        catch(Throwable throwable0) {
            this.zzd.zzq().zza(this.zzc, arr_b);
            throw throwable0;
        }
    label_4:
        this.zzd.zzq().zza(this.zzc, null);
        return;
        try {
            try {
            label_6:
                arr_b = zzgb0.zza(this.zza, this.zzb);
                this.zzd.zzar();
                goto label_16;
            }
            catch(RemoteException remoteException0) {
            }
        label_10:
            this.zzd.zzj().zzg().zza("Failed to send event to the service to bundle", remoteException0);
        }
        catch(Throwable throwable0) {
            this.zzd.zzq().zza(this.zzc, arr_b);
            throw throwable0;
        }
        this.zzd.zzq().zza(this.zzc, arr_b);
        return;
    label_16:
        this.zzd.zzq().zza(this.zzc, arr_b);
    }
}

