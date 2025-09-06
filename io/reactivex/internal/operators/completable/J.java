package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;

public final class j extends c {
    static final class a implements io.reactivex.disposables.c, f {
        f a;
        io.reactivex.disposables.c b;

        a(f f0) {
            this.a = f0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
        }

        @Override  // io.reactivex.f
        public void b(io.reactivex.disposables.c c0) {
            if(d.i(this.b, c0)) {
                this.b = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.a = null;
            this.b.dispose();
            this.b = d.a;
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            this.b = d.a;
            f f0 = this.a;
            if(f0 != null) {
                this.a = null;
                f0.onComplete();
            }
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.b = d.a;
            f f0 = this.a;
            if(f0 != null) {
                this.a = null;
                f0.onError(throwable0);
            }
        }
    }

    final i a;

    public j(i i0) {
        this.a = i0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a j$a0 = new a(f0);
        this.a.e(j$a0);
    }
}

