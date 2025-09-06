package io.reactivex.internal.operators.maybe;

import e3.o;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class A extends a {
    static final class io.reactivex.internal.operators.maybe.A.a implements c, v {
        static final class io.reactivex.internal.operators.maybe.A.a.a extends AtomicReference implements v {
            final v a;
            final e3.c b;
            Object c;
            private static final long d = 0xD7C84EF9C5F129A1L;

            io.reactivex.internal.operators.maybe.A.a.a(v v0, e3.c c0) {
                this.a = v0;
                this.b = c0;
            }

            @Override  // io.reactivex.v
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.v
            public void onComplete() {
                this.a.onComplete();
            }

            @Override  // io.reactivex.v
            public void onError(Throwable throwable0) {
                this.a.onError(throwable0);
            }

            @Override  // io.reactivex.v
            public void onSuccess(Object object0) {
                Object object2;
                try {
                    Object object1 = this.c;
                    this.c = null;
                    object2 = b.g(this.b.apply(object1, object0), "The resultSelector returned a null value");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.a.onError(throwable0);
                    return;
                }
                this.a.onSuccess(object2);
            }
        }

        final o a;
        final io.reactivex.internal.operators.maybe.A.a.a b;

        io.reactivex.internal.operators.maybe.A.a(v v0, o o0, e3.c c0) {
            this.b = new io.reactivex.internal.operators.maybe.A.a.a(v0, c0);
            this.a = o0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.b.get()));
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.g(this.b, c0)) {
                this.b.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this.b);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.b.a.onComplete();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.b.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            y y0;
            try {
                y0 = (y)b.g(this.a.apply(object0), "The mapper returned a null MaybeSource");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.b.a.onError(throwable0);
                return;
            }
            if(d.d(this.b, null)) {
                this.b.c = object0;
                y0.a(this.b);
            }
        }
    }

    final o b;
    final e3.c c;

    public A(y y0, o o0, e3.c c0) {
        super(y0);
        this.b = o0;
        this.c = c0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.A.a a$a0 = new io.reactivex.internal.operators.maybe.A.a(v0, this.b, this.c);
        this.a.a(a$a0);
    }
}

