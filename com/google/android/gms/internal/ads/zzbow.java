package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbow {
    private static zzbow zza;
    private final AtomicBoolean zzb;

    @VisibleForTesting
    zzbow() {
        this.zzb = new AtomicBoolean(false);
    }

    public static zzbow zza() {
        if(zzbow.zza == null) {
            zzbow.zza = new zzbow();
        }
        return zzbow.zza;
    }

    @Nullable
    public final Thread zzb(Context context0, @Nullable String s) {
        if(!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread0 = new Thread(new zzbov(this, context0, s));
        thread0.start();
        return thread0;
    }
}

