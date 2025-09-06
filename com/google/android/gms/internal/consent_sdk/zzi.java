package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.c.b;
import com.google.android.ump.e;

public final class zzi implements b {
    public final zzj zza;

    public zzi(zzj zzj0) {
        this.zza = zzj0;
    }

    @Override  // com.google.android.ump.c$b
    public final void onConsentInfoUpdateFailure(e e0) {
        this.zza.zzb(false);
    }
}

