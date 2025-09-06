package j$.util.concurrent;

public interface Flow.Subscriber {
    void onComplete();

    void onError(Throwable arg1);

    void onNext(Object arg1);

    void onSubscribe(Flow.Subscription arg1);
}

