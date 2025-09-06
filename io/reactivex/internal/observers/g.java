package io.reactivex.internal.observers;

public final class g extends e {
    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        this.a = null;
        this.b = throwable0;
        this.countDown();
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        this.a = object0;
    }
}

