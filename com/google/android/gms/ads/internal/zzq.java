package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzava;
import java.util.concurrent.Callable;

final class zzq implements Callable {
    final zzu zza;

    zzq(zzu zzu0) {
        this.zza = zzu0;
        super();
    }

    @Override
    public final Object call() throws Exception {
        String s = this.zza.zza.afmaVersion;
        return new zzava(zzauz.zzu(this.zza.zzd, new zzaux(s, false)));
    }
}

