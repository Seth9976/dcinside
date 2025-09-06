package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzgch extends zzgcj {
    public static zzgcf zza(Iterable iterable0) {
        return new zzgcf(false, zzfxn.zzk(iterable0), null);
    }

    public static zzgcf zzb(Iterable iterable0) {
        return new zzgcf(true, zzfxn.zzk(iterable0), null);
    }

    @SafeVarargs
    public static zzgcf zzc(t0[] arr_t0) {
        return new zzgcf(true, zzfxn.zzm(arr_t0), null);
    }

    public static t0 zzd(Iterable iterable0) {
        return new zzgbp(zzfxn.zzk(iterable0), true);
    }

    public static t0 zze(t0 t00, Class class0, zzfuc zzfuc0, Executor executor0) {
        t0 t01 = new zzgav(t00, class0, zzfuc0);
        t00.addListener(((Runnable)t01), zzgcz.zzd(executor0, ((zzgax)t01)));
        return t01;
    }

    public static t0 zzf(t0 t00, Class class0, zzgbo zzgbo0, Executor executor0) {
        t0 t01 = new zzgau(t00, class0, zzgbo0);
        t00.addListener(((Runnable)t01), zzgcz.zzd(executor0, ((zzgax)t01)));
        return t01;
    }

    public static t0 zzg(Throwable throwable0) {
        throwable0.getClass();
        return new zzgck(throwable0);
    }

    public static t0 zzh(Object object0) {
        return object0 == null ? zzgcl.zza : new zzgcl(object0);
    }

    public static t0 zzi() {
        return zzgcl.zza;
    }

    public static t0 zzj(Callable callable0, Executor executor0) {
        t0 t00 = new zzgdi(callable0);
        executor0.execute(((Runnable)t00));
        return t00;
    }

    public static t0 zzk(zzgbn zzgbn0, Executor executor0) {
        t0 t00 = new zzgdi(zzgbn0);
        executor0.execute(((Runnable)t00));
        return t00;
    }

    @SafeVarargs
    public static t0 zzl(t0[] arr_t0) {
        return new zzgbp(zzfxn.zzm(arr_t0), false);
    }

    public static t0 zzm(t0 t00, zzfuc zzfuc0, Executor executor0) {
        t0 t01 = new zzgbd(t00, zzfuc0);
        t00.addListener(((Runnable)t01), zzgcz.zzd(executor0, ((zzgax)t01)));
        return t01;
    }

    public static t0 zzn(t0 t00, zzgbo zzgbo0, Executor executor0) {
        executor0.getClass();
        t0 t01 = new zzgbc(t00, zzgbo0);
        t00.addListener(((Runnable)t01), zzgcz.zzd(executor0, ((zzgax)t01)));
        return t01;
    }

    // 去混淆评级： 低(20)
    public static t0 zzo(t0 t00, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        return t00.isDone() ? t00 : zzgdf.zzf(t00, v, timeUnit0, scheduledExecutorService0);
    }

    public static Object zzp(Future future0) throws ExecutionException {
        if(!future0.isDone()) {
            throw new IllegalStateException(zzfve.zzb("Future was expected to be done: %s", new Object[]{future0}));
        }
        return zzgdk.zza(future0);
    }

    public static Object zzq(Future future0) {
        try {
            return zzgdk.zza(future0);
        }
        catch(ExecutionException executionException0) {
            if(executionException0.getCause() instanceof Error) {
                throw new zzgbw(((Error)executionException0.getCause()));
            }
            throw new zzgdj(executionException0.getCause());
        }
    }

    public static void zzr(t0 t00, zzgcd zzgcd0, Executor executor0) {
        zzgcd0.getClass();
        t00.addListener(new zzgce(t00, zzgcd0), executor0);
    }
}

