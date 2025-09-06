package com.google.android.gms.internal.ads;

import j..util.Optional;

public final class zzfkd implements Runnable {
    public final zzfkh zza;
    public final long zzb;
    public final Optional zzc;

    public zzfkd(zzfkh zzfkh0, long v, Optional optional0) {
        this.zza = zzfkh0;
        this.zzb = v;
        this.zzc = optional0;
    }

    @Override
    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}

