package com.google.android.gms.measurement.internal;

final class zznp extends zzav {
    private final zznq zza;

    zznp(zznq zznq0, zzjc zzjc0) {
        this.zza = zznq0;
        super(zzjc0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzav
    public final void zzb() {
        this.zza.zzu();
        this.zza.zzj().zzp().zza("Starting upload from DelayedRunnable");
        this.zza.zzg.zzw();
    }
}

