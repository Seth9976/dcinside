package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

final class zzz extends ContentObserver {
    zzz(Handler handler0) {
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        zzy.zzct.set(true);
    }
}

