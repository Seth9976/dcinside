package io.reactivex.internal.subscribers;

import e3.a;
import e3.g;
import e3.r;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class i extends AtomicReference implements c, q {
    final r a;
    final g b;
    final a c;
    boolean d;
    private static final long e = -4403180040475402120L;

    public i(r r0, g g0, a a0) {
        this.a = r0;
        this.b = g0;
        this.c = a0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.get() == j.a;
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        j.a(this);
    }

    @Override  // io.reactivex.q
    public void g(e e0) {
        j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // org.reactivestreams.d
    public void onComplete() {
        if(this.d) {
            return;
        }
        try {
            this.d = true;
            this.c.run();
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            io.reactivex.plugins.a.Y(throwable0);
        }
    }

    @Override  // org.reactivestreams.d
    public void onError(Throwable throwable0) {
        if(this.d) {
            io.reactivex.plugins.a.Y(throwable0);
            return;
        }
        try {
            this.d = true;
            this.b.accept(throwable0);
        }
        catch(Throwable throwable1) {
            b.b(throwable1);
            io.reactivex.plugins.a.Y(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
        }
    }

    @Override  // org.reactivestreams.d
    public void onNext(Object object0) {
        if(this.d) {
            return;
        }
        try {
            if(!this.a.test(object0)) {
                goto label_9;
            }
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            this.dispose();
            this.onError(throwable0);
        }
        return;
    label_9:
        this.dispose();
        this.onComplete();
    }
}

