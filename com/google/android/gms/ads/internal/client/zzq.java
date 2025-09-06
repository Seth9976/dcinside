package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdRequest.Builder;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzq implements Consumer {
    public final Builder zza;

    public zzq(Builder adRequest$Builder0) {
        this.zza = adRequest$Builder0;
    }

    @Override
    public final void accept(Object object0) {
        this.zza.setContentUrl(((String)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

