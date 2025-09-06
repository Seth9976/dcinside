package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.c.c;

public final class zzt implements Runnable {
    public final c zza;

    public zzt(c c$c0) {
        this.zza = c$c0;
    }

    @Override
    public final void run() {
        this.zza.onConsentInfoUpdateSuccess();
    }
}

