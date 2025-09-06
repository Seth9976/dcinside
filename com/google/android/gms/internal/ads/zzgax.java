package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.a;

public abstract class zzgax extends zzgdl implements t0 {
    @a
    private volatile zzgax.zzd listeners;
    @a
    private volatile Object value;
    @a
    private volatile zzgax.zzk waiters;
    private static final Object zzbd;
    private static final zzgax.zza zzbg;
    static final boolean zzd;
    static final zzgcq zze;

    static {
        Throwable throwable1;
        Throwable throwable0;
        zzgax.zzj zzgax$zzj0;
        Class class0 = zzgax.zzk.class;
        zzgax.zzd = false;
        Class class1 = zzgax.class;
        zzgax.zze = new zzgcq(class1);
        try {
            zzgax$zzj0 = new zzgax.zzj(null);
            throwable0 = null;
            throwable1 = null;
        }
        catch(Exception | Error exception0) {
            try {
                throwable1 = null;
                throwable0 = exception0;
                zzgax$zzj0 = new zzgax.zze(AtomicReferenceFieldUpdater.newUpdater(class0, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(class0, class0, "next"), AtomicReferenceFieldUpdater.newUpdater(class1, class0, "waiters"), AtomicReferenceFieldUpdater.newUpdater(class1, zzgax.zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(class1, Object.class, "value"));
            }
            catch(Exception | Error exception1) {
                throwable1 = exception1;
                throwable0 = exception0;
                zzgax$zzj0 = new zzgax.zzg(null);
            }
        }
        zzgax.zzbg = zzgax$zzj0;
        if(throwable1 != null) {
            Logger logger0 = zzgax.zze.zza();
            Level level0 = Level.SEVERE;
            logger0.logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", throwable0);
            zzgax.zze.zza().logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", throwable1);
        }
        zzgax.zzbd = new Object();
    }

    @Override  // com.google.common.util.concurrent.t0
    public void addListener(Runnable runnable0, Executor executor0) {
        zzfun.zzc(runnable0, "Runnable was null.");
        zzfun.zzc(executor0, "Executor was null.");
        if(!this.isDone()) {
            zzgax.zzd zzgax$zzd0 = this.listeners;
            if(zzgax$zzd0 != zzgax.zzd.zza) {
                zzgax.zzd zzgax$zzd1 = new zzgax.zzd(runnable0, executor0);
                while(true) {
                    zzgax$zzd1.next = zzgax$zzd0;
                    if(zzgax.zzbg.zze(this, zzgax$zzd0, zzgax$zzd1)) {
                        return;
                    }
                    zzgax$zzd0 = this.listeners;
                    if(zzgax$zzd0 == zzgax.zzd.zza) {
                        break;
                    }
                }
            }
        }
        zzgax.zzy(runnable0, executor0);
    }

    @Override
    public boolean cancel(boolean z) {
        zzgax.zzb zzgax$zzb0;
        Object object0 = this.value;
        if((object0 instanceof zzgax.zzf | object0 == null) != 0) {
            if(zzgax.zzd) {
                zzgax$zzb0 = new zzgax.zzb(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                zzgax$zzb0 = z ? zzgax.zzb.zza : zzgax.zzb.zzb;
                Objects.requireNonNull(zzgax$zzb0);
            }
            boolean z1 = false;
            zzgax zzgax0 = this;
            while(true) {
                if(zzgax.zzbg.zzf(zzgax0, object0, zzgax$zzb0)) {
                    zzgax.zzx(zzgax0, z);
                    if(object0 instanceof zzgax.zzf) {
                        t0 t00 = ((zzgax.zzf)object0).zzb;
                        if(!(t00 instanceof zzgax.zzh)) {
                            t00.cancel(z);
                            return true;
                        }
                        zzgax0 = (zzgax)t00;
                        object0 = zzgax0.value;
                        if((object0 == null | object0 instanceof zzgax.zzf) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = zzgax0.value;
                if(!(object0 instanceof zzgax.zzf)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.value;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof zzgax.zzf)) != 0) {
            return zzgax.zzA(object0);
        }
        zzgax.zzk zzgax$zzk0 = this.waiters;
        if(zzgax$zzk0 != zzgax.zzk.zza) {
            zzgax.zzk zzgax$zzk1 = new zzgax.zzk();
            while(true) {
                zzgax.zzbg.zzc(zzgax$zzk1, zzgax$zzk0);
                if(zzgax.zzbg.zzg(this, zzgax$zzk0, zzgax$zzk1)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.value;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof zzgax.zzf)) != 0) {
                            return zzgax.zzA(object1);
                        }
                    }
                    this.zzz(zzgax$zzk1);
                    throw new InterruptedException();
                }
                zzgax$zzk0 = this.waiters;
                if(zzgax$zzk0 == zzgax.zzk.zza) {
                    break;
                }
            }
        }
        Object object2 = this.value;
        Objects.requireNonNull(object2);
        return zzgax.zzA(object2);
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.value;
        boolean z = true;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof zzgax.zzf)) != 0) {
            return zzgax.zzA(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            zzgax.zzk zzgax$zzk0 = this.waiters;
            if(zzgax$zzk0 != zzgax.zzk.zza) {
                zzgax.zzk zzgax$zzk1 = new zzgax.zzk();
                while(true) {
                    zzgax.zzbg.zzc(zzgax$zzk1, zzgax$zzk0);
                    if(zzgax.zzbg.zzg(this, zzgax$zzk0, zzgax$zzk1)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(v1, 0x1DCD64FFFFFFFFFFL));
                            if(Thread.interrupted()) {
                                this.zzz(zzgax$zzk1);
                                throw new InterruptedException();
                            }
                            Object object1 = this.value;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof zzgax.zzf)) != 0) {
                                return zzgax.zzA(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.zzz(zzgax$zzk1);
                        goto label_29;
                    }
                    zzgax$zzk0 = this.waiters;
                    if(zzgax$zzk0 == zzgax.zzk.zza) {
                        break;
                    }
                }
            }
            Object object2 = this.value;
            Objects.requireNonNull(object2);
            return zzgax.zzA(object2);
        }
    label_29:
        while(v1 > 0L) {
            Object object3 = this.value;
            if(((object3 == null ? 0 : 1) & !(object3 instanceof zzgax.zzf)) != 0) {
                return zzgax.zzA(object3);
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            v1 = v2 - System.nanoTime();
        }
        Locale locale0 = Locale.ROOT;
        String s = timeUnit0.toString().toLowerCase(locale0);
        String s1 = "Waited " + v + " " + timeUnit0.toString().toLowerCase(locale0);
        if(v1 + 1000L < 0L) {
            String s2 = s1 + " (plus ";
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            int v5 = Long.compare(v3, 0L);
            if(v5 != 0 && v4 <= 1000L) {
                z = false;
            }
            if(v5 > 0) {
                s2 = (z ? s2 + v3 + " " + s + "," : s2 + v3 + " " + s) + " ";
            }
            if(z) {
                s2 = s2 + v4 + " nanoseconds ";
            }
            s1 = s2 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s1 + " but future completed as timeout expired") : new TimeoutException(s1 + " for " + "com.google.android.gms.internal.ads.zzgax@4252a44f[status=PENDING]");
    }

    @Override
    public boolean isCancelled() {
        return this.value instanceof zzgax.zzb;
    }

    @Override
    public boolean isDone() {
        return this.value == null ? 0 : 1 & !(this.value instanceof zzgax.zzf);
    }

    @Override
    public String toString() [...] // 潜在的解密器

    private static final Object zzA(Object object0) throws ExecutionException {
        if(!(object0 instanceof zzgax.zzb)) {
            if(object0 instanceof zzgax.zzc) {
                throw new ExecutionException(((zzgax.zzc)object0).zzb);
            }
            return object0 == zzgax.zzbd ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((zzgax.zzb)object0).zzd);
        throw cancellationException0;
    }

    // 去混淆评级： 低(20)
    @a
    protected String zza() {
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    protected void zzb() {
    }

    protected boolean zzc(Object object0) {
        if(object0 == null) {
            object0 = zzgax.zzbd;
        }
        if(zzgax.zzbg.zzf(this, null, object0)) {
            zzgax.zzx(this, false);
            return true;
        }
        return false;
    }

    protected boolean zzd(Throwable throwable0) {
        throwable0.getClass();
        zzgax.zzc zzgax$zzc0 = new zzgax.zzc(throwable0);
        if(zzgax.zzbg.zzf(this, null, zzgax$zzc0)) {
            zzgax.zzx(this, false);
            return true;
        }
        return false;
    }

    private static Object zze(t0 t00) {
        if(t00 instanceof zzgax.zzh) {
            zzgax.zzb zzgax$zzb0 = ((zzgax)t00).value;
            if(zzgax$zzb0 instanceof zzgax.zzb && zzgax$zzb0.zzc) {
                zzgax$zzb0 = zzgax$zzb0.zzd == null ? zzgax.zzb.zzb : new zzgax.zzb(false, zzgax$zzb0.zzd);
            }
            Objects.requireNonNull(zzgax$zzb0);
            return zzgax$zzb0;
        }
        if(t00 instanceof zzgdl) {
            Throwable throwable0 = ((zzgdl)t00).zzl();
            if(throwable0 != null) {
                return new zzgax.zzc(throwable0);
            }
        }
        boolean z = t00.isCancelled();
        if((!zzgax.zzd & z) != 0) {
            Objects.requireNonNull(zzgax.zzb.zzb);
            return zzgax.zzb.zzb;
        }
        try {
            Object object0 = zzgax.zzf(t00);
            if(z) {
                return new zzgax.zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + t00));
            }
            return object0 == null ? zzgax.zzbd : object0;
        }
        catch(ExecutionException executionException0) {
            return z ? new zzgax.zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + t00, executionException0)) : new zzgax.zzc(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new zzgax.zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + t00, cancellationException0)) : new zzgax.zzb(false, cancellationException0);
        }
        catch(Exception exception0) {
            return new zzgax.zzc(exception0);
        }
        catch(Error exception0) {
            return new zzgax.zzc(exception0);
        }
        return new zzgax.zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + t00, executionException0));
    }

    private static Object zzf(Future future0) throws ExecutionException {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = future0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgdl
    @a
    protected final Throwable zzl() {
        if(this instanceof zzgax.zzh) {
            return this.value instanceof zzgax.zzc ? ((zzgax.zzc)this.value).zzb : null;
        }
        return null;
    }

    static void zzp(zzgax zzgax0, boolean z) {
        zzgax.zzx(zzgax0, false);
    }

    protected void zzq() {
    }

    final void zzr(@a Future future0) {
        if((future0 != null & this.isCancelled()) != 0) {
            future0.cancel(this.zzt());
        }
    }

    protected final boolean zzs(t0 t00) {
        zzgax.zzc zzgax$zzc0;
        t00.getClass();
        Object object0 = this.value;
        if(object0 == null) {
            if(t00.isDone()) {
                Object object1 = zzgax.zze(t00);
                if(zzgax.zzbg.zzf(this, null, object1)) {
                    zzgax.zzx(this, false);
                    return true;
                }
                return false;
            }
            zzgax.zzf zzgax$zzf0 = new zzgax.zzf(this, t00);
            if(zzgax.zzbg.zzf(this, null, zzgax$zzf0)) {
                try {
                    t00.addListener(zzgax$zzf0, zzgbv.zza);
                }
                catch(Throwable throwable0) {
                    try {
                        zzgax$zzc0 = new zzgax.zzc(throwable0);
                    }
                    catch(Exception | Error unused_ex) {
                        zzgax$zzc0 = zzgax.zzc.zza;
                    }
                    zzgax.zzbg.zzf(this, zzgax$zzf0, zzgax$zzc0);
                }
                return true;
            }
            object0 = this.value;
        }
        if(object0 instanceof zzgax.zzb) {
            t00.cancel(((zzgax.zzb)object0).zzc);
        }
        return false;
    }

    // 去混淆评级： 低(20)
    protected final boolean zzt() {
        return this.value instanceof zzgax.zzb && ((zzgax.zzb)this.value).zzc;
    }

    private final void zzu(StringBuilder stringBuilder0) {
        try {
            Object object0 = zzgax.zzf(this);
            stringBuilder0.append("SUCCESS, result=[");
            if(object0 == null) {
                stringBuilder0.append("null");
            }
            else if(object0 == this) {
                stringBuilder0.append("this future");
            }
            else {
                stringBuilder0.append(object0.getClass().getName());
                stringBuilder0.append("@");
                stringBuilder0.append(Integer.toHexString(System.identityHashCode(object0)));
            }
            stringBuilder0.append("]");
            return;
        }
        catch(ExecutionException executionException0) {
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
            return;
        }
        catch(Exception exception0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(exception0.getClass());
            stringBuilder0.append(" thrown from get()]");
            return;
        }
        stringBuilder0.append("FAILURE, cause=[");
        stringBuilder0.append(executionException0.getCause());
        stringBuilder0.append("]");
    }

    private final void zzv(StringBuilder stringBuilder0) {
        String s;
        int v = stringBuilder0.length();
        stringBuilder0.append("PENDING");
        Object object0 = this.value;
        if(object0 instanceof zzgax.zzf) {
            stringBuilder0.append(", setFuture=[");
            this.zzw(stringBuilder0, ((zzgax.zzf)object0).zzb);
            stringBuilder0.append("]");
        }
        else {
            try {
                s = zzfve.zza(this.zza());
            }
            catch(Exception | StackOverflowError exception0) {
                s = "Exception thrown from implementation: " + exception0.getClass();
            }
            if(s != null) {
                stringBuilder0.append(", info=[");
                stringBuilder0.append(s);
                stringBuilder0.append("]");
            }
        }
        if(this.isDone()) {
            stringBuilder0.delete(v, stringBuilder0.length());
            this.zzu(stringBuilder0);
        }
    }

    private final void zzw(StringBuilder stringBuilder0, @a Object object0) {
        try {
            if(object0 == this) {
                stringBuilder0.append("this future");
                return;
            }
            stringBuilder0.append(object0);
            return;
        }
        catch(Exception | StackOverflowError exception0) {
        }
        stringBuilder0.append("Exception thrown from implementation: ");
        stringBuilder0.append(exception0.getClass());
    }

    private static void zzx(zzgax zzgax0, boolean z) {
        Runnable runnable0;
        zzgax.zzd zzgax$zzd2;
        zzgax.zzd zzgax$zzd0 = null;
        while(true) {
            for(zzgax.zzk zzgax$zzk0 = zzgax.zzbg.zzb(zzgax0, zzgax.zzk.zza); zzgax$zzk0 != null; zzgax$zzk0 = zzgax$zzk0.next) {
                Thread thread0 = zzgax$zzk0.thread;
                if(thread0 != null) {
                    zzgax$zzk0.thread = null;
                    LockSupport.unpark(thread0);
                }
            }
            if(z) {
                zzgax0.zzq();
            }
            zzgax0.zzb();
            zzgax.zzd zzgax$zzd1 = zzgax.zzbg.zza(zzgax0, zzgax.zzd.zza);
            zzgax$zzd2 = zzgax$zzd0;
            while(zzgax$zzd1 != null) {
                zzgax.zzd zzgax$zzd3 = zzgax$zzd1.next;
                zzgax$zzd1.next = zzgax$zzd2;
                zzgax$zzd2 = zzgax$zzd1;
                zzgax$zzd1 = zzgax$zzd3;
            }
        label_20:
            if(zzgax$zzd2 != null) {
                zzgax$zzd0 = zzgax$zzd2.next;
                Objects.requireNonNull(zzgax$zzd2.zzb);
                runnable0 = zzgax$zzd2.zzb;
                if(runnable0 instanceof zzgax.zzf) {
                    zzgax0 = ((zzgax.zzf)runnable0).zza;
                    if(zzgax0.value == ((zzgax.zzf)runnable0)) {
                        Object object0 = zzgax.zze(((zzgax.zzf)runnable0).zzb);
                        if(zzgax.zzbg.zzf(zzgax0, ((zzgax.zzf)runnable0), object0)) {
                            z = false;
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                zzgax$zzd2 = zzgax$zzd0;
                goto label_20;
            }
            return;
        }
        Objects.requireNonNull(zzgax$zzd2.zzc);
        zzgax.zzy(runnable0, zzgax$zzd2.zzc);
        zzgax$zzd2 = zzgax$zzd0;
        goto label_20;
    }

    private static void zzy(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(Exception exception0) {
            zzgax.zze.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, exception0);
        }
    }

    private final void zzz(zzgax.zzk zzgax$zzk0) {
        zzgax$zzk0.thread = null;
    alab1:
        zzgax.zzk zzgax$zzk1;
        while((zzgax$zzk1 = this.waiters) != zzgax.zzk.zza) {
            zzgax.zzk zzgax$zzk2 = null;
            while(true) {
                if(zzgax$zzk1 == null) {
                    break alab1;
                }
                zzgax.zzk zzgax$zzk3 = zzgax$zzk1.next;
                if(zzgax$zzk1.thread != null) {
                    zzgax$zzk2 = zzgax$zzk1;
                }
                else if(zzgax$zzk2 == null) {
                    if(zzgax.zzbg.zzg(this, zzgax$zzk1, zzgax$zzk3)) {
                        zzgax$zzk1 = zzgax$zzk3;
                        continue;
                    }
                    break;
                }
                else {
                    zzgax$zzk2.next = zzgax$zzk3;
                    if(zzgax$zzk2.thread == null) {
                        break;
                    }
                }
                zzgax$zzk1 = zzgax$zzk3;
            }
        }
    }
}

