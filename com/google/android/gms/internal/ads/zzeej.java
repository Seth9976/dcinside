package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.t0;

public final class zzeej implements zzgbo {
    public final zzeel zza;
    public final Uri zzb;
    public final zzfca zzc;
    public final zzfbo zzd;
    public final zzfbr zze;

    public zzeej(zzeel zzeel0, Uri uri0, zzfca zzfca0, zzfbo zzfbo0, zzfbr zzfbr0) {
        this.zza = zzeel0;
        this.zzb = uri0;
        this.zzc = zzfca0;
        this.zzd = zzfbo0;
        this.zze = zzfbr0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, this.zze, object0);
    }
}

