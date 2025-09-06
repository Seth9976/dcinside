package com.google.android.gms.measurement.internal;

public final class zzih implements Runnable {
    private zzic zza;
    private zzo zzb;

    public zzih(zzic zzic0, zzo zzo0) {
        this.zza = zzic0;
        this.zzb = zzo0;
    }

    @Override
    public final void run() {
        this.zza.zzj(this.zzb);
    }
}

