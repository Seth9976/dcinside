package io.reactivex.internal.observers;

import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.internal.util.e;
import io.reactivex.internal.util.k;
import io.reactivex.v;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class h extends CountDownLatch implements N, f, v {
    Object a;
    Throwable b;
    c c;
    volatile boolean d;

    public h() {
        super(1);
    }

    public boolean a(long v, TimeUnit timeUnit0) {
        if(this.getCount() != 0L) {
            try {
                e.b();
                if(!this.await(v, timeUnit0)) {
                    this.g();
                    return false;
                }
            }
            catch(InterruptedException interruptedException0) {
                this.g();
                throw k.f(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw k.f(throwable0);
        }
        return true;
    }

    @Override  // io.reactivex.N, io.reactivex.f, io.reactivex.v
    public void b(c c0) {
        this.c = c0;
        if(this.d) {
            c0.dispose();
        }
    }

    public Object c() {
        if(this.getCount() != 0L) {
            try {
                e.b();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                this.g();
                throw k.f(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw k.f(throwable0);
        }
        return this.a;
    }

    public Object d(Object object0) {
        if(this.getCount() != 0L) {
            try {
                e.b();
                this.await();
            }
            catch(InterruptedException interruptedException0) {
                this.g();
                throw k.f(interruptedException0);
            }
        }
        Throwable throwable0 = this.b;
        if(throwable0 != null) {
            throw k.f(throwable0);
        }
        return this.a == null ? object0 : this.a;
    }

    public Throwable e() {
        if(this.getCount() != 0L) {
            try {
                e.b();
                this.await();
                return this.b;
            }
            catch(InterruptedException throwable0) {
                this.g();
                return throwable0;
            }
        }
        return this.b;
    }

    public Throwable f(long v, TimeUnit timeUnit0) {
        if(this.getCount() == 0L) {
            return this.b;
        }
        else {
            try {
                e.b();
                if(!this.await(v, timeUnit0)) {
                    this.g();
                    throw k.f(new TimeoutException(k.e(v, timeUnit0)));
                }
                return this.b;
            }
            catch(InterruptedException interruptedException0) {
            }
        }
        this.g();
        throw k.f(interruptedException0);
    }

    void g() {
        this.d = true;
        c c0 = this.c;
        if(c0 != null) {
            c0.dispose();
        }
    }

    @Override  // io.reactivex.f, io.reactivex.v
    public void onComplete() {
        this.countDown();
    }

    @Override  // io.reactivex.N, io.reactivex.f, io.reactivex.v
    public void onError(Throwable throwable0) {
        this.b = throwable0;
        this.countDown();
    }

    @Override  // io.reactivex.N, io.reactivex.v
    public void onSuccess(Object object0) {
        this.a = object0;
        this.countDown();
    }
}

