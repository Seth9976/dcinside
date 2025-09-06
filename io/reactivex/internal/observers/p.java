package io.reactivex.internal.observers;

import e3.a;
import e3.g;
import e3.r;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class p extends AtomicReference implements I, c {
    final r a;
    final g b;
    final a c;
    boolean d;
    private static final long e = -4403180040475402120L;

    public p(r r0, g g0, a a0) {
        this.a = r0;
        this.b = g0;
        this.c = a0;
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return d.c(((c)this.get()));
    }

    @Override  // io.reactivex.I
    public void b(c c0) {
        d.g(this, c0);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        d.b(this);
    }

    @Override  // io.reactivex.I
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

    @Override  // io.reactivex.I
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

    @Override  // io.reactivex.I
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

