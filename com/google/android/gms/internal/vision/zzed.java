package com.google.android.gms.internal.vision;

final class zzed extends zzdm {
    private final zzee zza;

    zzed(zzee zzee0, int v) {
        super(zzee0.size(), v);
        this.zza = zzee0;
    }

    @Override  // com.google.android.gms.internal.vision.zzdm
    protected final Object zza(int v) {
        return this.zza.get(v);
    }
}

