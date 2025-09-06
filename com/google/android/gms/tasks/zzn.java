package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import o3.h;

final class zzn implements zzq {
    private final Executor zza;
    private final Object zzb;
    @h
    private OnSuccessListener zzc;

    public zzn(@NonNull Executor executor0, @NonNull OnSuccessListener onSuccessListener0) {
        this.zzb = new Object();
        this.zza = executor0;
        this.zzc = onSuccessListener0;
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzc() {
        synchronized(this.zzb) {
            this.zzc = null;
        }
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzd(@NonNull Task task0) {
        if(task0.isSuccessful()) {
            Object object0 = this.zzb;
            synchronized(object0) {
                if(this.zzc == null) {
                    return;
                }
            }
            zzm zzm0 = new zzm(this, task0);
            this.zza.execute(zzm0);
        }
    }
}

