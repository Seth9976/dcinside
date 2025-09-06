package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdtj implements zzdsx {
    private final long zza;
    private final zzekv zzb;

    zzdtj(long v, Context context0, zzdtc zzdtc0, zzcgx zzcgx0, String s) {
        this.zza = v;
        zzezt zzezt0 = zzcgx0.zzv();
        zzezt0.zzc(context0);
        zzezt0.zza(new zzs());
        zzezt0.zzb(s);
        zzekv zzekv0 = zzezt0.zzd().zza();
        this.zzb = zzekv0;
        zzekv0.zzD(new zzdti(this, zzdtc0));
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public final void zza() {
        this.zzb.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public final void zzb(zzm zzm0) {
        this.zzb.zzab(zzm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdsx
    public final void zzc() {
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(null);
        this.zzb.zzW(iObjectWrapper0);
    }
}

