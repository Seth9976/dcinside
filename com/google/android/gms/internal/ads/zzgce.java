package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class zzgce implements Runnable {
    final Future zza;
    final zzgcd zzb;

    zzgce(Future future0, zzgcd zzgcd0) {
        this.zza = future0;
        this.zzb = zzgcd0;
    }

    @Override
    public final void run() {
        Object object0;
        Future future0 = this.zza;
        if(future0 instanceof zzgdl) {
            Throwable throwable0 = zzgdm.zza(((zzgdl)future0));
            if(throwable0 != null) {
                this.zzb.zza(throwable0);
                return;
            }
        }
        try {
            object0 = zzgch.zzp(this.zza);
        }
        catch(ExecutionException executionException0) {
            this.zzb.zza(executionException0.getCause());
            return;
        }
        catch(Throwable throwable1) {
            this.zzb.zza(throwable1);
            return;
        }
        this.zzb.zzb(object0);
    }

    @Override
    public final String toString() {
        zzfuh zzfuh0 = zzfuj.zza(this);
        zzfuh0.zza(this.zzb);
        return zzfuh0.toString();
    }
}

