package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class zzml implements Runnable {
    private final AtomicReference zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final zzo zze;
    private final zzls zzf;

    zzml(zzls zzls0, AtomicReference atomicReference0, String s, String s1, String s2, zzo zzo0) {
        this.zza = atomicReference0;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = s2;
        this.zze = zzo0;
        this.zzf = zzls0;
        super();
    }

    @Override
    public final void run() {
        AtomicReference atomicReference0 = this.zza;
        __monitor_enter(atomicReference0);
        try {
            try {
                zzgb zzgb0 = this.zzf.zzb;
                if(zzgb0 != null) {
                    if(TextUtils.isEmpty(this.zzb)) {
                        Preconditions.checkNotNull(this.zze);
                        List list0 = zzgb0.zza(this.zzc, this.zzd, this.zze);
                        this.zza.set(list0);
                    }
                    else {
                        List list1 = zzgb0.zza(this.zzb, this.zzc, this.zzd);
                        this.zza.set(list1);
                    }
                    this.zzf.zzar();
                    goto label_21;
                }
                this.zzf.zzj().zzg().zza("(legacy) Failed to get conditional properties; not connected to service", zzgo.zza(this.zzb), this.zzc, this.zzd);
                List list2 = Collections.emptyList();
                this.zza.set(list2);
                goto label_27;
            }
            catch(RemoteException remoteException0) {
                this.zzf.zzj().zzg().zza("(legacy) Failed to get conditional properties; remote exception", zzgo.zza(this.zzb), this.zzc, remoteException0);
                List list3 = Collections.emptyList();
                this.zza.set(list3);
            }
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
        label_21:
            this.zza.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
        return;
        try {
        label_25:
            this.zza.notify();
            throw throwable0;
        label_27:
            this.zza.notify();
        }
        catch(Throwable throwable1) {
            __monitor_exit(atomicReference0);
            throw throwable1;
        }
        __monitor_exit(atomicReference0);
    }
}

