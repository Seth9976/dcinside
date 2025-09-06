package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzeyg implements zzezf {
    private zzcuz zza;
    private final Executor zzb;

    public zzeyg() {
        this.zzb = zzgcz.zzc();
    }

    public final zzcuz zza() {
        return this.zza;
    }

    public final t0 zzb(zzezg zzezg0, zzeze zzeze0, @Nullable zzcuz zzcuz0) {
        zzcuy zzcuy0 = zzeze0.zza(zzezg0.zzb);
        zzcuy0.zzb(new zzezj(true));
        zzcuz zzcuz1 = (zzcuz)zzcuy0.zzh();
        this.zza = zzcuz1;
        zzcsd zzcsd0 = zzcuz1.zzb();
        zzfef zzfef0 = new zzfef();
        return (zzgby)zzgch.zzm(((zzgby)zzgch.zzn(zzgby.zzu(zzcsd0.zzi()), new zzeye(this, zzfef0, zzcsd0), this.zzb)), new zzeyf(zzfef0), this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzezf
    public final t0 zzc(zzezg zzezg0, zzeze zzeze0, @Nullable Object object0) {
        return this.zzb(zzezg0, zzeze0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzezf
    public final Object zzd() {
        return this.zza;
    }
}

