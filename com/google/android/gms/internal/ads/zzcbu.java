package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;

final class zzcbu implements Runnable {
    private final zzcbg zza;
    private boolean zzb;

    zzcbu(zzcbg zzcbg0) {
        this.zzb = false;
        this.zza = zzcbg0;
    }

    @Override
    public final void run() {
        if(!this.zzb) {
            this.zza.zzt();
            this.zzc();
        }
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc();
    }

    private final void zzc() {
        zzs.zza.removeCallbacks(this);
        zzs.zza.postDelayed(this, 0xFAL);
    }
}

