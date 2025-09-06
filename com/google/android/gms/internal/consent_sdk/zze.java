package com.google.android.gms.internal.consent_sdk;

import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public final class zze {
    private final Executor zza;

    zze(Executor executor0) {
        this.zza = executor0;
    }

    @AnyThread
    public final Executor zza() {
        return this.zza;
    }

    @AnyThread
    public final void zzb(@Nullable String s, @Nullable String s1, zzd[] arr_zzd) {
        zzc zzc0 = new zzc(s, s1, arr_zzd);
        this.zza.execute(zzc0);
    }
}

