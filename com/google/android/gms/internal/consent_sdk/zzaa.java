package com.google.android.gms.internal.consent_sdk;

public final class zzaa implements zzdn {
    private final zzds zza;
    private final zzds zzb;
    private final zzds zzc;

    public zzaa(zzds zzds0, zzds zzds1, zzds zzds2) {
        this.zza = zzds0;
        this.zzb = zzds1;
        this.zzc = zzds2;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        return this.zzb();
    }

    public final zzx zzb() {
        return new zzx(((zze)this.zza.zza()), ((zzao)this.zzb).zzb(), ((zzap)this.zzc.zza()));
    }
}

