package rx.observers;

import rx.h;
import rx.n;

public class g extends n {
    private final h f;

    public g(n n0) {
        this(n0, true);
    }

    public g(n n0, boolean z) {
        super(n0, z);
        this.f = new f(n0);
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

