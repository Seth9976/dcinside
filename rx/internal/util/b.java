package rx.internal.util;

import rx.functions.a;
import rx.h;

public final class b implements h {
    final rx.functions.b a;
    final rx.functions.b b;
    final a c;

    public b(rx.functions.b b0, rx.functions.b b1, a a0) {
        this.a = b0;
        this.b = b1;
        this.c = a0;
    }

    @Override  // rx.h
    public void d() {
        this.c.call();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.b.b(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.a.b(object0);
    }
}

