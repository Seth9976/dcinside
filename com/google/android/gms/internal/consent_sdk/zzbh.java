package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.b.a;
import com.google.android.ump.e;

public final class zzbh implements Runnable {
    public final a zza;

    public zzbh(a b$a0) {
        this.zza = b$a0;
    }

    @Override
    public final void run() {
        e e0 = new zzg(3, "No valid response received yet.").zza();
        this.zza.a(e0);
    }
}

