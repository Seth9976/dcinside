package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class zzgcc extends zzgca implements t0 {
    @Override  // com.google.common.util.concurrent.t0
    public final void addListener(Runnable runnable0, Executor executor0) {
        this.zzc().addListener(runnable0, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgca
    protected Future zzb() {
        throw null;
    }

    protected abstract t0 zzc();
}

