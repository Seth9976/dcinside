package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzgw extends ContentObserver {
    private final zzgu zza;

    zzgw(zzgu zzgu0, Handler handler0) {
        this.zza = zzgu0;
        super(null);
    }

    @Override  // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.zza.zzd();
    }
}

