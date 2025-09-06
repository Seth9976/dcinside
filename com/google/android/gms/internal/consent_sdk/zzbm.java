package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.e;
import com.google.android.ump.f.a;

public final class zzbm implements a {
    public final com.google.android.ump.b.a zza;

    public zzbm(com.google.android.ump.b.a b$a0) {
        this.zza = b$a0;
    }

    @Override  // com.google.android.ump.f$a
    public final void onConsentFormLoadFailure(e e0) {
        this.zza.a(e0);
    }
}

