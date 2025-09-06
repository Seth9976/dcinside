package rx.internal.operators;

import rx.functions.p;
import rx.g.b;
import rx.internal.producers.e;
import rx.n;
import rx.plugins.c;

public final class t0 implements b {
    final p a;
    final boolean b;

    public t0(p p0, boolean z) {
        this.a = p0;
        this.b = z;
    }

    public n a(n n0) {
        class a extends n {
            boolean f;
            boolean g;
            final e h;
            final n i;
            final t0 j;

            a(e e0, n n0) {
                this.h = e0;
                this.i = n0;
                super();
            }

            @Override  // rx.h
            public void d() {
                if(!this.g) {
                    this.g = true;
                    if(this.f) {
                        this.h.b(Boolean.FALSE);
                        return;
                    }
                    this.h.b(Boolean.valueOf(t0.this.b));
                }
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                if(!this.g) {
                    this.g = true;
                    this.i.onError(throwable0);
                    return;
                }
                c.I(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(this.g) {
                    return;
                }
                try {
                    this.f = true;
                    if(((Boolean)t0.this.a.b(object0)).booleanValue()) {
                        goto label_8;
                    }
                }
                catch(Throwable throwable0) {
                    rx.exceptions.c.g(throwable0, this, object0);
                }
                return;
            label_8:
                this.g = true;
                this.h.b(Boolean.valueOf(((boolean)(true ^ t0.this.b))));
                this.l();
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

