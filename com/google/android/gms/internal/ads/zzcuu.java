package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;

public final class zzcuu implements Callable {
    public final zzcuw zza;
    public final t0 zzb;
    public final Bundle zzc;

    public zzcuu(zzcuw zzcuw0, t0 t00, Bundle bundle0) {
        this.zza = zzcuw0;
        this.zzb = t00;
        this.zzc = bundle0;
    }

    @Override
    public final Object call() {
        return this.zza.zza(this.zzb, this.zzc);
    }
}

