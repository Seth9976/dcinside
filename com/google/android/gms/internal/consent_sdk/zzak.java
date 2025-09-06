package com.google.android.gms.internal.consent_sdk;

final class zzak implements zzav {
    private final zzag zza;
    private zzbp zzb;

    zzak(zzag zzag0, zzaj zzaj0) {
        this.zza = zzag0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzav
    public final zzav zza(zzbp zzbp0) {
        this.zzb = zzbp0;
        return this;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzav
    public final zzaw zzb() {
        zzdp.zzb(this.zzb, zzbp.class);
        return new zzam(this.zza, this.zzb, null);
    }
}

