package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.common.util.Clock;

public final class zzbxz {
    private final Clock zza;
    private final zzbxx zzb;

    zzbxz(Clock clock0, zzbxx zzbxx0) {
        this.zza = clock0;
        this.zzb = zzbxx0;
    }

    public static zzbxz zza(Context context0) {
        return zzbyj.zzd(context0).zzb();
    }

    public final void zzb(int v, long v1) {
        this.zzb.zza(v, v1);
    }

    public final void zzc(zzfv zzfv0) {
        long v = this.zza.currentTimeMillis();
        this.zzb.zza(-1, v);
    }

    public final void zzd() {
        long v = this.zza.currentTimeMillis();
        this.zzb.zza(-1, v);
    }
}

