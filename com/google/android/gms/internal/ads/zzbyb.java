package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

final class zzbyb {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzbyi zzd;

    private zzbyb() {
        throw null;
    }

    zzbyb(zzbyd zzbyd0) {
    }

    public final zzbyb zza(zzg zzg0) {
        this.zzc = zzg0;
        return this;
    }

    public final zzbyb zzb(Context context0) {
        context0.getClass();
        this.zza = context0;
        return this;
    }

    public final zzbyb zzc(Clock clock0) {
        clock0.getClass();
        this.zzb = clock0;
        return this;
    }

    public final zzbyb zzd(zzbyi zzbyi0) {
        this.zzd = zzbyi0;
        return this;
    }

    public final zzbyj zze() {
        zzhez.zzc(this.zza, Context.class);
        zzhez.zzc(this.zzb, Clock.class);
        zzhez.zzc(this.zzc, zzg.class);
        zzhez.zzc(this.zzd, zzbyi.class);
        return new zzbyc(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

