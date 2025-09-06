package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.WindowManager;
import java.util.Map;

public final class zzdjx implements zzbjp {
    public final zzdkb zza;
    public final View zzb;
    public final WindowManager zzc;

    public zzdjx(zzdkb zzdkb0, View view0, WindowManager windowManager0) {
        this.zza = zzdkb0;
        this.zzb = view0;
        this.zzc = windowManager0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object object0, Map map0) {
        this.zza.zzd(this.zzb, this.zzc, ((zzcex)object0), map0);
    }
}

