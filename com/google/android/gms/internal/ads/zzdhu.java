package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzdhu implements Runnable {
    public final zzdia zza;
    public final View zzb;
    public final boolean zzc;
    public final int zzd;

    public zzdhu(zzdia zzdia0, View view0, boolean z, int v) {
        this.zza = zzdia0;
        this.zzb = view0;
        this.zzc = z;
        this.zzd = v;
    }

    @Override
    public final void run() {
        this.zza.zzx(this.zzb, this.zzc, this.zzd);
    }
}

