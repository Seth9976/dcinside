package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

public final class zzdke implements Runnable {
    public final zzcex zza;

    public zzdke(zzcex zzcex0) {
        this.zza = zzcex0;
    }

    @Override
    public final void run() {
        ArrayMap arrayMap0 = new ArrayMap();
        this.zza.zzd("onSdkImpression", arrayMap0);
    }
}

