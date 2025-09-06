package io.reactivex.internal.subscribers;

import androidx.compose.animation.core.d;
import io.reactivex.internal.util.k;
import io.reactivex.plugins.a;
import io.reactivex.q;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class j extends CountDownLatch implements q, Future, e {
    Object a;
    Throwable b;
    final AtomicReference c;

    public j() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
    }

    @Override
    public boolean cancel(boolean z) {
        e e0;
        while((e0 = (e)this.c.get()) != this) {
            io.reactivex.internal.subscriptions.j j0 = io.reactivex.internal.subscriptions.j.a;
            if(e0 == j0) {
                break;
            }
            if(d.a(this.c, e0, j0)) {
                if(e0 != null) {
                    e0.cancel();
                }
                this.countDown();
                return true;
            }
        }
        return false;
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        io.reactivex.internal.subscriptions.j.i(this.c, e0, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        if(this.getCount() != 0L) {
            io.reactivex.internal.util.e.b();
            this.await();
        }
        if(this.isCancelled()) {
            throw new CancellationException();
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw new ExecutionException(throwable0);
        }
        return this.a;
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        if(this.getCount() != 0L) {
            io.reactivex.internal.util.e.b();
            if(!this.await(v, timeUnit0)) {
                throw new TimeoutException(k.e(v, timeUnit0));
            }
        }
        if(this.isCancelled()) {
            throw new CancellationException();
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw new ExecutionException(throwable0);
        }
        return this.a;
    }

    @Override
    public boolean isCancelled() {
        return this.c.get() == io.reactivex.internal.subscriptions.j.a;
    }

    @Override
    public boolean isDone() {
        return this.getCount() == 0L;
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.a == null) {
            this.onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while(true) {
            e e0 = (e)this.c.get();
            if(e0 == this || e0 == io.reactivex.internal.subscriptions.j.a) {
                break;
            }
            if(d.a(this.c, e0, this)) {
                this.countDown();
                return;
            }
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        while(true) {
            e e0 = (e)this.c.get();
            if(e0 == this || e0 == io.reactivex.internal.subscriptions.j.a) {
                break;
            }
            this.b = throwable0;
            if(d.a(this.c, e0, this)) {
                this.countDown();
                return;
            }
        }
        a.Y(throwable0);
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.a != null) {
            ((e)this.c.get()).cancel();
            this.onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.a = object0;
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
    }
}

