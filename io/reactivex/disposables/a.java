package io.reactivex.disposables;

import io.reactivex.internal.util.k;

final class a extends f {
    private static final long b = 0x8DEDA7D87411765FL;

    a(e3.a a0) {
        super(a0);
    }

    @Override  // io.reactivex.disposables.f
    protected void b(@d3.f Object object0) {
        this.c(((e3.a)object0));
    }

    protected void c(@d3.f e3.a a0) {
        try {
            a0.run();
        }
        catch(Throwable throwable0) {
            throw k.f(throwable0);
        }
    }
}

