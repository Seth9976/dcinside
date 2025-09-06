package com.google.android.gms.internal.vision;

import android.database.ContentObserver;
import android.os.Handler;

final class zzat extends ContentObserver {
    zzat(Handler handler0) {
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzaq.zze.set(true);
    }
}

