package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

final class zzac extends ContentObserver {
    private final zzab zzdm;

    zzac(zzab zzab0, Handler handler0) {
        this.zzdm = zzab0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzdm.zzh();
        this.zzdm.zzj();
    }
}

