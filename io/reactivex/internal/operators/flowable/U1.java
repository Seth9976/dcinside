package io.reactivex.internal.operators.flowable;

import f3.b;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.NoSuchElementException;
import org.reactivestreams.e;

public final class u1 extends K implements b {
    static final class a implements c, q {
        final N a;
        final Object b;
        e c;
        boolean d;
        Object e;

        a(N n0, Object object0) {
            this.a = n0;
            this.b = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.cancel();
            this.c = j.a;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.c, e0)) {
                this.c = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.d) {
                return;
            }
            this.d = true;
            this.c = j.a;
            Object object0 = this.e;
            this.e = null;
            if(object0 == null) {
                object0 = this.b;
            }
            if(object0 != null) {
                this.a.onSuccess(object0);
                return;
            }
            NoSuchElementException noSuchElementException0 = new NoSuchElementException();
            this.a.onError(noSuchElementException0);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.c = j.a;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.d) {
                return;
            }
            if(this.e != null) {
                this.d = true;
                this.c.cancel();
                this.c = j.a;
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                this.a.onError(illegalArgumentException0);
                return;
            }
            this.e = object0;
        }
    }

    final l a;
    final Object b;

    public u1(l l0, Object object0) {
        this.a = l0;
        this.b = object0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a u1$a0 = new a(n0, this.b);
        this.a.l6(u1$a0);
    }

    @Override  // f3.b
    public l d() {
        return io.reactivex.plugins.a.P(new s1(this.a, this.b, true));
    }
}

