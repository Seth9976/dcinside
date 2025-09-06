package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

public final class zzj implements Runnable {
    public final zzk zza;
    public final Drawable zzb;

    public zzj(zzk zzk0, Drawable drawable0) {
        this.zza = zzk0;
        this.zzb = drawable0;
    }

    @Override
    public final void run() {
        this.zza.zza.zzb.getWindow().setBackgroundDrawable(this.zzb);
    }
}

