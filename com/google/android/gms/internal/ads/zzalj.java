package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.List;
import java.util.Map;

final class zzalj implements zzaka {
    private final zzalc zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzalj(zzalc zzalc0, Map map0, Map map1, Map map2) {
        this.zza = zzalc0;
        this.zzd = map1;
        this.zze = map2;
        this.zzc = DesugarCollections.unmodifiableMap(map0);
        this.zzb = zzalc0.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzaka
    public final int zza() {
        return this.zzb.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzaka
    public final long zzb(int v) {
        return this.zzb[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzaka
    public final List zzc(long v) {
        return this.zza.zze(v, this.zzc, this.zzd, this.zze);
    }
}

