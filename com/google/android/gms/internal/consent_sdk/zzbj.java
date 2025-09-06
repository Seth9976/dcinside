package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.b.a;
import com.google.android.ump.e;

public final class zzbj implements Runnable {
    public final a zza;

    public zzbj(a b$a0) {
        this.zza = b$a0;
    }

    @Override
    public final void run() {
        e e0 = new zzg(3, "Privacy options form is being loading. Please try again later.").zza();
        this.zza.a(e0);
    }
}

