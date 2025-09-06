package io.reactivex.exceptions;

import d3.f;

public final class d extends RuntimeException {
    private static final long a = -6298857009889503852L;

    public d(String s, @f Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        super(s, throwable0);
    }

    public d(@f Throwable throwable0) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + throwable0, throwable0);
    }
}

