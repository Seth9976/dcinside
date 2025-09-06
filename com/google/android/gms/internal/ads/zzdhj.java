package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

public final class zzdhj implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdhj(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Context context0 = (Context)this.zza.zzb();
        zzfbo zzfbo0 = ((zzcrq)this.zzb).zza();
        return new zzddm(context0, new HashSet(), zzfbo0);
    }
}

