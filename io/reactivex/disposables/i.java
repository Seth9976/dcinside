package io.reactivex.disposables;

import org.reactivestreams.e;

final class i extends f {
    private static final long b = -707001650852963139L;

    i(e e0) {
        super(e0);
    }

    @Override  // io.reactivex.disposables.f
    protected void b(@d3.f Object object0) {
        this.c(((e)object0));
    }

    protected void c(@d3.f e e0) {
        e0.cancel();
    }
}

