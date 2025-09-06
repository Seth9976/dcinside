package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

public final class zzdhm implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzdhm(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzayg zzayg0 = (zzayg)this.zza.zzb();
        Executor executor0 = (Executor)this.zzb.zzb();
        Context context0 = (Context)this.zzc.zzb();
        Clock clock0 = (Clock)this.zzd.zzb();
        return new zzcnr(executor0, new zzcnd(context0, zzayg0), clock0);
    }
}

