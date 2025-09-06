package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzba;

final class zzdxp implements zzgcd {
    final Context zza;

    zzdxp(Context context0) {
        this.zza = context0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        if(((Boolean)zzbed.zzh.zze()).booleanValue() && throwable0 instanceof zzba) {
            zzbbv.zze(this.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        zzdyi zzdyi0 = (zzdyi)object0;
        if(((Boolean)zzbed.zzj.zze()).booleanValue()) {
            zzbbv.zze(this.zza);
        }
    }
}

