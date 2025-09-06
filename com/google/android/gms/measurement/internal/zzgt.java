package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

@WorkerThread
final class zzgt implements Runnable {
    private final zzgu zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    private zzgt(String s, zzgu zzgu0, int v, Throwable throwable0, byte[] arr_b, Map map0) {
        Preconditions.checkNotNull(zzgu0);
        this.zza = zzgu0;
        this.zzb = v;
        this.zzc = throwable0;
        this.zzd = arr_b;
        this.zze = s;
        this.zzf = map0;
    }

    zzgt(String s, zzgu zzgu0, int v, Throwable throwable0, byte[] arr_b, Map map0, zzgv zzgv0) {
        this(s, zzgu0, v, throwable0, arr_b, map0);
    }

    @Override
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}

