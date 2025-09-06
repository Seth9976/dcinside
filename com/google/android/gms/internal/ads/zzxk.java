package com.google.android.gms.internal.ads;

import android.media.Spatializer.OnSpatializerStateChangedListener;
import android.media.Spatializer;

final class zzxk implements Spatializer.OnSpatializerStateChangedListener {
    final zzxt zza;

    zzxk(zzxl zzxl0, zzxt zzxt0) {
        this.zza = zzxt0;
        super();
    }

    @Override  // android.media.Spatializer$OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer0, boolean z) {
        this.zza.zzu();
    }

    @Override  // android.media.Spatializer$OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer0, boolean z) {
        this.zza.zzu();
    }
}

