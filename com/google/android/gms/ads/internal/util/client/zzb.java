package com.google.android.gms.ads.internal.util.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzb {
    public static final ThreadPoolExecutor zza;
    public static final ExecutorService zzb;

    static {
        zzb.zza = new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zza("ClientDefault"));
        zzb.zzb = Executors.newSingleThreadExecutor(new zza("ClientSingle"));
    }
}

