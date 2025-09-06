package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.b.a;
import com.google.android.ump.e;

public final class zzbg implements Runnable {
    public final a zza;

    public zzbg(a b$a0) {
        this.zza = b$a0;
    }

    @Override
    public final void run() {
        e e0 = new zzg(1, "No consentInformation.").zza();
        this.zza.a(e0);
    }
}

