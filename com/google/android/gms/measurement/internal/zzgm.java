package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import j..time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public final class zzgm {
    private static zzgm zza;
    private static final Duration zzb;
    private final zzhy zzc;
    private final TelemetryLoggingClient zzd;
    private final AtomicLong zze;

    static {
        zzgm.zzb = Duration.ofMinutes(30L);
    }

    private zzgm(Context context0, zzhy zzhy0) {
        this.zze = new AtomicLong(-1L);
        this.zzd = TelemetryLogging.getClient(context0, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzc = zzhy0;
    }

    static zzgm zza(zzhy zzhy0) {
        if(zzgm.zza == null) {
            zzgm.zza = new zzgm(zzhy0.zza(), zzhy0);
        }
        return zzgm.zza;
    }

    public final void zza(int v, int v1, long v2, long v3, int v4) {
        synchronized(this) {
            long v6 = this.zzc.zzb().elapsedRealtime();
            if(this.zze.get() == -1L || v6 - this.zze.get() > zzgm.zzb.toMillis()) {
                TelemetryData telemetryData0 = new TelemetryData(0, Arrays.asList(new MethodInvocation[]{new MethodInvocation(36301, v1, 0, v2, v3, null, null, 0, v4)}));
                this.zzd.log(telemetryData0).addOnFailureListener((Exception exception0) -> this.zze.set(v6));
            }
        }
    }

    // 检测为 Lambda 实现
    final void zza(long v, Exception exception0) [...]
}

