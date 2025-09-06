package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdg;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzhw extends FutureTask implements Comparable {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final zzhv zzd;

    zzhw(zzhv zzhv0, Runnable runnable0, boolean z, String s) {
        this.zzd = zzhv0;
        super(zzdg.zza().zza(runnable0), null);
        Preconditions.checkNotNull(s);
        long v = zzhv.zza.getAndIncrement();
        this.zzb = v;
        this.zzc = s;
        this.zza = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            zzhv0.zzj().zzg().zza("Tasks index overflow");
        }
    }

    zzhw(zzhv zzhv0, Callable callable0, boolean z, String s) {
        this.zzd = zzhv0;
        super(zzdg.zza().zza(callable0));
        Preconditions.checkNotNull(s);
        long v = zzhv.zza.getAndIncrement();
        this.zzb = v;
        this.zzc = s;
        this.zza = z;
        if(v == 0x7FFFFFFFFFFFFFFFL) {
            zzhv0.zzj().zzg().zza("Tasks index overflow");
        }
    }

    @Override
    public final int compareTo(@NonNull Object object0) {
        boolean z = this.zza;
        if(z != ((zzhw)object0).zza) {
            return z ? -1 : 1;
        }
        long v = this.zzb;
        long v1 = ((zzhw)object0).zzb;
        if(v < v1) {
            return -1;
        }
        if(v > v1) {
            return 1;
        }
        this.zzd.zzj().zzn().zza("Two tasks share the same index. index", this.zzb);
        return 0;
    }

    @Override
    protected final void setException(Throwable throwable0) {
        this.zzd.zzj().zzg().zza(this.zzc, throwable0);
        if(throwable0 instanceof zzhu) {
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), throwable0);
            }
        }
        super.setException(throwable0);
    }
}

