package io.reactivex.internal.observers;

public final class f extends e {
    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        if(this.a == null) {
            this.b = throwable0;
        }
        this.countDown();
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        if(this.a == null) {
            this.a = object0;
            this.c.dispose();
            this.countDown();
        }
    }
}

