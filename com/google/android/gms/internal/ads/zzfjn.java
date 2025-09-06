package com.google.android.gms.internal.ads;

import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzfjn implements Consumer {
    public final zzdrv zza;

    public zzfjn(zzdrv zzdrv0) {
        this.zza = zzdrv0;
    }

    @Override
    public final void accept(Object object0) {
        this.zza.zzb("action", ((String)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

