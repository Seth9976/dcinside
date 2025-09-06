package com.google.android.gms.common.util.concurrent;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
public class NumberedThreadFactory implements ThreadFactory {
    private final String zza;
    private final AtomicInteger zzb;
    private final ThreadFactory zzc;

    @KeepForSdk
    public NumberedThreadFactory(@NonNull String s) {
        this.zzb = new AtomicInteger();
        this.zzc = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(s, "Name must not be null");
        this.zza = s;
    }

    @Override
    @NonNull
    public final Thread newThread(@NonNull Runnable runnable0) {
        zza zza0 = new zza(runnable0, 0);
        Thread thread0 = this.zzc.newThread(zza0);
        int v = this.zzb.getAndIncrement();
        thread0.setName(this.zza + "[" + v + "]");
        return thread0;
    }
}

