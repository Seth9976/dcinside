package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;

final class zzbzt implements Executor {
    private final Handler zza;

    zzbzt() {
        this.zza = new zzf(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable0.run();
                return;
            }
            catch(Throwable throwable0) {
                zzs.zzN(zzv.zzp().zzd(), throwable0);
                throw throwable0;
            }
        }
        this.zza.post(runnable0);
    }
}

