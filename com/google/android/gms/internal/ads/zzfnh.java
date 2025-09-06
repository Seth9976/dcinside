package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfnh implements Runnable {
    public final TaskCompletionSource zza;

    public zzfnh(TaskCompletionSource taskCompletionSource0) {
        this.zza = taskCompletionSource0;
    }

    @Override
    public final void run() {
        zzfpk zzfpk0 = zzfpk.zzc();
        this.zza.setResult(zzfpk0);
    }
}

