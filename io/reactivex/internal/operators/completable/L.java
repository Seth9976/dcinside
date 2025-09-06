package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicInteger;

public final class l extends c {
    static final class a extends AtomicInteger implements io.reactivex.disposables.c, f {
        final f a;
        final e3.a b;
        io.reactivex.disposables.c c;
        private static final long d = 0x3907BA0B13897E3DL;

        a(f f0, e3.a a0) {
            this.a = f0;
            this.b = a0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        void c() {
            if(this.compareAndSet(0, 1)) {
                try {
                    this.b.run();
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    io.reactivex.plugins.a.Y(throwable0);
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
            this.c();
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            this.a.onComplete();
            this.c();
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
            this.c();
        }
    }

    final i a;
    final e3.a b;

    public l(i i0, e3.a a0) {
        this.a = i0;
        this.b = a0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a l$a0 = new a(f0, this.b);
        this.a.e(l$a0);
    }
}

