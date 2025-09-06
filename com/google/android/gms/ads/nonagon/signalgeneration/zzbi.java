package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzdwz;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgch;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzbi implements zzgbo {
    private final Executor zza;
    private final zzdwz zzb;

    public zzbi(Executor executor0, zzdwz zzdwz0) {
        this.zza = executor0;
        this.zzb = zzdwz0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) throws Exception {
        return zzgch.zzn(this.zzb.zzc(((zzbvk)object0)), new zzbh(((zzbvk)object0)), this.zza);
    }
}

