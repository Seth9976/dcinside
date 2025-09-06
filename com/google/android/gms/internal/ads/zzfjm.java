package com.google.android.gms.internal.ads;

import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzfjm implements Consumer {
    public final zzdrv zza;

    public zzfjm(zzdrv zzdrv0) {
        this.zza = zzdrv0;
    }

    @Override
    public final void accept(Object object0) {
        this.zza.zzb("gqi", ((String)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

