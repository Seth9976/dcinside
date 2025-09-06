package com.google.android.gms.phenotype;

import android.database.ContentObserver;
import android.os.Handler;

final class zzb extends ContentObserver {
    private final zza zzm;

    zzb(zza zza0, Handler handler0) {
        this.zzm = zza0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zzm.zzb();
    }
}

