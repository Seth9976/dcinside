package rx.internal.util;

import rx.functions.a;
import rx.functions.b;
import rx.n;

public final class c extends n {
    final b f;
    final b g;
    final a h;

    public c(b b0, b b1, a a0) {
        this.f = b0;
        this.g = b1;
        this.h = a0;
    }

    @Override  // rx.h
    public void d() {
        this.h.call();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.g.b(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.f.b(object0);
    }
}

