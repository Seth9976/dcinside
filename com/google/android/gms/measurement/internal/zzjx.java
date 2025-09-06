package com.google.android.gms.measurement.internal;

public final class zzjx implements Runnable {
    private zzjq zza;
    private String zzb;

    public zzjx(zzjq zzjq0, String s) {
        this.zza = zzjq0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb);
    }
}

