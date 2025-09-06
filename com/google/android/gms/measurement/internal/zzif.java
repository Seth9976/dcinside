package com.google.android.gms.measurement.internal;

public final class zzif implements Runnable {
    private zzic zza;
    private zzo zzb;

    public zzif(zzic zzic0, zzo zzo0) {
        this.zza = zzic0;
        this.zzb = zzo0;
    }

    @Override
    public final void run() {
        this.zza.zzk(this.zzb);
    }
}

