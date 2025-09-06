package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzfqw;

public final class zzbt {
    private HandlerThread zza;
    private Handler zzb;
    private int zzc;
    private final Object zzd;

    public zzbt() {
        this.zza = null;
        this.zzb = null;
        this.zzc = 0;
        this.zzd = new Object();
    }

    public final Handler zza() {
        return this.zzb;
    }

    public final Looper zzb() {
        synchronized(this.zzd) {
            if(this.zzc != 0) {
                Preconditions.checkNotNull(this.zza, "Invalid state: handlerThread should already been initialized.");
            }
            else if(this.zza == null) {
                zze.zza("Starting the looper thread.");
                HandlerThread handlerThread0 = new HandlerThread("LooperProvider");
                this.zza = handlerThread0;
                handlerThread0.start();
                this.zzb = new zzfqw(this.zza.getLooper());
                zze.zza("Looper thread started.");
            }
            else {
                zze.zza("Resuming the looper thread");
                this.zzd.notifyAll();
            }
            ++this.zzc;
        }
        return this.zza.getLooper();
    }
}

