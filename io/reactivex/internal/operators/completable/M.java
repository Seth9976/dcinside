package io.reactivex.internal.operators.completable;

import e3.g;
import io.reactivex.c;
import io.reactivex.exceptions.b;
import io.reactivex.f;
import io.reactivex.i;

public final class m extends c {
    final class a implements f {
        private final f a;
        final m b;

        a(f f0) {
            this.a = f0;
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            this.a.b(c0);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            try {
                m.this.b.accept(null);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            try {
                m.this.b.accept(throwable0);
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
            }
            this.a.onError(throwable0);
        }
    }

    final i a;
    final g b;

    public m(i i0, g g0) {
        this.a = i0;
        this.b = g0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a m$a0 = new a(this, f0);
        this.a.e(m$a0);
    }
}

