package io.reactivex.internal.operators.observable;

import f3.d;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.c;
import io.reactivex.f;

public final class o0 extends c implements d {
    static final class a implements I, io.reactivex.disposables.c {
        final f a;
        io.reactivex.disposables.c b;

        a(f f0) {
            this.a = f0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
        }

        @Override  // io.reactivex.I
        public void b(io.reactivex.disposables.c c0) {
            this.b = c0;
            this.a.b(this);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
        }
    }

    final G a;

    public o0(G g0) {
        this.a = g0;
    }

    @Override  // io.reactivex.c
    public void J0(f f0) {
        a o0$a0 = new a(f0);
        this.a.d(o0$a0);
    }

    @Override  // f3.d
    public B c() {
        return io.reactivex.plugins.a.R(new n0(this.a));
    }
}

