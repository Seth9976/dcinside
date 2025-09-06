package io.reactivex.internal.operators.maybe;

import e3.o;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class c0 extends a {
    static final class io.reactivex.internal.operators.maybe.c0.a extends AtomicReference implements c, v {
        static final class io.reactivex.internal.operators.maybe.c0.a.a implements v {
            final v a;
            final AtomicReference b;

            io.reactivex.internal.operators.maybe.c0.a.a(v v0, AtomicReference atomicReference0) {
                this.a = v0;
                this.b = atomicReference0;
            }

            @Override  // io.reactivex.v
            public void b(c c0) {
                d.g(this.b, c0);
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
                this.a.onSuccess(object0);
            }
        }

        final v a;
        final o b;
        final boolean c;
        private static final long d = 0x1C20005A00F70A2CL;

        io.reactivex.internal.operators.maybe.c0.a(v v0, o o0, boolean z) {
            this.a = v0;
            this.b = o0;
            this.c = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            y y0;
            if(!this.c && !(throwable0 instanceof Exception)) {
                this.a.onError(throwable0);
                return;
            }
            try {
                y0 = (y)b.g(this.b.apply(throwable0), "The resumeFunction returned a null MaybeSource");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
                this.a.onError(a0);
                return;
            }
            d.d(this, null);
            y0.a(new io.reactivex.internal.operators.maybe.c0.a.a(this.a, this));
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
        }
    }

    final o b;
    final boolean c;

    public c0(y y0, o o0, boolean z) {
        super(y0);
        this.b = o0;
        this.c = z;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.c0.a c0$a0 = new io.reactivex.internal.operators.maybe.c0.a(v0, this.b, this.c);
        this.a.a(c0$a0);
    }
}

