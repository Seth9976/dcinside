package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public final class zzfrh implements OnCompleteListener {
    public final zzfri zza;

    public zzfrh(zzfri zzfri0) {
        this.zza = zzfri0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        zzfri zzfri0 = this.zza;
        if(task0.isCanceled()) {
            zzfri0.cancel(false);
            return;
        }
        if(task0.isSuccessful()) {
            zzfri0.zzc(task0.getResult());
            return;
        }
        Exception exception0 = task0.getException();
        if(exception0 == null) {
            throw new IllegalStateException();
        }
        zzfri0.zzd(exception0);
    }
}

