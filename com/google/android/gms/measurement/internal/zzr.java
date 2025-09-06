package com.google.android.gms.measurement.internal;

import j..util.Objects;

public final class zzr implements Runnable {
    private zzhy zza;

    public zzr(zzhy zzhy0) {
        this.zza = zzhy0;
    }

    @Override
    public final void run() {
        zzhy zzhy0 = this.zza;
        if(!zzhy0.zzt().zzw()) {
            zzhy0.zzj().zzu().zza("registerTrigger called but app not eligible");
            return;
        }
        zzjq zzjq0 = zzhy0.zzp();
        Objects.requireNonNull(zzjq0);
        new Thread(new zzs(zzjq0)).start();
    }
}

