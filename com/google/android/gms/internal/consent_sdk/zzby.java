package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class zzby implements Executor {
    public final Handler zza;

    public zzby(Handler handler0) {
        this.zza = handler0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.zza.post(runnable0);
    }
}

