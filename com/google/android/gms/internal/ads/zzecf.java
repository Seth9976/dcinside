package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzecf implements Runnable {
    public final zzfla zza;
    public final View zzb;

    public zzecf(zzfla zzfla0, View view0) {
        this.zza = zzfla0;
        this.zzb = view0;
    }

    @Override
    public final void run() {
        this.zza.zzf(this.zzb, zzfkw.zzc, "Ad overlay");
    }
}

