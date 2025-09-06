package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzevu implements zzetr {
    final ScheduledExecutorService zza;

    public zzevu(zzbti zzbti0, ScheduledExecutorService scheduledExecutorService0, Context context0) {
        this.zza = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 49;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        return zzgch.zzm(zzgch.zzo(zzgch.zzh(new Bundle()), ((long)(((Long)zzbe.zzc().zza(zzbcl.zzek)))), TimeUnit.MILLISECONDS, this.zza), new zzevt(), zzbzw.zza);
    }
}

