package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

public final class zzbxl implements Runnable {
    public final zzbxp zza;
    public final Bitmap zzb;

    public zzbxl(zzbxp zzbxp0, Bitmap bitmap0) {
        this.zza = zzbxp0;
        this.zzb = bitmap0;
    }

    @Override
    public final void run() {
        this.zza.zzf(this.zzb);
    }
}

