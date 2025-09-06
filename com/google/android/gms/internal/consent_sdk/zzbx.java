package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzbx implements zzdn {
    private final zzds zza;

    public zzbx(zzds zzds0) {
        this.zza = zzds0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return new zzbw(((Application)this.zza.zza()));
    }
}

