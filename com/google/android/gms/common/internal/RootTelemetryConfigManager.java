package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class RootTelemetryConfigManager {
    @Nullable
    private static RootTelemetryConfigManager zza;
    private static final RootTelemetryConfiguration zzb;
    @Nullable
    private RootTelemetryConfiguration zzc;

    static {
        RootTelemetryConfigManager.zzb = new RootTelemetryConfiguration(0, false, false, 0, 0);
    }

    @Nullable
    @KeepForSdk
    public RootTelemetryConfiguration getConfig() {
        return this.zzc;
    }

    @NonNull
    @KeepForSdk
    public static RootTelemetryConfigManager getInstance() {
        synchronized(RootTelemetryConfigManager.class) {
            if(RootTelemetryConfigManager.zza == null) {
                RootTelemetryConfigManager.zza = new RootTelemetryConfigManager();
            }
            return RootTelemetryConfigManager.zza;
        }
    }

    @VisibleForTesting
    public final void zza(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration0) {
        synchronized(this) {
            if(rootTelemetryConfiguration0 == null) {
                this.zzc = RootTelemetryConfigManager.zzb;
                return;
            }
            if(this.zzc != null && this.zzc.getVersion() >= rootTelemetryConfiguration0.getVersion()) {
                return;
            }
            this.zzc = rootTelemetryConfiguration0;
        }
    }
}

