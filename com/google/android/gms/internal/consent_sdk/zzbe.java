package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.f.b;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbe implements b {
    public final AtomicReference zza;

    public zzbe(AtomicReference atomicReference0) {
        this.zza = atomicReference0;
    }

    @Override  // com.google.android.ump.f$b
    public final void onConsentFormLoadSuccess(com.google.android.ump.b b0) {
        this.zza.set(b0);
    }
}

