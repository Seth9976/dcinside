package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzxj implements Executor {
    public final Handler zza;

    public zzxj(Handler handler0) {
        this.zza = handler0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.zza.post(runnable0);
    }
}

