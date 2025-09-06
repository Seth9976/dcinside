package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.c.b;
import com.google.android.ump.e;

public final class zzr implements Runnable {
    public final b zza;
    public final zzg zzb;

    public zzr(b c$b0, zzg zzg0) {
        this.zza = c$b0;
        this.zzb = zzg0;
    }

    @Override
    public final void run() {
        e e0 = this.zzb.zza();
        this.zza.onConsentInfoUpdateFailure(e0);
    }
}

