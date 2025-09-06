package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.t0;

public final class zzecx implements zzecw {
    @VisibleForTesting
    public final zzecw zza;
    private final zzfuc zzb;

    public zzecx(zzecw zzecw0, zzfuc zzfuc0) {
        this.zza = zzecw0;
        this.zzb = zzfuc0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        return zzgch.zzm(this.zza.zza(zzfca0, zzfbo0), this.zzb, zzbzw.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return this.zza.zzb(zzfca0, zzfbo0);
    }
}

