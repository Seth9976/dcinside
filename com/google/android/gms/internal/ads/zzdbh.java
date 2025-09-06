package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

public final class zzdbh implements Runnable {
    public final zzdbi zza;
    public final Object zzb;

    public zzdbh(zzdbi zzdbi0, Object object0) {
        this.zza = zzdbi0;
        this.zzb = object0;
    }

    @Override
    public final void run() {
        try {
            this.zza.zza(this.zzb);
        }
        catch(Throwable throwable0) {
            zzv.zzp().zzv(throwable0, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", throwable0);
        }
    }
}

