package com.google.android.gms.measurement.internal;

final class zzd implements Runnable {
    private final String zza;
    private final long zzb;
    private final zzb zzc;

    zzd(zzb zzb0, String s, long v) {
        this.zza = s;
        this.zzb = v;
        this.zzc = zzb0;
        super();
    }

    @Override
    public final void run() {
        zzb.zzb(this.zzc, this.zza, this.zzb);
    }
}

