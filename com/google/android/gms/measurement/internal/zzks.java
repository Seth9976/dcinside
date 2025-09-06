package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdo;

final class zzks implements Runnable {
    private final zzdo zza;
    private final zzjq zzb;

    zzks(zzjq zzjq0, zzdo zzdo0) {
        this.zza = zzdo0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        Long long0;
        zznb zznb0 = this.zzb.zzp();
        if(zznb0.zzk().zzo().zzh()) {
            long0 = zznb0.zzk().zza(zznb0.zzb().currentTimeMillis()) || zznb0.zzk().zzl.zza() == 0L ? null : zznb0.zzk().zzl.zza();
        }
        else {
            zznb0.zzj().zzv().zza("Analytics storage consent denied; will not get session id");
            long0 = null;
        }
        if(long0 != null) {
            this.zzb.zzu.zzt().zza(this.zza, ((long)long0));
            return;
        }
        try {
            this.zza.zza(null);
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzu.zzj().zzg().zza("getSessionId failed with exception", remoteException0);
        }
    }
}

