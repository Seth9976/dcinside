package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class zzlv implements Runnable {
    private final AtomicReference zza;
    private final zzo zzb;
    private final boolean zzc;
    private final zzls zzd;

    zzlv(zzls zzls0, AtomicReference atomicReference0, zzo zzo0, boolean z) {
        this.zza = atomicReference0;
        this.zzb = zzo0;
        this.zzc = z;
        this.zzd = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0;
        AtomicReference atomicReference0 = this.zza;
        __monitor_enter(atomicReference0);
        try {
            zzgb0 = this.zzd.zzb;
            if(zzgb0 == null) {
                this.zzd.zzj().zzg().zza("Failed to get all user properties; not connected to service");
                goto label_5;
            }
            goto label_8;
        }
        catch(RemoteException remoteException0) {
            goto label_14;
        }
        catch(Throwable throwable0) {
            goto label_17;
        }
        try {
        label_5:
            this.zza.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
            try {
            label_8:
                Preconditions.checkNotNull(this.zzb);
                List list0 = zzgb0.zza(this.zzb, this.zzc);
                this.zza.set(list0);
                this.zzd.zzar();
            }
            catch(RemoteException remoteException0) {
            label_14:
                this.zzd.zzj().zzg().zza("Failed to get all user properties; remote exception", remoteException0);
            }
            goto label_19;
        }
        catch(Throwable throwable0) {
            try {
            label_17:
                this.zza.notify();
                throw throwable0;
            label_19:
                this.zza.notify();
                goto label_24;
            }
            catch(Throwable throwable1) {
            }
        }
        __monitor_exit(atomicReference0);
        throw throwable1;
    label_24:
        __monitor_exit(atomicReference0);
    }
}

