package io.reactivex.internal.util;

import io.reactivex.I;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.plugins.a;
import io.reactivex.q;
import io.reactivex.v;
import org.reactivestreams.d;
import org.reactivestreams.e;

public enum h implements I, N, c, f, q, v, e {
    INSTANCE;

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return true;
    }

    @Override  // io.reactivex.I, io.reactivex.v, io.reactivex.N, io.reactivex.f
    public void b(c c0) {
        c0.dispose();
    }

    public static I c() {
        return h.a;
    }

    @Override  // org.reactivestreams.e
    public void cancel() {
    }

    public static d d() {
        return h.a;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        e0.cancel();
    }

    @Override  // io.reactivex.I, io.reactivex.v, io.reactivex.f, org.reactivestreams.d
    public void onComplete() {
    }

    @Override  // io.reactivex.I, io.reactivex.v, io.reactivex.N, io.reactivex.f, org.reactivestreams.d
    public void onError(Throwable throwable0) {
        a.Y(throwable0);
    }

    @Override  // io.reactivex.I, org.reactivestreams.d
    public void onNext(Object object0) {
    }

    @Override  // io.reactivex.v, io.reactivex.N
    public void onSuccess(Object object0) {
    }

    @Override  // org.reactivestreams.e
    public void request(long v) {
    }
}

