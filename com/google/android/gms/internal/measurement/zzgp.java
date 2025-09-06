package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzgp extends ContentObserver {
    private final zzgn zza;

    zzgp(zzgn zzgn0, Handler handler0) {
        this.zza = zzgn0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zza.set(true);
    }
}

