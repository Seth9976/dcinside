package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import o3.h;

final class zzh implements zzq {
    private final Executor zza;
    private final Object zzb;
    @h
    private OnCanceledListener zzc;

    public zzh(@NonNull Executor executor0, @NonNull OnCanceledListener onCanceledListener0) {
        this.zzb = new Object();
        this.zza = executor0;
        this.zzc = onCanceledListener0;
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized(this.zzb) {
            this.zzc = null;
        }
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task0) {
        if(task0.isCanceled()) {
            Object object0 = this.zzb;
            synchronized(object0) {
                if(this.zzc == null) {
                    return;
                }
            }
            zzg zzg0 = new zzg(this);
            this.zza.execute(zzg0);
        }
    }
}

