package io.reactivex.subscribers;

import e3.g;
import f3.l;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.observers.a;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public class f extends a implements c, q, e {
    static enum io.reactivex.subscribers.f.a implements q {
        INSTANCE;

        @Override  // io.reactivex.q
        public void g(e e0) {
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
        }
    }

    private final d k;
    private volatile boolean l;
    private final AtomicReference m;
    private final AtomicLong n;
    private l o;

    public f() {
        this(io.reactivex.subscribers.f.a.a, 0x7FFFFFFFFFFFFFFFL);
    }

    public f(long v) {
        this(io.reactivex.subscribers.f.a.a, v);
    }

    public f(d d0) {
        this(d0, 0x7FFFFFFFFFFFFFFFL);
    }

    public f(d d0, long v) {
        if(v < 0L) {
            throw new IllegalArgumentException("Negative initial request not allowed");
        }
        this.k = d0;
        this.m = new AtomicReference();
        this.n = new AtomicLong(v);
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.l;
    }

    @Override  // org.reactivestreams.e
    public final void cancel() {
        if(!this.l) {
            this.l = true;
            j.a(this.m);
        }
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        this.cancel();
    }

    final f f0() {
        if(this.o == null) {
            throw new AssertionError("Upstream is not fuseable.");
        }
        return this;
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        this.e = Thread.currentThread();
        if(e0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onSubscribe received a null Subscription");
            this.c.add(nullPointerException0);
            return;
        }
        if(!androidx.compose.animation.core.d.a(this.m, null, e0)) {
            e0.cancel();
            if(this.m.get() != j.a) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe received multiple subscriptions: " + e0);
                this.c.add(illegalStateException0);
            }
            return;
        }
        int v = this.g;
        if(v != 0 && e0 instanceof l) {
            this.o = (l)e0;
            int v1 = ((l)e0).i(v);
            this.h = v1;
            if(v1 == 1) {
                this.f = true;
                this.e = Thread.currentThread();
                try {
                    Object object0;
                    while((object0 = this.o.poll()) != null) {
                        this.b.add(object0);
                    }
                    ++this.d;
                    return;
                }
                catch(Throwable throwable0) {
                }
                this.c.add(throwable0);
                return;
            }
        }
        this.k.g(e0);
        long v2 = this.n.getAndSet(0L);
        if(v2 != 0L) {
            e0.request(v2);
        }
    }

    final f g0(int v) {
        int v1 = this.h;
        if(v1 != v) {
            throw this.o == null ? this.W("Upstream is not fuseable") : new AssertionError("Fusion mode different. Expected: " + f.o0(v) + ", actual: " + f.o0(v1));
        }
        return this;
    }

    final f h0() {
        if(this.o != null) {
            throw new AssertionError("Upstream is fuseable.");
        }
        return this;
    }

    public final f i0() {
        if(this.m.get() != null) {
            throw this.W("Subscribed!");
        }
        if(!this.c.isEmpty()) {
            throw this.W("Not subscribed but errors found");
        }
        return this;
    }

    public final f j0(g g0) {
        try {
            g0.accept(this);
            return this;
        }
        catch(Throwable throwable0) {
            throw k.f(throwable0);
        }
    }

    public final f k0() {
        if(this.m.get() == null) {
            throw this.W("Not subscribed!");
        }
        return this;
    }

    public static f l0() {
        return new f();
    }

    public static f m0(long v) {
        return new f(v);
    }

    public static f n0(d d0) {
        return new f(d0);
    }

    static String o0(int v) {
        switch(v) {
            case 0: {
                return "NONE";
            }
            case 1: {
                return "SYNC";
            }
            case 2: {
                return "ASYNC";
            }
            default: {
                return "Unknown(" + v + ")";
            }
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(!this.f) {
            this.f = true;
            if(this.m.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.c.add(illegalStateException0);
            }
        }
        try {
            this.e = Thread.currentThread();
            ++this.d;
            this.k.onComplete();
        }
        finally {
            this.a.countDown();
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(!this.f) {
            this.f = true;
            if(this.m.get() == null) {
                NullPointerException nullPointerException0 = new NullPointerException("onSubscribe not called in proper order");
                this.c.add(nullPointerException0);
            }
        }
        try {
            this.e = Thread.currentThread();
            this.c.add(throwable0);
            if(throwable0 == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onError received a null Throwable");
                this.c.add(illegalStateException0);
            }
            this.k.onError(throwable0);
        }
        finally {
            this.a.countDown();
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(!this.f) {
            this.f = true;
            if(this.m.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.c.add(illegalStateException0);
            }
        }
        this.e = Thread.currentThread();
        if(this.h == 2) {
            while(true) {
                try {
                    Object object1 = this.o.poll();
                    if(object1 == null) {
                        break;
                    }
                    this.b.add(object1);
                }
                catch(Throwable throwable0) {
                    this.c.add(throwable0);
                    this.o.cancel();
                    break;
                }
            }
            return;
        }
        this.b.add(object0);
        if(object0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onNext received a null value");
            this.c.add(nullPointerException0);
        }
        this.k.onNext(object0);
    }

    public final boolean p0() {
        return this.m.get() != null;
    }

    public final boolean q0() {
        return this.l;
    }

    protected void r0() {
    }

    @Override  // org.reactivestreams.e
    public final void request(long v) {
        j.b(this.m, this.n, v);
    }

    public final f s0(long v) {
        this.request(v);
        return this;
    }

    @Override  // io.reactivex.observers.a
    public a t() {
        return this.i0();
    }

    final f t0(int v) {
        this.g = v;
        return this;
    }

    @Override  // io.reactivex.observers.a
    public a w() {
        return this.k0();
    }
}

