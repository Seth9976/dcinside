package com.google.android.gms.internal.ads;

final class zzfxl extends zzfvn {
    private final zzfxn zza;

    zzfxl(zzfxn zzfxn0, int v) {
        super(zzfxn0.size(), v);
        this.zza = zzfxn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfvn
    protected final Object zza(int v) {
        return this.zza.get(v);
    }
}

