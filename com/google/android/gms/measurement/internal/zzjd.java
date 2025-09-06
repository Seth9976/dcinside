package com.google.android.gms.measurement.internal;

abstract class zzjd extends zzja {
    private boolean zza;

    zzjd(zzhy zzhy0) {
        super(zzhy0);
        this.zzu.zzaa();
    }

    protected void zzaa() {
    }

    protected final void zzac() {
        if(!this.zzaf()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzad() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        if(!this.zzh()) {
            this.zzu.zzz();
            this.zza = true;
        }
    }

    public final void zzae() {
        if(this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        }
        this.zzaa();
        this.zzu.zzz();
        this.zza = true;
    }

    final boolean zzaf() {
        return this.zza;
    }

    protected abstract boolean zzh();
}

