package rx.internal.operators;

import rx.functions.p;
import rx.g.b;
import rx.internal.producers.e;
import rx.n;
import rx.plugins.c;

public final class s0 implements b {
    final p a;

    public s0(p p0) {
        this.a = p0;
    }

    public n a(n n0) {
        class a extends n {
            boolean f;
            final e g;
            final n h;
            final s0 i;

            a(e e0, n n0) {
                this.g = e0;
                this.h = n0;
                super();
            }

            @Override  // rx.h
            public void d() {
                if(!this.f) {
                    this.f = true;
                    this.g.b(Boolean.TRUE);
                }
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                if(!this.f) {
                    this.f = true;
                    this.h.onError(throwable0);
                    return;
                }
                c.I(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(this.f) {
                    return;
                }
                try {
                    Boolean boolean0 = (Boolean)s0.this.a.b(object0);
                }
                catch(Throwable throwable0) {
                    rx.exceptions.c.g(throwable0, this, object0);
                    return;
                }
                if(!boolean0.booleanValue()) {
                    this.f = true;
                    this.g.b(Boolean.FALSE);
                    this.l();
                }
            }
        }

        e e0 = new e(n0);
        n n1 = new a(this, e0, n0);
        n0.q(n1);
        n0.X(e0);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

