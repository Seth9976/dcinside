package io.reactivex.subscribers;

import io.reactivex.internal.disposables.f;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.i;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public abstract class c implements io.reactivex.disposables.c, q {
    private final AtomicReference a;
    private final f b;
    private final AtomicLong c;

    public c() {
        this.a = new AtomicReference();
        this.b = new f();
        this.c = new AtomicLong();
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return this.a.get() == j.a;
    }

    public final void b(io.reactivex.disposables.c c0) {
        b.g(c0, "resource is null");
        this.b.d(c0);
    }

    protected void c() {
        this.d(0x7FFFFFFFFFFFFFFFL);
    }

    protected final void d(long v) {
        j.b(this.a, this.c, v);
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        if(j.a(this.a)) {
            this.b.dispose();
        }
    }

    @Override  // io.reactivex.q
    public final void g(e e0) {
        Class class0 = this.getClass();
        if(i.d(this.a, e0, class0)) {
            long v = this.c.getAndSet(0L);
            if(v != 0L) {
                e0.request(v);
            }
            this.c();
        }
    }
}

