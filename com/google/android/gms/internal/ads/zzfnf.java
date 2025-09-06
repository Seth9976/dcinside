package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final class zzfnf implements Continuation {
    public final zzari zza;
    public final int zzb;

    public zzfnf(zzari zzari0, int v) {
        this.zza = zzari0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        if(task0.isSuccessful()) {
            zzfpi zzfpi0 = ((zzfpk)task0.getResult()).zza(((zzarm)this.zza.zzbn()).zzaV());
            zzfpi0.zza(this.zzb);
            zzfpi0.zzc();
            return true;
        }
        return false;
    }
}

