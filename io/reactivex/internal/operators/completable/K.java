package io.reactivex.internal.operators.completable;

import io.reactivex.J;
import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;

public final class k extends c {
    static final class a implements io.reactivex.disposables.c, f, Runnable {
        final f a;
        final J b;
        io.reactivex.disposables.c c;
        volatile boolean d;

        a(f f0, J j0) {
            this.a = f0;
            this.b = j0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d;
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.d = true;
            this.b.f(this);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            if(this.d) {
                return;
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.a.onError(throwable0);
        }

        @Override
        public void run() {
            this.c.dispose();
            this.c = d.a;
        }
    }

    final i a;
    final J b;

    public k(i i0, J j0) {
        this.a = i0;
        this.b = j0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a k$a0 = new a(f0, this.b);
        this.a.e(k$a0);
    }
}

