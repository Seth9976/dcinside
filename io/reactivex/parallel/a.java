package io.reactivex.parallel;

import e3.c;

public enum a implements c {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    public a a(Long long0, Throwable throwable0) {
        return this;
    }

    @Override  // e3.c
    public Object apply(Object object0, Object object1) throws Exception {
        return this.a(((Long)object0), ((Throwable)object1));
    }
}

