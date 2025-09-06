package io.reactivex.observers;

import e3.g;
import f3.j;
import io.reactivex.I;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.k;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicReference;

public class n extends a implements I, N, c, f, v {
    static enum io.reactivex.observers.n.a implements I {
        INSTANCE;

        @Override  // io.reactivex.I
        public void b(c c0) {
        }

        @Override  // io.reactivex.I
        public void onComplete() {
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
        }
    }

    private final I k;
    private final AtomicReference l;
    private j m;

    public n() {
        this(io.reactivex.observers.n.a.a);
    }

    public n(I i0) {
        this.l = new AtomicReference();
        this.k = i0;
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return d.c(((c)this.l.get()));
    }

    @Override  // io.reactivex.I, io.reactivex.v, io.reactivex.N, io.reactivex.f
    public void b(c c0) {
        this.e = Thread.currentThread();
        if(c0 == null) {
            NullPointerException nullPointerException0 = new NullPointerException("onSubscribe received a null Subscription");
            this.c.add(nullPointerException0);
            return;
        }
        if(!androidx.compose.animation.core.d.a(this.l, null, c0)) {
            c0.dispose();
            if(this.l.get() != d.a) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe received multiple subscriptions: " + c0);
                this.c.add(illegalStateException0);
            }
            return;
        }
        int v = this.g;
        if(v != 0 && c0 instanceof j) {
            this.m = (j)c0;
            int v1 = ((j)c0).i(v);
            this.h = v1;
            if(v1 == 1) {
                this.f = true;
                this.e = Thread.currentThread();
                try {
                    Object object0;
                    while((object0 = this.m.poll()) != null) {
                        this.b.add(object0);
                    }
                    ++this.d;
                    this.l.lazySet(d.a);
                    return;
                }
                catch(Throwable throwable0) {
                }
                this.c.add(throwable0);
                return;
            }
        }
        this.k.b(c0);
    }

    public final void cancel() {
        this.dispose();
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        d.b(this.l);
    }

    final n f0() {
        if(this.m == null) {
            throw new AssertionError("Upstream is not fuseable.");
        }
        return this;
    }

    final n g0(int v) {
        int v1 = this.h;
        if(v1 != v) {
            throw this.m == null ? this.W("Upstream is not fuseable") : new AssertionError("Fusion mode different. Expected: " + n.n0(v) + ", actual: " + n.n0(v1));
        }
        return this;
    }

    final n h0() {
        if(this.m != null) {
            throw new AssertionError("Upstream is fuseable.");
        }
        return this;
    }

    public final n i0() {
        if(this.l.get() != null) {
            throw this.W("Subscribed!");
        }
        if(!this.c.isEmpty()) {
            throw this.W("Not subscribed but errors found");
        }
        return this;
    }

    public final n j0(g g0) {
        try {
            g0.accept(this);
            return this;
        }
        catch(Throwable throwable0) {
            throw k.f(throwable0);
        }
    }

    public final n k0() {
        if(this.l.get() == null) {
            throw this.W("Not subscribed!");
        }
        return this;
    }

    public static n l0() {
        return new n();
    }

    public static n m0(I i0) {
        return new n(i0);
    }

    static String n0(int v) {
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

    public final boolean o0() {
        return this.l.get() != null;
    }

    @Override  // io.reactivex.I, io.reactivex.v, io.reactivex.f
    public void onComplete() {
        if(!this.f) {
            this.f = true;
            if(this.l.get() == null) {
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

    @Override  // io.reactivex.I, io.reactivex.v, io.reactivex.N, io.reactivex.f
    public void onError(Throwable throwable0) {
        if(!this.f) {
            this.f = true;
            if(this.l.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.c.add(illegalStateException0);
            }
        }
        try {
            this.e = Thread.currentThread();
            if(throwable0 == null) {
                NullPointerException nullPointerException0 = new NullPointerException("onError received a null Throwable");
                this.c.add(nullPointerException0);
            }
            else {
                this.c.add(throwable0);
            }
            this.k.onError(throwable0);
        }
        finally {
            this.a.countDown();
        }
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        if(!this.f) {
            this.f = true;
            if(this.l.get() == null) {
                IllegalStateException illegalStateException0 = new IllegalStateException("onSubscribe not called in proper order");
                this.c.add(illegalStateException0);
            }
        }
        this.e = Thread.currentThread();
        if(this.h == 2) {
            while(true) {
                try {
                    Object object1 = this.m.poll();
                    if(object1 == null) {
                        break;
                    }
                    this.b.add(object1);
                }
                catch(Throwable throwable0) {
                    this.c.add(throwable0);
                    this.m.dispose();
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

    @Override  // io.reactivex.v, io.reactivex.N
    public void onSuccess(Object object0) {
        this.onNext(object0);
        this.onComplete();
    }

    public final boolean p0() {
        return this.a();
    }

    final n q0(int v) {
        this.g = v;
        return this;
    }

    @Override  // io.reactivex.observers.a
    public a t() {
        return this.i0();
    }

    @Override  // io.reactivex.observers.a
    public a w() {
        return this.k0();
    }
}

