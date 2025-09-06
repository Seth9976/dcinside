package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import o3.h;

final class zzl implements zzq {
    private final Executor zza;
    private final Object zzb;
    @h
    private OnFailureListener zzc;

    public zzl(@NonNull Executor executor0, @NonNull OnFailureListener onFailureListener0) {
        this.zzb = new Object();
        this.zza = executor0;
        this.zzc = onFailureListener0;
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized(this.zzb) {
            this.zzc = null;
        }
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task0) {
        if(!task0.isSuccessful() && !task0.isCanceled()) {
            Object object0 = this.zzb;
            synchronized(object0) {
                if(this.zzc == null) {
                    return;
                }
            }
            zzk zzk0 = new zzk(this, task0);
            this.zza.execute(zzk0);
        }
    }
}

