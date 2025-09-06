package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzapp {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaow zze;
    private final zzapf zzf;
    private final zzapg[] zzg;
    private zzaoy zzh;
    private final List zzi;
    private final List zzj;
    private final zzapd zzk;

    public zzapp(zzaow zzaow0, zzapf zzapf0, int v) {
        zzapd zzapd0 = new zzapd(new Handler(Looper.getMainLooper()));
        super();
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaow0;
        this.zzf = zzapf0;
        this.zzg = new zzapg[4];
        this.zzk = zzapd0;
    }

    public final zzapm zza(zzapm zzapm0) {
        zzapm0.zzf(this);
        synchronized(this.zzb) {
            this.zzb.add(zzapm0);
        }
        zzapm0.zzg(this.zza.incrementAndGet());
        zzapm0.zzm("add-to-queue");
        this.zzc(zzapm0, 0);
        this.zzc.add(zzapm0);
        return zzapm0;
    }

    final void zzb(zzapm zzapm0) {
        synchronized(this.zzb) {
            this.zzb.remove(zzapm0);
        }
        synchronized(this.zzi) {
            for(Object object0: this.zzi) {
                ((zzapo)object0).zza();
            }
        }
        this.zzc(zzapm0, 5);
    }

    final void zzc(zzapm zzapm0, int v) {
        synchronized(this.zzj) {
            for(Object object0: this.zzj) {
                ((zzapn)object0).zza();
            }
        }
    }

    public final void zzd() {
        zzaoy zzaoy0 = this.zzh;
        if(zzaoy0 != null) {
            zzaoy0.zzb();
        }
        zzapg[] arr_zzapg = this.zzg;
        for(int v1 = 0; v1 < 4; ++v1) {
            zzapg zzapg0 = arr_zzapg[v1];
            if(zzapg0 != null) {
                zzapg0.zza();
            }
        }
        zzaoy zzaoy1 = new zzaoy(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzaoy1;
        zzaoy1.start();
        for(int v = 0; v < 4; ++v) {
            zzapg zzapg1 = new zzapg(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[v] = zzapg1;
            zzapg1.start();
        }
    }
}

