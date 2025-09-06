package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import w4.d;

public final class zzhv extends zzjd {
    private static final AtomicLong zza;
    @Nullable
    private zzhz zzb;
    @Nullable
    private zzhz zzc;
    private final PriorityBlockingQueue zzd;
    private final BlockingQueue zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    static {
        zzhv.zza = new AtomicLong(0x8000000000000000L);
    }

    zzhv(zzhy zzhy0) {
        super(zzhy0);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzhx(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzhx(this, "Thread death: Uncaught exception on network thread");
    }

    static void zza(zzhv zzhv0, zzhz zzhz0) {
        zzhv0.zzc = null;
    }

    private final void zza(zzhw zzhw0) {
        synchronized(this.zzh) {
            this.zzd.add(zzhw0);
            zzhz zzhz0 = this.zzb;
            if(zzhz0 == null) {
                zzhz zzhz1 = new zzhz(this, "Measurement Worker", this.zzd);
                this.zzb = zzhz1;
                zzhz1.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            }
            else {
                zzhz0.zza();
            }
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Context zza() {
        return super.zza();
    }

    @Nullable
    final Object zza(AtomicReference atomicReference0, long v, String s, Runnable runnable0) {
        synchronized(atomicReference0) {
            this.zzl().zzb(runnable0);
            try {
                atomicReference0.wait(v);
            }
            catch(InterruptedException unused_ex) {
                this.zzj().zzu().zza("Interrupted waiting for " + s);
                return null;
            }
        }
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            this.zzj().zzu().zza("Timed out waiting for " + s);
        }
        return object0;
    }

    public final Future zza(Callable callable0) throws IllegalStateException {
        this.zzac();
        Preconditions.checkNotNull(callable0);
        Future future0 = new zzhw(this, callable0, false, "Task exception on worker thread");
        if(Thread.currentThread() == this.zzb) {
            if(!this.zzd.isEmpty()) {
                this.zzj().zzu().zza("Callable skipped the worker queue.");
            }
            ((FutureTask)future0).run();
            return future0;
        }
        this.zza(((zzhw)future0));
        return future0;
    }

    public final void zza(Runnable runnable0) throws IllegalStateException {
        this.zzac();
        Preconditions.checkNotNull(runnable0);
        zzhw zzhw0 = new zzhw(this, runnable0, false, "Task exception on network thread");
        synchronized(this.zzh) {
            this.zze.add(zzhw0);
            zzhz zzhz0 = this.zzc;
            if(zzhz0 == null) {
                zzhz zzhz1 = new zzhz(this, "Measurement Network", this.zze);
                this.zzc = zzhz1;
                zzhz1.setUncaughtExceptionHandler(this.zzg);
                this.zzc.start();
            }
            else {
                zzhz0.zza();
            }
        }
    }

    static void zzb(zzhv zzhv0, zzhz zzhz0) {
        zzhv0.zzb = null;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final Clock zzb() {
        return super.zzb();
    }

    public final Future zzb(Callable callable0) throws IllegalStateException {
        this.zzac();
        Preconditions.checkNotNull(callable0);
        Future future0 = new zzhw(this, callable0, true, "Task exception on worker thread");
        if(Thread.currentThread() == this.zzb) {
            ((FutureTask)future0).run();
            return future0;
        }
        this.zza(((zzhw)future0));
        return future0;
    }

    public final void zzb(Runnable runnable0) throws IllegalStateException {
        this.zzac();
        Preconditions.checkNotNull(runnable0);
        this.zza(new zzhw(this, runnable0, false, "Task exception on worker thread"));
    }

    public final void zzc(Runnable runnable0) throws IllegalStateException {
        this.zzac();
        Preconditions.checkNotNull(runnable0);
        this.zza(new zzhw(this, runnable0, true, "Task exception on worker thread"));
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzab zzd() {
        return super.zzd();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzag zze() {
        return super.zze();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzaz zzf() {
        return super.zzf();
    }

    public final boolean zzg() {
        return Thread.currentThread() == this.zzb;
    }

    @Override  // com.google.android.gms.measurement.internal.zzjd
    protected final boolean zzh() {
        return false;
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgh zzi() {
        return super.zzi();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzgo zzj() {
        return super.zzj();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzha zzk() {
        return super.zzk();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzhv zzl() {
        return super.zzl();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    @d
    public final zzos zzq() {
        return super.zzq();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzr() {
        if(Thread.currentThread() != this.zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzs() {
        super.zzs();
    }

    @Override  // com.google.android.gms.measurement.internal.zzja
    public final void zzt() {
        if(Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }
}

