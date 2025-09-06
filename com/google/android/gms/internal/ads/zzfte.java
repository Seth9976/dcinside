package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;

public final class zzfte implements zzfvf {
    public final String zza;

    public zzfte(String s) {
        this.zza = "OverlayDisplayService";
    }

    @Override  // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        HandlerThread handlerThread0 = new HandlerThread(this.zza, 10);
        handlerThread0.start();
        return new Handler(handlerThread0.getLooper());
    }
}

