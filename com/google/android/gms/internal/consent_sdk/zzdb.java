package com.google.android.gms.internal.consent_sdk;

final class zzdb extends zzcy {
    private final zzdd zza;

    zzdb(zzdd zzdd0, int v) {
        super(zzdd0.size(), v);
        this.zza = zzdd0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzcy
    protected final Object zza(int v) {
        return this.zza.get(v);
    }
}

