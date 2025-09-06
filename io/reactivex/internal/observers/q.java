package io.reactivex.internal.observers;

import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.k;
import io.reactivex.plugins.a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class q extends CountDownLatch implements I, c, Future {
    Object a;
    Throwable b;
    final AtomicReference c;

    public q() {
        super(1);
        this.c = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.isDone();
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        d.g(this.c, c0);
    }

    @Override
    public boolean cancel(boolean z) {
        c c0;
        while((c0 = (c)this.c.get()) != this) {
            d d0 = d.a;
            if(c0 == d0) {
                break;
            }
            if(androidx.compose.animation.core.d.a(this.c, c0, d0)) {
                if(c0 != null) {
                    c0.dispose();
                }
                this.countDown();
                return true;
            }
        }
        return false;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        if(this.getCount() != 0L) {
            e.b();
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
            e.b();
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
        return d.c(((c)this.c.get()));
    }

    @Override
    public boolean isDone() {
        return this.getCount() == 0L;
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        if(this.a == null) {
            this.onError(new NoSuchElementException("The source is empty"));
            return;
        }
        while(true) {
            c c0 = (c)this.c.get();
            if(c0 == this || c0 == d.a) {
                break;
            }
            if(androidx.compose.animation.core.d.a(this.c, c0, this)) {
                this.countDown();
                return;
            }
        }
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        if(this.b == null) {
            this.b = throwable0;
            while(true) {
                c c0 = (c)this.c.get();
                if(c0 == this || c0 == d.a) {
                    break;
                }
                if(androidx.compose.animation.core.d.a(this.c, c0, this)) {
                    this.countDown();
                    return;
                }
            }
            a.Y(throwable0);
            return;
        }
        a.Y(throwable0);
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        if(this.a != null) {
            ((c)this.c.get()).dispose();
            this.onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.a = object0;
    }
}

