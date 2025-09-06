package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzbzw {
    public static final zzgcs zza;
    public static final zzgcs zzb;
    public static final zzgcs zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgct zze;
    public static final zzgcs zzf;
    public static final zzgcs zzg;

    static {
        ExecutorService executorService0;
        if(zzbe.zzc().zzb(zzbcl.zzlf) == null || !((Boolean)zzbe.zzc().zzb(zzbcl.zzlf)).booleanValue()) {
            executorService0 = new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs("Default"));
        }
        else {
            zzbcc zzbcc0 = zzbcl.zzlg;
            if(zzbe.zzc().zzb(zzbcc0) == null) {
                executorService0 = new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs("Default"));
            }
            else {
                zzbcc zzbcc1 = zzbcl.zzlh;
                if(zzbe.zzc().zzb(zzbcc1) == null) {
                    executorService0 = new ThreadPoolExecutor(2, 0x7FFFFFFF, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs("Default"));
                }
                else {
                    ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(((int)(((Integer)zzbe.zzc().zzb(zzbcc0)))), ((int)(((Integer)zzbe.zzc().zzb(zzbcc0)))), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Default"));
                    threadPoolExecutor0.allowCoreThreadTimeOut(((Boolean)zzbe.zzc().zzb(zzbcc1)).booleanValue());
                    executorService0 = threadPoolExecutor0;
                }
            }
        }
        zzbzw.zza = new zzbzu(executorService0, null);
        ExecutorService executorService1 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Loader"));
        ((ThreadPoolExecutor)executorService1).allowCoreThreadTimeOut(true);
        zzbzw.zzb = new zzbzu(executorService1, null);
        ExecutorService executorService2 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Activeview"));
        ((ThreadPoolExecutor)executorService2).allowCoreThreadTimeOut(true);
        zzbzw.zzc = new zzbzu(executorService2, null);
        zzbzr zzbzr0 = new zzbzr(3, new zzbzs("Schedule"));
        zzbzw.zzd = zzbzr0;
        zzbzw.zze = zzgcz.zzb(zzbzr0);
        zzbzw.zzf = new zzbzu(new zzbzt(), null);
        zzbzw.zzg = new zzbzu(zzgcz.zzc(), null);
    }
}

