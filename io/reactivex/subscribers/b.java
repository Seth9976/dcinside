package io.reactivex.subscribers;

import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.i;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public abstract class b implements c, q {
    final AtomicReference a;

    public b() {
        this.a = new AtomicReference();
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.a.get() == j.a;
    }

    protected final void b() {
        this.dispose();
    }

    protected void c() {
        ((e)this.a.get()).request(0x7FFFFFFFFFFFFFFFL);
    }

    protected final void d(long v) {
        ((e)this.a.get()).request(v);
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        j.a(this.a);
    }

    @Override  // io.reactivex.q
    public final void g(e e0) {
        Class class0 = this.getClass();
        if(i.d(this.a, e0, class0)) {
            this.c();
        }
    }
}

