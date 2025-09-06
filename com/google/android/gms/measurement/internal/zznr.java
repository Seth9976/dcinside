package com.google.android.gms.measurement.internal;

abstract class zznr extends zzns {
    private boolean zza;

    zznr(zznv zznv0) {
        super(zznv0);
        this.zzg.zzu();
    }

    protected final void zzal() {
        if(!this.zzan()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzam() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzc();
        this.zzg.zzt();
        this.zza = true;
    }

    final boolean zzan() {
        return this.zza;
    }

    protected abstract boolean zzc();
}

