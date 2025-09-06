package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.io.InputStream;

public final class zzdwc implements zzgbo {
    public final zzbvk zza;

    public zzdwc(zzbvk zzbvk0) {
        this.zza = zzbvk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return zzgch.zzh(new zzdyi(((InputStream)object0), this.zza));
    }
}

