package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzo implements zzdn {
    private final zzds zza;
    private final zzds zzb;

    public zzo(zzds zzds0, zzds zzds1) {
        this.zza = zzds0;
        this.zzb = zzds1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zzb();
    }

    public final zzl zzb() {
        return new zzl(((Application)this.zza.zza()), ((zzap)this.zzb.zza()));
    }
}

