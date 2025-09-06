package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import o3.h;

final class zzj implements zzq {
    private final Executor zza;
    private final Object zzb;
    @h
    private OnCompleteListener zzc;

    public zzj(@NonNull Executor executor0, @NonNull OnCompleteListener onCompleteListener0) {
        this.zzb = new Object();
        this.zza = executor0;
        this.zzc = onCompleteListener0;
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized(this.zzb) {
            this.zzc = null;
        }
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task0) {
        synchronized(this.zzb) {
            if(this.zzc == null) {
                return;
            }
        }
        zzi zzi0 = new zzi(this, task0);
        this.zza.execute(zzi0);
    }
}

