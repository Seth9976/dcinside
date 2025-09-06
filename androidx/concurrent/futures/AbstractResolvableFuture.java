package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.t0;
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

@RestrictTo({Scope.c})
public abstract class AbstractResolvableFuture implements t0 {
    static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        AtomicHelper(androidx.concurrent.futures.AbstractResolvableFuture.1 abstractResolvableFuture$10) {
        }

        abstract boolean a(AbstractResolvableFuture arg1, Listener arg2, Listener arg3);

        abstract boolean b(AbstractResolvableFuture arg1, Object arg2, Object arg3);

        abstract boolean c(AbstractResolvableFuture arg1, Waiter arg2, Waiter arg3);

        abstract void d(Waiter arg1, Waiter arg2);

        abstract void e(Waiter arg1, Thread arg2);
    }

    static final class Cancellation {
        final boolean a;
        @Nullable
        final Throwable b;
        static final Cancellation c;
        static final Cancellation d;

        static {
            if(AbstractResolvableFuture.d) {
                Cancellation.d = null;
                Cancellation.c = null;
                return;
            }
            Cancellation.d = new Cancellation(false, null);
            Cancellation.c = new Cancellation(true, null);
        }

        Cancellation(boolean z, @Nullable Throwable throwable0) {
            this.a = z;
            this.b = throwable0;
        }
    }

    static final class Failure {
        final Throwable a;
        static final Failure b;

        static {
            Failure.b = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
                @Override
                public Throwable fillInStackTrace() {
                    synchronized(this) {
                    }
                    return this;
                }
            });
        }

        Failure(Throwable throwable0) {
            this.a = (Throwable)AbstractResolvableFuture.d(throwable0);
        }
    }

    static final class Listener {
        final Runnable a;
        final Executor b;
        @Nullable
        Listener c;
        static final Listener d;

        static {
            Listener.d = new Listener(null, null);
        }

        Listener(Runnable runnable0, Executor executor0) {
            this.a = runnable0;
            this.b = executor0;
        }
    }

    static final class SafeAtomicHelper extends AtomicHelper {
        final AtomicReferenceFieldUpdater a;
        final AtomicReferenceFieldUpdater b;
        final AtomicReferenceFieldUpdater c;
        final AtomicReferenceFieldUpdater d;
        final AtomicReferenceFieldUpdater e;

        SafeAtomicHelper(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater0, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater1, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4) {
            super(null);
            this.a = atomicReferenceFieldUpdater0;
            this.b = atomicReferenceFieldUpdater1;
            this.c = atomicReferenceFieldUpdater2;
            this.d = atomicReferenceFieldUpdater3;
            this.e = atomicReferenceFieldUpdater4;
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        boolean a(AbstractResolvableFuture abstractResolvableFuture0, Listener abstractResolvableFuture$Listener0, Listener abstractResolvableFuture$Listener1) {
            return a.a(this.d, abstractResolvableFuture0, abstractResolvableFuture$Listener0, abstractResolvableFuture$Listener1);
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        boolean b(AbstractResolvableFuture abstractResolvableFuture0, Object object0, Object object1) {
            return a.a(this.e, abstractResolvableFuture0, object0, object1);
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        boolean c(AbstractResolvableFuture abstractResolvableFuture0, Waiter abstractResolvableFuture$Waiter0, Waiter abstractResolvableFuture$Waiter1) {
            return a.a(this.c, abstractResolvableFuture0, abstractResolvableFuture$Waiter0, abstractResolvableFuture$Waiter1);
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        void d(Waiter abstractResolvableFuture$Waiter0, Waiter abstractResolvableFuture$Waiter1) {
            this.b.lazySet(abstractResolvableFuture$Waiter0, abstractResolvableFuture$Waiter1);
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        void e(Waiter abstractResolvableFuture$Waiter0, Thread thread0) {
            this.a.lazySet(abstractResolvableFuture$Waiter0, thread0);
        }
    }

    static final class SetFuture implements Runnable {
        final AbstractResolvableFuture a;
        final t0 b;

        SetFuture(AbstractResolvableFuture abstractResolvableFuture0, t0 t00) {
            this.a = abstractResolvableFuture0;
            this.b = t00;
        }

        @Override
        public void run() {
            if(this.a.a != this) {
                return;
            }
            Object object0 = AbstractResolvableFuture.i(this.b);
            if(AbstractResolvableFuture.g.b(this.a, this, object0)) {
                AbstractResolvableFuture.f(this.a);
            }
        }
    }

    static final class SynchronizedHelper extends AtomicHelper {
        SynchronizedHelper() {
            super(null);
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        boolean a(AbstractResolvableFuture abstractResolvableFuture0, Listener abstractResolvableFuture$Listener0, Listener abstractResolvableFuture$Listener1) {
            synchronized(abstractResolvableFuture0) {
                if(abstractResolvableFuture0.b == abstractResolvableFuture$Listener0) {
                    abstractResolvableFuture0.b = abstractResolvableFuture$Listener1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        boolean b(AbstractResolvableFuture abstractResolvableFuture0, Object object0, Object object1) {
            synchronized(abstractResolvableFuture0) {
                if(abstractResolvableFuture0.a == object0) {
                    abstractResolvableFuture0.a = object1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        boolean c(AbstractResolvableFuture abstractResolvableFuture0, Waiter abstractResolvableFuture$Waiter0, Waiter abstractResolvableFuture$Waiter1) {
            synchronized(abstractResolvableFuture0) {
                if(abstractResolvableFuture0.c == abstractResolvableFuture$Waiter0) {
                    abstractResolvableFuture0.c = abstractResolvableFuture$Waiter1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        void d(Waiter abstractResolvableFuture$Waiter0, Waiter abstractResolvableFuture$Waiter1) {
            abstractResolvableFuture$Waiter0.b = abstractResolvableFuture$Waiter1;
        }

        @Override  // androidx.concurrent.futures.AbstractResolvableFuture$AtomicHelper
        void e(Waiter abstractResolvableFuture$Waiter0, Thread thread0) {
            abstractResolvableFuture$Waiter0.a = thread0;
        }
    }

    static final class Waiter {
        @Nullable
        volatile Thread a;
        @Nullable
        volatile Waiter b;
        static final Waiter c;

        static {
            Waiter.c = new Waiter(false);
        }

        Waiter() {
            AbstractResolvableFuture.g.e(this, Thread.currentThread());
        }

        Waiter(boolean z) {
        }

        void a(Waiter abstractResolvableFuture$Waiter0) {
            AbstractResolvableFuture.g.d(this, abstractResolvableFuture$Waiter0);
        }

        void b() {
            Thread thread0 = this.a;
            if(thread0 != null) {
                this.a = null;
                LockSupport.unpark(thread0);
            }
        }
    }

    @Nullable
    volatile Object a;
    @Nullable
    volatile Listener b;
    @Nullable
    volatile Waiter c;
    static final boolean d = false;
    private static final Logger e = null;
    private static final long f = 1000L;
    static final AtomicHelper g;
    private static final Object h;

    static {
        SafeAtomicHelper abstractResolvableFuture$SafeAtomicHelper0;
        AbstractResolvableFuture.d = false;
        AbstractResolvableFuture.e = Logger.getLogger("androidx.concurrent.futures.AbstractResolvableFuture");
        try {
            abstractResolvableFuture$SafeAtomicHelper0 = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Waiter.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Listener.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            abstractResolvableFuture$SafeAtomicHelper0 = new SynchronizedHelper();
        }
        AbstractResolvableFuture.g = abstractResolvableFuture$SafeAtomicHelper0;
        if(throwable0 != null) {
            AbstractResolvableFuture.e.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        AbstractResolvableFuture.h = new Object();
    }

    private void a(StringBuilder stringBuilder0) {
        try {
            Object object0 = AbstractResolvableFuture.j(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append(this.u(object0));
            stringBuilder0.append("]");
        }
        catch(ExecutionException executionException0) {
            stringBuilder0.append("FAILURE, cause=[");
            stringBuilder0.append(executionException0.getCause());
            stringBuilder0.append("]");
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
        }
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
        }
    }

    @Override  // com.google.common.util.concurrent.t0
    public final void addListener(Runnable runnable0, Executor executor0) {
        AbstractResolvableFuture.d(runnable0);
        AbstractResolvableFuture.d(executor0);
        Listener abstractResolvableFuture$Listener0 = this.b;
        if(abstractResolvableFuture$Listener0 != Listener.d) {
            Listener abstractResolvableFuture$Listener1 = new Listener(runnable0, executor0);
            while(true) {
                abstractResolvableFuture$Listener1.c = abstractResolvableFuture$Listener0;
                if(AbstractResolvableFuture.g.a(this, abstractResolvableFuture$Listener0, abstractResolvableFuture$Listener1)) {
                    return;
                }
                abstractResolvableFuture$Listener0 = this.b;
                if(abstractResolvableFuture$Listener0 == Listener.d) {
                    break;
                }
            }
        }
        AbstractResolvableFuture.g(runnable0, executor0);
    }

    protected void b() {
    }

    private static CancellationException c(@Nullable String s, @Nullable Throwable throwable0) {
        CancellationException cancellationException0 = new CancellationException(s);
        cancellationException0.initCause(throwable0);
        return cancellationException0;
    }

    @Override
    public final boolean cancel(boolean z) {
        Cancellation abstractResolvableFuture$Cancellation0;
        Object object0 = this.a;
        if((object0 == null | object0 instanceof SetFuture) != 0) {
            if(AbstractResolvableFuture.d) {
                abstractResolvableFuture$Cancellation0 = new Cancellation(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                abstractResolvableFuture$Cancellation0 = z ? Cancellation.c : Cancellation.d;
            }
            boolean z1 = false;
            AbstractResolvableFuture abstractResolvableFuture0 = this;
            while(true) {
                if(AbstractResolvableFuture.g.b(abstractResolvableFuture0, object0, abstractResolvableFuture$Cancellation0)) {
                    AbstractResolvableFuture.f(abstractResolvableFuture0);
                    if(object0 instanceof SetFuture) {
                        t0 t00 = ((SetFuture)object0).b;
                        if(!(t00 instanceof AbstractResolvableFuture)) {
                            t00.cancel(z);
                            return true;
                        }
                        abstractResolvableFuture0 = (AbstractResolvableFuture)t00;
                        object0 = abstractResolvableFuture0.a;
                        if((object0 == null | object0 instanceof SetFuture) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = abstractResolvableFuture0.a;
                if(!(object0 instanceof SetFuture)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    @NonNull
    static Object d(@Nullable Object object0) {
        object0.getClass();
        return object0;
    }

    private Listener e(Listener abstractResolvableFuture$Listener0) {
        do {
            Listener abstractResolvableFuture$Listener1 = this.b;
        }
        while(!AbstractResolvableFuture.g.a(this, abstractResolvableFuture$Listener1, Listener.d));
        Listener abstractResolvableFuture$Listener2 = abstractResolvableFuture$Listener0;
        for(Listener abstractResolvableFuture$Listener3 = abstractResolvableFuture$Listener1; abstractResolvableFuture$Listener3 != null; abstractResolvableFuture$Listener3 = abstractResolvableFuture$Listener4) {
            Listener abstractResolvableFuture$Listener4 = abstractResolvableFuture$Listener3.c;
            abstractResolvableFuture$Listener3.c = abstractResolvableFuture$Listener2;
            abstractResolvableFuture$Listener2 = abstractResolvableFuture$Listener3;
        }
        return abstractResolvableFuture$Listener2;
    }

    static void f(AbstractResolvableFuture abstractResolvableFuture0) {
        Runnable runnable0;
        Listener abstractResolvableFuture$Listener1;
        Listener abstractResolvableFuture$Listener0 = null;
        while(true) {
            abstractResolvableFuture0.n();
            abstractResolvableFuture0.b();
            abstractResolvableFuture$Listener1 = abstractResolvableFuture0.e(abstractResolvableFuture$Listener0);
        label_4:
            if(abstractResolvableFuture$Listener1 == null) {
                return;
            }
            abstractResolvableFuture$Listener0 = abstractResolvableFuture$Listener1.c;
            runnable0 = abstractResolvableFuture$Listener1.a;
            if(!(runnable0 instanceof SetFuture)) {
                break;
            }
            abstractResolvableFuture0 = ((SetFuture)runnable0).a;
            if(abstractResolvableFuture0.a != ((SetFuture)runnable0)) {
                abstractResolvableFuture$Listener1 = abstractResolvableFuture$Listener0;
                goto label_4;
            }
            Object object0 = AbstractResolvableFuture.i(((SetFuture)runnable0).b);
            if(!AbstractResolvableFuture.g.b(abstractResolvableFuture0, ((SetFuture)runnable0), object0)) {
                abstractResolvableFuture$Listener1 = abstractResolvableFuture$Listener0;
                goto label_4;
            }
        }
        AbstractResolvableFuture.g(runnable0, abstractResolvableFuture$Listener1.b);
        abstractResolvableFuture$Listener1 = abstractResolvableFuture$Listener0;
        goto label_4;
    }

    private static void g(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            AbstractResolvableFuture.e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.a;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof SetFuture)) != 0) {
            return this.h(object0);
        }
        Waiter abstractResolvableFuture$Waiter0 = this.c;
        if(abstractResolvableFuture$Waiter0 != Waiter.c) {
            Waiter abstractResolvableFuture$Waiter1 = new Waiter();
            while(true) {
                abstractResolvableFuture$Waiter1.a(abstractResolvableFuture$Waiter0);
                if(AbstractResolvableFuture.g.c(this, abstractResolvableFuture$Waiter0, abstractResolvableFuture$Waiter1)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.a;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof SetFuture)) != 0) {
                            return this.h(object1);
                        }
                    }
                    this.p(abstractResolvableFuture$Waiter1);
                    throw new InterruptedException();
                }
                abstractResolvableFuture$Waiter0 = this.c;
                if(abstractResolvableFuture$Waiter0 == Waiter.c) {
                    break;
                }
            }
        }
        return this.h(this.a);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.a;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof SetFuture)) != 0) {
            return this.h(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            Waiter abstractResolvableFuture$Waiter0 = this.c;
            if(abstractResolvableFuture$Waiter0 != Waiter.c) {
                Waiter abstractResolvableFuture$Waiter1 = new Waiter();
                while(true) {
                    abstractResolvableFuture$Waiter1.a(abstractResolvableFuture$Waiter0);
                    if(AbstractResolvableFuture.g.c(this, abstractResolvableFuture$Waiter0, abstractResolvableFuture$Waiter1)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.p(abstractResolvableFuture$Waiter1);
                                throw new InterruptedException();
                            }
                            Object object1 = this.a;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof SetFuture)) != 0) {
                                return this.h(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.p(abstractResolvableFuture$Waiter1);
                        goto label_26;
                    }
                    abstractResolvableFuture$Waiter0 = this.c;
                    if(abstractResolvableFuture$Waiter0 == Waiter.c) {
                        break;
                    }
                }
            }
            return this.h(this.a);
        }
    label_26:
        while(v1 > 0L) {
            Object object2 = this.a;
            if(((object2 == null ? 0 : 1) & !(object2 instanceof SetFuture)) != 0) {
                return this.h(object2);
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
            boolean z = v5 == 0 || v4 > 1000L;
            if(v5 > 0) {
                s2 = (z ? s2 + v3 + " " + s + "," : s2 + v3 + " " + s) + " ";
            }
            if(z) {
                s2 = s2 + v4 + " nanoseconds ";
            }
            s1 = s2 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s1 + " but future completed as timeout expired") : new TimeoutException(s1 + " for " + "jebdyn.dexdec.irsb.Object_a5e85e71@7be4fa4b[status=PENDING]");
    }

    private Object h(Object object0) throws ExecutionException {
        if(object0 instanceof Cancellation) {
            throw AbstractResolvableFuture.c("Task was cancelled.", ((Cancellation)object0).b);
        }
        if(object0 instanceof Failure) {
            throw new ExecutionException(((Failure)object0).a);
        }
        return object0 == AbstractResolvableFuture.h ? null : object0;
    }

    static Object i(t0 t00) {
        if(t00 instanceof AbstractResolvableFuture) {
            Cancellation abstractResolvableFuture$Cancellation0 = ((AbstractResolvableFuture)t00).a;
            if(abstractResolvableFuture$Cancellation0 instanceof Cancellation && abstractResolvableFuture$Cancellation0.a) {
                return abstractResolvableFuture$Cancellation0.b == null ? Cancellation.d : new Cancellation(false, abstractResolvableFuture$Cancellation0.b);
            }
            return abstractResolvableFuture$Cancellation0;
        }
        boolean z = t00.isCancelled();
        if((!AbstractResolvableFuture.d & z) != 0) {
            return Cancellation.d;
        }
        try {
            Object object0 = AbstractResolvableFuture.j(t00);
            return object0 == null ? AbstractResolvableFuture.h : object0;
        }
        catch(ExecutionException executionException0) {
            return new Failure(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + t00, cancellationException0)) : new Cancellation(false, cancellationException0);
        }
        catch(Throwable throwable0) {
            return new Failure(throwable0);
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.a instanceof Cancellation;
    }

    @Override
    public final boolean isDone() {
        return this.a == null ? 0 : !(this.a instanceof SetFuture) & 1;
    }

    @RestrictTo({Scope.b})
    static Object j(Future future0) throws ExecutionException {
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

    protected void k() {
    }

    final void l(@Nullable Future future0) {
        if((future0 != null & this.isCancelled()) != 0) {
            future0.cancel(this.v());
        }
    }

    @Nullable
    protected String m() {
        Object object0 = this.a;
        if(object0 instanceof SetFuture) {
            return "setFuture=[" + this.u(((SetFuture)object0).b) + "]";
        }
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    private void n() {
        Waiter abstractResolvableFuture$Waiter0;
        do {
            abstractResolvableFuture$Waiter0 = this.c;
        }
        while(!AbstractResolvableFuture.g.c(this, abstractResolvableFuture$Waiter0, Waiter.c));
        while(abstractResolvableFuture$Waiter0 != null) {
            abstractResolvableFuture$Waiter0.b();
            abstractResolvableFuture$Waiter0 = abstractResolvableFuture$Waiter0.b;
        }
    }

    private void p(Waiter abstractResolvableFuture$Waiter0) {
        abstractResolvableFuture$Waiter0.a = null;
    alab1:
        while(true) {
            Waiter abstractResolvableFuture$Waiter1 = this.c;
            if(abstractResolvableFuture$Waiter1 == Waiter.c) {
                return;
            }
            Waiter abstractResolvableFuture$Waiter2 = null;
            while(true) {
                if(abstractResolvableFuture$Waiter1 == null) {
                    break alab1;
                }
                Waiter abstractResolvableFuture$Waiter3 = abstractResolvableFuture$Waiter1.b;
                if(abstractResolvableFuture$Waiter1.a != null) {
                    abstractResolvableFuture$Waiter2 = abstractResolvableFuture$Waiter1;
                }
                else if(abstractResolvableFuture$Waiter2 == null) {
                    if(AbstractResolvableFuture.g.c(this, abstractResolvableFuture$Waiter1, abstractResolvableFuture$Waiter3)) {
                        abstractResolvableFuture$Waiter1 = abstractResolvableFuture$Waiter3;
                        continue;
                    }
                    break;
                }
                else {
                    abstractResolvableFuture$Waiter2.b = abstractResolvableFuture$Waiter3;
                    if(abstractResolvableFuture$Waiter2.a == null) {
                        break;
                    }
                }
                abstractResolvableFuture$Waiter1 = abstractResolvableFuture$Waiter3;
            }
        }
    }

    protected boolean r(@Nullable Object object0) {
        if(object0 == null) {
            object0 = AbstractResolvableFuture.h;
        }
        if(AbstractResolvableFuture.g.b(this, null, object0)) {
            AbstractResolvableFuture.f(this);
            return true;
        }
        return false;
    }

    protected boolean s(Throwable throwable0) {
        Failure abstractResolvableFuture$Failure0 = new Failure(((Throwable)AbstractResolvableFuture.d(throwable0)));
        if(AbstractResolvableFuture.g.b(this, null, abstractResolvableFuture$Failure0)) {
            AbstractResolvableFuture.f(this);
            return true;
        }
        return false;
    }

    protected boolean t(t0 t00) {
        Failure abstractResolvableFuture$Failure0;
        AbstractResolvableFuture.d(t00);
        Object object0 = this.a;
        if(object0 == null) {
            if(t00.isDone()) {
                Object object1 = AbstractResolvableFuture.i(t00);
                if(AbstractResolvableFuture.g.b(this, null, object1)) {
                    AbstractResolvableFuture.f(this);
                    return true;
                }
                return false;
            }
            SetFuture abstractResolvableFuture$SetFuture0 = new SetFuture(this, t00);
            if(AbstractResolvableFuture.g.b(this, null, abstractResolvableFuture$SetFuture0)) {
                try {
                    t00.addListener(abstractResolvableFuture$SetFuture0, DirectExecutor.a);
                }
                catch(Throwable throwable0) {
                    try {
                        abstractResolvableFuture$Failure0 = new Failure(throwable0);
                    }
                    catch(Throwable unused_ex) {
                        abstractResolvableFuture$Failure0 = Failure.b;
                    }
                    AbstractResolvableFuture.g.b(this, abstractResolvableFuture$SetFuture0, abstractResolvableFuture$Failure0);
                }
                return true;
            }
            object0 = this.a;
        }
        if(object0 instanceof Cancellation) {
            t00.cancel(((Cancellation)object0).a);
        }
        return false;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    private String u(Object object0) {
        return object0 == this ? "this future" : String.valueOf(object0);
    }

    // 去混淆评级： 低(20)
    protected final boolean v() {
        return this.a instanceof Cancellation && ((Cancellation)this.a).a;
    }

    class androidx.concurrent.futures.AbstractResolvableFuture.1 {
    }

}

