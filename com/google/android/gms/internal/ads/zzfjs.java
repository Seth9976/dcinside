package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import j..util.Optional;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzfjs implements Consumer {
    public final zzfjv zza;
    public final AdFormat zzb;
    public final Optional zzc;

    public zzfjs(zzfjv zzfjv0, AdFormat adFormat0, Optional optional0) {
        this.zza = zzfjv0;
        this.zzb = adFormat0;
        this.zzc = optional0;
    }

    @Override
    public final void accept(Object object0) {
        this.zza.zzg(this.zzb, this.zzc, object0);
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

