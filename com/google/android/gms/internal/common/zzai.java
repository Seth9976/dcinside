package com.google.android.gms.internal.common;

final class zzai extends zzad {
    private final zzak zza;

    zzai(zzak zzak0, int v) {
        super(zzak0.size(), v);
        this.zza = zzak0;
    }

    @Override  // com.google.android.gms.internal.common.zzad
    protected final Object zza(int v) {
        return this.zza.get(v);
    }
}

