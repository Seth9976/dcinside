package rx.internal.util;

import rx.h;
import rx.n;

public final class j extends n {
    final h f;

    public j(h h0) {
        this.f = h0;
    }

    @Override  // rx.h
    public void d() {
        this.f.d();
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        this.f.onError(throwable0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        this.f.onNext(object0);
    }
}

