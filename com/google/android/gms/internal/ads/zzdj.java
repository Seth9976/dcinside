package com.google.android.gms.internal.ads;

import java.util.concurrent.CopyOnWriteArraySet;

public final class zzdj implements Runnable {
    public final CopyOnWriteArraySet zza;
    public final int zzb;
    public final zzdk zzc;

    public zzdj(CopyOnWriteArraySet copyOnWriteArraySet0, int v, zzdk zzdk0) {
        this.zza = copyOnWriteArraySet0;
        this.zzb = v;
        this.zzc = zzdk0;
    }

    @Override
    public final void run() {
        for(Object object0: this.zza) {
            ((zzdm)object0).zza(this.zzb, this.zzc);
        }
    }
}

