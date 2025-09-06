package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

final class zzdnj implements zzbjp {
    final zzdnl zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbjp zzd;

    zzdnj(zzdnl zzdnl0, WeakReference weakReference0, String s, zzbjp zzbjp0, zzdnk zzdnk0) {
        this.zza = zzdnl0;
        super();
        this.zzb = weakReference0;
        this.zzc = s;
        this.zzd = zzbjp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        Object object1 = this.zzb.get();
        if(object1 == null) {
            this.zza.zzn(this.zzc, this);
            return;
        }
        this.zzd.zza(object1, map0);
    }
}

