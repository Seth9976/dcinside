package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

public final class zzao implements zzdn {
    private final zzds zza;
    private final zzds zzb;

    public zzao(zzds zzds0, zzds zzds1, zzds zzds2) {
        this.zza = zzds0;
        this.zzb = zzds1;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zzb();
    }

    public final zzan zzb() {
        return new zzan(((Application)this.zza.zza()), ((zzap)this.zzb.zza()), zzau.zzb());
    }
}

