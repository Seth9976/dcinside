package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public final class zzdym implements zzgbo {
    public final zzbvk zza;

    public zzdym(zzbvk zzbvk0) {
        this.zza = zzbvk0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        this.zza.zzj = new String(zzgad.zzb(((InputStream)object0)), StandardCharsets.UTF_8);
        return zzgch.zzh(this.zza);
    }
}

