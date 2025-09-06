package com.google.android.gms.internal.measurement;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

public final class zzgl {
    @GuardedBy("GservicesDelegateSupplier.class")
    @Nullable
    private static zzgk zza;

    static {
    }

    public static zzgk zza() {
        synchronized(zzgl.class) {
            if(zzgl.zza == null) {
                zzgl.zza(new zzgn());
            }
            return zzgl.zza;
        }
    }

    private static void zza(zzgk zzgk0) {
        synchronized(zzgl.class) {
            if(zzgl.zza == null) {
                zzgl.zza = zzgk0;
                return;
            }
        }
        throw new IllegalStateException("init() already called");
    }
}

