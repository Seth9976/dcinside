package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzdrw {
    private final zzdsb zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdrw(zzdsb zzdsb0, Executor executor0) {
        this.zza = zzdsb0;
        this.zzc = zzdsb0.zza();
        this.zzb = executor0;
    }

    public final zzdrv zza() {
        zzdrv zzdrv0 = new zzdrv(this);
        zzdrv.zza(zzdrv0);
        return zzdrv0;
    }

    public final void zze() {
        if(!((Boolean)zzbe.zzc().zza(zzbcl.zzlw)).booleanValue()) {
            return;
        }
        zzdrv zzdrv0 = this.zza();
        zzdrv0.zzb("action", "pecr");
        zzdrv0.zzg();
    }
}

