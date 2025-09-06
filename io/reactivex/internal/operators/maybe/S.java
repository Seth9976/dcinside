package io.reactivex.internal.operators.maybe;

import e3.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;

public final class s extends a {
    static final class io.reactivex.internal.operators.maybe.s.a implements c, v {
        final v a;
        final b b;
        c c;

        io.reactivex.internal.operators.maybe.s.a(v v0, b b0) {
            this.a = v0;
            this.b = b0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
            this.c = d.a;
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            try {
                this.c = d.a;
                this.b.accept(null, null);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            try {
                this.c = d.a;
                this.b.accept(null, throwable0);
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
            }
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            try {
                this.c = d.a;
                this.b.accept(object0, null);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onSuccess(object0);
        }
    }

    final b b;

    public s(y y0, b b0) {
        super(y0);
        this.b = b0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.s.a s$a0 = new io.reactivex.internal.operators.maybe.s.a(v0, this.b);
        this.a.a(s$a0);
    }
}

