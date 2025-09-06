package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class zzfwz extends zzfxc {
    zzfwz() {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfxc
    public final int zza() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzb(int v, int v1) {
        return zzfwz.zzf(Integer.compare(v, v1));
    }

    @Override  // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzc(Object object0, Object object1, Comparator comparator0) {
        return zzfwz.zzf(comparator0.compare(object0, object1));
    }

    @Override  // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zzd(boolean z, boolean z1) {
        return zzfwz.zzf(Boolean.compare(z, z1));
    }

    @Override  // com.google.android.gms.internal.ads.zzfxc
    public final zzfxc zze(boolean z, boolean z1) {
        return zzfwz.zzf(Boolean.compare(z1, z));
    }

    static final zzfxc zzf(int v) {
        if(v < 0) {
            return zzfxc.zzb;
        }
        return v <= 0 ? zzfxc.zza : zzfxc.zzc;
    }
}

