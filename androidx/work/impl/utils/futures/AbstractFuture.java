package androidx.work.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.a;
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

@RestrictTo({Scope.b})
public abstract class AbstractFuture implements t0 {
    static abstract class AtomicHelper {
        private AtomicHelper() {
        }

        AtomicHelper(androidx.work.impl.utils.futures.AbstractFuture.1 abstractFuture$10) {
        }

        abstract boolean a(AbstractFuture arg1, Listener arg2, Listener arg3);

        abstract boolean b(AbstractFuture arg1, Object arg2, Object arg3);

        abstract boolean c(AbstractFuture arg1, Waiter arg2, Waiter arg3);

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
            if(AbstractFuture.d) {
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
            this.a = (Throwable)AbstractFuture.d(throwable0);
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

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        boolean a(AbstractFuture abstractFuture0, Listener abstractFuture$Listener0, Listener abstractFuture$Listener1) {
            return a.a(this.d, abstractFuture0, abstractFuture$Listener0, abstractFuture$Listener1);
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        boolean b(AbstractFuture abstractFuture0, Object object0, Object object1) {
            return a.a(this.e, abstractFuture0, object0, object1);
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        boolean c(AbstractFuture abstractFuture0, Waiter abstractFuture$Waiter0, Waiter abstractFuture$Waiter1) {
            return a.a(this.c, abstractFuture0, abstractFuture$Waiter0, abstractFuture$Waiter1);
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        void d(Waiter abstractFuture$Waiter0, Waiter abstractFuture$Waiter1) {
            this.b.lazySet(abstractFuture$Waiter0, abstractFuture$Waiter1);
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        void e(Waiter abstractFuture$Waiter0, Thread thread0) {
            this.a.lazySet(abstractFuture$Waiter0, thread0);
        }
    }

    static final class SetFuture implements Runnable {
        final AbstractFuture a;
        final t0 b;

        SetFuture(AbstractFuture abstractFuture0, t0 t00) {
            this.a = abstractFuture0;
            this.b = t00;
        }

        @Override
        public void run() {
            if(this.a.a != this) {
                return;
            }
            Object object0 = AbstractFuture.i(this.b);
            if(AbstractFuture.g.b(this.a, this, object0)) {
                AbstractFuture.f(this.a);
            }
        }
    }

    static final class SynchronizedHelper extends AtomicHelper {
        SynchronizedHelper() {
            super(null);
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        boolean a(AbstractFuture abstractFuture0, Listener abstractFuture$Listener0, Listener abstractFuture$Listener1) {
            synchronized(abstractFuture0) {
                if(abstractFuture0.b == abstractFuture$Listener0) {
                    abstractFuture0.b = abstractFuture$Listener1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        boolean b(AbstractFuture abstractFuture0, Object object0, Object object1) {
            synchronized(abstractFuture0) {
                if(abstractFuture0.a == object0) {
                    abstractFuture0.a = object1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        boolean c(AbstractFuture abstractFuture0, Waiter abstractFuture$Waiter0, Waiter abstractFuture$Waiter1) {
            synchronized(abstractFuture0) {
                if(abstractFuture0.c == abstractFuture$Waiter0) {
                    abstractFuture0.c = abstractFuture$Waiter1;
                    return true;
                }
            }
            return false;
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        void d(Waiter abstractFuture$Waiter0, Waiter abstractFuture$Waiter1) {
            abstractFuture$Waiter0.b = abstractFuture$Waiter1;
        }

        @Override  // androidx.work.impl.utils.futures.AbstractFuture$AtomicHelper
        void e(Waiter abstractFuture$Waiter0, Thread thread0) {
            abstractFuture$Waiter0.a = thread0;
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
            AbstractFuture.g.e(this, Thread.currentThread());
        }

        Waiter(boolean z) {
        }

        void a(Waiter abstractFuture$Waiter0) {
            AbstractFuture.g.d(this, abstractFuture$Waiter0);
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
        SafeAtomicHelper abstractFuture$SafeAtomicHelper0;
        AbstractFuture.d = false;
        AbstractFuture.e = Logger.getLogger("androidx.work.impl.utils.futures.AbstractFuture");
        try {
            abstractFuture$SafeAtomicHelper0 = new SafeAtomicHelper(AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(Waiter.class, Waiter.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Waiter.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Listener.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            abstractFuture$SafeAtomicHelper0 = new SynchronizedHelper();
        }
        AbstractFuture.g = abstractFuture$SafeAtomicHelper0;
        if(throwable0 != null) {
            AbstractFuture.e.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        AbstractFuture.h = new Object();
    }

    private void a(StringBuilder stringBuilder0) {
        try {
            Object object0 = AbstractFuture.j(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append(this.s(object0));
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
        AbstractFuture.d(runnable0);
        AbstractFuture.d(executor0);
        Listener abstractFuture$Listener0 = this.b;
        if(abstractFuture$Listener0 != Listener.d) {
            Listener abstractFuture$Listener1 = new Listener(runnable0, executor0);
            while(true) {
                abstractFuture$Listener1.c = abstractFuture$Listener0;
                if(AbstractFuture.g.a(this, abstractFuture$Listener0, abstractFuture$Listener1)) {
                    return;
                }
                abstractFuture$Listener0 = this.b;
                if(abstractFuture$Listener0 == Listener.d) {
                    break;
                }
            }
        }
        AbstractFuture.g(runnable0, executor0);
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
        Cancellation abstractFuture$Cancellation0;
        Object object0 = this.a;
        if((object0 == null | object0 instanceof SetFuture) != 0) {
            if(AbstractFuture.d) {
                abstractFuture$Cancellation0 = new Cancellation(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                abstractFuture$Cancellation0 = z ? Cancellation.c : Cancellation.d;
            }
            boolean z1 = false;
            AbstractFuture abstractFuture0 = this;
            while(true) {
                if(AbstractFuture.g.b(abstractFuture0, object0, abstractFuture$Cancellation0)) {
                    AbstractFuture.f(abstractFuture0);
                    if(object0 instanceof SetFuture) {
                        t0 t00 = ((SetFuture)object0).b;
                        if(!(t00 instanceof AbstractFuture)) {
                            t00.cancel(z);
                            return true;
                        }
                        abstractFuture0 = (AbstractFuture)t00;
                        object0 = abstractFuture0.a;
                        if((object0 == null | object0 instanceof SetFuture) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = abstractFuture0.a;
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

    private Listener e(Listener abstractFuture$Listener0) {
        do {
            Listener abstractFuture$Listener1 = this.b;
        }
        while(!AbstractFuture.g.a(this, abstractFuture$Listener1, Listener.d));
        Listener abstractFuture$Listener2 = abstractFuture$Listener0;
        for(Listener abstractFuture$Listener3 = abstractFuture$Listener1; abstractFuture$Listener3 != null; abstractFuture$Listener3 = abstractFuture$Listener4) {
            Listener abstractFuture$Listener4 = abstractFuture$Listener3.c;
            abstractFuture$Listener3.c = abstractFuture$Listener2;
            abstractFuture$Listener2 = abstractFuture$Listener3;
        }
        return abstractFuture$Listener2;
    }

    static void f(AbstractFuture abstractFuture0) {
        Runnable runnable0;
        Listener abstractFuture$Listener1;
        Listener abstractFuture$Listener0 = null;
        while(true) {
            abstractFuture0.n();
            abstractFuture$Listener1 = abstractFuture0.e(abstractFuture$Listener0);
        label_3:
            if(abstractFuture$Listener1 == null) {
                return;
            }
            abstractFuture$Listener0 = abstractFuture$Listener1.c;
            runnable0 = abstractFuture$Listener1.a;
            if(!(runnable0 instanceof SetFuture)) {
                break;
            }
            abstractFuture0 = ((SetFuture)runnable0).a;
            if(abstractFuture0.a != ((SetFuture)runnable0)) {
                abstractFuture$Listener1 = abstractFuture$Listener0;
                goto label_3;
            }
            Object object0 = AbstractFuture.i(((SetFuture)runnable0).b);
            if(!AbstractFuture.g.b(abstractFuture0, ((SetFuture)runnable0), object0)) {
                abstractFuture$Listener1 = abstractFuture$Listener0;
                goto label_3;
            }
        }
        AbstractFuture.g(runnable0, abstractFuture$Listener1.b);
        abstractFuture$Listener1 = abstractFuture$Listener0;
        goto label_3;
    }

    private static void g(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            AbstractFuture.e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
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
        Waiter abstractFuture$Waiter0 = this.c;
        if(abstractFuture$Waiter0 != Waiter.c) {
            Waiter abstractFuture$Waiter1 = new Waiter();
            while(true) {
                abstractFuture$Waiter1.a(abstractFuture$Waiter0);
                if(AbstractFuture.g.c(this, abstractFuture$Waiter0, abstractFuture$Waiter1)) {
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
                    this.o(abstractFuture$Waiter1);
                    throw new InterruptedException();
                }
                abstractFuture$Waiter0 = this.c;
                if(abstractFuture$Waiter0 == Waiter.c) {
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
            Waiter abstractFuture$Waiter0 = this.c;
            if(abstractFuture$Waiter0 != Waiter.c) {
                Waiter abstractFuture$Waiter1 = new Waiter();
                while(true) {
                    abstractFuture$Waiter1.a(abstractFuture$Waiter0);
                    if(AbstractFuture.g.c(this, abstractFuture$Waiter0, abstractFuture$Waiter1)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.o(abstractFuture$Waiter1);
                                throw new InterruptedException();
                            }
                            Object object1 = this.a;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof SetFuture)) != 0) {
                                return this.h(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.o(abstractFuture$Waiter1);
                        goto label_26;
                    }
                    abstractFuture$Waiter0 = this.c;
                    if(abstractFuture$Waiter0 == Waiter.c) {
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
        throw this.isDone() ? new TimeoutException(s1 + " but future completed as timeout expired") : new TimeoutException(s1 + " for " + "jebdyn.dexdec.irsb.Object_e2416401@2a76ae6[status=PENDING]");
    }

    private Object h(Object object0) throws ExecutionException {
        if(object0 instanceof Cancellation) {
            throw AbstractFuture.c("Task was cancelled.", ((Cancellation)object0).b);
        }
        if(object0 instanceof Failure) {
            throw new ExecutionException(((Failure)object0).a);
        }
        return object0 == AbstractFuture.h ? null : object0;
    }

    static Object i(t0 t00) {
        if(t00 instanceof AbstractFuture) {
            Cancellation abstractFuture$Cancellation0 = ((AbstractFuture)t00).a;
            if(abstractFuture$Cancellation0 instanceof Cancellation && abstractFuture$Cancellation0.a) {
                return abstractFuture$Cancellation0.b == null ? Cancellation.d : new Cancellation(false, abstractFuture$Cancellation0.b);
            }
            return abstractFuture$Cancellation0;
        }
        boolean z = t00.isCancelled();
        if((!AbstractFuture.d & z) != 0) {
            return Cancellation.d;
        }
        try {
            Object object0 = AbstractFuture.j(t00);
            return object0 == null ? AbstractFuture.h : object0;
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

    private static Object j(Future future0) throws ExecutionException {
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
            future0.cancel(this.t());
        }
    }

    @Nullable
    protected String m() {
        Object object0 = this.a;
        if(object0 instanceof SetFuture) {
            return "setFuture=[" + this.s(((SetFuture)object0).b) + "]";
        }
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    private void n() {
        Waiter abstractFuture$Waiter0;
        do {
            abstractFuture$Waiter0 = this.c;
        }
        while(!AbstractFuture.g.c(this, abstractFuture$Waiter0, Waiter.c));
        while(abstractFuture$Waiter0 != null) {
            abstractFuture$Waiter0.b();
            abstractFuture$Waiter0 = abstractFuture$Waiter0.b;
        }
    }

    private void o(Waiter abstractFuture$Waiter0) {
        abstractFuture$Waiter0.a = null;
    alab1:
        while(true) {
            Waiter abstractFuture$Waiter1 = this.c;
            if(abstractFuture$Waiter1 == Waiter.c) {
                return;
            }
            Waiter abstractFuture$Waiter2 = null;
            while(true) {
                if(abstractFuture$Waiter1 == null) {
                    break alab1;
                }
                Waiter abstractFuture$Waiter3 = abstractFuture$Waiter1.b;
                if(abstractFuture$Waiter1.a != null) {
                    abstractFuture$Waiter2 = abstractFuture$Waiter1;
                }
                else if(abstractFuture$Waiter2 == null) {
                    if(AbstractFuture.g.c(this, abstractFuture$Waiter1, abstractFuture$Waiter3)) {
                        abstractFuture$Waiter1 = abstractFuture$Waiter3;
                        continue;
                    }
                    break;
                }
                else {
                    abstractFuture$Waiter2.b = abstractFuture$Waiter3;
                    if(abstractFuture$Waiter2.a == null) {
                        break;
                    }
                }
                abstractFuture$Waiter1 = abstractFuture$Waiter3;
            }
        }
    }

    protected boolean p(@Nullable Object object0) {
        if(object0 == null) {
            object0 = AbstractFuture.h;
        }
        if(AbstractFuture.g.b(this, null, object0)) {
            AbstractFuture.f(this);
            return true;
        }
        return false;
    }

    protected boolean q(Throwable throwable0) {
        Failure abstractFuture$Failure0 = new Failure(((Throwable)AbstractFuture.d(throwable0)));
        if(AbstractFuture.g.b(this, null, abstractFuture$Failure0)) {
            AbstractFuture.f(this);
            return true;
        }
        return false;
    }

    protected boolean r(t0 t00) {
        Failure abstractFuture$Failure0;
        AbstractFuture.d(t00);
        Object object0 = this.a;
        if(object0 == null) {
            if(t00.isDone()) {
                Object object1 = AbstractFuture.i(t00);
                if(AbstractFuture.g.b(this, null, object1)) {
                    AbstractFuture.f(this);
                    return true;
                }
                return false;
            }
            SetFuture abstractFuture$SetFuture0 = new SetFuture(this, t00);
            if(AbstractFuture.g.b(this, null, abstractFuture$SetFuture0)) {
                try {
                    t00.addListener(abstractFuture$SetFuture0, DirectExecutor.a);
                }
                catch(Throwable throwable0) {
                    try {
                        abstractFuture$Failure0 = new Failure(throwable0);
                    }
                    catch(Throwable unused_ex) {
                        abstractFuture$Failure0 = Failure.b;
                    }
                    AbstractFuture.g.b(this, abstractFuture$SetFuture0, abstractFuture$Failure0);
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

    private String s(Object object0) {
        return object0 == this ? "this future" : String.valueOf(object0);
    }

    // 去混淆评级： 低(20)
    protected final boolean t() {
        return this.a instanceof Cancellation && ((Cancellation)this.a).a;
    }

    @Override
    public String toString() [...] // 潜在的解密器

    class androidx.work.impl.utils.futures.AbstractFuture.1 {
    }

}

