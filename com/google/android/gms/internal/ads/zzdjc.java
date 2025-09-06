package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

public final class zzdjc implements Runnable {
    public final zzdjf zza;
    public final ViewGroup zzb;

    public zzdjc(zzdjf zzdjf0, ViewGroup viewGroup0) {
        this.zza = zzdjf0;
        this.zzb = viewGroup0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

