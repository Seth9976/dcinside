package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzge implements zzfx {
    private final Context zza;
    private final zzfx zzb;

    public zzge(Context context0) {
        zzgg zzgg0 = new zzgg();
        super();
        this.zza = context0.getApplicationContext();
        this.zzb = zzgg0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfx
    public final zzfy zza() {
        zzfy zzfy0 = this.zzb.zza();
        return new zzgf(this.zza, zzfy0);
    }
}

