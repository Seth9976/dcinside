package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzbds {
    private MotionEvent zza;
    private MotionEvent zzb;
    private final ScheduledExecutorService zzc;

    public zzbds(Context context0, ScheduledExecutorService scheduledExecutorService0, zzbdu zzbdu0, zzfhh zzfhh0) {
        this.zza = MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
        this.zzb = MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
        this.zzc = scheduledExecutorService0;
    }

    public final t0 zza() {
        return (zzgby)zzgch.zzo(zzgby.zzu(zzgch.zzh(null)), ((long)(((Long)zzbek.zzc.zze()))), TimeUnit.MILLISECONDS, this.zzc);
    }

    public final void zzb(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 1 && motionEvent0.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent0);
            return;
        }
        if(motionEvent0.getAction() == 0 && motionEvent0.getEventTime() > this.zzb.getEventTime()) {
            this.zzb = MotionEvent.obtain(motionEvent0);
        }
    }
}

