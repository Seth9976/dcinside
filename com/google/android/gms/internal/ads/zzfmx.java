package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzfmx {
    private final BlockingQueue zza;
    private final ThreadPoolExecutor zzb;
    private final ArrayDeque zzc;
    private zzfmw zzd;

    public zzfmx() {
        this.zzc = new ArrayDeque();
        this.zzd = null;
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        this.zza = linkedBlockingQueue0;
        this.zzb = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue0);
    }

    public final void zza(zzfmw zzfmw0) {
        this.zzd = null;
        this.zzc();
    }

    public final void zzb(zzfmw zzfmw0) {
        zzfmw0.zzb(this);
        this.zzc.add(zzfmw0);
        if(this.zzd == null) {
            this.zzc();
        }
    }

    private final void zzc() {
        zzfmw zzfmw0 = (zzfmw)this.zzc.poll();
        this.zzd = zzfmw0;
        if(zzfmw0 != null) {
            zzfmw0.executeOnExecutor(this.zzb, new Object[0]);
        }
    }
}

