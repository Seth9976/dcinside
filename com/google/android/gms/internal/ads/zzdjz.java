package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdjz implements zzcgn {
    public final zzdkb zza;
    public final Map zzb;

    public zzdjz(zzdkb zzdkb0, Map map0) {
        this.zza = zzdkb0;
        this.zzb = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcgn
    public final void zza(boolean z, int v, String s, String s1) {
        this.zza.zze(this.zzb, z, v, s, s1);
    }
}

