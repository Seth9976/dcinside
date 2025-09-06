package com.google.android.gms.internal.ads;

import java.util.List;

final class zztp implements zzwa {
    private final zzwa zza;
    private final zzfxn zzb;

    public zztp(zzwa zzwa0, List list0) {
        this.zza = zzwa0;
        this.zzb = zzfxn.zzl(list0);
    }

    public final zzfxn zza() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final void zzm(long v) {
        this.zza.zzm(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkj0) {
        return this.zza.zzo(zzkj0);
    }

    @Override  // com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zza.zzp();
    }
}

