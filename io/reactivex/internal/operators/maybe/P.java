package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;

public final class p extends a {
    static final class io.reactivex.internal.operators.maybe.p.a implements c, v {
        v a;
        c b;

        io.reactivex.internal.operators.maybe.p.a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
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

        @Override  // io.reactivex.v
        public void onComplete() {
            this.b = d.a;
            v v0 = this.a;
            if(v0 != null) {
                this.a = null;
                v0.onComplete();
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.b = d.a;
            v v0 = this.a;
            if(v0 != null) {
                this.a = null;
                v0.onError(throwable0);
            }
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.b = d.a;
            v v0 = this.a;
            if(v0 != null) {
                this.a = null;
                v0.onSuccess(object0);
            }
        }
    }

    public p(y y0) {
        super(y0);
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.p.a p$a0 = new io.reactivex.internal.operators.maybe.p.a(v0);
        this.a.a(p$a0);
    }
}

