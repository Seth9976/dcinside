package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzbu {
    final Map zza;

    public zzbu() {
        this.zza = new ConcurrentHashMap();
        new AtomicInteger(0);
    }

    public final Bitmap zza(Integer integer0) {
        return (Bitmap)this.zza.get(integer0);
    }
}

