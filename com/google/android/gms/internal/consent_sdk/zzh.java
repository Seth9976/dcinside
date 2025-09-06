package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.c.c;

public final class zzh implements c {
    public final zzj zza;

    public zzh(zzj zzj0) {
        this.zza = zzj0;
    }

    @Override  // com.google.android.ump.c$c
    public final void onConsentInfoUpdateSuccess() {
        this.zza.zzb(false);
    }
}

