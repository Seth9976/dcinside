package io.reactivex.internal.operators.completable;

import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.c;
import io.reactivex.f;

public final class v extends c {
    static final class a implements N {
        final f a;

        a(f f0) {
            this.a = f0;
        }

        @Override  // io.reactivex.N
        public void b(io.reactivex.disposables.c c0) {
            this.a.b(c0);
        }

        @Override  // io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            this.a.onComplete();
        }
    }

    final Q a;

    public v(Q q0) {
        this.a = q0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a v$a0 = new a(f0);
        this.a.e(v$a0);
    }
}

