package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.e;
import com.google.android.ump.f.a;
import com.google.android.ump.f.b;

final class zzba implements a, b {
    private final b zza;
    private final a zzb;

    zzba(b f$b0, a f$a0, zzaz zzaz0) {
        this.zza = f$b0;
        this.zzb = f$a0;
    }

    @Override  // com.google.android.ump.f$a
    public final void onConsentFormLoadFailure(e e0) {
        this.zzb.onConsentFormLoadFailure(e0);
    }

    @Override  // com.google.android.ump.f$b
    public final void onConsentFormLoadSuccess(com.google.android.ump.b b0) {
        this.zza.onConsentFormLoadSuccess(b0);
    }
}

