package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;

final class zzbug implements Thread.UncaughtExceptionHandler {
    final Thread.UncaughtExceptionHandler zza;
    final zzbuh zzb;

    zzbug(zzbuh zzbuh0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        this.zza = thread$UncaughtExceptionHandler0;
        this.zzb = zzbuh0;
        super();
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        try {
            this.zzb.zzg(thread0, throwable0);
        }
        catch(Throwable unused_ex) {
            zzo.zzg("AdMob exception reporter failed reporting the exception.");
        }
        finally {
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.zza;
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
            }
        }
    }
}

