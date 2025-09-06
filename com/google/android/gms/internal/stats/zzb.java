package com.google.android.gms.internal.stats;

import androidx.annotation.Nullable;
import java.io.Closeable;

public final class zzb implements Closeable {
    private static final zzb zza;

    static {
        zzb.zza = new zzb(false, null);
    }

    private zzb(boolean z, @Nullable zzd zzd0) {
    }

    @Override
    public final void close() {
    }

    public static zzb zza(boolean z, @Nullable zzc zzc0) {
        return zzb.zza;
    }
}

