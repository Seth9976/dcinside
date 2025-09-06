package io.reactivex.internal.operators.completable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.c;
import io.reactivex.f;

public final class s extends c {
    static final class a implements I {
        final f a;

        a(f f0) {
            this.a = f0;
        }

        @Override  // io.reactivex.I
        public void b(io.reactivex.disposables.c c0) {
            this.a.b(c0);
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

    public s(G g0) {
        this.a = g0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a s$a0 = new a(f0);
        this.a.d(s$a0);
    }
}

