package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzcey implements Runnable {
    public final zzcff zza;
    public final View zzb;
    public final zzbxu zzc;
    public final int zzd;

    public zzcey(zzcff zzcff0, View view0, zzbxu zzbxu0, int v) {
        this.zza = zzcff0;
        this.zzb = view0;
        this.zzc = zzbxu0;
        this.zzd = v;
    }

    @Override
    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}

