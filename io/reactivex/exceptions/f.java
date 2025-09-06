package io.reactivex.exceptions;

public final class f extends IllegalStateException {
    private static final long a = 1644750035281290266L;

    public f(Throwable throwable0) {
        super("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What\'s-different-in-2.0#error-handling | " + throwable0, throwable0);
    }
}

