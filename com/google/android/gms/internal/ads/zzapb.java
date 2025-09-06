package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class zzapb implements Executor {
    final Handler zza;

    zzapb(zzapd zzapd0, Handler handler0) {
        this.zza = handler0;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.zza.post(runnable0);
    }
}

