package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.c.c;

public final class zzp implements Runnable {
    public final zzu zza;
    public final c zzb;
    public final zzz zzc;

    public zzp(zzu zzu0, c c$c0, zzz zzz0) {
        this.zza = zzu0;
        this.zzb = c$c0;
        this.zzc = zzz0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}

