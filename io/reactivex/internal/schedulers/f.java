package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.d;
import io.reactivex.disposables.c;
import io.reactivex.internal.functions.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

final class f implements c, Callable {
    final Runnable a;
    final AtomicReference b;
    final AtomicReference c;
    final ExecutorService d;
    Thread e;
    static final FutureTask f;

    static {
        f.f = new FutureTask(a.b, null);
    }

    f(Runnable runnable0, ExecutorService executorService0) {
        this.a = runnable0;
        this.c = new AtomicReference();
        this.b = new AtomicReference();
        this.d = executorService0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.c.get() == f.f;
    }

    public Void b() throws Exception {
        try {
            this.e = Thread.currentThread();
            this.a.run();
            this.d(this.d.submit(this));
            this.e = null;
        }
        catch(Throwable throwable0) {
            this.e = null;
            io.reactivex.plugins.a.Y(throwable0);
        }
        return null;
    }

    void c(Future future0) {
        do {
            Future future1 = (Future)this.c.get();
            if(future1 == f.f) {
                future0.cancel(this.e != Thread.currentThread());
                return;
            }
        }
        while(!d.a(this.c, future1, future0));
    }

    @Override
    public Object call() throws Exception {
        return this.b();
    }

    void d(Future future0) {
        do {
            Future future1 = (Future)this.b.get();
            if(future1 == f.f) {
                future0.cancel(this.e != Thread.currentThread());
                return;
            }
        }
        while(!d.a(this.b, future1, future0));
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        FutureTask futureTask0 = f.f;
        Future future0 = (Future)this.c.getAndSet(futureTask0);
        boolean z = false;
        if(future0 != null && future0 != futureTask0) {
            future0.cancel(this.e != Thread.currentThread());
        }
        Future future1 = (Future)this.b.getAndSet(futureTask0);
        if(future1 != null && future1 != futureTask0) {
            if(this.e != Thread.currentThread()) {
                z = true;
            }
            future1.cancel(z);
        }
    }
}

