package io.reactivex.internal.subscribers;

import io.reactivex.internal.subscriptions.f;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public abstract class h extends f implements q {
    protected e m;
    protected boolean n;
    private static final long o = 0x296B17EDCF9C299FL;

    public h(d d0) {
        super(d0);
    }

    @Override  // io.reactivex.internal.subscriptions.f
    public void cancel() {
        super.cancel();
        this.m.cancel();
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        if(j.k(this.m, e0)) {
            this.m = e0;
            this.b.g(this);
            e0.request(0x7FFFFFFFFFFFFFFFL);
        }
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.n) {
            this.a(this.c);
            return;
        }
        this.b.onComplete();
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        this.c = null;
        this.b.onError(throwable0);
    }
}

