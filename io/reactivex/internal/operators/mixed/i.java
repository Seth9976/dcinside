package io.reactivex.internal.operators.mixed;

import d3.e;
import io.reactivex.A;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;

@e
public final class i implements N, c, f, v {
    final N a;
    c b;

    public i(N n0) {
        this.a = n0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.b.a();
    }

    @Override  // io.reactivex.N, io.reactivex.v, io.reactivex.f
    public void b(c c0) {
        if(d.i(this.b, c0)) {
            this.b = c0;
            this.a.b(this);
        }
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        this.b.dispose();
    }

    @Override  // io.reactivex.v, io.reactivex.f
    public void onComplete() {
        this.a.onSuccess(A.a());
    }

    @Override  // io.reactivex.N, io.reactivex.v, io.reactivex.f
    public void onError(Throwable throwable0) {
        A a0 = A.b(throwable0);
        this.a.onSuccess(a0);
    }

    @Override  // io.reactivex.N, io.reactivex.v
    public void onSuccess(Object object0) {
        A a0 = A.c(object0);
        this.a.onSuccess(a0);
    }
}

