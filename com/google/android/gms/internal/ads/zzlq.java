package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
public final class zzlq {
    private final zzik zza;

    @Deprecated
    public zzlq(Context context0, zzced zzced0) {
        this.zza = new zzik(context0, zzced0);
    }

    @Deprecated
    public final zzlq zza(zzkg zzkg0) {
        zzcw.zzf(!this.zza.zzr);
        zzkg0.getClass();
        this.zza.zzf = new zzic(zzkg0);
        return this;
    }

    @Deprecated
    public final zzlq zzb(zzyb zzyb0) {
        zzcw.zzf(!this.zza.zzr);
        zzyb0.getClass();
        this.zza.zze = new zzij(zzyb0);
        return this;
    }

    @Deprecated
    public final zzlr zzc() {
        zzcw.zzf(!this.zza.zzr);
        this.zza.zzr = true;
        return new zzlr(this.zza);
    }
}

