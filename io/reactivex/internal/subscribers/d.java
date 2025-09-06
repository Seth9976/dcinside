package io.reactivex.internal.subscribers;

import io.reactivex.plugins.a;

public final class d extends c {
    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(this.a == null) {
            this.b = throwable0;
        }
        else {
            a.Y(throwable0);
        }
        this.countDown();
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.a == null) {
            this.a = object0;
            this.c.cancel();
            this.countDown();
        }
    }
}

