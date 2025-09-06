package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

public final class zzbo implements zzdn {
    private final zzds zza;

    public zzbo(zzds zzds0, zzds zzds1) {
        this.zza = zzds0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        Executor executor0 = zzau.zzb();
        return new zzbn(this.zza, executor0);
    }
}

