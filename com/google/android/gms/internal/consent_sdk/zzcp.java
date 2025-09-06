package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ThreadFactory;

public final class zzcp implements ThreadFactory {
    public final zzcq zza;
    public final String zzb;

    public zzcp(zzcq zzcq0, String s) {
        this.zza = zzcq0;
        this.zzb = "Google consent worker";
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return this.zza.zza(this.zzb, runnable0);
    }
}

