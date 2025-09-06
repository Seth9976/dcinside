package io.reactivex.subscribers;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.i;
import io.reactivex.q;
import org.reactivestreams.e;

public abstract class a implements q {
    e a;

    protected final void a() {
        e e0 = this.a;
        this.a = j.a;
        e0.cancel();
    }

    protected void b() {
        this.c(0x7FFFFFFFFFFFFFFFL);
    }

    protected final void c(long v) {
        e e0 = this.a;
        if(e0 != null) {
            e0.request(v);
        }
    }

    @Override  // io.reactivex.q
    public final void g(e e0) {
        if(i.f(this.a, e0, this.getClass())) {
            this.a = e0;
            this.b();
        }
    }
}

