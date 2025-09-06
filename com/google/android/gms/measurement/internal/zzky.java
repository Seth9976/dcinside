package com.google.android.gms.measurement.internal;

final class zzky implements Runnable {
    private final zzax zza;
    private final zzjq zzb;

    zzky(zzjq zzjq0, zzax zzax0) {
        this.zza = zzax0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        if(this.zzb.zzk().zza(this.zza)) {
            this.zzb.zzj().zzp().zza("Setting DMA consent(FE)", this.zza);
            if(this.zzb.zzo().zzao()) {
                this.zzb.zzo().zzaj();
                return;
            }
            this.zzb.zzo().zza(false);
            return;
        }
        this.zzb.zzj().zzo().zza("Lower precedence consent source ignored, proposed source", this.zza.zza());
    }
}

