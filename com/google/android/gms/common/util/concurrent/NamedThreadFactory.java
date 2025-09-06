package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
public class NamedThreadFactory implements ThreadFactory {
    private final String zza;
    private final ThreadFactory zzb;

    @KeepForSdk
    public NamedThreadFactory(@NonNull String s) {
        this.zzb = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(s, "Name must not be null");
        this.zza = s;
    }

    @Override
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable0) {
        zza zza0 = new zza(runnable0, 0);
        Thread thread0 = this.zzb.newThread(zza0);
        thread0.setName(this.zza);
        return thread0;
    }
}

