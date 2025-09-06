package com.google.android.gms.net;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zza implements Runnable {
    public final Context zza;
    public final TaskCompletionSource zzb;

    public zza(Context context0, TaskCompletionSource taskCompletionSource0) {
        this.zza = context0;
        this.zzb = taskCompletionSource0;
    }

    @Override
    public final void run() {
        TaskCompletionSource taskCompletionSource0;
        try {
            taskCompletionSource0 = this.zzb;
            CronetProviderInstaller.zzc(this.zza);
            taskCompletionSource0.setResult(null);
        }
        catch(Exception exception0) {
            taskCompletionSource0.setException(exception0);
        }
    }
}

