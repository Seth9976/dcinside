package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class zzets implements Runnable {
    public final zzetu zza;
    public final long zzb;
    public final zzetr zzc;
    public final Bundle zzd;

    public zzets(zzetu zzetu0, long v, zzetr zzetr0, Bundle bundle0) {
        this.zza = zzetu0;
        this.zzb = v;
        this.zzc = zzetr0;
        this.zzd = bundle0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb, this.zzc, this.zzd);
    }
}

