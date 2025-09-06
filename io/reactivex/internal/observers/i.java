package io.reactivex.internal.observers;

import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.q;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends AtomicReference implements I, c {
    final Queue a;
    private static final long b = 0xBC551743F607B3E4L;
    public static final Object c;

    static {
        i.c = new Object();
    }

    public i(Queue queue0) {
        this.a = queue0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == d.a;
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        d.g(this, c0);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        if(d.b(this)) {
            this.a.offer(i.c);
        }
    }

    @Override  // io.reactivex.I
    public void onComplete() {
        Object object0 = q.e();
        this.a.offer(object0);
    }

    @Override  // io.reactivex.I
    public void onError(Throwable throwable0) {
        Object object0 = q.g(throwable0);
        this.a.offer(object0);
    }

    @Override  // io.reactivex.I
    public void onNext(Object object0) {
        this.a.offer(object0);
    }
}

