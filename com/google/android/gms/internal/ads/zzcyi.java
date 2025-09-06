package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class zzcyi implements Runnable {
    private final WeakReference zza;

    zzcyi(zzcyl zzcyl0, zzcyk zzcyk0) {
        this.zza = new WeakReference(zzcyl0);
    }

    @Override
    public final void run() {
        zzcyl zzcyl0 = (zzcyl)this.zza.get();
        if(zzcyl0 != null) {
            zzcyl0.zzq(new zzcyg());
        }
    }
}

