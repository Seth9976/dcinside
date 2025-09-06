package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class zzeq implements Consumer {
    public final PreloadCallback zza;

    public zzeq(PreloadCallback preloadCallback0) {
        this.zza = preloadCallback0;
    }

    @Override
    public final void accept(Object object0) {
        this.zza.onAdsAvailable(((PreloadConfiguration)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

