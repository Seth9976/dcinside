package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

public final class zzdjw implements zzbjp {
    public final zzdkb zza;
    public final WindowManager zzb;
    public final View zzc;

    public zzdjw(zzdkb zzdkb0, WindowManager windowManager0, View view0) {
        this.zza = zzdkb0;
        this.zzb = windowManager0;
        this.zzc = view0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        this.zza.zzc(this.zzb, this.zzc, ((zzcex)object0), map0);
    }
}

