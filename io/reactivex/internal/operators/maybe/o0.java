package io.reactivex.internal.operators.maybe;

import f3.f;
import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.observers.l;
import io.reactivex.v;
import io.reactivex.y;

public final class o0 extends B implements f {
    static final class a extends l implements v {
        c j;
        private static final long k = 0x6984808A6F073B2AL;

        a(I i0) {
            super(i0);
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.j, c0)) {
                this.j = c0;
                this.b.b(this);
            }
        }

        @Override  // io.reactivex.internal.observers.l
        public void dispose() {
            super.dispose();
            this.j.dispose();
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.c();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.e(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.d(object0);
        }
    }

    final y a;

    public o0(y y0) {
        this.a = y0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        v v0 = o0.i8(i0);
        this.a.a(v0);
    }

    public static v i8(I i0) {
        return new a(i0);
    }

    @Override  // f3.f
    public y source() {
        return this.a;
    }
}

