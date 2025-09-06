package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

final class zzog implements Callable {
    private final zzo zza;
    private final zznv zzb;

    zzog(zznv zznv0, zzo zzo0) {
        this.zza = zzo0;
        this.zzb = zznv0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        String s = (String)Preconditions.checkNotNull(this.zza.zza);
        if(this.zzb.zzb(s).zzh() && zzje.zzb(this.zza.zzt).zzh()) {
            zzg zzg0 = this.zzb.zza(this.zza);
            if(zzg0 == null) {
                this.zzb.zzj().zzu().zza("App info was null when attempting to get app instance id");
                return null;
            }
            return zzg0.zzad();
        }
        this.zzb.zzj().zzp().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

