package com.google.android.gms.internal.ads;

import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzfjl implements Consumer {
    public final zzdrv zza;

    public zzfjl(zzdrv zzdrv0) {
        this.zza = zzdrv0;
    }

    @Override
    public final void accept(Object object0) {
        this.zza.zzb("plaay_ts", Long.toString(((long)(((Long)object0)))));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

