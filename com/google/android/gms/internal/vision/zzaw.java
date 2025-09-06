package com.google.android.gms.internal.vision;

import android.database.ContentObserver;
import android.os.Handler;

final class zzaw extends ContentObserver {
    private final zzau zza;

    zzaw(zzau zzau0, Handler handler0) {
        this.zza = zzau0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zza();
    }
}

