package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class zzgcu implements Executor {
    final Executor zza;
    final zzgax zzb;

    zzgcu(Executor executor0, zzgax zzgax0) {
        this.zza = executor0;
        this.zzb = zzgax0;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        try {
            this.zza.execute(runnable0);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            this.zzb.zzd(rejectedExecutionException0);
        }
    }
}

