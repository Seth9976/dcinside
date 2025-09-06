package rx.internal.util;

import rx.f;
import rx.functions.b;
import rx.h;

public final class a implements h {
    final b a;

    public a(b b0) {
        this.a = b0;
    }

    @Override  // rx.h
    public void d() {
        this.a.b(f.b());
    }

    @Override  // rx.h
    public void onError(Throwable throwable0) {
        f f0 = f.d(throwable0);
        this.a.b(f0);
    }

    @Override  // rx.h
    public void onNext(Object object0) {
        f f0 = f.e(object0);
        this.a.b(f0);
    }
}

