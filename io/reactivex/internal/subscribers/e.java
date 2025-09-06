package io.reactivex.internal.subscribers;

public final class e extends c {
    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        this.a = null;
        this.b = throwable0;
        this.countDown();
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        this.a = object0;
    }
}

