package io.reactivex.observers;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.f;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicReference;

public abstract class i implements c, v {
    private final AtomicReference a;
    private final f b;

    public i() {
        this.a = new AtomicReference();
        this.b = new f();
    }

    @Override  // io.reactivex.disposables.c
    public final boolean a() {
        return d.c(((c)this.a.get()));
    }

    @Override  // io.reactivex.v
    public final void b(@d3.f c c0) {
        Class class0 = this.getClass();
        boolean z = !io.reactivex.internal.util.i.c(this.a, c0, class0);
    }

    public final void c(@d3.f c c0) {
        b.g(c0, "resource is null");
        this.b.d(c0);
    }

    protected void d() {
    }

    @Override  // io.reactivex.disposables.c
    public final void dispose() {
        if(d.b(this.a)) {
            this.b.dispose();
        }
    }
}

