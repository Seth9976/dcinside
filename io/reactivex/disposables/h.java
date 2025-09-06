package io.reactivex.disposables;

import d3.g;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class h implements c {
    final AtomicReference a;

    public h() {
        this.a = new AtomicReference();
    }

    public h(@g c c0) {
        this.a = new AtomicReference(c0);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return d.c(((c)this.a.get()));
    }

    @g
    public c b() {
        c c0 = (c)this.a.get();
        return c0 == d.a ? io.reactivex.disposables.d.a() : c0;
    }

    public boolean c(@g c c0) {
        return d.d(this.a, c0);
    }

    public boolean d(@g c c0) {
        return d.f(this.a, c0);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this.a);
    }
}

