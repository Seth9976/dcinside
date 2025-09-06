package io.reactivex.internal.schedulers;

import io.reactivex.disposables.c;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class n extends AtomicReferenceArray implements c, Runnable, Callable {
    final Runnable a;
    private static final long b = 0xAB1098E7DBF903DBL;
    static final Object c = null;
    static final Object d = null;
    static final Object e = null;
    static final Object f = null;
    static final int g = 0;
    static final int h = 1;
    static final int i = 2;

    static {
        n.c = new Object();
        n.d = new Object();
        n.e = new Object();
        n.f = new Object();
    }

    public n(Runnable runnable0, io.reactivex.internal.disposables.c c0) {
        super(3);
        this.a = runnable0;
        this.lazySet(0, c0);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        Object object0 = this.get(0);
        return object0 == n.c || object0 == n.f;
    }

    public void b(Future future0) {
        do {
            Object object0 = this.get(1);
            if(object0 == n.f) {
                return;
            }
            if(object0 == n.d) {
                future0.cancel(false);
                return;
            }
            if(object0 == n.e) {
                future0.cancel(true);
                return;
            }
        }
        while(!this.compareAndSet(1, object0, future0));
    }

    @Override
    public Object call() {
        this.run();
        return null;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        Object object0;
        while((object0 = this.get(1)) != n.f) {
            Object object1 = n.d;
            if(object0 == object1) {
                break;
            }
            Object object2 = n.e;
            if(object0 == object2) {
                break;
            }
            boolean z = this.get(2) != Thread.currentThread();
            if(z) {
                object1 = object2;
            }
            if(this.compareAndSet(1, object0, object1)) {
                if(object0 == null) {
                    break;
                }
                ((Future)object0).cancel(z);
                break;
            }
        }
        Object object3;
        while((object3 = this.get(0)) != n.f) {
            Object object4 = n.c;
            if(object3 == object4 || object3 == null) {
                break;
            }
            if(this.compareAndSet(0, object3, object4)) {
                ((io.reactivex.internal.disposables.c)object3).c(this);
                return;
            }
        }
    }

    @Override
    public void run() {
        this.lazySet(2, Thread.currentThread());
        try {
            this.a.run();
        }
        catch(Throwable throwable0) {
            a.Y(throwable0);
        }
        finally {
            this.lazySet(2, null);
            Object object0 = this.get(0);
            if(object0 != n.c && this.compareAndSet(0, object0, n.f) && object0 != null) {
                ((io.reactivex.internal.disposables.c)object0).c(this);
            }
            do {
                Object object1 = this.get(1);
            }
            while(object1 != n.d && object1 != n.e && !this.compareAndSet(1, object1, n.f));
        }
    }
}

