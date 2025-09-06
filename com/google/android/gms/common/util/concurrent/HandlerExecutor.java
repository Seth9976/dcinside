package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzh;
import java.util.concurrent.Executor;

@KeepForSdk
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper0) {
        this.zza = new zzh(looper0);
    }

    @Override
    public final void execute(@NonNull Runnable runnable0) {
        this.zza.post(runnable0);
    }
}

