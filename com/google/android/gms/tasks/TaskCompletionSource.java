package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TaskCompletionSource {
    private final zzw zza;

    public TaskCompletionSource() {
        this.zza = new zzw();
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken0) {
        this.zza = new zzw();
        cancellationToken0.onCanceledRequested(new zzs(this));
    }

    @NonNull
    public Task getTask() {
        return this.zza;
    }

    public void setException(@NonNull Exception exception0) {
        this.zza.zza(exception0);
    }

    public void setResult(@Nullable Object object0) {
        this.zza.zzb(object0);
    }

    public boolean trySetException(@NonNull Exception exception0) {
        return this.zza.zzd(exception0);
    }

    public boolean trySetResult(@Nullable Object object0) {
        return this.zza.zze(object0);
    }
}

