package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.exceptions.b;
import io.reactivex.i;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.disposables.h;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class f extends c {
    static final class a extends AtomicInteger implements io.reactivex.f {
        final io.reactivex.f a;
        final Iterator b;
        final h c;
        private static final long d = -7965400327305809232L;

        a(io.reactivex.f f0, Iterator iterator0) {
            this.a = f0;
            this.b = iterator0;
            this.c = new h();
        }

        void a() {
            i i0;
            if(this.c.a()) {
                return;
            }
            if(this.getAndIncrement() != 0) {
                return;
            }
            Iterator iterator0 = this.b;
            do {
                if(this.c.a()) {
                    return;
                }
                try {
                    if(!iterator0.hasNext()) {
                        goto label_13;
                    }
                    goto label_15;
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    this.a.onError(throwable0);
                    return;
                }
            label_13:
                this.a.onComplete();
                return;
                try {
                label_15:
                    Object object0 = iterator0.next();
                    i0 = (i)io.reactivex.internal.functions.b.g(object0, "The CompletableSource returned is null");
                }
                catch(Throwable throwable1) {
                    b.b(throwable1);
                    this.a.onError(throwable1);
                    return;
                }
                i0.e(this);
            }
            while(this.decrementAndGet() != 0);
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            this.c.b(c0);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            this.a();
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }
    }

    final Iterable a;

    public f(Iterable iterable0) {
        this.a = iterable0;
    }

    @Override  // io.reactivex.c
    public void J0(io.reactivex.f f0) {
        Iterator iterator0;
        try {
            iterator0 = (Iterator)io.reactivex.internal.functions.b.g(this.a.iterator(), "The iterator returned is null");
        }
        catch(Throwable throwable0) {
            b.b(throwable0);
            e.e(throwable0, f0);
            return;
        }
        a f$a0 = new a(f0, iterator0);
        f0.b(f$a0.c);
        f$a0.a();
    }
}

